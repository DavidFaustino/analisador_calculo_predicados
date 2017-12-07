package analyzer.old.lexical.machines.testJUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n00.AlfaNumeric;
import stack.ArrayStack;

import java.util.LinkedList;


public class MachineAlfaNumeric {

	Machine alfanumeric;
	LinkedList<Integer> levels;
	
	@Before
	public void createMachineAlfaMinusc(){
		alfanumeric = AlfaNumeric.ALFANumeric;
		levels = new LinkedList<>();
	}
	
	@Test
	public void test1() throws Exception {
		System.out.println("--------------- TESTE 1 ----------------------");
		Assert.assertEquals(true, this.alfanumeric.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("--------------- TESTE 2 ----------------------");
		Assert.assertEquals(true, this.alfanumeric.accepted("A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		System.out.println("--------------- TESTE 3 ----------------------");
		Assert.assertEquals(true, this.alfanumeric.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws Exception {
		System.out.println("--------------- TESTE 4 ----------------------");
		Assert.assertEquals(true, this.alfanumeric.accepted("P", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		System.out.println("--------------- TESTE 5 ----------------------");
		Assert.assertEquals(false, this.alfanumeric.accepted("Tap", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws Exception {
		System.out.println("--------------- TESTE 6 ----------------------");
		Assert.assertEquals(false, this.alfanumeric.accepted("aA", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws Exception {
		System.out.println("--------------- TESTE 7 ----------------------");
		Assert.assertEquals(false, this.alfanumeric.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws Exception {
		System.out.println("--------------- TESTE 8 ----------------------");
		Assert.assertEquals(true, this.alfanumeric.accepted("9", levels, new ArrayStack<Character>()));
	}
	
	
	@Test
	public void test9() throws Exception {
		System.out.println("--------------- TESTE 9 ----------------------");
		Assert.assertEquals(false, this.alfanumeric.accepted("A3", levels, new ArrayStack<Character>()));
	}
	
	
	@Test
	public void test10() throws Exception {
		System.out.println("--------------- TESTE 10 ----------------------");
		Assert.assertEquals(true, this.alfanumeric.accepted("6 ", levels, new ArrayStack<Character>()));
	}
}
