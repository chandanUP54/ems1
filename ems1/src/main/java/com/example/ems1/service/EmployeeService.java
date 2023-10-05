package com.example.ems1.service;

import java.util.List;

import com.example.ems1.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee emp);
	public List<Employee> listAllEmployee();
	public Employee getOneEmployee(int id);
	public Employee updateEmployee(Employee emp,int id);
	public void deleteEmployee(int id);
}
