import java.lang.*;
import java.util.Random;
public class Array1 {

	
	public static void main(String[] args)
	{
		Random random = new Random(); 
		int[] arr=new int[50];

		// populated array of the size 50
		System.out.println("Random value of type double between 0 to 400:"); 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=random.nextInt(400);   
			
		}
		
		
		//print each element using a for loop.
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");   
		}
		System.out.println("");
		System.out.println("Adding 1 to each element in the array.");
		
		//add 1 to each element in the array.
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr[i]+1;   
			
		}
		
		// print the incremented values in the array.
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");   
		}
		
		 
		

	}

}
