package com.bootcamp.debitcard.service;


import com.bootcamp.debitcard.model.DebitCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DebitCardService {
    Flux<DebitCard> findAll();
    Mono<DebitCard> create(DebitCard debitCard);
    Flux<DebitCard> findByDebitCardNumber(String num);
    Mono<DebitCard> update(DebitCard debitCard);
    Mono<DebitCard> deleteById(String id);
    Mono delete(DebitCard debitCard);
}
