package com.mono.tttrsv.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class StatementItem
{
    private String id;
    private String time;
    private String description;
    private Integer mcc;
    private BigDecimal amount;
    private BigDecimal operationAmount;
    private Integer currencyCode;
    private BigDecimal cashbackAmount;
    private BigDecimal balance;
}
