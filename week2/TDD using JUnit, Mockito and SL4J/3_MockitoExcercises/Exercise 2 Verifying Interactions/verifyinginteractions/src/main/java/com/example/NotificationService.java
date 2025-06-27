package com.example;

public class NotificationService {
    private MessageApi messageApi;

    public NotificationService(MessageApi messageApi) {
        this.messageApi = messageApi;
    }

    public void sendWelcomeMessage(String user) {
        String message = "Welcome!";
        messageApi.sendMessage(user, message);
    }
}
