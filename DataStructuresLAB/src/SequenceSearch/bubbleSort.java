package SequenceSearch;

public class bubbleSort {
	private int[] arr;
	int size;
	
	public bubbleSort(int size) {
		this.size = size;
		arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			int Random = (int)(Math.random()*size);
			arr[i] = Random;
		}
	}
	
	public bubbleSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void sortArr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					arr[j] = arr[j] - arr[j - 1];
					arr[j - 1] = arr[j - 1] + arr[j];
					arr[j] = arr[j - 1] - arr[j];
				}
			}
		}
	}
	
	public void printSortedArr() {
		System.out.println("Unsorted array: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sortArr(arr);
		System.out.println("\n Sorted array: \n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	boolean isEmpty(int[] arr) {
		// TODO Auto-generated method stub
		return (arr == null);
	}
}
