package com.mono.tttrsv.dto;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountDto
{
    private String id;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private String type;
    private Integer currencyCode;
    private String cashbackType;
}
