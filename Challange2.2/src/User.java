import java.io.*;
import java.util.*;

class AddingUser implements Serializable
{
	 public String name;
	 public String surname;	
	 public String email;
	 public String date_of_birth;
	 
	 public AddingUser(String name,String surname,String email,String date_of_birth) 
	 {
		this.name=name;
		this.surname=surname;
		this.email=email;
		this.date_of_birth=date_of_birth;
		
	}
	 public void calculateAge(String dateOfBirth)
	{
		String[] statement = dateOfBirth.split("/");
		String year=statement[2];
		int yearsold = 2021 - Integer.parseInt(year);
				
		System.out.println("You are "+ yearsold +" years old "); 
			
			
	}
	 public void display(String name,String surname)
	 {
		 System.out.println("Hello "+name+" "+surname);
	 }
	 public String toString(){
	      return name+"\t"+surname+"\t"+email+"\t"+date_of_birth;
	   }
}

public class User 
{
	 public static void main(String[] args) throws Exception
	 {
		 
		 ArrayList<AddingUser> al = new ArrayList<AddingUser>();
		 Scanner keyboard=new Scanner(System.in);
		 int options;
		 File file = new File("UserDatabase.txt");
		 ObjectOutputStream oos = null;
	     ObjectInputStream ois = null;
	     ListIterator li = null;
	     Validate objVal=new Validate();
	     
	     
	     
	     if(file.isFile()){
	         ois = new ObjectInputStream(new FileInputStream(file));
	         al = (ArrayList<AddingUser>)ois.readObject();
	         ois.close();
	      }
		 
		 
		 while(true)
			{
			
				System.out.println("1. Add a user");
				System.out.println("2. Delete a user");
				System.out.println("3. Update a user - Should prompt for email");
				System.out.println("4. List users - Displays all the users in the list array");
				System.out.println("5: Search a user using email");
				System.out.println("6: Sort User On Screen by name");
				
				System.out.println("_________________________________________________________");
				
				
				
				
				try {
					System.out.print("Enter options in the below menu :");
					options=keyboard.nextInt();
					
					switch (options) 
					{
					case 1:
						
					   
						   System.out.print("What is your name                    :");
							keyboard.nextLine();
							String name=keyboard.nextLine();
							if (Validate.isValidnames(name)!=true) {
								break;
			                } 
				                      
							System.out.print("What is your surname                :");
							String surname=keyboard.nextLine();
							if (Validate.isValidnames(surname)!=true) {
								break;
			                
							}
							System.out.print("What is your email                   :");
							String email=keyboard.nextLine();
							if(objVal.valEmail(email))
							{
							
							}else
							{
								System.out.print("Reenter  your email                   :");
								email=keyboard.nextLine();
							}
							
							System.out.print("Enter your date of birth (DD/MM/YYYY):");
							String date_of_birth=keyboard.nextLine();
						
							al.add(new AddingUser(name, surname, email, date_of_birth));
							AddingUser objAdding=new AddingUser(name, surname, email, date_of_birth);
							objAdding.calculateAge(date_of_birth);
							objAdding.display(name, surname);
							oos = new ObjectOutputStream(new FileOutputStream(file));
				            oos.writeObject(al);
				            oos.close();
				
						
						break;
					case 2:
						if(file.isFile()){
			                  ois = new ObjectInputStream(new FileInputStream(file));
			                  al = (ArrayList<AddingUser>)ois.readObject();
			                  ois.close();

			                  boolean found = false;
			                  System.out.print("Enter email to Delete : ");
			                  keyboard.nextLine();
			                  String Enteredemail = keyboard.nextLine();
			                  System.out.println("-------------------------------------");
			                  li = al.listIterator();
			                  while(li.hasNext()){
			                     AddingUser e = (AddingUser)li.next();
			                     if(e.email.equalsIgnoreCase(Enteredemail)){
			                        li.remove();
			                        found = true;
			                     }
			                  }
			                  if(found){
			                     oos = new ObjectOutputStream(new FileOutputStream(file));
			                     oos.writeObject(al);
			                     oos.close();
			                     System.out.println("Record Deleted Successfully....!");
			                  }
			                  else{
			                     System.out.println("Record Not Found...!");                      
			                  }
			                  System.out.println("-------------------------------------");
			               }else{
			                  System.out.println("File not Exists....!");
			               }
						break;
					case 3:

						if(file.isFile()){
			                  ois = new ObjectInputStream(new FileInputStream(file));
			                  al = (ArrayList<AddingUser>)ois.readObject();
			                  ois.close();

			                  boolean found = false;
			                  System.out.print("Enter eamil to Update : ");
			                  keyboard.nextLine();
			                  String emailEntered = keyboard.nextLine();
			                  System.out.println("-------------------------------------");
			                  li = al.listIterator();
			                  while(li.hasNext()){
			                     AddingUser e = (AddingUser)li.next();
			                     if(e.email.equalsIgnoreCase(emailEntered)){
			                    	System.out.print("What is your name     :");
			 					//	keyboard.nextLine();
			 						name=keyboard.nextLine();
			 						System.out.print("What is your surname     :");
			 						surname=keyboard.nextLine();
			 						
			 						System.out.print("Enter your date of birth (DD/MM/YYYY):");
			 						date_of_birth=keyboard.nextLine();
			                        li.set(new AddingUser(name, surname, emailEntered, date_of_birth));
			                        found = true;
			                     }
			                  }
			                  if(found){
			                     oos = new ObjectOutputStream(new FileOutputStream(file));
			                     oos.writeObject(al);
			                     oos.close();
			                     System.out.println("Record Updated Successfully....!");
			                  }
			                  else{
			                     System.out.println("Record Not Found...!");                      
			                  }
			                  System.out.println("--------------------------");
			               }else{
			                  System.out.println("File not Exists....!");
			               }
						
						break;
					case 4:
						if(file.isFile()){
			                  ois = new ObjectInputStream(new FileInputStream(file));
			                  al = (ArrayList<AddingUser>)ois.readObject();
			                  ois.close();

			                  System.out.println("-------------------------------------");
			                  li = al.listIterator();
			                  while(li.hasNext())
			                     System.out.println(li.next());
			                  System.out.println("-------------------------------------");
			               }else{
			                  System.out.println("File not Exists....!");
			               }
						
						break;
						
					case 5:
						if(file.isFile()){
			                  ois = new ObjectInputStream(new FileInputStream(file));
			                  al = (ArrayList<AddingUser>)ois.readObject();
			                  ois.close();

			                  boolean found = false;
			                  System.out.println("Enter eamil you want to Search : ");
			                  keyboard.nextLine();
			                  String email1 = keyboard.nextLine();
			                  System.out.println("-------------------------------------");
			                  li = al.listIterator();
			                  while(li.hasNext()){
			                     AddingUser e = (AddingUser)li.next();
			                     if(e.email.equalsIgnoreCase(email1)){
			                        System.out.println(e);
			                        found = true;
			                     }
			                  }
			                  if(!found)
			                     System.out.println("Record Not Found...!");
			                  System.out.println("-------------------------------------");
			               }else{
			                  System.out.println("File not Exists....!");
			               }
						break;
					case 6:
						if(file.isFile()){
			                  ois = new ObjectInputStream(new FileInputStream(file));
			                  al = (ArrayList<AddingUser>)ois.readObject();
			                  ois.close();

			                  Collections.sort(al, new Comparator<AddingUser>(){
			                     public int compare(AddingUser e1, AddingUser e2){
			                        return e1.name.compareTo(e2.name);
			                     }  
			                  });    

			                  System.out.println("-------------------------------------");
			                  li = al.listIterator();
			                  while(li.hasNext())
			                     System.out.println(li.next());
			                  System.out.println("-------------------------------------");
			               }else{
			                  System.out.println("File not Exists....!");
			               }
						break;
					default:
						System.out.println("Invalid User Input. Please enter a value from 0 to 4.");
						break;
					}
					
				} catch (InputMismatchException e) 
				{
					System.out.println("Invalid User Input. Please enter a value from 0 to 4.");
		           	
				}
			}
		 
		 
	 }
}
