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
	/**
	 * 
	 * @param id dari kupon
	 * @param price harga dari suatu produk
	 * @param discount yang diberikan untuk suatu produk
	 * @return jika diskon dapat digunakan return true, jika tidak return false
	 */
	@RequestMapping("/{id}/canApply")
	public boolean canApply(int id, double price, double discount) {
		if(couponTable.get(id).canApply(null)) {
			return true;
		}
		return false;
			
	}
	
	/**
	 * 
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/getAvailable")
	public List<Coupon> getAvailable (int page, int pageSize){
		return null;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/{id}/isUsed")
	public boolean isUsed(int id) {
		if(couponTable.get(id).isUsed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Getter untuk nomor id pada kupon
	 */
	@Override
	public List<Coupon> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * Getter untuk couponTable
	 */
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
