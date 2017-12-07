package analyzer.test;



import analyzer.maquina.Fita;
import analyzer.maquina.Initializer;
import org.junit.Assert;
import org.junit.Test;

public class MaquinaConstanteTest extends Init {


	@Test
	public void testeConstante1() {
		Fita fita = new Fita("a");
		boolean aceito = Initializer.init(Constante, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeConstante2() {
		Fita fita = new Fita("abcdefg");
		boolean aceito = Initializer.init(Constante, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeConstante3() {
		Fita fita = new Fita("abcdefgabcdefgabcdefgabcdefgabcdefgabcdefg");
		boolean aceito = Initializer.init(Constante, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeConstante4() {
		Fita fita = new Fita("abcdefg_abcdefgabcdefgabcdefgabcdefgabcdefg");
		boolean aceito = Initializer.init(Constante, fita);
		Assert.assertFalse(aceito);
	}
}
