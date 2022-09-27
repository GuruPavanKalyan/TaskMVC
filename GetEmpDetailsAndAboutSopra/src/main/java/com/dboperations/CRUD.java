package com.dboperations;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.storage.Employee;

public class CRUD {
	public Employee getDetails(int empId){
		Employee emp=new Employee();
		String sql="select * from employee where empId=?";
		try {
			PreparedStatement sts=DBConnection.getConnect().prepareStatement(sql);
			sts.setInt(1, empId);
			ResultSet details=sts.executeQuery();
			while(details.next()) {
				emp.setEmpid(details.getInt("empId"));
				emp.setEmpName(details.getString("empName"));
				emp.setEmpDep(details.getString("empDep"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
		
	}

}
