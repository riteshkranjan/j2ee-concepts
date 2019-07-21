package com.design.patterns.behavioral;

import org.junit.Test;

import com.design.patterns.behavioral.observer.MyTopic;
import com.design.patterns.behavioral.observer.MyTopicSubscriber;
import com.design.patterns.behavioral.observer.Observer;

public class ObserverDesignPatternTest {

	@Test
	public void testObserver() {
		MyTopic topic = new MyTopic();

		// create observers
		Observer obj1 = new MyTopicSubscriber("Obj1");
		Observer obj2 = new MyTopicSubscriber("Obj2");
		Observer obj3 = new MyTopicSubscriber("Obj3");

		// register observers to the subject
		topic.register(obj1);
		topic.register(obj2);
		topic.register(obj3);

		// attach observer to subject
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj3.setSubject(topic);

		// check if any update is available
		obj1.update();

		// now send message to subject
		topic.postMessage("New Message");
	}
}
