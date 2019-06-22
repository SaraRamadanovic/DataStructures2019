package radixSort;

public class RadixSort {
	private LinkedList<Integer> zero = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> one = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> two = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> three = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> four = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> five = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> six = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> seven = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> eight = new LastReferenceLinkedList<Integer>();
	private LinkedList<Integer> nine = new LastReferenceLinkedList<Integer>();
	
	public Integer[] sort(Integer[] elements) {
		int phases = 0;

		for (int i : elements) {
			// length of digits
			int length = (int) (Math.log10(i) + 1);
			if (phases < length)
				phases = length;

			addToBucket(i % 10, i);
		}

		LinkedList<Integer> joinedList = joinBuckets();
		clearBuckets();

		LinkedList<Integer> sorted = sort(phases, joinedList);

		// additional step to copy data into array structure
		Integer[] sortedArray = new Integer[sorted.size()];
		int i = 0;
		for (Integer integer : sorted) {
			sortedArray[i++] = integer;
		}

		return sortedArray;
		
	}
	
	private LinkedList<Integer> sort(int phases, LinkedList<Integer> elements){
		for (int i = 1; i < phases; i++) {
			for (Integer value : elements) {
				int modDivisor = (int) Math.pow(10, (i + 1));
				int remainder = value % modDivisor;
				int digit = remainder / (modDivisor / 10);
				addToBucket(digit, value);
			}
			elements = joinBuckets();
			clearBuckets();
		}
		return elements;
		
	}
	
	private void addToBucket(int residue, Integer i) {
		switch (residue) {
		case 0:
			zero.add(i);
			break;
		case 1:
			one.add(i);
			break;
		case 2:
			two.add(i);
			break;
		case 3:
			three.add(i);
			break;
		case 4:
			four.add(i);
			break;
		case 5:
			five.add(i);
			break;
		case 6:
			six.add(i);
			break;
		case 7:
			seven.add(i);
			break;
		case 8:
			eight.add(i);
			break;
		case 9:
			nine.add(i);
			break;
		}
	}
	
	private LinkedList<Integer> joinBuckets() {
		LinkedList<Integer> joint = new LastReferenceLinkedList<Integer>();
		return joint.append(zero).append(one).append(two).append(three)
				.append(four).append(five).append(six).append(seven)
				.append(eight).append(nine);
	}
	
	private void clearBuckets() {
		zero.clear();
		one.clear();
		two.clear();
		three.clear();
		four.clear();
		five.clear();
		six.clear();
		seven.clear();
		eight.clear();
		nine.clear();
	}
	
	
}


