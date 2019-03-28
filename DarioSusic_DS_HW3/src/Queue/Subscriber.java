package Queue;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
	private List<String> topic = new ArrayList<String>();
	private List<Message> message = new ArrayList<Message>();
	public List<String> getTopic() {
		return topic;
	}
	public Subscriber(List<String> topic, List<Message> message) {
		this.topic = topic;
		this.message = message;
	}
	public void setTopic(List<String> topic) {
		this.topic = topic;
	}
	public List<Message> getMessage() {
		return message;
	}
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	
	public void getMessagesOfSubscriberOnTopic(String topic, System s) {
		s.getMessagesSubscriberTopic(topic, this);
	}
}
