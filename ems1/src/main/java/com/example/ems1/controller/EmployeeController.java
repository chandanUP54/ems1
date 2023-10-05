package com.example.ems1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ems1.entity.Employee;
import com.example.ems1.service.EmployeeService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService empService;

	@PostMapping("/employees/save")  // Create
	public Employee addEmp(@RequestBody Employee emp) {
		return empService.addEmployee(emp);
	}
	
	@GetMapping("/employees") //Read
	public List<Employee> getAll(){
		return empService.listAllEmployee();
	}
	
	@GetMapping("/employees/{id}") //Read
	public Employee findOneEmp(@PathVariable int id) {
		return empService.getOneEmployee(id);
	}
	
	@PutMapping("/employees/update/{id}")
	public Employee updateEmp(@RequestBody Employee emp,@PathVariable int id) {
		return empService.updateEmployee(emp, id);
	}
	
	@DeleteMapping("/employees/delete/{id}")
	public void deteteOne(@PathVariable int id) {
		 empService.deleteEmployee(id);
	}
	
}
