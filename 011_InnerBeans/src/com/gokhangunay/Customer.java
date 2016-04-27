package com.gokhangunay;

public class Customer {

	private Order order;
	
	public Customer(){
		System.out.println("customer class empty construction!");
	}
	
	public void customerTotalPay(){
		System.out.println("customerTotalPay method!");
		order.totalResult();
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
