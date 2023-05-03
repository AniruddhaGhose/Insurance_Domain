package com.Insurance_Domain.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Claim {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int claimId;

	private int userId;
	
	private String agentName;

	private int policyId;

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public Claim(int claimId, int userId, String agentName, int policyId) {
		super();
		this.claimId = claimId;
		this.userId = userId;
		this.agentName = agentName;
		this.policyId = policyId;
	}

	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", userId=" + userId + ", agentName=" + agentName + ", policyId="
				+ policyId + "]";
	}

	
	
	
}
