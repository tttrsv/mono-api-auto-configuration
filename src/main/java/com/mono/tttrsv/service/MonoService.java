package com.mono.tttrsv.service;

import com.mono.tttrsv.dto.StatementItem;
import com.mono.tttrsv.dto.UserInfoDto;

import java.time.LocalDate;
import java.util.Optional;

public interface MonoService
{
    Optional<UserInfoDto> getUserInfo();

    Optional<StatementItem[]> getUserStatement(String accountId, LocalDate from, LocalDate to );
}
