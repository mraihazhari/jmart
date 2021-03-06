package com.MuhammadRaihanAzhariJmartFH;


import java.util.Date;
import java.util.ArrayList;


/**
 * Write a description of class Invoice here.
 *
 * @author Muhammad Raihan Azhari
 */
public abstract class Invoice extends Serializable
{
  
	
    enum Status{
        WAITING_CONFIRMATION, CANCELLED, ON_PROGRESS, ON_DELIVERY, COMPLAINT, FINISHED, FAILED, DELIVERED;
    }
    enum Rating{
        NONE, BAD, NEUTRAL, GOOD;
    }
    
    public Date date;
    public int buyerId;
    public int productId;
    public int complaintId = -1;
    public Rating rating = Rating.NONE;
    public static Status status;
    
    
    /**
     * Constructor dari Invoice
     * @param buyerId untuk menentukan id dari pembeli
     * @param productId untuk menentukan id dari product
     */
    protected Invoice(int id, int buyerId, int productId){
        this.buyerId = buyerId;
        this.productId = productId;
        this.complaintId = complaintId;
        date = new Date();
        rating = rating.NONE;
        status = status.WAITING_CONFIRMATION;
    }
    
    
    public double getTotalPay(){
        return 0.0;
    }
  
    
    
}
