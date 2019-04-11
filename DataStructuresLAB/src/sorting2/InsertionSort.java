package sorting2;

import java.util.Arrays;

public class InsertionSort implements Sorter{

	public void sort(int[] array) {
		int N = array.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0; j--) {
				if (less(array[j], array[j - 1]))
					exch(array, j, j - 1);
				else
					break;
			}
		}
		
	}

	private static boolean less(int a, int b) {
		return (a < b);
	}

	private static void exch(int[] a, int v1, int v2) {
		int tmp = a[v1];
		a[v1] = a[v2];
		a[v2] = tmp;
	}
}
