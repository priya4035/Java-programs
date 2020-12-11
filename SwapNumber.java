package method;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumber ref = new SwapNumber();
		int q = 9, e = 1;
		ref.swapNo(q, e);
		int z = 5, m = 78;
		ref.swapNo(z, m);

	}

	void swapNo(int a, int b) {
		a = a + b;// a=30
		b = a - b;// b=10
		a = a - b;// a=20
		System.out.println("a=" + a +" "+ "b=" + b);
	}
}
