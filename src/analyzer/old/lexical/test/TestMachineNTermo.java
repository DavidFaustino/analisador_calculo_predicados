package analyzer.old.lexical.test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n02.NTermo;
import stack.ArrayStack;

import java.util.LinkedList;

public class TestMachineNTermo {
	
	public static void main(String[] args) throws MachineStateExists, CaracterNotPermited, MachineAddState {
		Machine ntermo = NTermo.NTERMO;
		LinkedList<Integer> levels = new LinkedList<>();
		
		System.out.println(ntermo.accepted("An", levels, new ArrayStack<Character>()));
		
	}

}
