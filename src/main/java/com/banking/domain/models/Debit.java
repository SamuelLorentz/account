package com.banking.domain.models;

import com.banking.domain.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class Debit {

    private Long id;
    private Account destinyAccount;
    private Account originAccount;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private StatusEnum status;

}
