package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Registration;
import com.example.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository regRepository;
	
	public RegistrationService() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationService(RegistrationRepository regRepository) {
		super();
		this.regRepository = regRepository;
	}
	
	public Registration saveRegistration(Registration registration) {
		
		return regRepository.save(registration);
	}
	
	public List<Registration> getRegistrations(){
		return regRepository.findAll();
	}
	

}
