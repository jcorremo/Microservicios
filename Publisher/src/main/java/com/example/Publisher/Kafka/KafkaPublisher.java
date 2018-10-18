package com.example.Publisher.Kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaPublisher {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value("${kafka.topic}")
	private String topic;
	
	public void publish(String message) {
		System.out.print("MENSAJE A ESCRIBIR --------->   "+message);
		kafkaTemplate.send(topic,message);
	}
}
