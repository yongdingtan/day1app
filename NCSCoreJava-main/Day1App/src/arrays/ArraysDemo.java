package arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		
		ArraysDemo app = new ArraysDemo();
		int arr[] = new int[5];
		
		app.insertValue(arr, 999, 2);
		app.insertValue(arr, 889, 0);
		app.insertValue(arr, 777, 3);
		
		app.displayArray(arr);
		
		
	}//end main
	
	public void insertValue(int arr[],int value,int location)
	{
		if(location>-1 && location <5)
		{
			arr[location] = value;
		}
	}
	
	public void displayArray(int arr[])
	{
		for (int value : arr) {
			System.out.println(value);
		}
	}

}//endclass
