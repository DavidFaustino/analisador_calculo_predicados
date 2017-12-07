package analyzer.old.lexical.test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n00.Function2;
import stack.ArrayStack;

import java.util.LinkedList;

public class TestMachineFunction {
	
	public static void main(String[] args) throws MachineAddState, CaracterNotPermited, MachineStateExists {

		Machine function2 = Function2.FUNCTION2;
		LinkedList<Integer> levels = new LinkedList<>();

		System.out.println(function2.accepted("p", levels, new ArrayStack<Character>()));

	}

}
