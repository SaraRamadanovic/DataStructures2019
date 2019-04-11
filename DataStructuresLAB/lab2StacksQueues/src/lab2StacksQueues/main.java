package lab2StacksQueues;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedStackOfStrings linkedList = new LinkedStackOfStrings();
		linkedList.push("10");
		linkedList.push("20");
		linkedList.push("30");

		linkedList.pop();

		System.out.println(linkedList.size());
		System.out.println(linkedList.isEmpty());
		System.out.println(linkedList.pop());
		System.out.println(linkedList.pop());

	}

}
