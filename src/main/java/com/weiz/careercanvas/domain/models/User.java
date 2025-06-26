package com.weiz.careercanvas.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;

    private String email;

    private String passwordHash;

    private String fullName;

    private String phoneNumber;

    private boolean isActive = true;

    private LocalDateTime lastLogin;
}
