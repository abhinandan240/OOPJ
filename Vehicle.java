package in.Assignment4.cdac;

import java.util.Scanner;

public class Vehicle {
	public String name;
	public int modelNo ;
	public float price ;
	 
	void display() {
		System.out.println( name+"\n"+modelNo+"\n"+price );
	}
	void recordData() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Vehicle name :" );
		 name =sc.nextLine();
		 System.out.println("Enter Vehicle ModelNo :" );
		 modelNo =sc.nextInt();
		 System.out.println("Enter Vehicle price :" );
		 price =sc.nextFloat();
		 sc.close();
	}
	
  void recordData(String name) {
	 this.name = name;
	  
  }
  void recordData(String n, Float p) {
	name= n;
	price =p;
  }
  
 public static void main(String[] arg) {
	 Vehicle obj1 = new Vehicle();
	 //Vehicle obj2 = new Vehicle();
	// Vehicle obj3 = new Vehicle();

	 obj1.recordData();
	 obj1.display();
	// obj2.recordData("Bajaj");
	// obj2.display();
	 //obj3.recordData("Avenger", 2500.25f);
	// obj3.display();
	 
	 obj1.recordData("Bajaj");
	 obj1.display();
	 
	 obj1.recordData("Avenger", 2500.25f);
	 obj1.display();
	 
}
	 
	 
 }