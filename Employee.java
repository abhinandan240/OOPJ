package in.Assignment.four;

import java.util.Scanner;

public class Employee {
	public String name;
	public int empid ;
	public double salary;
	
	void setRecord() {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee name :" );
		 name =sc.nextLine();
		 System.out.println("Enter Employee ID :" );
		 empid =sc.nextInt();
		 System.out.println("Enter Employee Salary :" );
		 salary =sc.nextDouble();
		 sc.close();
	}
	void setRecord(String name1,int empid1) {
		name =name1;
		empid = empid1;
	
	}
	void setRecord(String n,int e,double s) {
		name =n;
		empid = e;
	    salary=s;
	}
	void display() {
		
		 System.out.println(name+"\n"+empid+"\n"+salary );
	}
	public static void main(String[] arg) {
		 Employee data = new Employee ();
		 data.setRecord();
		 data.display();
		 data.setRecord("Abhishek", 8005);
		 data.display();
		 data.setRecord("Rohan", 8006, 0858d);
		 data.display();
}
}
