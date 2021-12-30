import java.util.Arrays;
import java.util.Collections;

public class TwoDarray 
{
    public static String[][] lineToArr(String line)
    {
    	   
	    String[] rows = line.split("\n");

	    String[][] matrix = new String[rows.length][]; 
	    int r = 0;
	    for (String row : rows) {
	        matrix[r++] = row.split(",");
	       
	    }

	    
	    return matrix;
    }
    public static int[][] strToInt(String[][] arr,int len)
    {
    	int[][] intArr=new int[len][];
    	for (int i = 0; i < arr.length; i++)
  	    {
              for (int j = 0; j < arr[i].length; j++)
              {
                  intArr[i][j]=Integer.parseInt(arr[i][j]);
                  
              }
             
  	    }
    
    	
    	return intArr;
    }
    
    public static void sortRowWise(String m[][])
    {
        // loop for rows of matrix
        for (int i = 0; i < m.length; i++) {
 
            // loop for column of matrix
            for (int j = 0; j < m[i].length; j++) {
 
                // loop for comparison and swapping
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (Integer.parseInt(m[i][k]) >Integer.parseInt( m[i][k + 1])) {
 
                        // swapping of elements
                        String t =m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }
        
        for (int i = 0; i < m.length; i++)
	    {
            for (int j = 0; j < m[i].length; j++)
            {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
	    }
	    
 
     
        
    }
	
	public static void main(String[] args) 
	{
		String line="1,4,3,2,3,7,5,6,9\n"+
                "8,6,3,7,3,7,5,6,9\n"; 
	    String[][] strArr=lineToArr(line);
	    int len=strArr.length;
	    
	    for (int i = 0; i < strArr.length; i++)
	    {
            for (int j = 0; j < strArr[i].length; j++)
            {
                System.out.print(strArr[i][j] + " ");
            }
            System.out.println(" ");
	    }
	    
	    
		System.out.println("----------------Sorted--------------- ");
		sortRowWise(strArr);
		
		

		
	}

}
