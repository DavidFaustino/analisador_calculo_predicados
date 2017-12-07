package analyzer.old.lexical.test;

import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n00.Digit;
import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class TestMachineDigit {
	
	public static void main(String[] args) throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Machine digit = Digit.DIGIT;
		LinkedList<Integer> levels = new LinkedList<>();
		
		System.out.println(digit.accepted("1", levels, new ArrayStack<Character>()));
	}

}
