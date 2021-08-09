package com.juaracoding.ujianuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juaracoding.ujianuser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
