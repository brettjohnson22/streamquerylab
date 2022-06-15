package com.dcc.stream_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcc.stream_test.models.Product;


public interface ProductsRepository extends JpaRepository<Product, Integer> {

}