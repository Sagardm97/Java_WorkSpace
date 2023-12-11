package com.example.packagee;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the true or false ");
		boolean num=scan.nextBoolean();
		
	
		Arrayss array=new Arrayss(n);
		if(num==true) {
			System.out.println("press 1======>>>> insert()");
			System.out.println("press 2======>>>> delete()");
			System.out.println("press 3======>>>> display()");
			System.out.println("press any other number ======>>>> exit()");
			int n1=scan.nextInt();
			
			
			
			while(true) {
				switch (n1) {
				case 1: array.insert();
				return;
				case 2: array.insert();
				return;
				case 3: array.insert();
				return;
				case 4: array.insert();
				return;
				default:
					throw new IllegalArgumentException("Unexpected value: " + n1);
				}
			}
		}
		

	}

}
