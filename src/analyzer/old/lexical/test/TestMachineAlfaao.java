package analyzer.old.lexical.test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n00.Alfa_ao;
import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class TestMachineAlfaao {
	
	public static void main(String[] args) throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Machine ao = Alfa_ao.ALFAao;
		LinkedList<Integer> levels = new LinkedList<>();
		
		//System.out.println(under.accepted("aG3d"));
		//System.out.println(under.accepted("4d-A"));
		//System.out.println(under.accepted("a_"));
		System.out.println(ao.accepted("ap", levels, new ArrayStack<Character>()));
	}

}
