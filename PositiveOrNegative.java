package method;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveOrNegative ref = new PositiveOrNegative();
		int a = 7;
		ref.positiveOrNegative(a);
		int b = -7;
		ref.positiveOrNegative(b);
		int c = 0;
		ref.positiveOrNegative(c);
	}

	void positiveOrNegative(int n) {
		if (n > 0)
					System.out.println(n + " " + "is positive");
		else if(n<0) {
			System.out.println(n + " " + "is negative");
		}
		
		if (n == 0) {
			System.out.println(n + " " + "is neither negative nor positive");
		}
	}
}
