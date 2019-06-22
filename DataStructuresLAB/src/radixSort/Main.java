package radixSort;

public class Main {

	public static void main(String[] args) {
		Integer[] numbers = new Integer[] { 41, 242, 38, 577, 37, 66, 90, 88, 7, 35 };

		RadixSort sort = new RadixSort();
		Integer[] sorted = sort.sort(numbers);
		
		for (Integer integer : sorted) {
			System.out.println(integer);
		}
	}

}
