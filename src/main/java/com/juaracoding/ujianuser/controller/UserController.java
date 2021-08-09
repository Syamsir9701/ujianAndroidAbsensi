package com.juaracoding.ujianuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.ujianuser.entity.User;
import com.juaracoding.ujianuser.service.ModelUser;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	ModelUser modelUser;
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAll(){
		
		return ResponseEntity.status(HttpStatus.OK)
				.contentType(MediaType.APPLICATION_JSON)
				.body(this.modelUser.getAllUser());
		
		
	}

}
