import java.util.Random;

public class Array3 {

	public static void main(String[] args) 
	{
		Random random = new Random(); 
		int[] arr=new int[50];
		int i=0;
		int j=0;
		int x=0;

		// populated array of the size 50
		System.out.println("Random value of type double between 0 to 20:"); 
		while(i<arr.length)
		{
			arr[i]=random.nextInt(200);   
			i++;
			
		}
		//print each element using a for loop.
		while(j<arr.length)
		{
			System.out.print(arr[j]+" ");   
			j++;
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");
		System.out.println("Print even number and numbers divisible by 11 only..");
		System.out.println("------------------------------------------------------------");
		while(x<arr.length)
		{
			
			int even=arr[x]%2;
			int divisable=arr[x]%11;
			
			switch (even) {
			case 0:
				 System.out.print(arr[x]+" "); 
				break;

			default:
				break;
			}
			switch (divisable) {
			case 0:
				 System.out.print(arr[x]+" "); 
				break;

			default:
				break;
			}
			x++;
		}

	}

}
