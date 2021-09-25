package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Complaint extends Transaction implements FileParser
{
    // instance variables - replace the example below with your own
    public int paymentId;
    public String desc;
    
    public Complaint(int id, Payment payment, String descs){
        super(id, 1, 1);
        this.desc = desc;
    }
    
    public Complaint(int id, int buyerId, int storeId, int paymentId, String desc )
    {
      super(id, buyerId, storeId);
      this.paymentId = paymentId;
      this.desc = desc;
      
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
