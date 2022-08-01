package com.mono.tttrsv.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("mono")
public class MonoApiProperties {
    private String token;
}