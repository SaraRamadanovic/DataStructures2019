package radixSort;

import java.util.Iterator;

public class LastReferenceLinkedList<Item> implements LinkedList<Item> {
	private Node<Item> first;
	private Node<Item> last;
	private int count = 0;
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new LastReferenceListIterator();
	}

	@Override
	public Item get(int i) {
		int c = 0;
		Node<Item> current = first;
		while (current != null) {
			if (c == i) {
				return current.item;
			}
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public void add(Item i) {
		if (first == null && last == null) {
			first = new Node<Item>();
			first.item = i;
			last = first;
		} else {
			last.next = new Node<Item>();
			last.next.item = i;
			last = last.next;
		}
		count++;
	}

	@Override
	public Node<Item> getFirst() {
		if (first != null)
			return first;
		return null;
	}

	@Override
	public Node<Item> getLast() {
		if (last != null)
			return last;
		return null;
	}

	@Override
	public LinkedList<Item> append(LinkedList<Item> list) {
		// empty list which is going to be merged. nothing to be done
				if (list.size() == 0)
					return this;

				// target list is empty. Just copy pointers to new list
				if (first == null && last == null) {
					this.first = list.getFirst();
					this.last = list.getLast();
					this.count = list.size();
				} else {
					// append list to existing one
					this.last.next = list.getFirst();
					this.last = list.getLast();
					this.count += list.size();
				}

				return this;
	}

	@Override
	public void clear() {
		count = 0;
		first = null;
		last = null;
	}

	public class LastReferenceListIterator implements Iterator<Item> {
		private Node<Item> current = first;

		@Override
		public boolean hasNext() {
			return this.current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			// not supported
		}
	}
}


