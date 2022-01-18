package com.starter.services;

import com.starter.models.UserModel;
import com.starter.models.UserObject;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class UserService {
    private final WebClient webClient;

    public UserService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://randomuser.me/api/").build();
    }

    public Mono<UserObject[]> getUserBySeed(String seed) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.queryParam("seed", seed).build())
                .retrieve()
                .bodyToMono(UserModel.class)
                .map(res -> res.results)
                .log();
    }
}
