package com.MuhammadRaihanAzhariJmartFH.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MuhammadRaihanAzhariJmartFH.Account;
import com.MuhammadRaihanAzhariJmartFH.JsonTable;
import com.MuhammadRaihanAzhariJmartFH.Payment;


@RestController
@RequestMapping("/payment")
public class PaymentController implements BasicGetController<Payment>{
	
	
	public boolean accept(int id) {
		return false;
	}
	public boolean cancel(int id) {
		return true;
	}
	public Payment create (int buyreId, int productId, int productCount, String shipmentAdddress, byte shipmentPlan) {
		return null;
	}
	public boolean submit (int id, String receipt) {
		return true;
	}
	public static boolean timekeeper (Payment payment) {
		return true;
	}

	@Override
	public List<Payment> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonTable<Payment> getJsonTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
