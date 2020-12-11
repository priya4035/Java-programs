package method;

public class PrimeNum {

	public static void main(String[] args) {
		PrimeNum ref = new PrimeNum();
		int a = 1;
		ref.findNum(a);
		int b = 0;
		ref.findNum(b);//called method
		int c = 9;
		ref.findNum(c);
		int d = 23;
		ref.findNum(d);
		int e=5;
		ref.findNum(e);
		int f=80;
		ref.findNum(f);

	}

	void findNum(int n) {
		if(n==1||n==0)
		{
			System.out.println("is not a prime num"+" "+n);//method calling
		}else 
		{
			boolean flag=false;
			for (int i = 2; i <= n / 2; ++i)
			{
				if (n % i == 0)
				{
					System.out.println("the num is not a prime num"+n);
					flag = true;
					break;
				}
			}
			
		if (!flag) 
			System.out.println("the num is a prime num"+n);
			
		}
		}
	}

