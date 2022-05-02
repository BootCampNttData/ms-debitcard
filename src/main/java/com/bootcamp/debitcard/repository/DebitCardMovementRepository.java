package com.bootcamp.debitcard.repository;

import com.bootcamp.debitcard.model.Accounts;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DebitCardMovementRepository extends ReactiveCrudRepository<Accounts, String> {
//    Flux<Accounts> findByDebitCardNumber(Integer num);
}
