import java.util.Scanner;

public class MenuDrivenCalculator {

	public static void main(String[] args) 
	{
		
		Scanner keyboard=new Scanner(System.in);
		
		int firstNum;
		int SecNum;
		char methematicalOpe;
		
		
		try 
		{
		      
					System.out.print("Enter your First Number           :");
					firstNum=keyboard.nextInt();
					System.out.print("Enter your mathematical operation :");
					methematicalOpe=keyboard.next().charAt(0);	
					System.out.print("Enter your Second Number          :");
					SecNum=keyboard.nextInt();
					switch (methematicalOpe) {
					case '*':
						System.out.println("You Answer                        :"+firstNum+" "+methematicalOpe+" "+SecNum+" ="+(firstNum*SecNum));
						break;
					case '+':
						System.out.println("You Answer                        :"+firstNum+" "+methematicalOpe+" "+SecNum+" ="+(firstNum+SecNum));
						break;
					case '-':
						System.out.println("You Answer                        :"+firstNum+" "+methematicalOpe+" "+SecNum+" ="+(firstNum-SecNum));
						break;
					case '/':
						System.out.println("You Answer                        :"+firstNum+" "+methematicalOpe+" "+SecNum+" ="+(firstNum/SecNum));
						break;
					case '%':
						System.out.println("You Answer                        :"+firstNum+" "+methematicalOpe+" "+SecNum+" ="+(firstNum%SecNum));
						break;
					
					default:
						System.out.println(methematicalOpe+" does not exists");
						
						break;
					}
			
			
		    } catch (Exception e) {
		      System.out.println("You entered incorrect input");
		    }
		
		
		
	}

}
