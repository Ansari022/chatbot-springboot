package com.care.chatbot.controller;

import com.care.chatbot.model.Chat;
import com.care.chatbot.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Webhook")
public class ChatController {
    @Autowired
    ChatService chatService;
@PostMapping("/chat")
    public String receiveMessage(@RequestBody Chat request){
        System.out.println("Message: "+ request.getMessage());
        return chatService.getReply(request.getMessage());
    }
}
