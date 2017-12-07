package analyzer.old.lexical.machines.testJUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n00.Alfa_ao;
import stack.ArrayStack;

import java.util.LinkedList;


public class MachineAlfaao {

	Machine alfaao;
    LinkedList<Integer> levels;

	
	@Before
	public void createMachineDigit(){
		this.alfaao = Alfa_ao.ALFAao;
        levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(true, this.alfaao.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		Assert.assertEquals(false, this.alfaao.accepted("ab", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		Assert.assertEquals(false, this.alfaao.accepted("p", new LinkedList<>(), new ArrayStack<Character>()));
	}

	@Test
	public void test4() throws Exception {
		Assert.assertEquals(false, this.alfaao.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		Assert.assertEquals(false, this.alfaao.accepted("A", levels, new ArrayStack<Character>()));
	}
}
