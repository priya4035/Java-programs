
public class PositiveNegative {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a = 100;
		search(a);

		int b = -10;
		search(b);

		int c = 0;
		search(c);

	}

	static void search(int num) {
		if (num == 0) {
			System.out.println("the num is zero");
		} else if (num > 0) {
			System.out.println("the num is positive"+ " " + num);
		} else {
			System.out.println("the num is negative" +" "+ num);
		}
	}

}
