package MuhammadRaihanAzhariJmartFH;


import java.util.Date;
import java.text.*;


/**
 * Write a description of class Recognizable here.
 *
 * @author (Muhammad Raihan Azhari)
 * @version (25 Sept 2021)
 */
public class Complaint extends Recognizable implements FileParser
{
    // instance variables - replace the example below with your own
    public String desc;
    public Date date;
    public static final SimpleDateFormat ESTIMATION_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    
    
    public Complaint (int id, String desc){
        super(id);
        this.desc = desc;
        this.date = new Date();
    }
    public String toString(){
        return "date="+ESTIMATION_FORMAT.format(date.getTime())+",desc="+desc;
    }
    public boolean read (String content){
        return false;
    }
    public Object write(){
        return null;
    }
    public Object newInstance(String content){
        return 0;
    }
    
   


}
