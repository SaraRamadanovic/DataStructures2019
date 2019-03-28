package Queue;

public class Message {
	private String text;
	private String topic;
	public Message(String text, String topic) {
		this.text = text;
		this.topic = topic;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}	
}
