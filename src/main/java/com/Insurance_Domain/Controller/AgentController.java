package com.Insurance_Domain.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance_Domain.DTO.AgentDTO;
import com.Insurance_Domain.DTO.ClaimDTO;
import com.Insurance_Domain.Entity.Claim;
import com.Insurance_Domain.Services.AgentServices;
import com.Insurance_Domain.Services.ClaimServices;

@RestController
@RequestMapping("/insurance-domain")
public class AgentController {

	@Autowired
	private AgentServices agentServices;

	@Autowired
	private ClaimServices claimServices;

	@PostMapping("/agents")
	public ResponseEntity<AgentDTO> addAgent(@RequestBody AgentDTO agentDTO) {
		AgentDTO dto = agentServices.addAgent(agentDTO);
		return new ResponseEntity<AgentDTO>(dto, HttpStatus.CREATED);
	}

	@PostMapping("/claims")
	public ResponseEntity<ClaimDTO> addClaim(@RequestBody ClaimDTO claimDTO) {
		ClaimDTO dto = claimServices.addClaim(claimDTO);
		return new ResponseEntity<ClaimDTO>(dto, HttpStatus.CREATED);
	}

	@GetMapping("/claims/{id}")
	public ResponseEntity<ClaimDTO> getClaim(@PathVariable("id") int id) {
		ClaimDTO claimDTO = claimServices.getClaim(id);
		return new ResponseEntity<ClaimDTO>(claimDTO, HttpStatus.OK);

	}

	@GetMapping("/customers/{id}/claims")
	public ResponseEntity<List<ClaimDTO>> getByUserId(@PathVariable("id") int userId) {

		List<ClaimDTO> claim = claimServices.getByUserId(userId);

		return new ResponseEntity<List<ClaimDTO>>(claim, HttpStatus.OK);

	}

}
