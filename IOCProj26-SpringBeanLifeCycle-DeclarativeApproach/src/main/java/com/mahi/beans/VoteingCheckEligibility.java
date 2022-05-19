package com.mahi.beans;

import java.util.Date;

public class VoteingCheckEligibility {
	private String name;
	private int age;
	private String address;
	private Date verifyon;
	
	public void setName(String name) {
		System.out.println("VoteingCheckEligibility.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VoteingCheckEligibility.setAge()");
		this.age = age;
	}
	public void setAddress(String address) {
		System.out.println("VoteingCheckEligibility.setAddress()");
		this.address = address;
	}
	
	//Custom init method
	public void myInit() {
		System.out.println("VoteingCheckEligibility.myInit()");
	      verifyon=new Date();
		if(address==null)
			address="not provided";
		 if(name==null)
			throw new IllegalArgumentException("Name is required ");
		else if(age<=0 || age>=125)
			throw new IllegalArgumentException("Age must be with in the range 0 through 125");
	}
	
	
	//B.Method
	public String CheckEligibility() {
		//B.logic
		if(age<18)
			return "Mr/Miss/Mrs"+name+" from "+address+" whose age is "+age+" is not eligible for voting::--->verify on ....  "+verifyon;
		else 
		    return "Mr/Miss/Mrs"+name+" from "+address+" whose age is "+age+" is eligible for voting::--->verify on..... "+verifyon;
		
	}
	
	//custom destroy method
	public void myDestroy() {
		System.out.println("VoteingCheckEligibility.myDestroy()");
		//nullifiy all the spring beans
		name=null;
		age=0;
		address=null;
		verifyon=null;
	}
	

}
