
public class Array10 {

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
			int[][] arr=new int[100][30];
			
			
			
			print(arr);
			arr=add1(arr);
			System.out.println("------------------------------------------------------------");

			print(arr);
			
		}


}
