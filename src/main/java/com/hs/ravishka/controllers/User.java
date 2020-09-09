package com.hs.ravishka.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hs.ravishka.domain.UserDTO;
import com.hs.ravishka.services.UserServices;


@RestController
@RequestMapping("/user")
public class User {

	
	
	
		
		@Autowired
		private UserServices userServices;
		
		@RequestMapping(value = "/all",method = RequestMethod.GET)
		public List<UserDTO> alluser() {
			return userServices.findAllUsers();
		}
		
		@RequestMapping(value =  "/add",method = RequestMethod.POST)
		public String addUser(@RequestBody UserDTO Userdata) {
			return userServices.saveUser(Userdata);
		}
		
		@RequestMapping(value = "/update",method = RequestMethod.PUT)
		public String updateUser(@RequestBody UserDTO newUserData) {
			return userServices.updateUser(newUserData);
		}
		
		@RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
		public UserDTO getUserById(@PathVariable Integer id) {
			return userServices.findById(id);
		}

}
	
	
	

