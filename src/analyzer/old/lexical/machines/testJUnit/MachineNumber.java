package analyzer.old.lexical.machines.testJUnit;

import analyzer.old.lexical.exception.CaracterNotPermited;
import analyzer.old.lexical.exception.MachineAddState;
import analyzer.old.lexical.exception.MachineStateExists;
import analyzer.old.lexical.machines.n01.Number;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analyzer.old.lexical.Machine;
import stack.ArrayStack;
import stack.StackUnderFlowException;
import stack.StacksOverFlowException;

import java.util.LinkedList;

public class MachineNumber {
	
	private Machine number;
	private LinkedList<Integer> levels;
	
	@Before
	public void createMachineNumber(){
		this.number =  Number.NUMBER;
		this.levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(true, this.number.accepted("11", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		Assert.assertEquals(true, this.number.accepted("5345192", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		Assert.assertEquals(false, this.number.accepted(" ", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws StacksOverFlowException, MachineStateExists, CaracterNotPermited, StackUnderFlowException, MachineAddState {
		Assert.assertEquals(false, number.accepted("adGh3sd", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		Assert.assertEquals(false, this.number.accepted("1asdf", levels, new ArrayStack<Character>()));
	}	

}
