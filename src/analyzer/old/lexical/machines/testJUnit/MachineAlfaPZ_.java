package analyzer.old.lexical.machines.testJUnit;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n00.Alfa_PZ_;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;

import java.util.LinkedList;

public class MachineAlfaPZ_ {

	Machine alfaPZ;
	LinkedList<Integer> levels;

	@Before
	public void createMachineDigit(){
		this.alfaPZ = Alfa_PZ_.ALFA_PZ_;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(false, this.alfaPZ.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		Assert.assertEquals(false, this.alfaPZ.accepted("ab", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		Assert.assertEquals(false, this.alfaPZ.accepted("p", levels, new ArrayStack<Character>()));
	}

	@Test
	public void test4() throws Exception {
		Assert.assertEquals(false, this.alfaPZ.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		Assert.assertEquals(false, this.alfaPZ.accepted("A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws Exception {
		Assert.assertEquals(true, this.alfaPZ.accepted("P", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws Exception {
		Assert.assertEquals(false, this.alfaPZ.accepted("Rp", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws Exception {
		Assert.assertEquals(false, this.alfaPZ.accepted("NU", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test9() throws Exception {
		Assert.assertEquals(true, this.alfaPZ.accepted("Z", levels, new ArrayStack<Character>()));
	}
}
