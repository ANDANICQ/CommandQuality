import java.util.Random;

public class ArrayName {

	
		//Method to display
		public static void print(int arr[][])
		{
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		//method to add 1 
		public static int[][] add1(int arr[][])
		{
			int[][] newArr=new int[100][30];
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					
				   newArr[i][j]=arr[i][j]+1;			}
				
			}
			
			return newArr;
		}
		
		

		public static void main(String[] args) 
		{
			Random random = new Random(); 
			int[][] arr=new int[100][30];
			
			// populated array of the size 50
			System.out.println("Random value of type double between 0 to 400:"); 
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					
				    arr[i][j]=random.nextInt(400);   
						
				}
			}
			
			arr=add1(arr);
			System.out.println("------------------------------------------------------------");
			
			
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					
					if(arr[i][j]%2==0 && arr[i][j]%11==0)
					{
					    System.out.print(arr[i][j]+" ");   
					}
							
				 }
				
			}
			
		}

	
		
		
		
		


}
