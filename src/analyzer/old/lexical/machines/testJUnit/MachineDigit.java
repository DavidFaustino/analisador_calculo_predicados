package analyzer.old.lexical.machines.testJUnit;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n00.Digit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;

import java.util.LinkedList;


public class MachineDigit {

	Machine digit;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachineDigit(){
		this.digit = Digit.DIGIT;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(true, this.digit.accepted("1", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		Assert.assertEquals(false, this.digit.accepted("11", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		Assert.assertEquals(false, this.digit.accepted("11o", levels, new ArrayStack<Character>()));
	}

	@Test
	public void test4() throws Exception {
		Assert.assertEquals(false, this.digit.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
}
