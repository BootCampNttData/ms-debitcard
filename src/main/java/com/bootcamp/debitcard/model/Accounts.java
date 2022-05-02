package com.bootcamp.debitcard.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document

public class Accounts {
    @Id
    private String  id;
    private Integer accountNumber;
    private Boolean isPrincipal;

    /**
    private Integer debitCardNumber;
    private String movementType;
    private String movementDate;
    private Double amount;
    private Double creditLimit; */
}
