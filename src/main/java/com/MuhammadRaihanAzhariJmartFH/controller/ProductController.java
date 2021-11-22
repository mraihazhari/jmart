package com.MuhammadRaihanAzhariJmartFH.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MuhammadRaihanAzhariJmartFH.Account;
import com.MuhammadRaihanAzhariJmartFH.Algorithm;
import com.MuhammadRaihanAzhariJmartFH.JsonTable;
import com.MuhammadRaihanAzhariJmartFH.Product;
import com.MuhammadRaihanAzhariJmartFH.ProductCategory;



@RestController
@RequestMapping("/product")
public class ProductController implements BasicGetController<Product>{

	public static JsonTable<Product> productTable;
	
	
	
	@Override
	public List<Product> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@GetMapping("/{id}/store")
	public List<Product> getProductByStore(int id, int page, int size){
		Algorithm.paginate(productTable, page, size, null);
		return productTable;
	}
	
	@PostMapping("/create")
	public Product create(int AccountId, String name, int weight, boolean ConditionUsed, double price, double discount, ProductCategory category, byte shipmentPlans) {
		return null;
	}

	@Override
	public JsonTable<Product> getJsonTable() {
		// TODO Auto-generated method stub
		return productTable;
	}

	@Override
	public Product getPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping("/getFiltered")
	public List<Product> getProductFiltered(int page, int pageSize, int accountId, String search, int minPrice, int maxPrice, ProductCategory category){
		
		List<Product> listHasil = new ArrayList<>();
		for(int i = 0 ; i < productTable.size(); i++) {
			if(maxPrice == 0) {
				if(productTable.get(i).price >= minPrice){
					listHasil.add(productTable.get(i));
				}
			}
			else {
				if(productTable.get(i).price >= minPrice && productTable.get(i).price <= maxPrice){
					listHasil.add(productTable.get(i));
				}
			}
		}
		return listHasil;
		
	}
	
	
	
	
	
	
	

}
