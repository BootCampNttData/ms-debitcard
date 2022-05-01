package com.bootcamp.debitcard.service.Impl;


import com.bootcamp.debitcard.model.DebitCardMovement;
import com.bootcamp.debitcard.repository.DebitCardMovementRepository;
import com.bootcamp.debitcard.service.DebitCardMovementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor

public class DebitCardMovementServiceImpl implements DebitCardMovementService {
//    public final DebitCardMovementRepository repository;
//
//    @Override
//    public Mono<DebitCardMovement> create(DebitCardMovement debitCardMovement) {
//        return repository.save(debitCardMovement);
//    }
//
//    @Override
//    public Mono<DebitCardMovement> update(DebitCardMovement debitCardMovement) {
//        return repository.save(debitCardMovement);
//    }
//
//    @Override
//    public Mono deleteById(String id) {
//        return repository.deleteById(id);
//    }
//
//    @Override
//    public Flux<DebitCardMovement> findAll() {
//        return repository.findAll();
//    }

}