package com.Insurance_Domain.Services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance_Domain.DTO.ClaimDTO;
import com.Insurance_Domain.Entity.Admin;
import com.Insurance_Domain.Entity.Claim;
import com.Insurance_Domain.Exception.ResourceNotFoundException;
import com.Insurance_Domain.Mapper.ClaimMapper;
import com.Insurance_Domain.Mapper.UserMapper;
import com.Insurance_Domain.Repository.ClaimDao;

@Service
public class ClaimServicesImpl implements ClaimServices {

	@Autowired
	private ClaimDao dao;

	@Override
	public ClaimDTO addClaim(ClaimDTO claimDTO) {
		Claim claim = ClaimMapper.mapClaim(claimDTO);
		Claim claim2 = dao.save(claim);
		ClaimDTO claimDTO2 = ClaimMapper.mapClaimDTO(claim2);
		return claimDTO2;
	}

	@Override
	public List<ClaimDTO> getAllClaims() {

		List<Claim> claims = dao.findAll();
		return claims.stream().map(ClaimMapper::mapClaimDTO).collect(Collectors.toList());

	}

	@Override
	public ClaimDTO getClaim(int id) {
		Claim claim = dao.findById(id).orElseThrow(() -> new ResourceNotFoundException());
		ClaimDTO claimDTO = ClaimMapper.mapClaimDTO(claim);
		return claimDTO;
	}

	@Override
	public List<ClaimDTO> getByUserId(int userId) {

		List<Claim> claim = dao.findAll();

		return claim.stream().filter(e -> e.getUserId() == userId).map(ClaimMapper::mapClaimDTO)
				.collect(Collectors.toList());

	}

}
