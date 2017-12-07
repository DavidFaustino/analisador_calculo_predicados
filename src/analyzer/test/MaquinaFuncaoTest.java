package analyzer.test;

import analyzer.maquina.Fita;
import analyzer.maquina.Initializer;

import org.junit.Assert;
import org.junit.Test;

public class MaquinaFuncaoTest extends Init {

	@Test
	public void testeFuncao1() {
		Fita fita = new Fita("a");
		boolean aceito = Initializer.init(Funcao, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeFuncao2() {
		Fita fita = new Fita("aa");
		boolean aceito = Initializer.init(Funcao, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeFuncao3() {
		Fita fita = new Fita("A");
		boolean aceito = Initializer.init(Funcao, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeFuncao4() {
		Fita fita = new Fita("AA");
		boolean aceito = Initializer.init(Funcao, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeFuncao5() {
		Fita fita = new Fita("aA");
		boolean aceito = Initializer.init(Funcao, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeFuncao6() {
		Fita fita = new Fita("aAa");
		boolean aceito = Initializer.init(Funcao, fita);
		Assert.assertTrue(aceito);
	}
}
