package p1;

public class ControlStatementApp {
	
	public static void main(String[] args) {
		
		int x = 10;
		boolean b = false;
		
		//if (x = 10)  // error
		if(b = true)
		{
			System.out.println("valid");
		}
		else if(x == 20)
		{
			System.out.println("error");
		}
		else
		{
			System.out.println("not a option");
		}
		
		// ---------------------------
		// switch case
		
		int xx = 3; // entered by user
		switch (xx) {
		case 1:
			System.out.println("one");
			break;
		case 3:
			System.out.println("three");
			
		case 2:
			System.out.println("Two");
			break;
			

		
		}//end switch
		
		// -----------------
		// for 

		for(int i = 0;i<10;i++) {
			System.out.println(i);
		}//end for
	}//end main

}//end class



















