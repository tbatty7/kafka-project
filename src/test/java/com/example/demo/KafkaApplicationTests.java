package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaApplicationTests {

	@Value("${message.topic.name}")
	String topicName;

	@Autowired
	private MessagePublisher publisher;

	@Test
	public void sendMsg() {
		publisher.sendMessage("hello world");
	}

}
