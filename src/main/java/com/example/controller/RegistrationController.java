package com.example.controller;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Registration;
import com.example.service.IdTypeService;
import com.example.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired
	private RegistrationService regServ;
	
	private IdTypeService idTypeServ;
	
	public RegistrationController() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationController(RegistrationService regServ) {
		super();
		this.regServ = regServ;
	}


	@PostMapping("/register")
	public ResponseEntity<String> addRegistration(@RequestBody  LinkedHashMap<String, String> fMap) {
		String name = fMap.get("name");
		String address = fMap.get("address");
		String email = fMap.get("email");
		String contactNumber = fMap.get("contactNo");
		String idNumber = fMap.get("idNumber");
		String idType = fMap.get("idType");
//		int idTypeId = Integer.parseInt(fMap.get("idType"));
//		IdType idType = idTypeServ.getById(idTypeId);
		Registration registration = new Registration(name, address, idType, idNumber, contactNumber,  email);
		
		regServ.saveRegistration(registration);
		return new ResponseEntity<>("new registration submitted", HttpStatus.CREATED);
	}
	
	@GetMapping("/registrations")
	public List<Registration> getRegistrations(){
		return regServ.getRegistrations();
	}

}
