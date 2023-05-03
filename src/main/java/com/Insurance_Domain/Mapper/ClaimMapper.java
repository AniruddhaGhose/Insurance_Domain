package com.Insurance_Domain.Mapper;

import com.Insurance_Domain.DTO.ClaimDTO;
import com.Insurance_Domain.Entity.Claim;

public class ClaimMapper {
	
	public static ClaimDTO mapClaimDTO(Claim claim) {
		
		ClaimDTO claimDTO= new ClaimDTO(claim.getClaimId(),claim.getUserId(), claim.getAgentName(), claim.getPolicyId());
		
		return claimDTO;
	}

	public static Claim mapClaim(ClaimDTO claimDTO) {
		Claim claim= new Claim(claimDTO.getClaimId(), claimDTO.getUserId(), claimDTO.getAgentName(), claimDTO.getPolicyId());
		
		return claim;
	}
}
