package stack;

/**
 * Pilha Cheia
 * @author David
 *
 */
@SuppressWarnings("serial")
public class StacksOverFlowException extends Exception {

	public StacksOverFlowException(){
		super("A pilha esta CHEIA");
	}
	
}
