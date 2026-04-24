package com.care.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public String getReply(String message) {

        if (message==null) {
            return "Invalid message";
        }
            message=message.toLowerCase();
            switch (message){
                case "hi" : return "Hello";
                case "bye" : return "Goodbye";
                case "how are you" : return "i am fine";
                default: return "sorry, I did not understand ";
        }
    }
}
