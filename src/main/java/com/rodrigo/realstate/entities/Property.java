package com.rodrigo.realstate.entities;

import java.util.ArrayList;
import java.util.List;

import com.rodrigo.realstate.entities.enums.PropertyStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity	
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

	

	
	public Property() {
	
	}



	public Property(String address, String type, String description, PropertyStatus status) {
		
		this.address = address;
		this.type = type;
		this.description = description;
		this.status = status;
	}



	public Long getId() {
		return id;
	}



	


	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public PropertyStatus getStatus() {
		return status;
	}


	public void setStatus(PropertyStatus status) {
		this.status = status;
	}



	public List<Photo> getPhotos() {
		return photos;
	}



	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	
	
	
	
}
