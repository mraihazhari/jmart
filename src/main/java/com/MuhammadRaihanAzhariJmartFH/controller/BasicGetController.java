package com.MuhammadRaihanAzhariJmartFH.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.MuhammadRaihanAzhariJmartFH.JsonTable;
import com.MuhammadRaihanAzhariJmartFH.Serializable;

public interface BasicGetController<T extends Serializable> {
	
	@GetMapping("/page")
	public List<T> getById(int id);
	
	public abstract JsonTable<T> getJsonTable();
	
	@GetMapping("/{id}")
	public T getPage(int page, int pageSize);
	

}
