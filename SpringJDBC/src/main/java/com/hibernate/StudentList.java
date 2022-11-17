package com.hibernate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentList implements ResultSetExtractor<List<Employee>> {

	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Employee> l=new ArrayList<>();
		while(rs.next())
		{
		  Employee e=new Employee();
		  e.setEid(rs.getInt(1));
		  e.setEname(rs.getString(2));
		  l.add(e);
		  
		}
		
		return l;
	}

}
