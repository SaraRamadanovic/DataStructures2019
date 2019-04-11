package sorting2;

import java.util.Arrays;
public class SelectionSort implements Sorter {
	
	public void sort(int[] array) {
		int N = array.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i + 1; j < N; j++) {
				if (less(array[j], array[min])) {
					min = j;
					exch(array, i, min);
				}
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
