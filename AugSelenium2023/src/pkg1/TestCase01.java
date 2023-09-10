package pkg1;



public class TestCase01 {

	static int x=100;
	int b=200;
	
	public static void main(String[] args) {
		
		TestCase01.x=200;
		System.out.println(TestCase01.x);
		
		TestCase01 obj1=new TestCase01();
		System.out.println(obj1.b); 
		obj1.b=300;
		System.out.println(obj1.b);
		
		TestCase01.x=400;
		System.out.println(TestCase01.x);
		
	}
}
