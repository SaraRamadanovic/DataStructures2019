import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] randNum = new int[10];
		for (int i = 0; i < randNum.length; i++) {
			randNum[i] = (int) (Math.random()*6)+1;
		}
		
		for (int i = 0; i < randNum.length; i++) {
			System.out.print(randNum[i] + " ");
		}
			
		
		for (int i = 0; i < randNum.length; i++) {
			for (int j = 1; j < randNum.length - 1; j++) {
				if (randNum[j]<randNum[j-1]) {
					/*int temp = randNum[j];
					randNum[j] = randNum[j-1];
					randNum[j-1] = temp;*/
					
					randNum[j] = randNum[j] - randNum[j-1];
					randNum[j-1] = randNum[j-1] + randNum[j];
					randNum[j] = randNum[j-1] - randNum[j];
					
					//a = a-b;
					//b = b+a;
					//a = b-a
				}
			}
		}
		System.out.println("sorted is: \n");
		for (int i = 0; i < randNum.length; i++) {
			System.out.print(randNum[i]);
		}
	}

}