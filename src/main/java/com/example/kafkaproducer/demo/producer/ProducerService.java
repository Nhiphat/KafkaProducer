package com.example.kafkaproducer.demo.producer;

import com.example.kafkaproducer.demo.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;
    public void producer(Message message) {
        kafkaTemplate.send("messages", message);
    }
}
