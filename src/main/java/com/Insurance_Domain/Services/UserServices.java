package com.Insurance_Domain.Services;

import java.util.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.Insurance_Domain.DTO.UserDTO;

public interface UserServices {
	
	public UserDTO addUser(UserDTO userDTO);

	public List<UserDTO> getAll();
	
	public UserDTO getUser(int id);
	
	public void deleteUser(int id);
	
	public UserDTO updateUser(int id, UserDTO userDTO);
}
