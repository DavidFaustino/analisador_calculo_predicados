package analyzer.old.lexical.machines.testJUnit;



import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n01.Predicate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class MachinePredicate {

	Machine predicate;
	LinkedList<Integer> levels;

	@Before
	public void createMachinePredicate(){
		predicate = Predicate.PREDICATE;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, predicate.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, predicate.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, predicate.accepted("pA", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, predicate.accepted("a_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, predicate.accepted("_p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, predicate.accepted("1_p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, predicate.accepted("a2_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, predicate.accepted("K_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test9() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, predicate.accepted("hoje_S", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test10() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, predicate.accepted("Gato2", levels, new ArrayStack<Character>()));
	}

}
