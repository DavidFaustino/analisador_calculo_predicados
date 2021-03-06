package analyzer.old.lexical.machines.testJUnit;

import analyzer.old.lexical.machines.n00.AlfaMinusc;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analyzer.old.lexical.Machine;
import stack.ArrayStack;

import java.util.LinkedList;

public class MachineAlfaMinusc {

	Machine alfaminusc;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachineAlfaMinusc(){
		alfaminusc = AlfaMinusc.ALFAminusc;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("--------------- TESTE 1 ----------------------");
		Assert.assertEquals(true, this.alfaminusc.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("--------------- TESTE 2 ----------------------");
		Assert.assertEquals(true, this.alfaminusc.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		System.out.println("--------------- TESTE 3 ----------------------");
		Assert.assertEquals(false, this.alfaminusc.accepted("P", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws Exception {
		System.out.println("--------------- TESTE 4 ----------------------");
		Assert.assertEquals(false, this.alfaminusc.accepted("A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		System.out.println("--------------- TESTE 5 ----------------------");
		Assert.assertEquals(false, this.alfaminusc.accepted("ap", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws Exception {
		System.out.println("--------------- TESTE 6 ----------------------");
		Assert.assertEquals(false, this.alfaminusc.accepted("aA", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws Exception {
		System.out.println("--------------- TESTE 7 ----------------------");
		Assert.assertEquals(false, this.alfaminusc.accepted("PA", levels, new ArrayStack<Character>()));
	}
}
