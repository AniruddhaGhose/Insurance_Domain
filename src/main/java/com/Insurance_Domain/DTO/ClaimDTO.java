package com.Insurance_Domain.DTO;

import com.Insurance_Domain.Entity.Admin;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

public class ClaimDTO {

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

	public ClaimDTO(int claimId, int userId, String agentName, int policyId) {
		super();
		this.claimId = claimId;
		this.userId = userId;
		this.agentName = agentName;
		this.policyId = policyId;
	}

	public ClaimDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
