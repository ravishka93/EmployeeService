package com.hs.ravishka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hs.ravishka.domain.UserDTO;



public interface UserRepository extends JpaRepository<UserDTO,Integer>{

	

}