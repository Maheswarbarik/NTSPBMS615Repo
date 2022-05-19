package com.mahi.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mahi.controller.MainController;
import com.mahi.vo.EmployeeVO;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//create IOC container
    			DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
    			XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
    			reader.loadBeanDefinitions("com/mahi/cfgs/applicationContext.xml");
    			// get SpringBean class obj ref
    			MainController controller=factory.getBean("controller",MainController.class);
    			//read inputs as stirng values and store them into EmployeeVO class object
    			Scanner sc=new Scanner(System.in);
    			System.out.println("Enter Employee Number::");
    			String no=sc.next();
    			System.out.println("Enter employee name::");
    			String  name=sc.next();
    			System.out.println("Enter employee desg::");
    			String  desg=sc.next();
    			System.out.println("Enter employee basicSalary::");
    			String  salary=sc.next();
    			EmployeeVO vo=new EmployeeVO();
    			vo.setEno(no);
    			vo.setEname(name); 
    			vo.setDesg(desg);
    			vo.setSalary(salary);
    			//invoke methods
    			try {
    				String result=controller.processEmployee(vo);
    				System.out.println(result);
    			}
    			catch(Exception e) {
    				//e.printStackTrace();
    				System.out.println("Internal problem::"+e.getMessage());
    			}

    		}
    	

        
    }

