package email;
import java.util.regex.*;    
import java.util.*;    


public class Validation {
	
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("mahi@123.com");  
        emails.add("santhosh@41634.com");  
        emails.add("guru1.com");  
        emails.add("qwdinfc@123.com");  
        emails.add("@yahoo.com");  
        emails.add("mahi#gmail.com");  
        String regex = "^(.+)@(.+)$";     
        Pattern pattern = Pattern.compile(regex);  
        for(String email : emails){  
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}



