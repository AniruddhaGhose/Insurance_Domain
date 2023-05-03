package com.Insurance_Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insurance_Domain.Entity.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer>{

}
