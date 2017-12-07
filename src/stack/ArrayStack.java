package stack;

/**
 * Array implementa Pilha Generica
 * @author David
 *@version 1.0.0
 * @param <E>
 */
public class ArrayStack <E> implements Stack<E>{

	private static int CAPACITY = 1000;
	private E data [];
	private int top = -1;
	
	public ArrayStack() {
		this(CAPACITY);
	}
	
	
	/**
	 * Construtor de Pilha recebendo a capacidade
	 * @param capacity
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack(int capacity) {
		data = (E [] ) new Object[capacity];
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {		
		return (top == -1);
	}


	@Override
	public void push(E element) throws StacksOverFlowException {

		if(size() == data.length){
			throw new StacksOverFlowException();
		}

		data[++top] = element;

	}

	@Override
	public E top() {
		if(isEmpty()){
			return null;
		}
		
		return data[top];
	}

	@Override
	public E pop() throws StackUnderFlowException {
		
		if(isEmpty()){
			throw new StackUnderFlowException();
		}
		
		E topElement = data [top];
		data[top] = null;
		top --;
		return topElement;
	}

}
