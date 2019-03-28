import java.util.Iterator;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class DoublyLinkedList<E> implements Iterable<E> {

	private Node first;
	
	/**
	 * Adds element at index
	 * @param element
	 * @param index
	 */
	void add(E element, int index) {
		if (this.first == null) {
			return;
		} else if (index == 0) {
			Node temp = this.first;
			Node a = new Node(element);
			a.setNext(temp);
			this.first = a;
		} else {
			int count = 0;
			Node current = this.first;
			while (current != null) {
				if (count + 1 == index) {
					Node next = current.getNext();
					Node newNode = new Node(element);
					current.setNext(newNode);
					newNode.setPrev(current);
					newNode.setNext(next);
					if (next != null) {
						next.setPrev(newNode);
					}
				}
				count++;
				current = current.getNext();
			}
		}
	}
	
	/**
	 * Return first element in List
	 * @return
	 */
	Node getFirst(){
		return this.first;
	}
	
	/**
	 * Sets first element in list
	 * @param element
	 */
	void setFirst(E element) {
		addToFront(element);
	}
	
	/**
	 * Adds first element to list
	 * @param element
	 */
	void addToFront(E element) {
		if (this.first == null) {
			this.first = new Node(element);
		} else {
			Node temp = this.first;
			Node newNode = new Node(element);
			this.first = newNode;
			this.first.setNext(temp);
			temp.setPrev(newNode);
		}
	}
	/**
	 * Add node to rear of List
	 * @param element
	 */
    void addToRear(E element) {
        if (this.first == null) {
            this.first = new Node(element);
        } else {
            Node current = this.first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(element));
            current.getNext().setPrev(current);
        }
    }
	/**
	 * Removes Node from specific index point
	 * @param index
	 */
    void remove(int index) {
        if (index == 0 && this.first != null) {
            this.first = this.first.getNext();
        } else {
            int count = 0;
            Node current = this.first;
            while (current != null) {
                if (count + 1 == index) {
                	Node temp = current.getNext().getNext();
                	current.setNext(temp);
                    temp.setPrev(current);
                }
                count++;
                current = current.getNext();
            }
        }
    }
	
	/**
	 * Removes node from front
	 */
	void removeFromFront() {
		if (this.first != null) {
			Node temp = this.first;
			this.first = temp.getNext();
			
			temp.setPrev(null);
			temp.setNext(null);			
		}
	}
	
	/**
	 * Removes node from rear
	 */
	void removeFromRear() {
        Node current = this.first;

        if (this.first == null) {
            return;
        } else if (this.first.getNext() == null) {
            this.first = null;
            return;
        } else if (this.first.getNext().getNext() == null) {
            this.first.getNext().setNext(null);
            return;
        }

        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
    }
	
    int count() {
        int count = 0;
        if (this.first == null) {
            return count;
        } else {
            Node current = this.first;
            while (current != null) {
                count++;
                current = current.getNext();
            }
            return count;
        }
    }
	
    @Override
    public String toString() {
        String list = "";
        for (E el : this) {
            list += el + ",";
        }
        return list;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<>(this.first);
    }
}
