package com.java.empmgmtsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.java.empmgmtsystem.entity.Employee;

public class EmployeeService {
	
	List<Employee> empList = new ArrayList<Employee>();
	static int counter = 0;
	
	{
		
		empList.add(new Employee(1, "Jack" ,1000.0));
		empList.add(new Employee(2, "Angela" ,2000.0));
		empList.add(new Employee(3, "Mike" ,1500.0));
	}

	public Employee getEmployee(int id) {
		
		return new Employee();
	}
	
	public void deleteEmployee(int id) {
		
	}
	
	public Employee addEmployee(Employee e) {
		
		e.setId(counter++);
		empList.add(e);
		return e;
	}
	
	public Employee updateEmployee(Employee e) {
		return new Employee();
	}
	
	public List<Employee> getAllEmployees() {
		return empList;
	}
}
