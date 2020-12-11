
public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car hondaCity = new Car();
		System.out.println("car color :" + hondaCity.color);
		System.out.println("car brand :" + hondaCity.brand);
		System.out.println("car cost :" + hondaCity.cost);
		System.out.println("is it petrol or diesel :" + hondaCity.typeofcar);

		System.out.println("////////////");
		Car bmw = new Car("Black", "BMW", 60000000, "Petrol");

		System.out.println("car color :" + bmw.color);
		System.out.println("car brand :" + bmw.brand);
		System.out.println("car cost :" + bmw.cost);
		System.out.println("is it petrol or diesel :" + bmw.typeofcar);
              
	 bmw.color ="red";
	 System.out.println("color : "+ bmw.color);
	  
	 bmw.driving();
	  hondaCity.racing();
	}

}
