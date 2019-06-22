package quickSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[] {7, 52, 4, 1, 7, 99, 41, 23, 11, 3, 23, 32};
		QuickSort newQuickSort = null;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		newQuickSort.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
