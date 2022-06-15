package com.dcc.stream_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcc.stream_test.models.Shoppingcart;
import com.dcc.stream_test.models.ShoppingcartPK;


public interface ShoppingCartRepository extends JpaRepository<Shoppingcart, ShoppingcartPK> {

}
