package stack;

/**
 * Pilha Gen�rica
 * @author David
 * @version 1.0.0
 * @param <E>
 */
public interface Stack <E>{
	
	/**
	 * Retorna o n�mero de elementos da pilha
	 * @return
	 */
	public int size();
	
	/**
	 * Verifica se a pilha est� vazia
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * Adiciona um elemento na pilha
	 * @param element
	 */
	public void push(E element) throws StacksOverFlowException;
	
	/**
	 * Retorna o elemento do topo da pilha
	 * @return
	 */
	public E top();
	
	/**
	 * Retorna e remove o elemento do topo da pilha
	 * @return
	 */
	public E pop() throws StackUnderFlowException;

}
