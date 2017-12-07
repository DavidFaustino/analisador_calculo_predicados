package analyzer.old.lexical.machines.testJUnit;



import analyzer.old.lexical.Machine;
import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n01.Variable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class MachineVariable {

	Machine variable;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachinePredicate(){
		variable = Variable.VARIABLE;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("pA", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("A_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("_p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("1_p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("A2_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("K_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test9() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, variable.accepted("hoje_S", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test10() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, variable.accepted("Gato2", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test11() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, variable.accepted("Z", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test12() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, variable.accepted("A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test13() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, variable.accepted("Jamil", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test14() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, variable.accepted("JKAn2", levels, new ArrayStack<Character>()));
	}
	
	

}
