package com.Assignment1.main;

import java.util.Scanner;

 class Student {
	 String name ; 
	 int RollNo ;
	 float marks ;
 }
	 class StudentData{
		 public static  void main(String[] args) {
			  Student obj = new Student();
			   
			  
			  try(Scanner sc = new Scanner(System.in);){
		        System.out.print("name : ");
			 obj.name = sc.nextLine();
				System.out.print("Roll No : ");
				obj.RollNo = sc.nextInt();
				System.out.print("marks : ");
				obj.marks = sc.nextFloat();
				System.out.println( obj.name+" "+obj.RollNo+" "+obj.marks);
				}
	 }


}
