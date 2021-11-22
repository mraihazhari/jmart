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
   
    
    public String toString(){
    	return "name: " + (String)this.name + "\n" + "weight: " + (int)this.weight + "\n" + "conditionUsed: " +  (boolean)this.conditionUsed + "Discount: " + (Double)this.discount + "\n" + "Category: " + this.category + "\n" + "Price: " + (double)this.price + "\n" + "ShipmentPlans: " + this.shipmentPlans;
    }
 

}
