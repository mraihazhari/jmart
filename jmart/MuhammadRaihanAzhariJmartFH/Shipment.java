package MuhammadRaihanAzhariJmartFH;

import java.text.*;
import java.util.Calendar;
import java.util.Date;


/**
 * Write a description of class Shipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Shipment implements FileParser
{
    public String address;
    public int shipmentCost;
    public Duration duration;
    public String receipt;
    
    
    public static class Duration
    {
    // instance variables - replace the example below with your own
    public static final Duration INSTANT = new Duration((byte)(1<<0));
    public static final Duration SAME_DAY = new Duration((byte)(1<<1));
    public static final Duration NEXT_DAY = new Duration((byte) (1<<2));
    public static final Duration REGULER = new Duration((byte)(1<<3));
    public static final Duration KARGO = new Duration((byte)(1<<4));
    public static final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("E MMMM dd yyyy");
    public byte bit;
    
    private Duration(byte bit){
        this.bit = bit;
    }
    
    public String getEstimatedArrival(Date reference){
      Calendar newDate = Calendar.getInstance();
      if(bit == (1<<0)){
          return ESTIMATION_FORMAT.format(reference.getTime());
      }
      else if(bit == (1<<1)){
          return ESTIMATION_FORMAT.format(reference.getTime());
      }
      else if (bit == (1<<2)){
          newDate.setTime(reference);
          newDate.add(Calendar.DATE, 1);
          return ESTIMATION_FORMAT.format(newDate.getTime());
      }
      else if (bit == (1<<3)){
          newDate.setTime(reference);
          newDate.add(Calendar.DATE, 2);
          return ESTIMATION_FORMAT.format(newDate.getTime());
      }
      else{
          newDate.setTime(reference);
          newDate.add(Calendar.DATE, 5);
          return ESTIMATION_FORMAT.format(newDate.getTime());
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
    
    public Shipment(String address, int shipmentCost, Duration duration, String receipt){
        this.address = address;
        this.shipmentCost = shipmentCost;
        this.duration = duration;
        this.receipt = receipt;
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
