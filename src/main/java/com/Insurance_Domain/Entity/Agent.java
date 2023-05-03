package com.Insurance_Domain.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Agent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int agentId;
	
	private String agentName;
	
	private transient String agentPwd;

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentPwd() {
		return agentPwd;
	}

	public void setAgentPwd(String agentPwd) {
		this.agentPwd = agentPwd;
	}

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(int agentId, String agentName, String agentPwd) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentPwd = agentPwd;
	}

	@Override
	public String toString() {
		return "Agent [agentId=" + agentId + ", agentName=" + agentName + "]";
	}
	
	
	
}
