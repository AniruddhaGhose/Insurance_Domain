package com.Insurance_Domain.DTO;

public class AgentDTO {
	
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

	public AgentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgentDTO(int agentId, String agentName, String agentPwd) {
		super();
		this.agentId = agentId;
		this.agentName = agentName;
		this.agentPwd = agentPwd;
	}

	@Override
	public String toString() {
		return "AgentDTO [agentId=" + agentId + ", agentName=" + agentName + "]";
	}

	
}
