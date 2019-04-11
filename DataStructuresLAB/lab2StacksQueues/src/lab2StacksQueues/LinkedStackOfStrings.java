package lab2StacksQueues;

import java.util.Iterator;

public class LinkedStackOfStrings implements StackOfStrings {

	private class Node{
		public String item;
		public Node next;
	}
	
	private Node first=null;
	private int count=0;
	
	@Override
	public void push(String item) {

		Node temp=first;
		first= new Node();
		first.item=item;
		first.next=temp;
		count++;
		
	}

	@Override
	public String pop() {
		if(first==null)return null;
		
		String item = first.item;
		first=first.next;
		count--;
		return item;
	}

	@Override
	public boolean isEmpty() {
		return first==null;
	}

	@Override
	public int size() {
		return count;
	}
	@Override
	public Iterator<Item> iterator(){
		return new ListIterator();
	}
	public class ListIterator<Item> implements Iterator<Item>{
		private Node current =first;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public void remove() {
			
		}
		}
	

}
