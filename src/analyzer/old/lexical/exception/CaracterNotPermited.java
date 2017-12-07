package analyzer.old.lexical.exception;

@SuppressWarnings("serial")
public class CaracterNotPermited extends Exception {

	public CaracterNotPermited(char c) {
		super("Caracter n�o permitido: " + c);
	}
}
