package com.MuhammadRaihanAzhariJmartFH;


/*
 * @author Muhammad Raihan Azhari
 */

import java.util.Vector;
import java.util.function.Function;


/*
 * Class untuk melakukan multi threading
 */

public class ObjectPoolThread<T> extends Thread{

	private boolean exitSignal;
	private Vector<T> objectPool;
	private Function <T, Boolean> routine;
	
	public ObjectPoolThread (String name, Function<T, Boolean> routine) {
		this.routine = routine;
		super.setName(name);
	}
	
	public ObjectPoolThread (Function<T, Boolean> routine) {
		super();
	}
	
	public void add(T object) {
		objectPool.addElement(object);	
	}
	
	public void exit() {
		
	}
	
	public void run() {
		
	}
	
	public int size() {
		//return ((Vector<T>) routine).size();
		return 0;
	}
	
	
	
	
}
