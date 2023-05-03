package com.Insurance_Domain.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance_Domain.DTO.UserDTO;
import com.Insurance_Domain.Services.UserServices;

@RestController
@RequestMapping("/insurance-domain")
public class UserController {

	@Autowired
	private UserServices userServices;

	@PostMapping("/customers")
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
		UserDTO dto = userServices.addUser(userDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);

	}

	@GetMapping("/customers")
	public ResponseEntity<List<UserDTO>> getAll() {
		List<UserDTO> dtos = userServices.getAll();
		return ResponseEntity.ok(dtos);
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<UserDTO> getUser(@PathVariable("id") int id) {
		UserDTO dto = userServices.getUser(id);
		return ResponseEntity.ok(dto);

	}
	
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<UserDTO> deleteUser(@PathVariable("id") int id){
		userServices.deleteUser(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/customers/{id}")
	public ResponseEntity<UserDTO> updateUser(@PathVariable("id") int id, @RequestBody UserDTO userDTO) {
		UserDTO dto= userServices.updateUser(id, userDTO);
		return new ResponseEntity<UserDTO>(dto, HttpStatus.OK);
	}
}
