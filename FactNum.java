
public class FactNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2;
		factorial(n);

		int n1 = 6;
		factorial(n1);

		int n2 = 5;
		factorial(n2);
	}

	static void factorial(int num) {
		int multi = 1;
		for (int i = 1; i <= num; i++)
			multi = multi * i;
		System.out.println("factorial value is:" + multi);

	}

}
