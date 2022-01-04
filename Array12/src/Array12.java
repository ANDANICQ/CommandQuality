
public class Array12 {

	

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
				{

				int[][] arr=new int[100][30];
				
					
					
					print(arr);
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
							
							if(arr[i][j]%2==0 && arr[i][j]%11==0)
							{
							    System.out.print(arr[i][j]+" ");   
							}
							

							j++;
						}
						System.out.println();
						i++;
					}
					
					
					
				}

			
				

	


}
