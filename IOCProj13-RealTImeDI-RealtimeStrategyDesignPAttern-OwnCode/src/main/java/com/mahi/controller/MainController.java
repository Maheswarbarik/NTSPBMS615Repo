package com.mahi.controller;

import com.mahi.dto.EmployeeDTO;
import com.mahi.service.EmployeeServiceImpl;
import com.mahi.vo.EmployeeVO;

public class MainController {
	//HAS-A property
	private EmployeeServiceImpl service;

	public MainController(EmployeeServiceImpl service) {
		System.out.println("MainController::1-param construtor");
		this.service = service;
	}
	
	public String processEmployee(EmployeeVO vo) throws Exception {
		//convert employeeVO clas object to DTO
		EmployeeDTO dto=new EmployeeDTO();
		dto.setEno(Integer.parseInt(vo.getEno()));
		dto.setEname(vo.getEname());
		dto.setDesg(vo.getDesg());
		dto.setSalary(Float.parseFloat(vo.getSalary()));
		
		//use service
		String result=service.registerEmployee(dto);
		return result;
		
	}
	
	
	

}
