package com.MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class PriceTag here.
 *
 * @author Muhammad Raihan Azhari
 * @version 18 Desember 2021
 */
public class Treasury
{
  
    public static double COMMISSION_MULTIPLIER = 0.05;
    public static double BOTTOM_PRICE = 20000.0;
    public static double BOTTOM_FEE = 1000.0;
    public double discount;
    public double price;
    
    /**
     * 
     * @param price harga dari produk
     */
    public Treasury (double price)
    {
        this.price = price;
        this.discount = 0;
    }
    
    /**
     * 
     * @param price harga dari produk
     * @param discount diskon yang diguanakn
     */
    
      public Treasury (double price, double discount)
    {
        this.price = price;
        this.discount = discount;
    }
    
     /**
      * Method untuk menentukan harga yang telah disesuaikan dengan fee
      * @return harga bersih yang telah disesuaikan
      */
    public double getAdjustedPrice (){
        return (getDiscountedPrice() + getAdminFee());
    }
    /**
     * Method untuk menentukan biaya adminn
     * @return biaya setelah disesuaikan dengan fee
     */
    public double getAdminFee(){
        double price_after;
        price_after = getDiscountedPrice();
        if(price_after < BOTTOM_PRICE){
            price_after = BOTTOM_FEE;
        }
        else{
            price_after = price_after - (price_after * COMMISSION_MULTIPLIER);
        }
        return price_after;
    }
    /**
     * Method untuk menentukan harga diskomm
     * @return harga sesudah didiskon
     */
    private double getDiscountedPrice(){
        
        if(discount > 100.0){
            discount = 100.0;
        }
        if(discount == 100.0){
            return 0.0;
        }
        else{
            return (price - ((discount / 100) * price));
        }
    }
    
}
