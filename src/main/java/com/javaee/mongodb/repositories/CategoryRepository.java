package com.javaee.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaee.mongodb.domain.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{

}
