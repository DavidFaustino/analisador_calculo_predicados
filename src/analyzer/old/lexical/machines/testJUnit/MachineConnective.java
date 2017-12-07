package analyzer.old.lexical.machines.testJUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n00.Connective;
import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class MachineConnective {
	
	Machine connective;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachineNumber(){
		this.connective =  Connective.CONNECTIVE;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, this.connective.accepted("&&", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, this.connective.accepted("&&", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, this.connective.accepted("||", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {		
		Assert.assertEquals(true, connective.accepted("<->", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, this.connective.accepted("==", levels, new ArrayStack<Character>()));
	}	

}
