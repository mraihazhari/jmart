package MuhammadRaihanAzhariJmartFH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Store extends Recognizable implements FileParser
{
    
    public String name;
    public String address;
    public String phoneNumber;
    
    public static final Pattern REGEX_PHONE = Pattern.compile("[n{9,12}]");
    public static final Pattern REGEX_NAME = Pattern.compile("[^(A-Z][n{4,20}]");
    
    
  
    public Store(int accountId, String name,String address, String phoneNumber){
       super(accountId);
       this.name = name;
       this.address = address;
       this.phoneNumber = phoneNumber;

       
    }
    public Store(Account account, String name, String address, String phoneNumber){
       super(1);
       this.name = name;
       this.address = address;
       this.phoneNumber = phoneNumber;
        
    }
    
    public boolean validate(){
        Matcher matcher1 = REGEX_NAME.matcher(name);
        Matcher matcher2 = REGEX_PHONE.matcher(phoneNumber);
        
        if(matcher1.find() && matcher2.find() == true){
            return true;
        }
        else{
            return false;
        }
        
        
    }
    public boolean read (String content){
        return false;
    }
    public Object write(){
        return null;
    }
    public Object newInstance(String content){
        return 0;
    }

   
}
