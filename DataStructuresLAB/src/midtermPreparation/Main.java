package midtermPreparation;

public class Main {
	
	public static void writeArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	private static int[] aux;
	
	
	/**
	 * recursive function
	 * 
	 * @param a
	 * @param lo
	 * @param hi
	 * 
	 * 
	 */
	private static void sort(int[] a, int lo, int hi) {
		
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);

		mergeSort(a, lo, mid, hi);
		
	}
	
	/**
	 * Merges two arrays into one
	 * @param a
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	private static void mergeSort(int[]a, int lo, int mid, int hi) {
		int i=lo, j=mid+1;
		
		for(int k = lo; k <= hi; k++) {
			aux[k]=a[k];
		}
		//actual sort
		for(int k = lo; k <= hi; k++) {
			if(i>mid) 
				a[k]=aux[j++];
			else if(j>hi) 
				a[k]=aux[i++];
			else if(aux[j]<aux[i]) 
				a[k]=aux[j++];
			else 
				a[k]=aux[i++];
		}
	}
	
	/**
	 * calls for method sort and passes params array, starting index, ending index
	 * @param array
	 * 
	 * Initialize aux array and calls for sort method
	 */
	public static void mergeSort(int[]a) {
		aux = new int[a.length];
		sort(a,0,a.length-1);
	}



	public static void main(String[] args) {
		int arr[] = {3,2,5,7,1,44,19,2,4,91,54,66,3,7,3,1,53,8,33,9,10,12,13};
		writeArr(arr);
		System.out.println();
		mergeSort(arr);
		writeArr(arr);
	}

}
