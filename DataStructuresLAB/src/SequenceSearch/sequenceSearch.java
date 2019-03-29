package SequenceSearch;

public class sequenceSearch {

	public static int searchNumber(int num, int[] testSearch) {
		for (int i = 0; i < testSearch.length; i++) {
			if (num == testSearch[i]) {
				return i;
			}
		}
		return -1;
	}

	boolean isEmpty(int[] arr) {
		// TODO Auto-generated method stub
		return (arr == null);
	}	
}
