package com.xworkz.staticexample.fields;

public class Trainee {

	String name;
	int id;
	String emailid;
	static String institute;
	int age;

	Trainee() {
		System.out.println("no arg-const");
	}

	Trainee(String inName, int inId, String inEmailid, int inAge) {
		name = inName;
		id = inId;
		emailid = inEmailid;
		age = inAge;
	}

	static void setInstitute(String institute) {
		 institute = "X-workz";
	}

	void displayDetails() {
		System.out.println("Name: " + name  +  "ID: "+ id  +  "EmailId: " +emailid   +  "Institute: " +institute +  "Age: "+age);
	}

	{
		System.out.println("intialization of variables");
	}
	static {
		System.out.println("initilization of static");
		institute="xworkz";
	}
}