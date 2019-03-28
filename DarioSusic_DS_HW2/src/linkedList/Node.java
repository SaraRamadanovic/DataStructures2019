package linkedList;

public class Node<E> {

    /**
     * @return the prev
     */
    public Node getPrev() {
        return this.prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    private E value;
    private Node next;
    private Node prev;

    public Node(E value) {
        this.value = value;
    }

    public Node(E value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(E value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    void setValue(E value) {
        this.value = value;
    }

    public E getValue() {
        return this.value;
    }

    void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getNext() {
        return this.next;
    }

}