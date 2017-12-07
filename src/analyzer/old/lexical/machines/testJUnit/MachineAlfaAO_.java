package analyzer.old.lexical.machines.testJUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n00.Alfa_AO_;
import stack.ArrayStack;

import java.util.LinkedList;

public class MachineAlfaAO_ {

	Machine alfaAO;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachineDigit(){
		this.alfaAO = Alfa_AO_.ALFA_AO_;
        levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(false, this.alfaAO.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		Assert.assertEquals(false, this.alfaAO.accepted("ab", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		Assert.assertEquals(false, this.alfaAO.accepted("p", levels, new ArrayStack<Character>()));
	}

	@Test
	public void test4() throws Exception {
		Assert.assertEquals(false, this.alfaAO.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		Assert.assertEquals(true, this.alfaAO.accepted("A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws Exception {
		Assert.assertEquals(true, this.alfaAO.accepted("O", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws Exception {
		Assert.assertEquals(false, this.alfaAO.accepted("Ab", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws Exception {
		Assert.assertEquals(false, this.alfaAO.accepted("FG", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test9() throws Exception {
		Assert.assertEquals(false, this.alfaAO.accepted("P", levels, new ArrayStack<Character>()));
	}
}
