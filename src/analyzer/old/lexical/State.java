package analyzer.old.lexical;

import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.exception.TransitionCompare;
import analyzer.old.lexical.machines.TypesMachine;
import stack.ArrayStack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by David on 28/05/2016.
 */
public class State {

    private List<TransitionAbstract> transitionAbstracts;
    private char type;
    private String name;

    public State(String name, char type) {
        this.transitionAbstracts = new ArrayList<TransitionAbstract>();
        this.type = type;
        this.name = name;
    }

    public void addTransition(TransitionAbstract t) throws TransitionCompare {
        if(!compareToTransition(t)){
            transitionAbstracts.add(t);
        }else{
            throw new TransitionCompare();
        }
    }

    private boolean compareToTransition(TransitionAbstract t){
        for (TransitionAbstract transition : transitionAbstracts) {
            if(transition.equals(t)){
                return true;
            }
        }
        return false;
    }

    public char getType(){
        return type;
    }

    public boolean toMove(Tape tape, TypesMachine typesMachine, ArrayStack<Character> symbols, LinkedList<Integer> levels) throws MachineStateExists, CaracterNotPermited, MachineAddState {
        System.out.println(typesMachine.toString());
        System.out.println(toString() + " [TYPE]: " + type + " [QT]: " + transitionAbstracts.size() + " >>BEGIN");

        boolean resp = false;
        boolean control = false;


        if(type == 'F' && tape.consumed() == '\0'){
            resp = true;
        }else{
            for (int i = 0; i < transitionAbstracts.size(); i++) {
                TransitionAbstract<?> transition = transitionAbstracts.get(i);
                control = true;

                resp = transition.toMove(tape, typesMachine, symbols, levels);



                if (!resp && transitionAbstracts.size() > i) {
                    System.out.println("[CONTINUE TO TRANSTION]: " + transitionAbstracts.get(i).toString());
                    continue;
                }else if(resp){
                    break;
                }


                if(!resp && i  == transitionAbstracts.size()){
                    typesMachine.name();

                }
            }
        }



        if(levels.getFirst() != 0 && type == 'F' && !control && !symbols.isEmpty()){
            resp = true;
        }



        System.out.println(typesMachine.toString());
        System.out.println(toString() + " -> " + (resp ? "ACEITOU" : "REJEITOU") + " >>END");
        return resp;
    }

    @Override
    public String toString() {
        return "[ST]: " + this.name;
    }
}
