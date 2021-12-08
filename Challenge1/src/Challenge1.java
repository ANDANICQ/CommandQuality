import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Challenge1 
{

	public static void main(String[] args) 
	{
		
		
        Scanner keyboard=new Scanner(System.in);
        final double mileToKm=0.621371;
		
		String name;
		String surname;		
		String date_of_birth;
		double distance_from_store;
		double distanceInMiles;
		double distanceInMeter;
		long ageInSec;
		long ageInMillsec;
		
		System.out.print("What is your name     :");
		name=keyboard.nextLine();
		
		//checking if name is Empty
		while( name.isEmpty()==true)
		{
			System.out.print("What is your name     :");
			name=keyboard.nextLine();
		}
		
		System.out.print("What is your surname  :");
		surname=keyboard.nextLine();
	
		//checking if surname is Empty
		while( surname.isEmpty()==true)
		{
			System.out.print("What is your surname  :");
			surname=keyboard.nextLine();
		}
		
		System.out.print("Enter your date of birth (DD/MM/YYYY):");
		date_of_birth=keyboard.nextLine();
		
		//checking if date for birth follows  follows format
		while(dateValidation(date_of_birth)!=true)
		{
			System.out.print("Enter your date of birth (DD/MM/YYYY):");
			date_of_birth=keyboard.nextLine();
		}
		
		
		System.out.print("How far is your favourite store from your home in KM? "); 
		distance_from_store=keyboard.nextDouble();
		
		
		//checking if distance is > and not equals to zero
		while(distance_from_store <= 0)
		{
			System.out.print("How far is your favourite store from your home in KM? "); 
			distance_from_store=keyboard.nextDouble();
		}
		
		
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------------");
		
		System.out.println("Hello "+name+" "+surname);
		String[] statement = date_of_birth.split("/");
		String year=statement[2];
		int yearsold = 2021 - Integer.parseInt(year);
		
		System.out.println("You are "+ yearsold +"years old "); 
		
		distanceInMiles=mileToKm*distance_from_store;
		distanceInMeter=1000*distance_from_store;
		
		System.out.println("You are  "+distanceInMiles+" miles far from store ");
		System.out.println("You are  "+distanceInMeter+" meter far from store ");
		
		//Leap year
		int countLeap=0;
		int tempYear=Integer.parseInt(year);
        while(tempYear<=2021)
        {
        	boolean isLeapYear = ((tempYear % 4 == 0) && (tempYear % 100 != 0) || (tempYear % 400 == 0));

            if (isLeapYear)
            {
                countLeap++;
            } 
           
        	
            tempYear++;
        }
        
        
        ageInSec = ((yearsold * 365)-countLeap) * 24 *60*60; 
		
		System.out.println("You age "+ageInSec+" seconds old");
		
		ageInMillsec=ageInSec*1000;
		System.out.println("You age "+ageInMillsec+" millseconds old");
		
		
		
		
		System.out.println("--------------------------------------------------------------------------------------------");	
		dateToBinOctHex(date_of_birth);
    
	}
	
	private static boolean dateValidation(String date)
    {
      boolean status = false;
      if (checkDate(date)) 
      {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
            	dateFormat.parse(date);
            	status = true;
            } catch (Exception e) 
            {
            	status = false;
            }
      }
      return status;
    
    }
    
    static boolean checkDate(String date) {
    String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
    boolean flag = false;
    if (date.matches(pattern)) {
      flag = true;
    }
    return flag;
  }
    
    public static void dateToBinOctHex(String dateOfBirth)
    {
    	String[] statement = dateOfBirth.split("/");
		int year=Integer.parseInt(statement[2]);
		int month=Integer.parseInt(statement[1]);
		int days=Integer.parseInt(statement[0]);
		
		System.out.println("Your birthdate in Binary :"+Integer.toBinaryString(days)+"/"+Integer.toBinaryString(month)+"/"+Integer.toBinaryString(year));
		System.out.println("Your birthdate in Octat :"+Integer.toOctalString(days)+"/"+Integer.toOctalString(month)+"/"+Integer.toOctalString(year));
		System.out.println("Your birthdate in Hex :"+Integer.toHexString(days)+"/"+Integer.toHexString(month)+"/"+Integer.toHexString(year));
		
		
	
	
    }

}
