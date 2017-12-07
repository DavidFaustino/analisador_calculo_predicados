package analyzer.old.lexical;

import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import stack.ArrayStack;

import java.util.LinkedList;

/**
 * Created by David on 28/05/2016.
 */
public class TransitionMachine<E> extends TransitionAbstract<E> {

    @SafeVarargs
    public TransitionMachine(String name, State origem, State next, E... element) {
        super(name, origem, next, element);

    }

    @Override
    public char typeTo() {
        return 'M';
    }

    private boolean validateMachine2(Tape tape, LinkedList<Integer> levels) throws MachineStateExists, CaracterNotPermited, MachineAddState {
        boolean resp = false;
        int head =  tape.getHead();
        int auxhead = 0;
        int distance = 0;

        for (E e : data) {
            Machine n = (Machine) e;
            char aux = tape.consumed();
            String cont = "";

            if(aux != '\0'){

                resp = n.accepted(String.valueOf(aux), levels, new ArrayStack<Character>());
                cont += String.valueOf(aux);

                while (resp){
                    tape.consume();
                    if(tape.consumed() != '\0'){
                        cont += String.valueOf(tape.consumed());
                        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + cont);
                        resp = n.accepted(cont, levels, new ArrayStack<Character>());
                        System.out.println(resp);
                    }else{
                        break;
                    }
                }

                if(!resp){
                    auxhead = tape.getHead();
                }
            }
        }

        if(head == auxhead){
            return resp;
        }else if(auxhead > head){
            distance = auxhead - head;
        }

        if(!resp && distance > 1){
            tape.setHead(auxhead - 1);
            resp =  true;
        }

        System.out.println("SAIUUUU: " + resp + "\n");
        return resp;
    }

    @Override
    public boolean toMove(Tape tape, TypesMachine typesMachine, ArrayStack<Character> symbols, LinkedList<Integer> levels) throws MachineStateExists, CaracterNotPermited, MachineAddState {
        System.out.println(typesMachine.toString());
        System.out.println(toString() + " >>BEGIN");

        boolean resp = false;

        for (E e : data) {
            Machine n = (Machine) e;
            if(n.accepted(tape, levels, symbols)){
                resp = true;
                break;
            }
        }

        if(resp){
            if(next.getType() == 'F' && tape.nextCosumed() =='\0'){
                return true;
            }

            System.out.println("NEXT STATE TRANS MACHINE - SYMBOL: " + tape.consumed() + " TYPE STATE: " + next.getType());
            resp = next.toMove(tape, typesMachine, symbols, levels);

        }

        System.out.println(typesMachine.toString());
        System.out.println(toString() + " -> " + (resp ? "ACEITOU" : "REJEITOU") + " >>END");
        return resp;
    }

    @Override
    public String toString() {
        return "[TM]: " + super.name;
    }



}