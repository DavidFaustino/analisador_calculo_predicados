package analyzer.old.lexical;

import analyzer.old.lexical.machines.TypesMachine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import stack.ArrayStack;
import stack.StacksOverFlowException;

import java.util.LinkedList;

/**
 * Created by David on 28/05/2016.
 */
public class TransitionState<E> extends TransitionAbstract<E> {


    public TransitionState(String name, State origem, State next, E... element) {
        super(name, origem, next, element);
    }


    public char typeTo() {
        return 'S';
    }

    @Override
    public boolean toMove(Tape tape, TypesMachine typesMachine, ArrayStack<Character> symbols, LinkedList<Integer> levels) throws MachineStateExists, CaracterNotPermited, MachineAddState {

        tape.consume();

        System.out.println(typesMachine.toString());
        System.out.println(toString() + " Symbol:" + tape.consumed() + " >>BEGIN");

        boolean resp;

        Object ob = tape.consumed();
        resp = isExistElement((E) ob);

        if (resp) {
            //add in stack
            try {

                symbols.push(tape.consumed());
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>PUSH STACK: " + symbols.top());
            } catch (StacksOverFlowException e) {
                System.out.println(e.getMessage());
            }

            if (tape.nextCosumed() == '\0' && next.getType() == 'F') {
                resp = true;
            } else {
                System.out.println("NEXT STATE TRANS STATE - SYMBOL: " + tape.consumed() + " TYPE STATE: " + next.getType());
                resp = next.toMove(tape, typesMachine, symbols, levels);
            }
        } else {

            System.out.println("[AFTER HEAD TAPE]");
            tape.setHead(tape.getHead() - 1);

           /*
            if(!symbols.isEmpty() && levels.getFirst() != 0){

                System.out.println("AQUI");
                resp = true;
            }
        */
            return resp;
        }

        System.out.println(typesMachine.toString());
        System.out.println(toString() + " -> " + (resp ? "ACEITOU" : "REJEITOU") + " >>END");
        return resp;
    }

    @Override
    public String toString() {
        return "[TS]: " + super.name;
    }
}
