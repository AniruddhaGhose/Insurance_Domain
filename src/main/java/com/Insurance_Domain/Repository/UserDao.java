package com.Insurance_Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insurance_Domain.Entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
