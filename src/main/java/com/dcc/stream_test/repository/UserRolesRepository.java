package com.dcc.stream_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dcc.stream_test.models.Userrole;
import com.dcc.stream_test.models.UserrolePK;

public interface UserRolesRepository extends JpaRepository<Userrole, UserrolePK> {

}