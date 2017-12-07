package analyzer.old.lexical.test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n01.Constant;
import stack.ArrayStack;

import java.util.LinkedList;

public class TestMachineConstant {
	
	public static void main(String[] args) throws MachineStateExists, CaracterNotPermited, MachineAddState {
		Machine cons = Constant.CONSTANT;
		LinkedList<Integer> levels = new LinkedList<>();
		
		System.out.println(cons.accepted("Ana", levels, new ArrayStack<Character>()));
		
	}

}
