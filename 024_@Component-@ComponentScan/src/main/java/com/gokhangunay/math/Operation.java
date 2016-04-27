package com.gokhangunay.math;

import org.springframework.stereotype.Component;

// bean oldugunu soyluyoruz. spring bunu beanlestiriyor.
// nie ustune bean yazilmiyor? 

@Component("operation") 
//@ComponentScan(basePackages="com.gokhangunay.math") //basePackageClasses=Operation.class seklinde de kullanilabilir.
public class Operation {

	public int addition(int value1, int value2){
		return value1 + value2;
	}
	
	public int subtraction(int value1, int value2){
			return value1 - value2;
	}
	
	public int multiplication(int value1, int value2){
		return value1*value2;
	}
	
	public double division(double value1, double value2){
		return value1 /value2;
	}	
	
}
