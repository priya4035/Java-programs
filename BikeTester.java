
public class BikeTester {

	public static void main(String[] args) {
		
		Bike rx= new Bike("RX","Red",85000.00);
		rx.displayDetails();
		rx.driving();

		 System.out.println("////////////////");
		  
		 Bike ktm = new Bike("KTM","Orange",100000.00);
		 ktm.driving();
		 ktm.displayDetails();
	}

}
