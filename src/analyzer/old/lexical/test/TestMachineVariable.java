package analyzer.old.lexical.test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n01.Variable;
import stack.ArrayStack;

import java.util.LinkedList;

public class TestMachineVariable {
	
	public static void main(String[] args) throws MachineStateExists, CaracterNotPermited, MachineAddState {
		Machine var = Variable.VARIABLE;
		LinkedList<Integer> levels = new LinkedList<>();
		
		System.out.println(var.accepted("Ana", levels, new ArrayStack<Character>()));
		
	}

}
