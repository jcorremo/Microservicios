package com.example.Publisher.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Publisher.Kafka.KafkaPublisher;
import com.example.Publisher.Model.Model;

@RestController
public class HelloWorldController {
	
	@Autowired
	private KafkaPublisher publisher;
	
	@RequestMapping("/publisher")
	public Model retornarMensaje(@RequestParam(value = "message") String message,@RequestParam(value = "name") String name) {
		Model model = new Model();
		model.setName(name);
		model.setMessage(message);
		publisher.publish(model.getMessage());
		return model;
	}
}
