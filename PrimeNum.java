
public class PrimeNum {

	public static void main(String[] args) {
		int a = 10;
		primeNumber(a);
		int b = 0;
		primeNumber(b);
		int c = 2;
		primeNumber(c);
		int d = 5;
		primeNumber(d);
		
	}

	// TODO Auto-generated method stub
	static void primeNumber(int n) {
		int flag = 0;
		{
			if (n == 0 || n == 1) {
				System.out.println(n +"is not a prime number" );
			} else {
				for (int i = 2; i <= n/2;++i) {
					if (n % i == 0) {
						System.out.println(n+ "is not a prime number" );
						flag = 1;
						break;
					}
				}
				if (flag == 0) {
					System.out.println(n+ "is a prime number" );
				}

			}
		}
	}
}