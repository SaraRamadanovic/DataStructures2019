package radixSort;

public interface LinkedList<Item> extends Iterable<Item> {
	
	public class Node<Item>{
		public Item item;
		public Node<Item> next;
	}
	
	public Item get(int i);
	
	public int size();
	
	public void add(Item i);
	
	public Node<Item> getFirst();
	
	public Node<Item> getLast();
	
	public LinkedList<Item> append(LinkedList<Item> list);
	
	public void clear();

}
