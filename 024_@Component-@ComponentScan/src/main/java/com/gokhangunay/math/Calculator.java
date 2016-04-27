package com.gokhangunay.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("calculator")
//@ComponentScan(basePackages="com.gokhangunay.math")
public class Calculator {
	
	private Operation operation;

	public Operation getOperation() {
		return operation;
	}

	@Autowired
	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	
	public void showResult(int value1, int value2){
		System.out.println("Toplama: " + operation.addition(value1, value2));
		System.out.println("Çıkarma: " + operation.subtraction(value1, value2));
		System.out.println("Çarpma:  " + operation.multiplication(value1, value2));
		System.out.println("Bölme:   " + operation.division(value1, value2));
	}

}
