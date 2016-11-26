package com.java.empmgmtsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.empmgmtsystem.entity.Employee;
import com.java.empmgmtsystem.service.EmployeeService;

@RestController
public class EmployeeController {

	
	 @Autowired  
	 private HttpServletRequest request;  
	 EmployeeService employeeService = new EmployeeService();  
	  
	 @RequestMapping(value = "/employees", method = RequestMethod.GET, headers = "Accept=application/json")  
	 public List<Employee> getEmployees() {  
	    
	  List<Employee> listOfEmployees = employeeService.getAllEmployees();  
	  System.out.println("Returned employees " +listOfEmployees);
	  return listOfEmployees;  
	 }  
	  
	 @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")  
	 public Employee getEmployeeById(@PathVariable int id) {  
		 System.out.println("Requested employee with id " +id);
		 return employeeService.getEmployee(id);  
	 }  
	  
	 @RequestMapping(value = "/addemployee", method = RequestMethod.POST, headers = "Accept=application/json")  
	 public Employee addEmployee(@RequestBody Employee employee) {  
		 System.out.println("Added employee " +employee);
		 return employeeService.addEmployee(employee);  
	 }  
	  
	 @RequestMapping(value = "/updemployee", method = RequestMethod.PUT, headers = "Accept=application/json")  
	 public Employee updateEmployee(@RequestBody Employee employee) {  
		 System.out.println("Updated employee " +employee);
		 return employeeService.updateEmployee(employee);  
	  
	 }  
	  
	 @RequestMapping(value = "/delemployee/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")  
	 public void deleteEmployee(@PathVariable("id") int id) { 
		 System.out.println("Deleted employee with id" +id);
		 employeeService.deleteEmployee(id);  
	  
	 }   
}
