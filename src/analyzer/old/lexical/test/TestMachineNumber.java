package analyzer.old.lexical.test;

import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n01.Number;
import analyzer.old.lexical.Machine;
import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class TestMachineNumber {
	
	public static void main(String[] args) throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Machine number = Number.NUMBER;
		LinkedList<Integer> levels = new LinkedList<>();
		
		//System.out.println(number.accepted("adGh3sd", levels));
		System.out.println(number.accepted("1a", levels, new ArrayStack<Character>()));
		//System.out.println(number.accepted("1111", levels));
	}

}
