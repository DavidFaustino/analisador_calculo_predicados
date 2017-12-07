package analyzer.test;

import analyzer.maquina.Fita;
import analyzer.maquina.Initializer;

import org.junit.Assert;
import org.junit.Test;

public class MaquinaTermoTest extends Init {


	@Test
	public void testeTermo1() {
		Fita fita = new Fita("a");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo2() {
		Fita fita = new Fita("a(");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeTermo3() {
		Fita fita = new Fita("a(abcde)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo4() {
		Fita fita = new Fita("a(b,c)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo5() {
		Fita fita = new Fita("aaaa(b,c)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo6() {
		Fita fita = new Fita("aaaa(bccc,cdddd)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo7() {
		Fita fita = new Fita("aaaa(bccc,cdddd");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeTermo8() {
		Fita fita = new Fita("aaaa(bccc(a,a),cdddd)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeTermo9() {
		Fita fita = new Fita("aaaa(bccc(a(a,b,c,d),a),cdddd)");
		boolean aceito = Initializer.init(Termo, fita);
		Assert.assertTrue(aceito);
	}
}
