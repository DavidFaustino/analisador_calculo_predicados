package analyzer.old.lexical;

import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.TypesMachine;
import stack.ArrayStack;
import stack.StackUnderFlowException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by David on 28/05/2016.
 */
public class Machine {

    private TypesMachine typesMachine;
    private List<State> states;
    private List<State> ends;
    private List<State> transitional;
    private State initial;
    private int level;


    public Machine(TypesMachine typemachine, int level) {
        this.states = new ArrayList<>();
        this.transitional = new ArrayList<>();
        this.ends = new ArrayList<>();
        this.typesMachine = typemachine;
        this.level = level;
    }

    public TypesMachine getTypesMachine() {
        return typesMachine;
    }


    public void addState(State state) throws MachineAddState {
        if (states.isEmpty() && state.getType() == 'I') {
            states.add(state);
            initial = state;
        } else if (!(states.isEmpty()) && state.getType() == 'F') {
            states.add(state);
            ends.add(state);
        } else if (!(states.isEmpty()) && state.getType() == 'T') {
            states.add(state);
            transitional.add(state);
        } else if (!(states.isEmpty()) && state.getType() != 'I') {
            throw new MachineAddState();
        }
    }

    public boolean accepted(String accepted, LinkedList<Integer> levels, ArrayStack<Character> symbols) throws MachineStateExists, CaracterNotPermited, MachineAddState {
        return accepted(new Tape(accepted), levels, symbols);
    }


    public boolean accepted(Tape tape, LinkedList<Integer> levels, ArrayStack<Character> symbols) throws MachineStateExists, CaracterNotPermited, MachineAddState {
        System.out.println(toString() + " [STATES]: " + states.size() + " [INITIAL STATE]: " + initial.toString().replace("State@", "") + " >>BEGIN");

        boolean resp;

        if (initial != null && !(ends.isEmpty())) {

            levels.add(level);
            resp = initial.toMove(tape, typesMachine, symbols, levels);
        } else {
            throw new MachineStateExists();
        }



        if (!symbols.isEmpty()) {
            System.out.print("[TOKEN " + typesMachine.name() + "]: ");
        }

        if (!symbols.isEmpty() && level != 0) {
            while (!symbols.isEmpty()) {
                try {
                    System.out.print(symbols.pop());

                } catch (StackUnderFlowException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& POP");
            resp = true;
        } else if (!symbols.isEmpty()) {
            System.out.print(symbols.top());
            System.out.println("\n &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& TOP");
        }





        System.out.println("\nLEVEL: " + levels.getFirst());


        System.out.println("\n" + toString() + " -> " + (resp ? "ACEITOU" : "REJEITOU") + " >>END\n");
        return resp;
    }

    @Override
    public String toString() {
        String resp = "[MACHINE]: " + typesMachine.name();
        return resp;
    }
}
