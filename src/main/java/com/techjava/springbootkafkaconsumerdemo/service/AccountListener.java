package com.techjava.springbootkafkaconsumerdemo.service;

import com.techjava.springbootkafkaconsumerdemo.model.Account;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AccountListener {

    @KafkaListener(topics = "kafka_json", group = "groupjson", containerFactory = "kafkaListenerContainerFactory")
    public void consumemessage(Account account){
        System.out.println("Consumed Message-->" +account);
    }
}
