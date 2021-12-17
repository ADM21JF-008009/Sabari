package com.cognizant.ormlearn.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}