
public class Bike {
	String color;
	String brand;
	double cost;
	String typeofbike;

	Bike() {

	}

	Bike(String inColor, String inBrand) {
		color = inColor;
		brand = inBrand;

	}

	Bike(String inColor, String inBrand, double inCost, String inTypeofbike) {
		color = inColor;
		brand = inBrand;
		cost = inCost;
		typeofbike = inTypeofbike;

	}

	void driving() {
		System.out.println("bike driving");
	}

	void racing() {
		System.out.println("bike racing");
	}
}
