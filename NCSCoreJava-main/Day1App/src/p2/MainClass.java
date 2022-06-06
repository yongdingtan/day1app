package p2;

public class MainClass {

	public static void main(String[] args) {
		Sample obj1 = new Sample();
		obj1.x = 10;
		obj1.ch = 'A';
		System.out.println(obj1);
		doStuff(obj1);
		
		Sample obj2 = new Sample();
		obj1.x = 100;
		obj1.ch = 'Z';
		System.out.println(obj2);
		doStuff(obj2);
		
		
		Sample obj3 = null;
		doStuff(obj3);
		
		
	}
	
	public static void doStuff(Sample s) // xyz business method
	{
		s.doSomeWork();
	}
	
	
}
