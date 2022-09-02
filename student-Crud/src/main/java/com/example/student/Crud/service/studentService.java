package com.example.student.Crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.Crud.domain.student;
import com.example.student.Crud.repository.studentRepository;
@Service
public class studentService {
	
	@Autowired
    private studentRepository repo;
public List<student> listAll() {
        return repo.findAll();
    }
    
    public void save(student std) {
        repo.save(std);
    }
    
    public student get(long id) {
        return repo.findById(id).get();
    }
    
    public void delete(long id) {
        repo.deleteById(id);
    }
 

}
