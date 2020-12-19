package com.xworkz.staticexample.fields;

public class TraineeTester {

	public static void main(String[] args) {

		Trainee vasu = new Trainee("Vasu", 2, "vasu333@oo.com", 23);
		Trainee.setInstitute("Xworkz");
		vasu.displayDetails();
		
		Trainee raj = new Trainee("Raj", 3, "raj@gmail.com", 21);
		raj.displayDetails();
		
		Trainee prabu = new Trainee("Prabu", 4, "prabus@com", 24);
		prabu.displayDetails();
		Trainee.setInstitute("XWorkz");

	}

}
