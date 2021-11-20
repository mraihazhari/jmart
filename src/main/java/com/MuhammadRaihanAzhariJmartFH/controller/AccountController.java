package com.MuhammadRaihanAzhariJmartFH.controller;


import com.MuhammadRaihanAzhariJmartFH.Account;
import com.MuhammadRaihanAzhariJmartFH.JsonTable;
import com.MuhammadRaihanAzhariJmartFH.Store;
import com.MuhammadRaihanAzhariJmartFH.dbjson.JsonAutowired;

import java.lang.annotation.Target;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.web.bind.annotation.*;
import com.MuhammadRaihanAzhariJmartFH.dbjson.*;


@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
	
	
	
	
	public static final String REGEX_EMAIL = "^([A-Za-z0-9|.|*|~|_|&]*?)@[A-Za-z0-9][A-Za-z0-9|-|.]";
    public static final String REGEX_PASSWORD = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,100}$";
	public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
	public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);
	
	
	public Account login(String email, String password) {
		return null;
	}
	public Account login(String name, String email, String password) {
		return null;
	}
	
	@PostMapping("/{id}/registerStore")
	public Store registerStore(String name, String email, String password) {
		return null;
	}
	@PostMapping("/{id}/registerStore")
	public Store registerStore(int id, String name, String address, String phoneNumber) {
		return null;
	}
	@PostMapping("/{id}/topUp")
	public boolean topUp(int id, double balance) {
		return true;
	}

	@Override
	public List<Account> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonTable<Account> getJsonTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getPage(int page, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
}