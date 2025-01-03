package io.javabrains.spring_secuirty_jwt.controller;


import io.javabrains.spring_secuirty_jwt.dto.UserLoginDTO;
import io.javabrains.spring_secuirty_jwt.dto.UserRegisterDTO;
import io.javabrains.spring_secuirty_jwt.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserRegisterDTO userRegisterDTO) {
        return ResponseEntity.ok(authService.register(userRegisterDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserLoginDTO userLoginDTO) {
        return ResponseEntity.ok(authService.login(userLoginDTO.getEmail(), userLoginDTO.getPassword()));
    }
    @GetMapping("/dashboard")
    public ResponseEntity<String> getDashboard() {
        return ResponseEntity.ok("Welcome to the Dashboard!");
    }
}
