package com.MuhammadRaihanAzhariJmartFH;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Account extends Serializable
{
    String name;
    String email;
    String password;
    Store store;
    double balance;
    
    public static final String REGEX_EMAIL = "^([A-Za-z0-9|.|*|~|_|&]*?)@[A-Za-z0-9][A-Za-z0-9|-|.]";
    public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,100}$";
    
    public Account(String name, String email, String password, int id)
    {  
       this.name = name;
       this.email = email;
       this.password = password;
       this.id = super.id;
    }
    
    public Account(String name, String email, String password)
    {  
       this.name = name;
       this.email = email;
       this.password = password;
   
    }
    
     public boolean validate(){
    	Pattern pattern1 = Pattern.compile(REGEX_EMAIL);
    	Pattern pattern2 = Pattern.compile(REGEX_PASSWORD);
        Matcher matcher1 = pattern1.matcher(email);
        Matcher matcher2 = pattern2.matcher(password);
        
        if(matcher1.find() && matcher2.find() == true){
            return true;
        }
        else{
            return false;
        }
        
        
    }
    
    
    public String toString(){
        validate();
        return "ID: "+id+" Name: "+name+" email: "+email+" password: "+password+" status_REGECX: "+ validate();
    }
   

}
