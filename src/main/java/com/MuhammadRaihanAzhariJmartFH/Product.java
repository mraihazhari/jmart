package com.MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Product extends Serializable
{
   public int accountId;
   public ProductCategory category;
   public boolean conditionUsed;
   public double discount;
   public String name;
   public double price;
   public byte shipmentPlans;
   public int weight;
   

    /**
     * Construtctor Product
     * @param accountId Id dari pemilik akun
     * @param name nama dari produk
     * @param weight berat dari produk
     * @param conditionUsed apakah produk sudah digunakan atau belum
     * @param price harga dari produk yang akan diberi
     * @param discount diskon yang diberkan untuk pembelia produk
     * @param category kategory dari produk
     * @param shipmentPlans metode pengiriman barang yang akan digunakan
     */
    public Product(int accountId, String name, int weight, boolean conditionUsed, double price, double discount, ProductCategory category, byte shipmentPlans){
        this.accountId = accountId;
        this.name = name;
        this.weight = weight;
        this.conditionUsed = conditionUsed;
        this.category = category;
        this.price = price;
        this.shipmentPlans = shipmentPlans;
        this.discount = discount;
        
    }
   
    /**
     * Konversi ke string
     */
    public String toString(){
    	return "name: " + (String)this.name + "\n" + "weight: " + (int)this.weight + "\n" + "conditionUsed: " +  (boolean)this.conditionUsed + "Discount: " + (Double)this.discount + "\n" + "Category: " + this.category + "\n" + "Price: " + (double)this.price + "\n" + "ShipmentPlans: " + this.shipmentPlans;
    }
 

}
