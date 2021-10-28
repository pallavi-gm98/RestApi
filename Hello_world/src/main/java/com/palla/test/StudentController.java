package com.palla.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@GetMapping("/student")
	public StudentEntity getStudent() {
		return new StudentEntity("pallavi","Shaiva");
	}
	
	
	//localhost:8080/students
	@GetMapping("/students")
	public List<StudentEntity> getStudents(){
		
		List<StudentEntity> students =new ArrayList<>();
		students.add(new StudentEntity("pallavi","GM"));
		students.add(new StudentEntity("kushi","GM"));
		students.add(new StudentEntity("havibu","GM"));
		students.add(new StudentEntity("harshi","GM"));
		students.add(new StudentEntity("pavi","GM"));
		return students;
	}
	
	
	//handle path variable
	//PathVariable annotation to bind the request url template path variable to the method argument
	//localhost:8080/pallavi/shaiva
		
	@GetMapping("{firstName}/{lastName}")
	public StudentEntity studentPathVariable(@PathVariable("firstName") String firstName,
			@PathVariable("lastName")String lastName) {
		return new StudentEntity(firstName,lastName);
		
	}
	
	//RequestParam to bind the value of web request parameter to method variable
	//http://localhost:8080/student/query?firstName=pallavi&lastName=shaiva
	
	@GetMapping("/student/query")
	public StudentEntity studentQueryParam(
			@RequestParam(name = "firstName") String firstName ,
			@RequestParam(name = "lastName") String lastName) {
		return new StudentEntity(firstName,lastName);
	}
	
	
	

}
