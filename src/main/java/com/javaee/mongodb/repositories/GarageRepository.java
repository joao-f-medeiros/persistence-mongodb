package com.javaee.mongodb.repositories;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaee.mongodb.domain.Garage;

public interface GarageRepository extends MongoRepository<Garage, String>{

	Set<Garage> findByName(String name);
}
