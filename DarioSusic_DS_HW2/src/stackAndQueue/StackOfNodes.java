package stackAndQueue;
import linkedList.LinkedList;

@SuppressWarnings({"rawtypes", "unused", "unchecked"})
public class StackOfNodes<E> extends LinkedList<E> implements Stack<E>{
	private linkedList.Node first;
	private linkedList.Node current;
	private int count = 0;
	//private E value;
	private LinkedList<E> stack;
	
	public LinkedList<E> getStack() {
		return stack;
	}

	public StackOfNodes() {
		this.stack = new LinkedList<E>();
		this.count = 0;
	}
	
	@Override
	public E pop() {
		if (this.stack.getNext() != null) {
			current = this.stack.getFirst();
			stack.setFirst(current.getNext());
			count--;
		}
		return (E) current.getValue();
	}
	
	/**
	 * Add element to top of stack
	 */
	@Override
	public void push(E value) {
		this.stack.addToFront(value);
		count++;
	}
	
	/**
	 * Removes first element in stack
	 */
	@Override
	public void remove() {
		if (this.stack != null) {
			this.stack.removeFromFront();
		}else {
			// TODO Throw exception when empty
		}
	}

	@Override
	public boolean isEmpty() {
		return this.stack.getFirst() == null;
	}

	@Override
	public int size() {
		return count;
	}
}
