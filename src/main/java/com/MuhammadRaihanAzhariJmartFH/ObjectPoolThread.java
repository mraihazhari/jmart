package com.MuhammadRaihanAzhariJmartFH;

import java.util.Vector;
import java.util.function.Function;

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
		return ((Vector<T>) routine).size();
	}
	
	
	
	
}
