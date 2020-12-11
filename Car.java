
public class Car {
	String color;
	String brand;
	double cost;
	String typeofcar;

	Car() {

	}

	Car(String inColor, String inBrand, double inCost, String inTypeofcar) {
		color = inColor;
		brand = inBrand;
		cost = inCost;
		typeofcar = inTypeofcar;

	}

	void driving() {
		System.out.println("car driving");
	}

	void racing() {
		System.out.println("car racing");
	}
}