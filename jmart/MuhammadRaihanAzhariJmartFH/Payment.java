package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Payment extends Invoice implements FileParser
{
   
    int productId;
    public Shipment shipment;
  
    public Payment(int id, int buyerId, int storeId, int productId, Shipment shipment){
        super(id, buyerId, storeId);
        this.productId = productId;
        this.shipment = shipment;
    }
    
    public Invoice perform(){
        return null;
    }
    
    public double getTotalPay(){
        return 0.0;
    }
    public boolean validate(){
        return true;
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
