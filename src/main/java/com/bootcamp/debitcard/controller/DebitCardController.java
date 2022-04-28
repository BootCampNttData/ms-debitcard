package com.bootcamp.debitcard.controller;

import com.bootcamp.debitcard.model.DebitCard;
import com.bootcamp.debitcard.model.DebitCardMovement;
import com.bootcamp.debitcard.service.DebitCardMovementService;
import com.bootcamp.debitcard.service.DebitCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/debitcard")
@RequiredArgsConstructor
public class DebitCardController {
    public final DebitCardService service;
    public final DebitCardMovementService debitCardMovementService;
    @GetMapping
    public Flux<DebitCard> getAll(){
        return service.findAll();
    }

    @GetMapping("/find/{num}")
    public Flux<DebitCard> getByIdDebitCard(@PathVariable("num") String num){
        return service.findByDebitCardNumber(num);
    }

    @PostMapping
    public Mono<DebitCard> create(@RequestBody DebitCard debitCard){
        return service.create(debitCard);
    }

    @PostMapping("/update")
    public Mono<DebitCard> update(@RequestBody DebitCard debitCard){
        return service.create(debitCard);
    }

    @DeleteMapping
    public Mono<DebitCard> delete(@RequestBody DebitCard debitCard){
        return service.delete(debitCard);
    }

    @DeleteMapping("/byId/{id}")
    public Mono<DebitCard> deleteById(@RequestBody String id){
        return service.deleteById(id);
    }

/** *******************************************************************************************/
    @GetMapping("/movement")
    public Flux<DebitCardMovement> getAllMovements(){
        return debitCardMovementService.findAll();
    }

//    @GetMapping("/movement/find/{num}")
//    public Flux<DebitCardMovement> getByIdDebitCard(@PathVariable("num") Integer num){
//        return debitCardMovementService.findByDebitCardNumber(num);
//    }

    @PostMapping("/movement")
    public Mono<DebitCardMovement> create(@RequestBody DebitCardMovement debitCardMovement){
        return debitCardMovementService.create(debitCardMovement);
    }

    @PostMapping("/movement/update")
    public Mono<DebitCardMovement> update(@RequestBody DebitCardMovement debitCardMovement){
        return debitCardMovementService.create(debitCardMovement);
    }

    @DeleteMapping("/movement/byId/{id}")
    public Mono<DebitCardMovement> deleteMovementById(@PathVariable("id")  String id){
        return debitCardMovementService.deleteById(id);
    }

    @GetMapping("/accountBalance/{account}")
    public String getAccountBalance(@PathVariable("account") String account){
        double balance=0;
//        RestTemplate restTemplate=new RestTemplate();
//        String urlDp = actPrdUrl +"/debitCardMovement/find/" + account;
//        ResponseEntity<DebitCardMovement[]> debitCardMovements = restTemplate.getForEntity(urlDp,DebitCardMovement[].class);
//        for(DebitCardMovement am: debitCardMovements.getBody()){
//            if (am.getMovementType().equals("D")){
//                balance += am.getAmount();
//            }else{
//                balance -= am.getAmount();
//            }
//        }
        return String.valueOf(balance);
    }


}