package method;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial ref = new Factorial();
		int a = 5;
		ref.factorial(a);
		int b = 3;
		ref.factorial(b);
		int c = 10;
		ref.factorial(c);
	}

	void factorial(int n) {
		int multi = 1;
		for (int i = 1; i <= n; i++)
			multi *= i;
		System.out.println("factorial of a num"+" "+ n+" " +"is"+" " + multi);
	}
}
