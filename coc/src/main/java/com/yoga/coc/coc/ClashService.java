package com.yoga.coc.coc;

import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class ClashService {

    public String getPlayerProfile(String playerTag, String token) {
        WebClient webClient = WebClient.builder().baseUrl("https://api.clashofclans.com/v1").build();
        return webClient.get().uri("/players/{playerTag}", playerTag)
                .header("Authorization", token)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public Mono<String> getPlayerDetails(String playerTag, String token) {
        WebClient webClient = WebClient.builder().baseUrl("https://api.clashofclans.com/v1").build();
        return webClient.get().uri("/players/{playerTag}", playerTag)
                .header("Authorization", token)
                .retrieve()
                .bodyToMono(String.class);
    }
}
