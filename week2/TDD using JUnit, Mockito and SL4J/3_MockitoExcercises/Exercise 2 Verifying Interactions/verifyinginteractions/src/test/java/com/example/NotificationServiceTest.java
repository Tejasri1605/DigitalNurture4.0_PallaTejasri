package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTest {

    @Test
    public void testVerifyWelcomeMessageSent() {
        System.out.println("Step 1: Creating mock for MessageApi...");
        MessageApi mockApi = Mockito.mock(MessageApi.class);

        System.out.println("Step 2: Injecting mock into NotificationService...");
        NotificationService service = new NotificationService(mockApi);

        System.out.println("Step 3: Calling sendWelcomeMessage(\"Tejasri\")...");
        service.sendWelcomeMessage("Tejasri");

        System.out.println("Step 4: Verifying that mockApi.sendMessage was called with correct arguments...");
        verify(mockApi).sendMessage("Tejasri", "Welcome!");

        System.out.println("✅ Test Passed: Interaction verified!");
    }
}
