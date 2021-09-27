package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Shipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Shipment implements FileParser
{
    public class Duration
    {
    // instance variables - replace the example below with your own
    public  Duration INSTANT = new Duration(1<<0);
    public Duration SAME_DAY = new Duration(1<<1);
    public  Duration NEXT_DAY = new Duration(1<<2);
    public  Duration REGULER = new Duration(1<<3);
    public  Duration KARGO = new Duration(1<<4);
    public int bit;
    
    private Duration(int bit){
        this.bit = bit;
    }
    
    
    public boolean isDuration(Duration reference){
        if((this.bit & reference.bit) == reference.bit){
            return true;
        }
        else{
            return false;
        }
    }
    
    }
    
    public class MultiDuration
    {
        public byte bit;
        
        public MultiDuration (Duration... args){
            for(Duration i: args){
                this.bit |= i.bit;
            }
        }
        public boolean isDuration(Duration reference){
            if((this.bit & reference.bit) == reference.bit){
                return true;
            }
            else{
                return false;
            }
        }
        
    }
    
    public Shipment (String address, int shipmentCost, Duration duration, String receipt){
        
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
