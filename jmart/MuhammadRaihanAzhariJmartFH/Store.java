package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Store extends Recognizable implements FileParser
{
    
    String name;
    String address;
    String phoneNumber;
  
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
