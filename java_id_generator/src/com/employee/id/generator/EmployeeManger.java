package com.employee.id.generator;

public class EmployeeManger {
	private int capacity;
	private int size;
	private Employee[]e;
	
	EmployeeManger(int capacity) 
	{
		this.capacity=capacity;
		e=new Employee[capacity];
		size=0;
	}
	public void addEmployee(String name,double salary)
	{
		if(size<capacity) 
		{
		e[size]=new Employee(name,salary);
		System.out.println("employeee added successfully and generated : "+e[size].getId());
		size++;
		}
		else 
		{
			System.out.println("no vacancy");
		}
	}
	void SearchEmployee(int id) 
	{
		
	}
	void displayEmployee()
	{
		
	}

}
