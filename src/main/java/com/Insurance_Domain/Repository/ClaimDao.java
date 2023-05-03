package com.Insurance_Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insurance_Domain.Entity.Claim;

public interface ClaimDao extends JpaRepository<Claim, Integer> {

}
