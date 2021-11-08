package MuhammadRaihanAzhariJmartFH;


/**
 * Write a description of class Jmart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.google.gson.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

class Jmart
{
	
	public static List<Product> filterByAccountId (List<Product> list, int accountId, int page, int pageSize){
		paginate(list, page, pageSize, null);
		return list;
	}
	
	public static List<Product> filterByName (List<Product> list, String search, int page, int pageSize){
		paginate(list, page, pageSize, null);
		return list;
	}
	
	private static List<Product> paginate (List<Product> list, int page, int pageSize, Predicate<Product> pred){

		List<Product> listHasil = new ArrayList<Product>();
	    int currIdx = page > 1 ? (page -1) * pageSize : 0;
	    for (int i = 0; i < pageSize && i < list.size() - currIdx; i++) {
	      listHasil.add(list.get(currIdx + i));
	    }
	    return listHasil;
		    
	}
  
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
	public static List<Product> read (String filepath) throws FileNotFoundException {
		
		  Gson gson = new Gson();
		  Type userListType = new TypeToken<ArrayList<Product>>() {}.getType();
		  BufferedReader br = new BufferedReader(new FileReader(filepath));
		  return gson.fromJson(br, userListType);
		  
	}
    
	public static void main(String[] args) {
		
		try
		{
			List<Product> list = read("D:/#KAKAK/UI/OOP/Praktikum/Praktikum Modul 1/jmart/lib/randomProductList.json");
			List<Product> filtered_price = filterByPrice(list, 0.0, 20000.0);
			List<Product> filtered_ID = filterByAccountId(list, 1, 1, 5);
			List<Product> filtered_Name = filterByName(list, "GTX", 1, 5);
			//filtered.forEach(product -> System.out.println(product.price));
			filtered_Name.forEach(product -> System.out.println(product.name));
			filtered_ID.forEach(product -> System.out.println(product.name));
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
		
		
		System.out.println("account id:" + new Account(-1, null, null, null).id);
		System.out.println("account id:" + new Account(0, null, null, null).id);
		System.out.println("account id:" + new Account(1, null, null, null).id);
		
		
		
	}
   
    
}
