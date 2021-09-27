package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Complaint extends Recognizable implements FileParser
{
    // instance variables - replace the example below with your own
    public int paymentId;
    public String desc;
    public String date;
    
    
    public Complaint (int id, String desc){
        super(id);
        this.paymentId = id;
        this.desc = desc;
        this.date = "String apapun";
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
