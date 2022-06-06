import java.util.Scanner; // getting scanner from different folder

public class DemoClass {
	
	public static void main(String arg[]) // main + control+space
	{
		Scanner sc = new Scanner(System.in);// creating scanner class Object
		System.out.println("Enter First Value "); // shortcut :- sysout + control+space
		int x = sc.nextInt();
		
		System.out.println("Enter Second Value ");
		int y = sc.nextInt();
		
		int sum = x+y;
		System.out.println("Sum :- "+sum);
		
	}//end main
}//end class


// javac command compiles the code 
// java <public - class - name>  :- runs the code 
