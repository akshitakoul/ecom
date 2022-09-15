package com.ex.eco.repository;

import com.ex.eco.model.Cart;
import com.ex.eco.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}
