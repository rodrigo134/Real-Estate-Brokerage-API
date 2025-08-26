package com.rodrigo.realstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.realstate.entities.Realtor;

public interface RealtorRepository extends JpaRepository<Realtor, Long> {

}
