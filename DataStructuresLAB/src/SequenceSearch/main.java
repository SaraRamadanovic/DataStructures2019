package SequenceSearch;

public class main {

	public static void main(String[] args) {
		
		int arr[] = new int[] {3, 4, 6, 32, 22, 11, 8};
		int binaryArr[] = new int[] {1,2,3,5,8,13,21,34,52,79};
		
		sequenceSearch newSearch = new sequenceSearch();
		binarySearch newBinarySearch = new binarySearch();
		bubbleSort newBubbleSort = new bubbleSort(50);

		banchmarkSearch newBanchmarkSearch1000 = new banchmarkSearch(1000);
		banchmarkSearch newBanchmarkSearch10000 = new banchmarkSearch(10000);
		banchmarkSearch newBanchmarkSearch100000 = new banchmarkSearch(100000);
		banchmarkSearch newBanchmarkSearch1000000 = new banchmarkSearch(1000000);
		
		newBanchmarkSearch1000.elapsedTimeSequnceSearch();
		
		
//		System.out.println(newBanchmarkSearch1000.elapsedTimeSequnceSearch(newSearch));
		
//		newBubbleSort.printSortedArr();
		
//		System.out.println("\n Searched number is at index: " + sequenceSearch.searchNumber(4, arr) + "\n");
//		System.out.println("\n Searched number is at index: " + newBinarySearch.searchNumber(binaryArr, 0, binaryArr.length, 5)+ "\n");
		
	}

}
