package com.warrior.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MessageController {
	
	@Autowired
	private SimpMessageSendingOperations simpMessagingTemplate;

	@MessageMapping("/symbol")
	public void broadcastNews(@Payload InboundOutboudMessage message) {
		this.simpMessagingTemplate.convertAndSend("/topic/symbol", message);
	}
	
	@SubscribeMapping("/topic/greetings")
    public String findAll() {
		System.out.println("Subscribed...");
        return "Subscribed to topic";
    }
}
