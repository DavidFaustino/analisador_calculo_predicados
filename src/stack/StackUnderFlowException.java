package stack;

/**
 * Exce��o de Pilha Vazia
 * @author David
 *
 */
@SuppressWarnings("serial")
public class StackUnderFlowException extends Exception {

	public StackUnderFlowException(){
		super("A pilha esta VAZIA");
	}
}
