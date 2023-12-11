package com.employee.id.generator;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeManger em=new EmployeeManger(10);
		boolean b=true;
		Scanner scan =new Scanner(System.in);
		
		while(b) {
			System.out.println("enter the number 1");
			int in=scan.nextInt();
			if(in==1) {
				System.out.println("enter the name");
				String name=scan.next();
				System.out.println("enter tha salary");
				double salary=scan.nextDouble();
				em.addEmployee(name, salary);
			}
			
		}

	}

}
