package com.Insurance_Domain.Services;

import java.util.List;

import com.Insurance_Domain.DTO.AdminDTO;

public interface AdminServices {

	public AdminDTO addPolicy(AdminDTO adminDTO);
	
	public List<AdminDTO> getAll();
	
	public AdminDTO getPolicy(int id);
	
	public void deletePolicy(int id);
	
	public AdminDTO updatePolicy(int id, AdminDTO adminDTO);
}
