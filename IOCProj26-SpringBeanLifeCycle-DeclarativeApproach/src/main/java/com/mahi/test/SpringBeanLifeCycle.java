package com.mahi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahi.beans.VoteingCheckEligibility;

public class SpringBeanLifeCycle {

	public static void main(String[] args) {
		//create IOC Container
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/mahi/cfgs/applicationContext.xml");
		
		//create spring bean  class obj
		VoteingCheckEligibility voter=ctx.getBean("voter",VoteingCheckEligibility.class);
		//invoke B.method
		System.out.println(voter.CheckEligibility());
      //close the container
		ctx.close();
		
	}

}
