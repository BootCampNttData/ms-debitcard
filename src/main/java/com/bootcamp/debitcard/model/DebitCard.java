package com.bootcamp.debitcard.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document

public class DebitCard {
    @Id
    private String  id;
    private String  clientId;
    private Integer debitCardNumber;
    private Integer primaryAccount;
    private Integer secondaryAccounts[];
}
