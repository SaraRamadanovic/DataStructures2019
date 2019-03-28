package Queue;

public class Main {

	public static void main(String[] args) {
		System pubSub = new System();
		
		Publisher javaPublisher = new Publisher();
		Subscriber javaSubscriber = new Subscriber();
		
		Publisher cppPublisher = new Publisher();
		Subscriber cppSubscriber = new Subscriber();
		Message a = new Message();
		Message b = new Message();
		
		a.setTopic("Java");
		a.setText("text ta havu");
		b.setTopic("C++");
		b.setText("Ovo je lista");
		
		pubSub.addMessage(a);
		pubSub.addMessage(b);
		
		javaPublisher.publish(a, pubSub);
		cppPublisher.publish(b, pubSub);
		
		javaSubscriber.getMessagesOfSubscriberOnTopic(a.getTopic(), pubSub);
		
	}

}
