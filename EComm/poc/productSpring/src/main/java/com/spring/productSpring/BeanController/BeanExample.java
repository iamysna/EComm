package com.spring.productSpring.BeanController;

public class BeanExample {
	
	private int i=0;

	public int getI() {
		increment();
		return i;
	}
	
	public void increment() {
		i = i +1;
	}
	public void setI(int i) {
		this.i = i;
	}
	
}
