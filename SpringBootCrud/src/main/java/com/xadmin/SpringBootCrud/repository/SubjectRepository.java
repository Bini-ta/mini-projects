package com.xadmin.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrud.bean.Subject;
import com.xadmin.SpringBootCrud.service.SubjectService;

public interface SubjectRepository extends CrudRepository<Subject,String> {

	void save(SubjectService subject);

}
