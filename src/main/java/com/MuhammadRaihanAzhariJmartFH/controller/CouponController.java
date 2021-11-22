package com.MuhammadRaihanAzhariJmartFH.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MuhammadRaihanAzhariJmartFH.Coupon;
import com.MuhammadRaihanAzhariJmartFH.JsonTable;
import com.MuhammadRaihanAzhariJmartFH.dbjson.JsonAutowired;


@RestController
@RequestMapping("/coupon")

public class CouponController implements BasicGetController<Coupon>{
	

	public static JsonTable<Coupon> couponTable;
	
	@RequestMapping("/{id}/canApply")
	public boolean canApply(int id, double price, double discount) {
		if(couponTable.get(id).canApply(null)) {
			return true;
		}
		return false;
			
	}
	
	@RequestMapping("/getAvailable")
	public List<Coupon> getAvailable (int page, int pageSize){
		return null;
	}
	
	@RequestMapping("/{id}/isUsed")
	public boolean isUsed(int id) {
		if(couponTable.get(id).isUsed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	@Override
	public List<Coupon> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonTable<Coupon> getJsonTable() {
		// TODO Auto-generated method stub
		return couponTable;
	}

	@Override
	public Coupon getPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
