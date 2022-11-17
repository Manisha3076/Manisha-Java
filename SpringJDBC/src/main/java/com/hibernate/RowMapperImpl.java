package com.hibernate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee emp=new Employee();
		emp.setEid(rs.getInt(1));
		emp.setEname(rs.getString(2));
		//System.out.println("Row number :"+rowNum);
		return emp;
	}

	
}
