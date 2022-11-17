package com.hibernate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jca.cci.core.RecordExtractor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac=new ClassPathXmlApplicationContext("jdbctest.xml");
        
        JdbcTemplate jt=(JdbcTemplate) ac.getBean("jdbcTemplate");
       
        Employee emp=(Employee) ac.getBean("emp1");
      
         String query="insert into employee values(?,?)" ;
        
        jt.update(query,emp.getEid(),emp.getEname() );
        
        
        emp=(Employee) ac.getBean("emp2");
        
        query="insert into employee values(?,?)" ;
         
         jt.update(query,emp.getEid(),emp.getEname() );
         
         
         
         emp=(Employee) ac.getBean("emp3");
         
         query="insert into employee values(?,?)" ;
          
          jt.update(query,emp.getEid(),emp.getEname() );
          
         
        
       // System.out.println("Record Inserted.....");
        
      //String  query="update employee set emp_name=?  where eid=200";
       
       // String query="delete from employee where eid=?";
        
        //int i= jt.update(query,emp.getEid());
        //System.out.println("Record deleted.....");
    
       // String query="Select * from Employee ";
        
        //using lambda 
       
       /* List<Employee> e=jt.query(query, (rs,n)->{
        	 
        	emp.setEid(rs.getInt(1));
    		emp.setEname(rs.getString(2));
    		System.out.println("Row :"+n);
    		return emp;
            	
        }, 100);
        
        //Using interface implementaion
   
        RowMapper rm=new RowMapperImpl();
        
        List<Employee> e=jt.query(query, rm );
   
        System.out.println(e);*/
   
    }
}
