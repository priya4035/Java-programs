
public class MemoryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
        MemoryManagement ref=new MemoryManagement();
        ref.method1(i);
        System.out.println(i);
	}
void method1(int num) {
	method2();
	System.out.println(num);
}
void method2() {
	Car c=new Car();
	c.color="black";
	c.years= 5;
}
}
class Car{
	String color;
	int years;
	void driving() {
		
	}
}
