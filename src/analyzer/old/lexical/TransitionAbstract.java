package analyzer.old.lexical;

import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.TypesMachine;
import stack.ArrayStack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by David on 28/05/2016.
 */
public abstract class TransitionAbstract<E> {

    protected State origin;
    protected State next;
    protected List<E> data;
    protected String name;

    @SafeVarargs
    public TransitionAbstract(String name, State origin, State next, E ... element){
        this.origin = origin;
        this.next = next;
        this.data = Arrays.asList(element.clone());
        this.name =  name;
    }

    public State getOrigin(){
        return origin;
    }

    public State getNext(){
        return next;
    }

    public List<E> getList(){
        return data;
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public boolean isExistElement(E element) {
        for (E e : data) {
            if(e.equals(element)){
                return true;
            }
        }
        return false;
    }

    public E getSearchElement(E element) {
        for (E e : data) {
            if(e.equals(element)){
                return e;
            }
        }
        return null;
    }

    public abstract char typeTo();

    public abstract boolean toMove(Tape tape, TypesMachine typesMachine, ArrayStack<Character> arrayList, LinkedList<Integer> levels) throws MachineStateExists, CaracterNotPermited, MachineAddState;



}
