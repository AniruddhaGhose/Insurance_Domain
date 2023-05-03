package com.Insurance_Domain.Services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance_Domain.DTO.AdminDTO;
import com.Insurance_Domain.Entity.Admin;
import com.Insurance_Domain.Exception.ResourceNotFoundException;
import com.Insurance_Domain.Mapper.AdminMapper;
import com.Insurance_Domain.Repository.AdminDao;

@Service
public class AdminServicesImpl implements AdminServices {

	@Autowired
	private AdminDao adminDao;

	@Override
	public AdminDTO addPolicy(AdminDTO adminDTO) {

		Admin admin = AdminMapper.mapAdmin(adminDTO);

		Admin admin2 = adminDao.save(admin);

		AdminDTO adminDTO2 = AdminMapper.mapAdminDto(admin2);

		return adminDTO2;
	}

	@Override
	public List<AdminDTO> getAll() {
		List<Admin> admins = adminDao.findAll();
		return admins.stream().map(AdminMapper::mapAdminDto).collect(Collectors.toList());
	}

	@Override
	public AdminDTO getPolicy(int id) {

		Admin admin = adminDao.findById(id).orElseThrow(() -> new ResourceNotFoundException());
		AdminDTO dto = AdminMapper.mapAdminDto(admin);
		return dto;
	}

	@Override
	public void deletePolicy(int id) {

		Admin admin = adminDao.findById(id).orElseThrow(() -> new ResourceNotFoundException());
		AdminDTO dto = AdminMapper.mapAdminDto(admin);
		adminDao.delete(admin);

	}

	@Override
	public AdminDTO updatePolicy(int id, AdminDTO adminDTO) {

		List<AdminDTO> dtos = getAll();

		dtos.stream().forEach(e -> {
			if (e.getPolicy_Id() == adminDTO.getPolicy_Id()) {
				e.setPolicy_Type(adminDTO.getPolicy_Type());
				e.setPolicy_Amt(adminDTO.getPolicy_Amt());
				e.setPolicy_Maturity(adminDTO.getPolicy_Maturity());
			}
		});

		Admin admin = AdminMapper.mapAdmin(adminDTO);
		Admin admin2 = adminDao.save(admin);
		AdminDTO dto = AdminMapper.mapAdminDto(admin2);

		return dto;
	}

}
