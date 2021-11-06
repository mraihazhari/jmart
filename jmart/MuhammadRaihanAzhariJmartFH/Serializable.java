
/**
	 * Write a description of class Recognizable here.
	 *
	 * @author (Muhammad Raihan Azhari)
	 * @version (25 Sept 2021)
	 */


package MuhammadRaihanAzhariJmartFH;

import java.util.HashMap;
import java.util.Map;

public class Serializable implements Comparable<Serializable>
	{
	   
		
	    public int id = 0;
	    public static Map<Class<?>, Integer> mapCounter = new HashMap();
	    
	    
	    protected Serializable()
	    {
	    	
	    	mapCounter.put(getClass(), id);
	    	this.id = id++;
	    	
	    }
	    
	    public static <T> Integer getClosingId(Class<T> clazz) {
	    	 if(clazz.isAssignableFrom(Serializable.class)){
	             return 0;
	         }
	    	 else{
	             return 1;
	         }
	    }
	    
	    public static <T> Integer setClosingId(Class<T> clazz, int id) {
	    	if(clazz.isAssignableFrom(Serializable.class)){
	            return 0;
	          }
	    	else{
	            return 1;
	         }
	    }
	    
	   public boolean equals(Serializable serializable){
	       return serializable.id == id;
	   }
	    
	   public boolean equals(Object object){
	        if(object instanceof Serializable){
	            Serializable obj = (Serializable)object;
	            if(obj.id == id){
	               return true; 
	            }
	       }
	       return false;
	   }
	   
	   public int compareTo(Serializable recognizable) {
		   return (this.id / recognizable.id);
	   }
	   
	   
	}

