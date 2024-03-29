package queues;
public class LinkedQueueOfStrings implements QueueOfStrings {

	private class Node {
		public String item;
		public Node next;
	}

	private Node first;
	private Node last;
	private int count = 0;


	public void enqueue(String item) {
		Node oldLast = new Node();
		this.last = new Node();
		this.last.item = item;
		this.last.next = null;
		if (isEmpty()) {
			this.first = this.last;
			count++;
		} else {
			oldLast.next = this.last;
			count++;
		}
	}
	
	public String dequeue() {
		String item = this.first.item;
		this.first=first.next;
		if(isEmpty()){
			this.last = null;
		}
		count --;
		return item;
	}


	public int size() {
		return count;
	}


	public boolean isEmpty() {
		return count == 0;
	}
}