package com.example.packagee;

import java.util.Scanner;

public class Arrayss {
	private int arr[]=null;
	Scanner scan=new Scanner(System.in);
	public int Array(int n) {
		arr=new int(n);
	
	}
	public void insert() {
		System.out.println("enter the pos of elem to be stored in the array");
	int pos=scan.nextInt();
	System.out.println("enter the number on which the number can be stored the above position");
	int elem=scan.nextInt();
	arr[pos]=elem;
	
	}
	public void delete() {
	System.out.println("enter the pos of elem to be stored in the array");
	int pos=scan.nextInt();
	System.out.println("enter the number on which the number can be stored the above position");
	int elem=scan.nextInt();
	arr[pos]=elem;
	}
	public void display() {
		System.out.println("enter the pos of elem to be stored in the array");
	int pos=scan.nextInt();
	System.out.println("enter the number on which the number can be stored the above position");
	int elem=scan.nextInt();
	arr[pos]=elem;
	
	}
	

}
