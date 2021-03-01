package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.IdType;

public interface IdTypeRepository extends JpaRepository<IdType, Integer>{

}
