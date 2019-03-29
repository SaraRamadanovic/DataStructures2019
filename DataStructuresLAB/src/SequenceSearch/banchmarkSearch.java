package SequenceSearch;
import java.util.concurrent.TimeUnit;

public class banchmarkSearch {
	private int size;
	private int banchmarkArr[];
	long startTime;
	long endTime;
	long timeElapsed;

	
	public banchmarkSearch(int size) {
		this.size = size;
		banchmarkArr = new int[size];
		for (int i = 0, a = size; i < banchmarkArr.length; i++, a--) {
			banchmarkArr[i] = a;
		}
	}
	
	@SuppressWarnings("static-access")
	public void elapsedTimeSequnceSearch () {
		startTime = System.currentTimeMillis();;
		sequenceSearch.searchNumber(size/2, banchmarkArr);
		endTime = System.currentTimeMillis();
		timeElapsed = endTime - startTime;
		System.out.println(timeElapsed);
	}
	
	public long elapsedTimeBubbleSort () {
		startTime = System.currentTimeMillis();
		bubbleSort.sortArr(banchmarkArr);
		endTime = System.currentTimeMillis();
		timeElapsed = endTime - startTime;
		return timeElapsed;
	}
	
	public long elapsedTimeBinarySearch () {
		startTime = System.currentTimeMillis();
		binarySearch.searchNumber(banchmarkArr, 0, banchmarkArr.length, size/2);
		endTime = System.currentTimeMillis();
		timeElapsed = endTime - startTime;
		return timeElapsed;
	}
}