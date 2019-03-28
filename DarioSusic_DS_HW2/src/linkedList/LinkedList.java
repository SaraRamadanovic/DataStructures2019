package linkedList;

import java.util.Iterator;


@SuppressWarnings({"rawtypes", "unchecked"})
public class LinkedList<E> implements Iterable<E> {
	private Node first;

    /**
     * removes the element from the rear
     */
    public void removeFromRear() {
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

    /**
     * remove the first element in the list
     */
    public void removeFromFront() {
        if (this.first != null) {
            this.first = this.first.getNext();
        }
    }

    /**
     * get the first element of the list
     *
     * @return
     */
    public Node getFirst() {
        return this.first;
    }

    /**
     * add first element to list, if list empty
     *
     * @param element
     */
    public void setFirst(Node element) {
        //addToFront(element);
    	this.first = element;
    }
    

	public Node getNext() {
		if (this.first.getNext() != null) {
			return this.first.getNext();
		} return null;
	}
    /**
     * add the element to the beginning of the list
     *
     * @param element
     */
    public void addToFront(E element) {
        if (this.first == null) {
            this.first = new Node(element);
        } else {
            Node firstT = this.first;
            this.first = new Node(element);
            this.first.setNext(firstT);
        }
    }

    /**
     * add the element to the rear of the list
     *
     * @param element
     */
    public void addToRear(E element) {
        if (this.first == null) {
            this.first = new Node(element);
        } else {
            Node current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(element));

        }
    }

    /**
     * add the element at the required index
     *
     * @param element
     * @param index
     */
    public void add(E element, int index) {
        if (index == 0) {
            Node temp = this.first;
            Node a = new Node(element);
            a.setNext(temp);
            this.first = a;
        } else if (this.first != null) {
            if (index == 0) {
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
                        newNode.setNext(next);
                    }
                    count++;
                    current = current.getNext();
                }

            }

        }
    }

    /**
     * delete the node at the provided index
     *
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
                    current.setNext(current.getNext().getNext());
                }
                count++;
                current = current.getNext();
            }
        }
    }
    
    /**
     * Counts number of elements in node
     * @return
     */
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