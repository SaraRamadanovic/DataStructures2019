package Queue;

public class Publisher {
	private String name;
	public void publish(Message m, System s) {
		s.addMessage(m);
	}
}
