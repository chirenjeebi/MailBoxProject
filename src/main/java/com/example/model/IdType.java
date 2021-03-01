package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="id_type")
@AllArgsConstructor
@NoArgsConstructor
public class IdType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="type_id")
	private int typeId;
	
	@Column(name="id_type")
	private String idType;

	public IdType(String idType) {
		super();
		this.idType = idType;
	}
	
	
	

}
