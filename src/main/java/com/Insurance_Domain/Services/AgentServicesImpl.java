package com.Insurance_Domain.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Insurance_Domain.DTO.AgentDTO;
import com.Insurance_Domain.Entity.Agent;
import com.Insurance_Domain.Mapper.AgentMapper;
import com.Insurance_Domain.Repository.AgentDao;

@Component
public class AgentServicesImpl implements AgentServices {

	@Autowired
	private AgentDao agentDao;

	@Override
	public AgentDTO addAgent(AgentDTO agentDTO) {
		Agent agent = AgentMapper.mapAgent(agentDTO);
		Agent agent2=  agentDao.save(agent);
		
		AgentDTO agentDTO2= AgentMapper.mapAgentDTO(agent2);
		
		return agentDTO2;
	}

}
