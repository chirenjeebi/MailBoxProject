package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_register")
public class Registration {
	
	@Id
    @Column(name = "user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String name;
	
	private String address;
	
//	@OneToOne(fetch=FetchType.EAGER )
	private String idType;
	private String idNumber;
	private String contactNo;
	private String email;
	
	public Registration(String name, String address, String idType, String idNumber, String contactNo, String email) {
		super();
		this.name = name;
		this.address = address;
		this.idType = idType;
		this.idNumber = idNumber;
		this.contactNo = contactNo;
		this.email = email;
	}
	
	
	
	
	
}
