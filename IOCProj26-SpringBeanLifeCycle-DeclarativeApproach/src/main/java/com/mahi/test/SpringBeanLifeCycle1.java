package com.mahi.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.mahi.beans.VoteingCheckEligibility;

public class SpringBeanLifeCycle1 {

	public static void main(String[] args) {
		//create BeanFactory IOC Container
		FileSystemResource res=new FileSystemResource("src/main/java/com/mahi/cfgs/applicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//create spring bean  class obj
	   VoteingCheckEligibility voter=factory.getBean("voter",VoteingCheckEligibility.class);
		//invoke B.method
		System.out.println(voter.CheckEligibility());
      //close the container
		//factory.close();
		
	}

}
