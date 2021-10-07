package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Jmart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Jmart
{
  
     public static Product createProduct(){
         return null;
     }
     public static Coupon createCoupon(){
         Coupon kupon1 = new Coupon("GratisOngkir", 12345, Coupon.Type.REBATE, 1000.0, 500.0);
         kupon1.isUsed();
         return kupon1;
     }
     public static Product ShipmentDuration(){
         return null;
     }
    

    public static void main(String[] args){
    	System.out.println("Hello From eclipe");
        Account akun1 = new Account(1, "Azhari", "azhariraihan2002@gmail.com", "luLusoop123");
        System.out.println(akun1.toString());
        Complaint komplen1 = new Complaint(1, "Kurir Salah Alamat");
        System.out.println(komplen1.toString());
    }
    
   
    
}
