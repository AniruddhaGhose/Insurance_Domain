package com.Insurance_Domain.Mapper;

import com.Insurance_Domain.DTO.AgentDTO;
import com.Insurance_Domain.Entity.Agent;

public class AgentMapper {

	public static AgentDTO mapAgentDTO(Agent agent) {
		
		AgentDTO agentDTO = new AgentDTO(agent.getAgentId(), agent.getAgentName(), agent.getAgentPwd());
		return agentDTO;
	}
	
	public static Agent mapAgent(AgentDTO agentDTO) {
		
		Agent agent= new Agent(agentDTO.getAgentId(), agentDTO.getAgentName(), agentDTO.getAgentPwd());
		
		return agent;
	}
}
