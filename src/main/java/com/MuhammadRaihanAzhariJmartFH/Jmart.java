package com.MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Jmart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import com.MuhammadRaihanAzhariJmartFH.dbjson.JsonDBEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
class Jmart
{
    
	public static void main(String[] args) {
				
			JsonDBEngine.Run(Jmart.class);
			SpringApplication.run(Jmart.class, args);
			Runtime.getRuntime().addShutdownHook(new Thread( () -> JsonDBEngine.join() ));
		
	}
}
	

	
  

