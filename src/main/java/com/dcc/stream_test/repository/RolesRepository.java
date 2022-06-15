package com.dcc.stream_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcc.stream_test.models.Role;

public interface RolesRepository extends JpaRepository<Role, Integer> {

}