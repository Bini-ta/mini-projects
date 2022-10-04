package com.example.student.Crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.student.Crud.domain.student;
import com.example.student.Crud.service.studentService;
@Controller
@RequestMapping("/api")
public class studentController {
	
	@PostMapping("/addStudents")
	public student addstudent(@RequestBody student Student) {
		 studentService.addstudent(Student);
		 return Student;
	}
    
    @PutMapping("/update")
	public student updatestudent(@RequestBody student student ) {
		 studentService.updatestudent(student);
		 return student;

    }	
	@GetMapping("/getStudents")
	public List<student> getAllStudents() {
	return studentService.getstudents();
	}
	
	@GetMapping("/students/{id}")
	public student getStudent(@PathVariable int id) {
	return studentService.getstudents(id);
	}
	
	@DeleteMapping("/deleteStudents/{id}")
	public void deletestudent(@PathVariable int id) {
	studentService.deletestudent(id);		
	}
}


    
    
    
    
    
    
    
    
    
    
   









