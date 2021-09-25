package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Account extends Recognizable implements FileParser
{
    String name;
    String email;
    String password;
    
    public Account(int id, String name, String email, String password)
    {  
       super(id);
       this.name = name;
       this.email = email;
       this.password = password;
       this.id = id;
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
