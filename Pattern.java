package method;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern ref= new Pattern();
int a=6;
ref.patternOne(a);
int b=5;
ref.patternTwo(b);
	}
void patternOne(int n)
{
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++)
		{
			System.out.print(" * ");
		}
			
	System.out.println(" ");
	}
		System.out.println("/////");
}
void patternTwo(int n1) {
	for(int i=n1;i>=1;i--) {
		for(int j=1;j<=i;j++)
		{
			System.out.print(" * ");
		}
	System.out.println(" ");
}
	}

}
