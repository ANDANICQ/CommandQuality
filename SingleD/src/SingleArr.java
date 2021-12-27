
public class SingleArr {

	//Split String into an array
	public static String[] convertArr(String line)
	{
	    String[] arr = line.split(",");
	
		return arr;
	}
  //Converting String arr into int
	
	public static int[] convertStrToInt(String[] arr,int len)
	{
		int[] arrInt= new int[len];
		for(int i=0;i<len;i++)
		{
			arrInt[i]=Integer.parseInt(arr[i]);
		}
		
		return arrInt;
		
	}
	//Sorting array  
    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	

	public static void main(String[] args) 
	{

		
		String line = "1,4,3,2,3,7,5,6,9"; 
		String[] arr=convertArr(line);
		
		int len=arr.length;
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			
		}
		System.out.println("");
		
		System.out.println("----------------Sorted--------------- ");
		
		
		int[] arrInt=convertStrToInt(arr, len);
		bubbleSort(arrInt);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arrInt[i]);
			
		}
		System.out.println("");

	}

}
