package LinkedLists;
import java.util.Iterator;

/*Your assignment is to implement the Doubly Linked List for generic types.
       Your class needs to have the following methods:
        //    • setFirst – setting the first element of the list
        //    • getFirst – getting the first element of the list
        //    • add – adding the element at the required index
        //    • addToFront – adding the element at the front of the list
        //    • addToRear – adding the element at the rear of the list
        //    • remove – removing the element at the required index
        //    • removeFromFront – removing the element from the front of the list
        //    • removeFromRear – removing the element from the rear of the list
        //    • count – returning the size of the list
            Use the code from the lecture as your reference
 */
@SuppressWarnings({ "unchecked", "rawtypes" })
public class LinkedList<E> implements Iterable<E> {

    
	private Node first;
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

    /**
     * remove the first element in the list
     */
    void removeFromFront() {
        if (this.first != null) {
            this.first = this.first.getNext();
        }
    }

    /**
     * get the first element of the list
     *
     * @return
     */
    Node getFirst() {
        return this.first;
    }

    /**
     * add first element to list, if list empty
     *
     * @param element
     */
    void setFirst(E element) {
        addToFront(element);
    }

    /**
     * add the element to the beginning of the list
     *
     * @param element
     */
    void addToFront(E element) {
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
    void addToRear(E element) {
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
                    newNode.setNext(next);
                }
                count++;
                current = current.getNext();
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