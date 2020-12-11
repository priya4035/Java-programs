
public class FindingEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		findEven(n);

		int n1 = 19;
		findEven(n1);

		int n2 = 44;
		findEven(n2);

	}

	static void findEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " " + "is even");

		} else {
			System.out.println(num + " " + "is odd");
		}
		System.out.println("end of the program");
	}

}
