package com.gokhangunay;

public class Order {

	private int total;
	
	public Order(){
		System.out.println("order class empty construction!");
	}
	
	public void totalResult(){
		System.out.println("Total resul method");
		System.out.println("Total: " + getTotal());
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	 
}
