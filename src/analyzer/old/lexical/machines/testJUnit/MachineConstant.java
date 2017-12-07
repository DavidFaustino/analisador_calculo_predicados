package analyzer.old.lexical.machines.testJUnit;



import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n01.Constant;
import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class MachineConstant {

	Machine constant;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachinePredicate(){
		constant = Constant.CONSTANT;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, constant.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, constant.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, constant.accepted("pA", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, constant.accepted("a_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, constant.accepted("_p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, constant.accepted("1_p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, constant.accepted("a2_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, constant.accepted("K_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test9() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, constant.accepted("hoje_S", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test10() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, constant.accepted("Gato2", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test11() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, constant.accepted("gato2", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test12() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, constant.accepted("x1", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test13() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(true, constant.accepted("angelica", levels, new ArrayStack<Character>()));
	}
	
	

}
