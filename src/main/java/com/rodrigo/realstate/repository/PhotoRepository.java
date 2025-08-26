package com.rodrigo.realstate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigo.realstate.entities.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
