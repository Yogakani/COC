package com.yoga.coc.coc;

import org.springframework.web.reactive.function.client.WebClient;

public class ClashService {

    public String getPlayerProfile(String playerTag, String token) {
        WebClient webClient = WebClient.builder().baseUrl("https://api.clashofclans.com/v1").build();
        return webClient.get().uri("/players/{playerTag}", playerTag)
                .header("Authorization", token)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
