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

    public static String getCustomer(){
        return "oop";
    }

    public static float getDiscountPercentage(int before, int after){

        float hasil;
        if(before >= after){
            hasil = before - after;
            return hasil;
        }
        else{
            return 0;
        }
    }

    public static int getDiscountedPrice(int price, float discountPercentage) {
        int hasil;
        if (discountPercentage > 100){
            return 0;
        }
        else{
            //hasil = price - (discountPercentage * price);
            //return hasil;
            return 0;
        }
    }

    public int getOriginalPrice(int discountedPrice, float discountPercentage){
        int hasil;

        //hasil = discountedPrice + (discountPercentage * price);
        //return hasil;
        return 0;

    }



    public static void main(String[] args){

        int before;
        int after;
        int price;
        int pricediskon;

        float presdiskon;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan before");
        before = input.nextInt();
        System.out.println("Masukan after");
        after = input.nextInt();
        presdiskon = getDiscountPercentage(before, after);
        System.out.println("Presentasi diskon = " + presdiskon + "%");
        System.out.println("Masukan price");
        price = input.nextInt();
        System.out.println("Belum selesai :(");
    }
    
    
}
