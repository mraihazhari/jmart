package com.MuhammadRaihanAzhariJmartFH;

import java.util.ArrayList;
import java.util.Date;

import com.MuhammadRaihanAzhariJmartFH.Invoice.Status;

/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Payment extends Invoice
{
   
    public static Date date;
	public int productCount;
    public Shipment shipment;
    public ArrayList <Record> history;
    
    
    /**
     * 
     * @param id variabel untuk menentukan id
     * @param buyerId variabel untuk id pembeli
     * @param productId variabel untuk id dari produk
     * @param productCount variabel untuk menghitung product
     * @param shipment variable untuk jenis pengiriman yang digunakan
     */
    public Payment(int id, int buyerId, int productId, int productCount, Shipment shipment){
    	
        super(id, buyerId, productId);
        this.productCount = productCount;
        this.shipment = shipment;
        
    }
    
   
    public static class Record{
        public static Status status;
        public Date date;
        public String message;
        /**
         * 
         * @param status status dari pengiriman
         * @param message pesan untuk mendeskripsikan keadaan pengiriman
         */
        public Record(Status status, String message) {
        	this.date = new Date();
        	this.status = status;
        	this.message = message;
        }
    }
    
    public Invoice perform(){
        return null;
    }
    
    public double getTotalPay(Product product){
        return 0.0;
    }
    public boolean validate(){
        return true;
    }
    
   
}
