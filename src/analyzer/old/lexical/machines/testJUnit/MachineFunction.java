package analyzer.old.lexical.machines.testJUnit;

import analyzer.old.lexical.Machine;
import analyzer.old.lexical.machines.n01.Function;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import stack.ArrayStack;

import java.util.LinkedList;


public class MachineFunction {

	Machine function;
	LinkedList<Integer> levels;
	
	@Before
	/*
	public void createMachineAlfaMinusc(){

		function = Function2.FUNCTION2;
	}
	 */
	public void createMachineAlfaMinusc(){
		function = Function.FUNCTION;
		levels = new LinkedList<>();
	}

	@Test
	public void test1() throws Exception {
		System.out.println("--------------- TESTE 1 ----------------------");
		Assert.assertEquals(true, this.function.accepted("a", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test2() throws Exception {
		System.out.println("--------------- TESTE 2 ----------------------");
		Assert.assertEquals(false, this.function.accepted("A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test3() throws Exception {
		System.out.println("--------------- TESTE 3 ----------------------");
		Assert.assertEquals(false, this.function.accepted("p", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test4() throws Exception {
		System.out.println("--------------- TESTE 4 ----------------------");
		Assert.assertEquals(false, this.function.accepted("P", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test5() throws Exception {
		System.out.println("--------------- TESTE 5 ----------------------");
		Assert.assertEquals(false, this.function.accepted("Tap", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test6() throws Exception {
		System.out.println("--------------- TESTE 6 ----------------------");
		Assert.assertEquals(true, this.function.accepted("aA", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test7() throws Exception {
		System.out.println("--------------- TESTE 7 ----------------------");
		Assert.assertEquals(false, this.function.accepted(String.valueOf('\0'), levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test8() throws Exception {
		System.out.println("--------------- TESTE 8 ----------------------");
		Assert.assertEquals(false, this.function.accepted("4d3A", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test9() throws Exception {
		System.out.println("--------------- TESTE 9 ----------------------");
		Assert.assertEquals(true, this.function.accepted("pZ", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test10() throws Exception {
		System.out.println("--------------- TESTE 10 ----------------------");
		Assert.assertEquals(false, this.function.accepted("431201238316Aas dfLKJASDFY2134", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test11() throws Exception {
		System.out.println("--------------- TESTE 11 ----------------------");
		Assert.assertEquals(true, this.function.accepted("p34", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test12() throws Exception {
		System.out.println("--------------- TESTE 12 ----------------------");
		Assert.assertEquals(false, this.function.accepted("_430", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test13() throws Exception {
		System.out.println("--------------- TESTE 13 ----------------------");
		Assert.assertEquals(true, this.function.accepted("a_", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test14() throws Exception {
		System.out.println("--------------- TESTE 14 ----------------------");
		Assert.assertEquals(true, this.function.accepted("a_Z", levels, new ArrayStack<Character>()));
	}
	
	@Test
	public void test15() throws Exception {
		System.out.println("--------------- TESTE 15 ----------------------");
		Assert.assertEquals(true, this.function.accepted("aS1sd_aZ9", levels, new ArrayStack<Character>()));
	}
}
