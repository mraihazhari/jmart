package com.MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Coupun here.
 *
 * @author (Muhammad Raihan Azhari)
 * 
 */
public class Coupon extends Serializable
{
    enum Type{
        DISCOUNT, REBATE;
    }
    
    public String name;
    public int code;
    public Type type;
    public double cut;
    public double minimum;
    private boolean used;

    /**Constructor coupon
     * 
     * @param name 
     * @param code
     * @param type tipe kupon sesuai enum, apakah DISCOUNT atau REBATE
     * @param cut untuk menentukan besaran potongan harga
     * @param minimum harga minimum untuk diberlakukanya diskon
     */
    public Coupon(String name, int code,Type type, double cut, double minimum){
        this.name = name;
        this.code = code;
        this.type = type;
        this.cut = cut;
        this.minimum = minimum;
        this.used = false;
        
    }
    /**
     * Method untuk mengecek apakah kupon sudah diguankan atau belum
     * @return used digunakan apabila kupon telah digunakan
     */
    public boolean isUsed(){
        return used;
    }
     
    /**
     * Method yang digunakan untuk mengecek apakah bisa mengguanakan coupon atau tidak
     * @param priceTag sebagai objek dari class Treasury
     * @return true apabila harga yang sudah disesuaikan lebih besar dari harga minimum, jika tidak return false 
     */
    public boolean canApply(Treasury priceTag){
        if(priceTag.getAdjustedPrice() >= minimum){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Fungsi yang diguanakn untuk mengaplikasikan kupon
     * @param priceTag sebagai objek dari Treasury
     * @return harga yang telah disesuaikan
     */
    public double apply(Treasury priceTag){
        this.used = true;
        if(this.type == type.REBATE){
           return(priceTag.getAdjustedPrice() - this.cut); 
        }
        else{
            return ((1 - this.cut) * priceTag.getAdjustedPrice());
        }
        
    }
 
    
}
