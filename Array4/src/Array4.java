
public class Array4 {

	public static void main(String[] args) {
		int[] arr=new int[50];
		
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
			if(arr[i]%2==0 || arr[i]%11==0)
			{
			    System.out.print(arr[i]+" ");   
			}
		}

	}

}
