package com.mahi.service;

import com.mahi.bo.EmployeeBO;
import com.mahi.dao.IEmployeeDAO;
import com.mahi.dto.EmployeeDTO;

public class EmployeeServiceImpl implements IEmployeeService {
	//HAS-A property 
	private IEmployeeDAO dao;
	
	public EmployeeServiceImpl(IEmployeeDAO dao) {
	System.out.println("EmployeeServiceImpl::1-param constructor");
		this.dao = dao;
	}



	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		System.out.println("EmployeeServiceImpl.registerEmployee()");
		
	    String msg ="Employee Register with details:: ";
		
		//prepare BO class object
		EmployeeBO bo=new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setDesg(dto.getDesg());
		bo.setSalary(dto.getSalary());
		//use DAO
		int count=dao.insertEmployee(bo);
		//generate final result
		
		return msg ;
	}

}
