import java.util.Random;

public class Array2 {

	public static void main(String[] args) 
	{
		Random random = new Random(); 
		int[] arr=new int[50];

		// populated array of the size 50
		System.out.println("Random value of type double between 0 to 20:"); 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=random.nextInt(200);   
			
		}
		//print each element using a for loop.
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");   
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("Print even number and numbers divisible by 11 only..");
		System.out.println("------------------------------------------------------------");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0 || arr[i]%11==0)
			System.out.print(arr[i]+" ");   
		}
		

	}

}
