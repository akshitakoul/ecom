package com.ex.eco.repository;

import com.ex.eco.model.AuthenticationToken;
import com.ex.eco.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {

    AuthenticationToken findByUser(User user);
    AuthenticationToken findByToken(String token);
}
