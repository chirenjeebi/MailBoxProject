package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
