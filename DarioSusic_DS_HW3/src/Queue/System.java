package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class System {
	private Queue<Message> newQueue;
	List<Subscriber> newSubscriber;
	
	/**
	 * Adds new subscriber to the list
	 * @param s
	 */
	public void addSubscriber(Subscriber s) {
		newSubscriber.add(s);
	}
	
	/**
	 * Removes first subscriber from the list
	 * @param s
	 */
	public void removeSubscriber(Subscriber s) {
		newSubscriber.remove(newSubscriber.indexOf(s));
	}
	
	/**
	 * Adds new message to queue
	 * @param m
	 */
	public void addMessage(Message m) {
		newQueue.enqueue(m);
	}
	
	public void broadcastMessage(Message m) {
		//TODO sends corresponding message to subscriber
	}
	
	public void getMessagesSubscriberTopic(String topic, Subscriber subscriber) {
		//TODO return message to subscriber
	}
	
}
