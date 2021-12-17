package com.cognizant.ormlearn.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.ormlearn.model.Question;

public interface QuestionRepository extends JpaRepository<Question, String>{

}