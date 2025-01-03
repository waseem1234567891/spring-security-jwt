package io.javabrains.spring_secuirty_jwt.dto;

import lombok.Data;

@Data
public class UserLoginDTO {
    private String email;
    private String password;
}
