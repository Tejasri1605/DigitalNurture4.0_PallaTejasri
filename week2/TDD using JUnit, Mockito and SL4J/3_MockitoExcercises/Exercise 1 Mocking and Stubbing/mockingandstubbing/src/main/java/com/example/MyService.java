package com.example;

// This service depends on ExternalApi
public class MyService {
    private ExternalApi externalApi;

    // Dependency Injection via constructor
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    // Fetch data from the API
    public String fetchData() {
        System.out.println("Calling the external API...");
        return externalApi.getData();
    }
}
