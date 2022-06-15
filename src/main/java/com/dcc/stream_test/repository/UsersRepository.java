package com.dcc.stream_test.repository;

//import java.util.Collection;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.dcc.stream_test.models.User;


public interface UsersRepository extends JpaRepository<User, Integer> {

}

