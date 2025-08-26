package com.rodrigo.realstate.entities;

import java.util.ArrayList;
import java.util.List;

import com.rodrigo.realstate.entities.enums.PropertyStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Property {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String address;
	private String type;
	private String description;
	
	@Enumerated(EnumType.STRING)
	private PropertyStatus status;
	
	private List<Photo> photos = new ArrayList<>();

}
