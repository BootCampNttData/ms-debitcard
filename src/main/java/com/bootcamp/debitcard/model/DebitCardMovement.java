package com.bootcamp.debitcard.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document

public class DebitCardMovement {
    @Id
    private String id;
    /**
    private Integer debitCardNumber;
    private String movementType;
    private String movementDate;
    private Double amount;
    private Double creditLimit; */
}
