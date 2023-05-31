package me.gogohigh.springbootdeveloper.repository;

import me.gogohigh.springbootdeveloper.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByUserId(long userid);
    Optional<RefreshToken> findByRefreshToken(String refreshToken);
}
