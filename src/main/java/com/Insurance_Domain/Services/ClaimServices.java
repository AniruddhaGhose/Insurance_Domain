package com.Insurance_Domain.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Insurance_Domain.DTO.ClaimDTO;
import com.Insurance_Domain.Entity.Claim;

public interface ClaimServices {

	public ClaimDTO addClaim(ClaimDTO claimDTO);
	
	public List<ClaimDTO> getAllClaims();
	
	public ClaimDTO getClaim(int id);
	
//	public List<ClaimDTO> getbyUserId(int userId);
	
	public List<ClaimDTO> getByUserId(int userId);
}
