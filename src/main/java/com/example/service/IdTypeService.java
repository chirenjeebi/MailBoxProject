package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.IdType;
import com.example.repository.IdTypeRepository;

@Service
public class IdTypeService {
	
	private IdTypeRepository idTypeRepo;
	
	public IdTypeService() {
		// TODO Auto-generated constructor stub
	}

	public IdTypeService(IdTypeRepository idTypeRepo) {
		super();
		this.idTypeRepo = idTypeRepo;
	}
	
	public IdType getById(int id) {
		return idTypeRepo.findById(id).orElse(null);
	}

}
