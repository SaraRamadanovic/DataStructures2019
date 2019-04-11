package LinkedLists;
@SuppressWarnings({ })
public class Main {

    public static void main(String[] args) {
        new Main().linkedListMain();

    }

    
	void linkedListMain() {
		//LinkedList<Integer> a = new LinkedList();
		DoublyLinkedList<Integer> b = new DoublyLinkedList<Integer>();
		
		

        /*a.addToRear(0);
        a.addToRear(1);
        a.addToRear(3);
        a.addToRear(5);
        a.addToRear(6);
        a.remove(2);
        a.addToRear(45);
        a.addToRear(67);
        a.add(123456, 1);
        a.add(142, 1);
        a.addToFront(7);
        a.addToFront(16);
        System.out.println(a);

        LinkedList<String> b = new LinkedList();
        b.addToRear("sdas");
        b.addToRear("sdsd");
        System.out.println(b);

        LinkedList<Integer> c = new LinkedList();
        c.addToFront(1);
        c.add(15, 1);
        c.removeFromFront();
        c.removeFromRear();
        System.out.println(c);*/
        
		b.addToFront(10);
		b.addToFront(1);
		b.addToFront(3);
		//b.removeFromFront();
		//b.addToRear(11);
		b.removeFromRear();
		//b.add(3, 3);
		
		
		System.out.println(b);

    }
}