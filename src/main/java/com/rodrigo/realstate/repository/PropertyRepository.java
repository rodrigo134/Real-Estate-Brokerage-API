package com.rodrigo.realstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.realstate.entities.Property;

public interface PropertyRepository extends JpaRepository<Property, Long> {

}
