
public class Sort1 
{

	
	//Method to display
	public static void print(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
				
				System.out.print(arr[i]+" ");

			
		}
		
	}
	
	
	

	public static void main(String[] args) 
	{

		int[] arr={15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,1,2,3,4,5,6,7,8,9,10,11,12,13,14,};
		
		print(arr);
		System.out.println(" ");
		System.out.println("-----------------------------------------------------------------");
		arr[20]=60;
		arr[21]=61;
		
		print(arr);
		
		
		
		
	}

}
