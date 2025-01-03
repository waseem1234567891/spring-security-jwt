package io.javabrains.spring_secuirty_jwt.dto;

import lombok.Data;

@Data
public class UserRegisterDTO {
    private String email;
    private String password;
}

