package io.javabrains.spring_secuirty_jwt.repository;

import io.javabrains.spring_secuirty_jwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
