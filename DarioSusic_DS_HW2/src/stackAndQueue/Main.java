package stackAndQueue;

public class Main {

	public static void main(String[] args) {
		StackOfNodes<Integer> st1 = new StackOfNodes<Integer>();
		st1.push(2);
		st1.push(3);
		st1.push(4);
		int a = st1.pop();
		//st1.remove();
	
		System.out.println(st1.isEmpty());
		System.out.println(st1.getStack());
		System.out.println(st1.size());
		System.out.println(a);
	}

}
