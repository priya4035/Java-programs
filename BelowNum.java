
public class BelowNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		below(a);
		int b = 99;
		below(b);
		int c = 101;
		below(c);
	}

	static void below(int n) {
		if (n < 100) {
			System.out.println("below hundred " + n);
		} else {
			System.out.println("above hundred" + n);
		}
	}

}
