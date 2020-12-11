package method;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digit ref = new Digit();
		int a = 123;
		ref.tracedigit(a);
		int b = 23;
		ref.tracedigit(b);
		int c = 1;
		ref.tracedigit(c);
		int d = 145260;
		ref.tracedigit(d);
	}

	void tracedigit(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}

		System.out.println("the num of digits is" + count);
	}
}
