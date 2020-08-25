package com.hs.ravishka.services;

import java.util.List;
import java.util.Optional;

import com.hs.ravishka.domain.UserDTO;

public interface UserServices {
	
	    List<UserDTO> findAllUsers();

		String saveUser(UserDTO userdata);
		
		String updateUser(UserDTO newUserData);
		
		Optional<UserDTO> findById(Integer id);
	}



