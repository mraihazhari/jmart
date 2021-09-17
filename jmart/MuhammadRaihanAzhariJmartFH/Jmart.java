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
    // instance variables - replace the example below with your own
     public int getPromo(){
        return 0;
    }

    public String getCustomer(){
        return "oop";
    }

    public float getDiscountPercentage(int before, int after){

        float hasil;
        if(before >= after){
            hasil = before - after;
            hasil = (hasil / (float)before)*100;
            return hasil;
        }
        else{
            return 0;
        }
    }

    public int getDiscountedPrice(int price, float discountPercentage) {
        int hasil;
        if (discountPercentage > 100){
            return 0;
        }
        else{
            hasil = price - (int)(discountPercentage * price / 100);
            return hasil;
        }
    }

    public float getComissionMultiplier(){
        return (5/100);
    }

    public int getOriginalPrice(int discountedPrice, float discountPercentage){
        int hasil;
        float temp;

        temp = (discountedPrice) / (1 - (discountPercentage/100));
        hasil = (int)temp;
        return hasil;

    }

    public int getAdjustedPrice(int price){
        int hasil;
        hasil = (int)(0.05 * price) + price;
        return hasil;
    }

    public int getAdminFee(int price){
        int hasil;
        hasil = (int)(0.05 * price);
        return hasil;
    }


    public static void main(String[] args){

        float discountPrecentage;
        int discountPrice;
        int originalPrice;
        int adjust;

        
        Jmart Belanja = new Jmart();
        
        Belanja.getPromo();

        System.out.println("Customer : " + Belanja.getCustomer());
        //asumsikan before 100.000 dan after 93.000
        discountPrecentage = Belanja.getDiscountPercentage(100000, 93000);
        System.out.println("Presentasi diskon = " + discountPrecentage + "%");
        discountPrice = Belanja.getDiscountedPrice(100000, discountPrecentage);
        System.out.println("Harga setelah potongan harga = " + discountPrice);
        originalPrice = Belanja.getOriginalPrice(discountPrice, discountPrecentage);
        System.out.println("Harga sebelum dipotong = " + originalPrice);
        Belanja.getComissionMultiplier();
        Belanja.getAdjustedPrice(100000);
        Belanja.getAdminFee(100000);





        
    }
    
    
}
