import java.util.*;
import java.util.regex.*;

public class Validate {
	 public static boolean isValidnames(String name)
	    {
	  
	        
	        String regex = "^[A-Za-z]\\w{3,29}$";
	  
	      
	        Pattern p = Pattern.compile(regex);
	  
	        
	        if (name == null) {
	            return false;
	        }
	  
	        Matcher m = p.matcher(name);
	  
	        return m.matches();
	    }
	    public static boolean valEmail(String eml)
	    {
	        String emailRegex = "[\\w-]{1,20}@\\w{2,20}\\.\\w{2,5}$";
	        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
	        Matcher matcher = emailPat.matcher(eml);
	        return matcher.matches();
	    }
	 
}
