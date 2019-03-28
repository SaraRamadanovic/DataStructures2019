import java.util.Iterator;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class LinkedListIterator<E> implements Iterator {

    private final Node<E> first;
    private Node<E> current;

	public LinkedListIterator(Node first) {
        this.first = first;
        this.current = this.first;
    }

    @Override
    public boolean hasNext() {
        return this.current != null;
    }

    @Override
    public E next() {
        E value = current.getValue();
        current = current.getNext();
        return value;
    }

}