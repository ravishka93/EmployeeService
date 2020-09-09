package com.hs.ravishka.services.impl;
import com.hs.ravishka.domain.UserDTO;
import com.hs.ravishka.repositories.UserRepository;
import com.hs.ravishka.services.UserServices;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceimpl implements UserServices{
	
	



	//import com.ravishka.boot.Services.UserServices;
	//import com.ravishka.boot.domain.UserDTO;
	//import com.ravishka.boot.repository.UserRepository;

	
		@Autowired
		private UserRepository userRepository;
		
		@Override
		public List<UserDTO> findAllUsers() {
			// TODO Auto-generated method stub
			List<UserDTO> allusers = userRepository.findAll();
			return allusers;
		}

		@Override
		public String saveUser(UserDTO userdata) {
			// TODO Auto-generated method stub
			userRepository.save(userdata);
			return "Data Save";
		}

		@Override
		public String updateUser(UserDTO newUserData) {
			// TODO Auto-generated method stub
			String msg = null;
			
			if(newUserData.getId() != null) {
				userRepository.save(newUserData);
				msg = "Data Updated";
			}
			else {
				msg = "Not Updated";
			}
			return msg;
		}

		@Override
		public UserDTO findById(Integer id) {
			// TODO Auto-generated method stub
//			return Optional.ofNullable(userRepository.findById(id));
			//return null;
			return userRepository.findOne(id);
		}
		
		
		
		

		
	}

	
	


