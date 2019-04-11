package sorting2;

import java.util.Random;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		InsertionSort newSort = new InsertionSort();
		SelectionSort newSelSort = new SelectionSort();
		ShellSort newShellSort = new ShellSort();
		KnuthShuffle shuffle = new KnuthShuffle();
		
		//int[] a1= {1,2,3,12,5,66,53,2,2};
		Random rand = new Random();
		int[] a1 = new int[1000];
		
		for (int i = 0; i < a1.length; i++) {
			a1[i] = rand.nextInt(a1.length);
		}
		
		System.out.print("New unsorted arr is: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] +" ");
		}
		
		long start_InsertionSort = System.currentTimeMillis();
		newSort.sort(a1);
		long end_InsertionSort = System.currentTimeMillis();
		long difference_Insertion = end_InsertionSort - start_InsertionSort;
		System.out.print("\n\nNew sorted arr is: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] +" ");
		}
		
		shuffle.shuffle(a1);
		System.out.print("\n\nNew shuffled arr is: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] +" ");
		}
		
		long start_SelectionSort = System.currentTimeMillis();
		newSelSort.sort(a1);
		long end_SelectionSort = System.currentTimeMillis();
		long difference_SelectionSort = end_SelectionSort - start_SelectionSort;
		System.out.print("\n\nNew sorted arr is: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] +" ");
		}
		
		shuffle.shuffle(a1);
		System.out.print("\n\nNew shuffled arr is: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] +" ");
		}
		
		long start_ShellSort = System.currentTimeMillis();
		newShellSort.sort(a1);
		long end_ShellSort = System.currentTimeMillis();
		long difference_ShellSort = end_ShellSort - start_ShellSort;
		System.out.print("\n\nNew sorted arr is: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] +" ");
		}
		
		System.out.printf("\n\nInsertion Sort time is: %d ms\n"
				+ "Selection Sort time is %d ms\n"
				+ "Shell Sort time is: %d ms", difference_Insertion, difference_SelectionSort, difference_ShellSort);
	}

}
