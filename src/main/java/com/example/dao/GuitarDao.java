package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Guitar;

public interface GuitarDao extends CrudRepository<Guitar,Integer>{
	

}
