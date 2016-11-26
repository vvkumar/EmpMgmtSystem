package com.java.empmgmtsystem.entity;

public class Employee {

	private String name;
	private int id;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.salary = sal;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int empId) {
		this.id = empId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + id + ", salary=" + salary + "]";
	}
	
	
}
