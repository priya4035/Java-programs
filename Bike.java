
public class Bike {
 
	String name;
	String color;
	double price;
	 
	{
		System.out.println("initlization 1");
	}
	 
	Bike(){
		System.out.println("no arg const");
	}
	{
		System.out.println("initilization 2");
	}
	Bike(String inName,String inColor,double inPrice){
		name=inName;
		color=inColor;
		price=inPrice;
	}
	void driving() {
		System.out.println("driving the bike");
	}
	void displayDetails() {
		System.out.println("NAME: "+name+" "+ "COLOR: "+color +" "+ "PRICE: "+price);
	}
	{
		System.out.println("initilization 3");
	}
	static {
		System.out.println("initilization 4");
	}
}
