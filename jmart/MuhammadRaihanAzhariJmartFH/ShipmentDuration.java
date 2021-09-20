package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class ShipmentDuration here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShipmentDuration
{
    // instance variables - replace the example below with your own
    public static ShipmentDuration INSTANT = new ShipmentDuration(1<<0);
    public static ShipmentDuration SAME_DAY = new ShipmentDuration(1<<1);
    public static ShipmentDuration NEXT_DAY = new ShipmentDuration(1<<2);
    public static ShipmentDuration REGULER = new ShipmentDuration(1<<3);
    public static ShipmentDuration KARGO = new ShipmentDuration(1<<4);
    public int bit;
    
    private ShipmentDuration(int bit){
        this.bit = bit;
    }
    
    public ShipmentDuration(ShipmentDuration... args){
       //ShipmentDuration.KARGO = 00010000;
       // ShipmentDuration.INSTANT | ShipmentDuration.REGULER = 00000101;
       // ShipmentDuration.KARGO | ShipmentDuration.SAME_DAY = 00010010;
       // ShipmentDuration.INSTANT | ShipmentDuration.SAME_DAY | ShipmentDuration.NEXT_DAY = (00000111);
        
    }
    
   // public boolean isDuration(ShipmentDuration reference){
        
   // }
 
}
