package com.Insurance_Domain.Mapper;

import com.Insurance_Domain.DTO.AdminDTO;
import com.Insurance_Domain.Entity.Admin;

public class AdminMapper {
	public static AdminDTO mapAdminDto(Admin admin) {

		AdminDTO adminDto = new AdminDTO(admin.getPolicyId(), admin.getPolicyType(), admin.getPolicyAmt(),
				admin.getPolicyMaturity()

		);

		return adminDto;

	}

	public static Admin mapAdmin(AdminDTO adminDto) {

		Admin admin = new Admin(adminDto.getPolicy_Id(), adminDto.getPolicy_Type(), adminDto.getPolicy_Amt(),
				adminDto.getPolicy_Maturity()

		);
		return admin;
	}
}
