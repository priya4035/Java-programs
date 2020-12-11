
public class BikeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike activaHonda = new Bike();
		System.out.println("bike color :" + activaHonda.color);
		System.out.println("bike brand :" + activaHonda.brand);
		System.out.println("bike cost :" + activaHonda.cost);
		System.out.println("is it petrol or electric :" + activaHonda.typeofbike);

		System.out.println("////////////");
		Bike dio = new Bike("Black", "Dio", 60000, "Petrol");

		System.out.println("bike color :" + dio.color);
		System.out.println("bike brand :" + dio.brand);
		System.out.println("bike cost :" + dio.cost);
		System.out.println("is it petrol or electric :" + dio.typeofbike);
		
		System.out.println("===============");
		 
		Bike ktm = new Bike("White","KTM");
		System.out.println("bike color :" + ktm.color);
		System.out.println("bike brand :" + ktm.brand);
              
		System.out.println(":::::::::::::::::::::");
	 dio.color ="red";
	 System.out.println("color : "+ dio.color);
	 
	  System.out.println(",,,,,,,,");
	 dio.driving();
	  activaHonda.racing();
	}

}
