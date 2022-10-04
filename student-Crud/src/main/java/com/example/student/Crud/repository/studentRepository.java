package com.example.student.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.student.Crud.domain.student;

@Repository
public interface studentRepository extends JpaRepository<student, Long>  {

}

