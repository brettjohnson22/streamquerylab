package com.dcc.stream_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcc.stream_test.models.ShoppingcartItem;
import com.dcc.stream_test.models.ShoppingcartItemPK;


public interface ShoppingcartItemRepository extends JpaRepository<ShoppingcartItem, ShoppingcartItemPK> {

}
