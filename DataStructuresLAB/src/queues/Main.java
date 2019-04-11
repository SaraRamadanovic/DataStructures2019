package queues;

public class Main {

	public static void main(String[] args) {
		LinkedQueueOfStrings a = new LinkedQueueOfStrings();
		
		a.enqueue("a");
		a.enqueue("b");
		a.dequeue();
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
