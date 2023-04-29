package com.yeluri.dms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yeluri.dms.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{

	List<Dog> findByName(String name);
}
