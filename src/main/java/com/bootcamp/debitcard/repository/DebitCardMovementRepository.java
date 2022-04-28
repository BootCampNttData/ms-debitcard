package com.bootcamp.debitcard.repository;

import com.bootcamp.debitcard.model.DebitCardMovement;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface DebitCardMovementRepository extends ReactiveCrudRepository<DebitCardMovement, String> {
    Flux<DebitCardMovement> findByDebitCardNumber(Integer num);
}
