package com.Insurance_Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Insurance_Domain.Entity.Agent;

public interface AgentDao extends JpaRepository<Agent, Integer>{

}
