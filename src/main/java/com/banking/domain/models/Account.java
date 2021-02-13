package com.banking.domain.models;

import java.math.BigDecimal;
import java.util.List;

public class Account {

    private Long accountNumber;
    private int agency;
    private String owner;
    private BigDecimal balance;
    private List<Credit> credits;
    private List<Debit> debits;

}
