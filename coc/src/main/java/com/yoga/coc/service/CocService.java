package com.yoga.coc.service;

import reactor.core.publisher.Mono;

import java.util.function.Function;

public interface CocService {

    String getPlayerProfile(String token, String playerTag);

    Mono<String> getPlayerDetails(String token, String playerTag);
}
