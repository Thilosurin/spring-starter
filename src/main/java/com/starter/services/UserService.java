package com.starter.services;

import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class UserService {
    private final WebClient webClient;

    public UserService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://randomuser.me/api/").build();
    }

    public Mono<Object> getUserBySeed(String seed) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.queryParam("seed", seed).build())
                .retrieve()
                .bodyToMono(Object.class).log();
    }
}
