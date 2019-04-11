package sorting2;
import java.util.Arrays;
import java.util.Random;

public class KnuthShuffle implements Shuffle{

	@Override
	public void shuffle(int[] arr) {
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			int r = i + rand.nextInt(arr.length - i);
			
			int temp = arr[r];
			arr[r] = arr[i];
			arr[i] = temp;
		}
	}
}
