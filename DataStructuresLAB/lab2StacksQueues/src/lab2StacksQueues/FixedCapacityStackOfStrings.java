package lab2StacksQueues;

import java.util.Iterator;

public class FixedCapacityStackOfStrings implements StackOfStrings {
	private String items[];
	private int count = 0;

	public FixedCapacityStackOfStrings(int capacity) {
		this.items = new String[capacity];
	}

	@Override
	public void push(String item) {
		if (count == items.length) {
			this.resize(2 * items.length);
		}
		this.items[count++] = item;

	}

	public void resize(int capacity) {
		String array[] = new String[capacity];
		int temp = this.count;
		while (temp != 0) {
			array[temp] = this.items[temp];
			temp--;
		}
		this.items=array;
		System.out.println("Resize!");

	}

	@Override
	public String pop() {
		String item = this.items[--count];
		this.items[count] = null;
		if (count > 0 && count == this.items.length / 4) {
			this.resize(this.items.length / 2);
		}
		return item;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOfStrings stack = new FixedCapacityStackOfStrings(10);

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
