package analyzer.old.lexical.machines.testJUnit;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n01.WordAlfaNR;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;


public class MachineWordAlfaNR {

	Machine alfanr;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachineAlfaMinusc(){
		alfanr = WordAlfaNR.WORDALFANR;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 1 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 2 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 3 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 4 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("P", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 5 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("Tap", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 6 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("aA", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 7 ----------------------");
		Assert.assertEquals(false, this.alfanr.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 8 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("4d3A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test9() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 9 ----------------------");
		Assert.assertEquals(false, this.alfanr.accepted("4d3-A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test10() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 10 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("431201238316Aas dfLKJASDFY2134", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test11() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		System.out.println("--------------- TESTE 11 ----------------------");
		Assert.assertEquals(true, this.alfanr.accepted("430324987", levels, new ArrayStack<Character>()));
	}
}
