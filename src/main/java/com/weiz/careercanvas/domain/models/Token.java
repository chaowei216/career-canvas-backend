package com.weiz.careercanvas.domain.models;

import com.weiz.careercanvas.domain.enums.TokenType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Token {

    private String id;

    private TokenType tokenType;

    private String tokenTypeDescription;

    private String tokenValue;

    private LocalDateTime expirationDate;

    private boolean isRevoked;

    private LocalDateTime revokedAt;
}
