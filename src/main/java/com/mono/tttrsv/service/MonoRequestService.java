package com.mono.tttrsv.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Slf4j
public class MonoRequestService
{
    private final RestTemplate restTemplate;

    MonoRequestService( RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <T> Optional<T> request(String endpoint, Class<T> responseType) {
        ResponseEntity<T> response = restTemplate.getForEntity(endpoint, responseType);
        return Optional.ofNullable(response.getBody());
    }
}
