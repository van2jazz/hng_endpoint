package com.endpoint.hng_endpoint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/me")
public class Controller {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String CAT_FACT_URL = "https://catfact.ninja/fact";

    @GetMapping(produces = "application/json")
    public ResponseEntity<Map<String, Object>> getProfile() {
        Map<String, Object> response = new HashMap<>();
        Map<String, Object> user = new HashMap<>();

        // Populate user details
        user.put("email", "your.email@example.com");
        user.put("name", "Your Full Name");
        user.put("stack", "Java/Spring Boot");

        String catFact = "Could not fetch cat fact at this time.";

        try {
            Map<?, ?> catApiResponse = restTemplate.getForObject(CAT_FACT_URL, Map.class);
            if (catApiResponse != null && catApiResponse.containsKey("fact")) {
                catFact = catApiResponse.get("fact").toString();
            }
        } catch (Exception e) {
            System.err.println("Error fetching cat fact: " + e.getMessage());
        }

        response.put("status", "success");
        response.put("user", user);
        response.put("timestamp", Instant.now().toString());
        response.put("fact", catFact);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
