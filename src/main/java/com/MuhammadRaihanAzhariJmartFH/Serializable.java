
/**
	 * Write a description of class Recognizable here.
	 *
	 * @author (Muhammad Raihan Azhari)
	 * @version (25 Sept 2021)
	 */


package com.MuhammadRaihanAzhariJmartFH;

import java.util.HashMap;
import java.util.Map;

public class Serializable implements Comparable<Serializable>
	{
	   
		
	    public int id = 0;
	    public static Map<Class<?>, Integer> mapCounter = new HashMap();
	    
	    
	    protected Serializable()
	    {
	    	Integer counter = mapCounter.get(getClass());
	    	if (counter == null) {
	    		mapCounter.put(getClass(), 0);
	    		this.id = 0;
	    	}
	    	else {
	    		mapCounter.put(getClass(), counter + 1);
	    		this.id = counter + 1;
	    	}
	    	 
	    	
	    }
	    
	    public static <T> Integer getClosingId(Class<T> clazz) {
	    	
	    	return mapCounter.get(clazz);
	    }
	    
	    public static <T> Integer setClosingId(Class<T> clazz, int id) {
	    	
	    	 return mapCounter.put(clazz, id);
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

