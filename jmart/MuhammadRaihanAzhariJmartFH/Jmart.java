package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Jmart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;

class Jmart
{
  
	public static List<Product> filterByCategory (List<Product> list, ProductCategory category){
		return null;
	}
	public static List<Product> filterByPrice (List<Product> list, double minPrice, double maxPrice){
		if (minPrice == 0.0) {
			return list;
		}
		else if(maxPrice == 0.0) {
			return list;
		}
		else {
			return list;
		}
	}
	public static List<Product> read (String filepath){
		Gson gson = new Gson();
		try
		{
			BufferedReader br = new BufferedReader (new FileReader(filepath));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
    
	public static void main(String[] args) {
		
		List<Product> list = read("D:/#KAKAK/UI/OOP/Praktikum/Praktikum Modul 1/jmart/lib/randomProductList.json");
		
		
		System.out.println("account id:" + new Account(-1, null, null, null).id);
		System.out.println("account id:" + new Account(0, null, null, null).id);
		System.out.println("account id:" + new Account(1, null, null, null).id);
		
		
		
	}
   
    
}
