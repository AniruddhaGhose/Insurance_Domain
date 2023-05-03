package com.Insurance_Domain.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Insurance_Domain.DTO.UserDTO;
import com.Insurance_Domain.Entity.User;
import com.Insurance_Domain.Exception.ResourceNotFoundException;
import com.Insurance_Domain.Mapper.UserMapper;
import com.Insurance_Domain.Repository.UserDao;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserDao userDao;

	@Override
	public UserDTO addUser(UserDTO userDTO) {

		User user = UserMapper.mapUser(userDTO);
		User user2 = userDao.save(user);

		UserDTO dto = UserMapper.mapUserDto(user2);

		return dto;
	}

	@Override
	public List<UserDTO> getAll() {
		List<User> user= userDao.findAll();
		
		 return user.stream().map(UserMapper:: mapUserDto).collect(Collectors.toList());
		
		
	}

	@Override
	public UserDTO getUser(int id) {
		User user = userDao.findById(id).orElseThrow(()-> new ResourceNotFoundException() );
		UserDTO dto = UserMapper.mapUserDto(user);
		return dto;
	}

	@Override
	public void deleteUser(int id) {
		User user = userDao.findById(id).orElseThrow(()-> new ResourceNotFoundException());
		UserDTO dto = UserMapper.mapUserDto(user);
		userDao.delete(user);
		
		
	}

	@Override
	public UserDTO updateUser(int id, UserDTO userDTO) {
		List<UserDTO> dtos = getAll();
		dtos.stream().forEach(e->{
			if(e.getUserId()==userDTO.getUserId()) {
				e.setUserName(userDTO.getUserName());
				e.setUserPwd(userDTO.getUserPwd());
			}
		});
		
		User user = UserMapper.mapUser(userDTO);
		User user2= userDao.save(user);
		
		UserDTO dto= UserMapper.mapUserDto(user2);
		return dto;
	}

}
