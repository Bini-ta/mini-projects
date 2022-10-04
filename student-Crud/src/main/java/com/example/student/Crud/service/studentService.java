package com.example.student.Crud.service;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.student.Crud.domain.student;
import com.example.student.Crud. repository.studentRepository;
import com.example.student.Crud.service.studentService;
import com.example.student.Crud.dao.studentdao;



@Service
public class studentService {
	
	@Autowired
	private studentdao studentDao;
	
@Autowired
private studentRepository studentRepository;


	public static List<student> getstudents() {
		return studentdao.findAll();
	}
@Transactional
	public static void addstudent(student student) {
		studentdao.save(student);
	}

@Transactional
public static void deletestudent(int id) {
	studentService.deletestudent(id);
}
@Transactional
public static void updatestudent(student student) {
	studentdao.updatestudent(student);
}
public static student getstudents(int id) {
	return studentdao.getstudent(id);
}
}


