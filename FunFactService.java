package com.example.funfactgenerator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class FunFactService {

    private final String API_URL = "https://uselessfacts.jsph.pl/random.json?language=en";

    public FactResponse getRandomFactResponse() {
        RestTemplate restTemplate = new RestTemplate();
        try {
            return restTemplate.getForObject(API_URL, FactResponse.class);
        } catch (RestClientException e) {
            // Return an empty FactResponse or handle as needed
            return new FactResponse();
        }
    }

    public String getRandomFact() {
        FactResponse response = getRandomFactResponse();
        return response != null ? response.getText() : "Oops! Something went wrong. Please try again.";
    }
}
