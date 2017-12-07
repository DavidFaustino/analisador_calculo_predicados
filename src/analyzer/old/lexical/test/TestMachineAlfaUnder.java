package analyzer.old.lexical.test;

import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n00.AlfaUnder;
import analyzer.old.lexical.Machine;
import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class TestMachineAlfaUnder {
	
	public static void main(String[] args) throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Machine under = AlfaUnder.ALFAUNDER;
		LinkedList<Integer> levels = new LinkedList<>();
		
		System.out.println(under.accepted("aG3d", levels, new ArrayStack<Character>()));
		//System.out.println(under.accepted("4d-A"));
		//System.out.println(under.accepted("a_"));
		//System.out.println(under.accepted("_430"));
	}

}
