package com.Insurance_Domain.Mapper;

import com.Insurance_Domain.DTO.UserDTO;
import com.Insurance_Domain.Entity.User;

public class UserMapper {

	public static UserDTO mapUserDto(User user) {

		UserDTO userDTO = new UserDTO(user.getUserId(), user.getUserName(), user.getUserPwd()

		);
		return userDTO;
	}

	public static User mapUser(UserDTO userDTO) {
		
		User user= new User(
				
				userDTO.getUserId(), userDTO.getUserName(),userDTO.getUserPwd()
				);
		
		return user;
	}
}
