package com.Insurance_Domain.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Insurance_Domain.DTO.AdminDTO;
import com.Insurance_Domain.DTO.ClaimDTO;
import com.Insurance_Domain.Services.AdminServices;
import com.Insurance_Domain.Services.ClaimServices;

@RestController
@RequestMapping("/insurance-domain")
public class AdminController {

	@Autowired
	private AdminServices adminServices;
	
	@Autowired
	private ClaimServices claimServices;

	@PostMapping("/policies")
	public ResponseEntity<AdminDTO> addPolicy(@RequestBody AdminDTO adminDTO) {

		AdminDTO dto = adminServices.addPolicy(adminDTO);

		return new ResponseEntity<AdminDTO>(dto, HttpStatus.CREATED);

	}

	@GetMapping("/policies/{id}")
	public ResponseEntity<AdminDTO> getPolicy(@PathVariable("id") int id) {
		AdminDTO dto = adminServices.getPolicy(id);
		return new ResponseEntity<AdminDTO>(dto, HttpStatus.OK);

	}

	@GetMapping("/policies")
	public ResponseEntity<List<AdminDTO>> getAll() {

		List<AdminDTO> dtos = adminServices.getAll();
		return new ResponseEntity<List<AdminDTO>>(dtos, HttpStatus.OK);
	}

	@DeleteMapping("/policies/{id}")
	public ResponseEntity<String> deletePolicy(@PathVariable("id") int id) {
		adminServices.deletePolicy(id);
		return new ResponseEntity<String>("Deleted SuccessFully", HttpStatus.NO_CONTENT);

	}

	@PutMapping("/policies/{id}")
	public ResponseEntity<AdminDTO> updatePolicy(@PathVariable("id") int id, @RequestBody AdminDTO adminDTO) {
		AdminDTO dto = adminServices.updatePolicy(id, adminDTO);
		return new ResponseEntity<AdminDTO>(dto, HttpStatus.OK);

	}
	
	@GetMapping("/claims")
	public ResponseEntity<List<ClaimDTO>> getAllClaims(){
		List<ClaimDTO> dto= claimServices.getAllClaims();
		return new ResponseEntity<List<ClaimDTO>>(dto,HttpStatus.OK );
		
	}
}
