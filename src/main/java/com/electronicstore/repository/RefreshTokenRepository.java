package com.electronicstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electronicstore.entity.RefreshToken;
import com.electronicstore.entity.User;

@Repository	
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer> {

	Optional<RefreshToken> findByToken(String token);
	
	Optional<RefreshToken> findByUser(User user);
	
	
}
