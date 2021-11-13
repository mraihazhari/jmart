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
		return paginate(list, page, pageSize, product -> product.accountId == accountId);
	}
	
	public static List<Product> filterByName (List<Product> list, String search, int page, int pageSize){
		return paginate(list, page, pageSize, product ->product.name.toLowerCase().contains(search.toLowerCase()));
	}
	
	private static List<Product> paginate (List<Product> list, int page, int pageSize, Predicate<Product> pred){

		int iteration = 0;
		int find_product = 0;
		int demand = page * pageSize;
		List<Product> listHasil = new ArrayList<>(pageSize);
	    while(iteration < list.size() && find_product < demand) {
	    	if(pred.predicate(list.get(iteration))) {
	    		demand++;
	    	}
	    	iteration++;
	    }
	    for(int i = iteration; i < list.size() && listHasil.size() < pageSize; i++) {
	    	if(pred.predicate(list.get(i))) {
	    		listHasil.add(list.get(i));
	    	}
	    }
	    
	    return listHasil;
		    
	}
  
	public static List<Product> filterByCategory (List<Product> list, ProductCategory category){
		return null;
	}
	public static List<Product> filterByPrice (List<Product> list, double minPrice, double maxPrice){
		List<Product> listHasil = new ArrayList<>();
		for(int i = 0 ; i < list.size(); i++) {
			if(maxPrice == 0) {
				if(list.get(i).price >= minPrice){
					listHasil.add(list.get(i));
				}
			}
			else {
				if(list.get(i).price >= minPrice && list.get(i).price <= maxPrice){
					listHasil.add(list.get(i));
				}
			}
		}
		return listHasil;
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
			
			String filepath = "D:/#KAKAK/UI/OOP/Praktikum/Praktikum Modul 1/jmart/lib/account.json";
			
			JsonTable<Account> tableAccount = new JsonTable<>(Account.class, filepath);
			tableAccount.add(new Account("name", "email", "password"));
			tableAccount.writeJson();
			
			tableAccount = new JsonTable<>(Account.class, filepath);
			tableAccount.forEach(account->System.out.println(account.toString()));
			
		}
		catch (Throwable t) {
			t.printStackTrace();
		}
	}
   
    
}
