package com.example.demo.controller;

import java.util.List;

public class StudentController {
	
	public class StudentController;
	@Autowired
	
	@GetMapping(value="/fetchStudents")
	public List<Student> getallStudents()
	{
		List<Student> studList = studService.getAllStudents();
		return studList;
	}
	@PostMapping(value="/saveStudent")
	public saveStudent(@RequestBody Student s)
	{
		studService.saveStudent(s);
	}
	

}
