package SequenceSearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.*;

public class sequenceTesting {
	sequenceSearch testSearch = new sequenceSearch();
	binarySearch testBinarySearch = new binarySearch();
	bubbleSort testBubbleSort = new bubbleSort();
	
	int arr[] = new int[] {3, 4, 5, 6, 43};
	int unsortedArr[] = new int[] {3, 4, 12, 32, 22, 11, 8, 1};
	
	
	@Test 
	public void testMethod() {		
		assertEquals(0, (testSearch.searchNumber(3, arr)));
		assertEquals(1, (testBinarySearch.searchNumber(arr, 0, arr.length, 4)));
	}
	
	@Test
	public void isEmpty() {
		assertFalse(testSearch.isEmpty(arr));
		assertFalse(testBinarySearch.isEmpty(arr));
		assertFalse(testBubbleSort.isEmpty(unsortedArr));
	}
	
	@Test
	public void isSorted() {
		testBubbleSort.sortArr(unsortedArr);
		assertEquals(0, testSearch.searchNumber(1, unsortedArr));
	}
	
	
}
