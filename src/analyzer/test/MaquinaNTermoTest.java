package analyzer.test;

import analyzer.maquina.Fita;
import analyzer.maquina.Initializer;

import org.junit.Assert;
import org.junit.Test;

public class MaquinaNTermoTest extends Init {

	@Test
	public void testeNTermo1() {
		Fita fita = new Fita("a");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeNTermo2() {
		Fita fita = new Fita("ab");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeNTermo3() {
		Fita fita = new Fita("abc");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeNTermo4() {
		Fita fita = new Fita("abcd");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeNTermo5() {
		Fita fita = new Fita("a,");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeNTermo6() {
		Fita fita = new Fita("a,b");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeNTermo7() {
		Fita fita = new Fita("a,b,c");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeNTermo8() {
		Fita fita = new Fita("a,abc,aaaaaaaaaaa");
		boolean aceito = Initializer.init(NTermo, fita);
		Assert.assertTrue(aceito);
	}
}
