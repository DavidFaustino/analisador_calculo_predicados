package analyzer.test;

import analyzer.maquina.Fita;
import analyzer.maquina.Initializer;
import org.junit.Assert;
import org.junit.Test;

public class MaquinaSentencaAtomicaTest extends Init {


	@Test
	public void testeSentencaAtomica1() {
		Fita fita = new Fita("a");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeSentencaAtomica2() {
		Fita fita = new Fita("a(");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeSentencaAtomica3() {
		Fita fita = new Fita("a(abcde)");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeSentencaAtomica4() {
		Fita fita = new Fita("a(b,c)");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeSentencaAtomica5() {
		Fita fita = new Fita("aaaa(b,c)");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeSentencaAtomica6() {
		Fita fita = new Fita("aaaa(bccc,cdddd)");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeSentencaAtomica7() {
		Fita fita = new Fita("aaaa(bccc,cdddd");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertFalse(aceito);
	}
	
	@Test
	public void testeSentencaAtomica8() {
		Fita fita = new Fita("aaaa(bccc(a,a),cdddd)");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertTrue(aceito);
	}
	
	@Test
	public void testeSentencaAtomica9() {
		Fita fita = new Fita("aaaa(bccc(a(a,b,c,d),a),cdddd)");
		boolean aceito = Initializer.init(SentencaAtomica, fita);
		Assert.assertTrue(aceito);
	}
}
