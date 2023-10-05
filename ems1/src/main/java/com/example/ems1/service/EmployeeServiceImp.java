package com.example.ems1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems1.dao.EmployeeRepository;
import com.example.ems1.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	public EmployeeRepository empRepo;
	
	public Employee addEmployee(Employee emp) {
		return empRepo.save(emp);
	}
	public List<Employee> listAllEmployee(){
		return empRepo.findAll();
	}
	public Employee getOneEmployee(int id) {
		return empRepo.findById(id).get();
	}
	public Employee updateEmployee(Employee emp,int id) {
		Employee oldEmployee=empRepo.findById(id).get();
		if(oldEmployee!=null) {
			emp.setId(id);
		return	empRepo.save(emp);
		}
		return null;
	}
	public void deleteEmployee(int id) {
		Employee emp=empRepo.findById(id).get();
		if(emp!=null) {
			empRepo.deleteById(id);
		}
	}
}
