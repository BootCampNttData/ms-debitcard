package com.bootcamp.debitcard.service.Impl;


import com.bootcamp.debitcard.model.DebitCard;
import com.bootcamp.debitcard.repository.DebitCardRepository;
import com.bootcamp.debitcard.service.DebitCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class DebitCardServiceImpl implements DebitCardService {
    public final DebitCardRepository repository;

    @Override
    public Mono<DebitCard> create(DebitCard debitCard) {
        return repository.save(debitCard);
    }

    @Override
    public Mono<DebitCard> update(DebitCard debitCard) {
        return repository.save(debitCard);
    }

    @Override
    public Mono deleteById(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono delete(DebitCard debitCard) {
        return repository.delete(debitCard);
    }

    @Override
    public Flux<DebitCard> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<DebitCard> findByDebitCardNumber(String id) {
        return repository.findByDebitCardNumber(id);
    }
}