package com.MuhammadRaihanAzhariJmartFH;


import java.util.Date;
import java.text.*;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Complaint extends Serializable
{
   
    public String desc;
    public Date date;
    public static final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    
    /**Constructor dengan parameter id dari akun serta descriptionya*/
    public Complaint (int id, String desc){
        this.desc = desc;
        this.date = new Date();
    }
    /**Konversi ke string*/
    public String toString(){
        return "date="+ESTIMATION_FORMAT.format(date.getTime())+",desc="+desc;
    }
 
    
   


}
