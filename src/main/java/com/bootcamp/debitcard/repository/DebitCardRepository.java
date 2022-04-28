package com.bootcamp.debitcard.repository;

import com.bootcamp.debitcard.model.DebitCard;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface DebitCardRepository extends ReactiveCrudRepository<DebitCard, String> {
    Flux<DebitCard> findByDebitCardNumber(String num);
}
