package com.mahi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mahi.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	public static final String EMP_INSERT_QUERY="INSERT INTO EMPLOYEEDATA VALUES(?,?,?,?)";
	//HAS-property
	private DataSource ds;
	
	public EmployeeDAOImpl(DataSource ds) {
		System.out.println("EmployeeDAOImple::1-param constructor");
		this.ds=ds;
	}

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insertEmployee()");
		int result=0;
		
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(EMP_INSERT_QUERY);
				){
			ps.setInt(1, bo.getEno());
			ps.setString(2, bo.getEname());
			ps.setString(3, bo.getDesg());
			ps.setFloat(4, bo.getSalary());
			
			result=ps.executeUpdate();
			}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return result;
	}

}
