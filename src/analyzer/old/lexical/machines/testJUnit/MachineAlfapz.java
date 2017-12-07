package analyzer.old.lexical.machines.testJUnit;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n00.Alfa_pz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;

import java.util.LinkedList;

public class MachineAlfapz {

	Machine alfapz;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachineDigit(){
		this.alfapz = Alfa_pz.ALFApz;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(true, this.alfapz.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		Assert.assertEquals(false, this.alfapz.accepted("tu", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		Assert.assertEquals(false, this.alfapz.accepted("o", levels, new ArrayStack<Character>()));
	}

	@Test
	public void test4() throws Exception {
		Assert.assertEquals(false, this.alfapz.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		Assert.assertEquals(false, this.alfapz.accepted("P", levels, new ArrayStack<Character>()));
	}
}
