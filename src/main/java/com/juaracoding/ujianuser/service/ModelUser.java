package com.juaracoding.ujianuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juaracoding.ujianuser.entity.User;
import com.juaracoding.ujianuser.repository.UserRepository;

@Service
public class ModelUser implements ModelUserInterface {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> getAllUser(){
		return this.userRepo.findAll();
	}
}
