package queues;
public interface QueueOfStrings {

	public void enqueue(String item);
	
	public String dequeue();
	
	public int size();
	
	public boolean isEmpty();
}
