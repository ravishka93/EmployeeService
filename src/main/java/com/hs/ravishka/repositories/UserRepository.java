package com.hs.ravishka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hs.ravishka.domain.UserDTO;



public interface UserRepository extends JpaRepository<UserDTO,Integer>{

	//UserDTO findById(Integer id);

}