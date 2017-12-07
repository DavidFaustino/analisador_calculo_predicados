package analyzer.old.lexical.test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n02.Termo;
import stack.ArrayStack;

import java.util.LinkedList;

public class TestMachineTermo {
	
	public static void main(String[] args) throws MachineStateExists, CaracterNotPermited, MachineAddState {
		Machine termo = Termo.TERMO;
		LinkedList<Integer> levels = new LinkedList<>();
		
		System.out.println(termo.accepted("an(an)", levels, new ArrayStack<Character>()));
		
	}

}
