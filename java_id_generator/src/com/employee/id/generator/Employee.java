package com.employee.id.generator;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private static int idGenerator=1000;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Employee(String name,double salary) {
		this.id=++idGenerator;
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	


}
