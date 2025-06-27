package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        System.out.println("Step 1: Creating mock for ExternalApi...");
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        System.out.println("Step 2: Stubbing mockApi.getData() to return 'Mock Data'...");
        when(mockApi.getData()).thenReturn("Mock Data");

        System.out.println("Step 3: Injecting mock into MyService...");
        MyService service = new MyService(mockApi);

        System.out.println("Step 4: Calling fetchData()...");
        String result = service.fetchData();

        System.out.println("Step 5: Asserting expected vs actual output...");
        assertEquals("Mock Data", result);

        System.out.println("✅ Test Passed! Output received from mocked API: " + result);
    }
}
