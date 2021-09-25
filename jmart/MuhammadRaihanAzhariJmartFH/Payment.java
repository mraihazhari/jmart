package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Payment extends Transaction implements FileParser
{
   
    int productId;
    public ShipmentDuration shipmentDuration;
    public Payment(int id, int buyerId, Product product, ShipmentDuration shipmentDuration)
    {
       super(id, buyerId, 1); 
    }
    public Payment(int id, int buyerId, int storeId, int productId, ShipmentDuration shipmentDuration){
        super(id, buyerId, storeId);
        this.productId = productId;
        this.shipmentDuration = shipmentDuration;
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
