package SequenceSearch;

public class binarySearch {
	public static int searchNumber(int arr[], int l, int r, int x) {
		if (r>=1) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) 
                return mid; 
            if (arr[mid] > x) 
                return searchNumber(arr, l, mid - 1, x); 
            return searchNumber(arr, mid + 1, r, x);
		}
		return -1;
	}
	
	boolean isEmpty(int[] arr) {
		// TODO Auto-generated method stub
		return (arr == null);
	}
}
