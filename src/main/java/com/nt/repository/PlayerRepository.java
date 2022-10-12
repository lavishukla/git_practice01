package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Person;

public interface PlayerRepository extends CrudRepository<Person, Integer>{

}
