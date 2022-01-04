import java.util.Random;

public class Array9 {

	//Method to display
			public static void print(int arr[][])
			{
				int i=0;
				while(i<arr.length)
				{
					int j=0;
					while(j<arr[i].length)
					{
						
						System.out.print(arr[i][j]+" ");
						j++;
					}
					System.out.println();
					i++;
				}
				
			}
			//method to add 1 
			public static int[][] add1(int arr[][])
			{
				int[][] newArr=new int[100][30];
				
				
				int i=0;
				while(i<arr.length)
				{
					int j=0;
					while(j<arr[i].length)
					{
						
						newArr[i][j]=arr[i][j]+1;
						j++;
					}
					
					i++;
				}
				
				return newArr;
			}
			
			

			public static void main(String[] args) 
			{Random random = new Random(); 
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
				
				int i=0;
				while(i<arr.length)
				{
					int j=0;
					while(j<arr[i].length)
					{
						
						int even=arr[i][j]%2;
						int divisable=arr[i][j]%11;
						
						switch (even) {
						case 0:
							 System.out.print(arr[i][j]+" "); 
							break;

						default:
							break;
						}
						switch (divisable) {
						case 11:
							 System.out.print(arr[i][j]+" "); 
							break;

						default:
							break;
						}

						j++;
					}
					System.out.println();
					i++;
				}
				
				
				
			}

		
			

}
