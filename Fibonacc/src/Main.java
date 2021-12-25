
public class Main {

    public static void fibonacciDisplay(int maxNumber,int previousNumber,int nextNumber)
    {
    	//This function display fibonacci from 0 to 200
    	   for (int i = 1; previousNumber <= maxNumber; ++i)
	        {
	            System.out.println(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */

	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	       }

    	
    }
	public static void main(String[] args) 
	{
	
		        // Set it to the number of elements you want in the Fibonacci Series
				 int maxNumber = 200; 
				 int previousNumber = 0;
				 int nextNumber = 1;
				 
			     System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
		     
			     fibonacciDisplay(maxNumber,previousNumber,nextNumber);
			     
	}

}

