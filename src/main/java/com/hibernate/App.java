package com.hibernate;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App  
{
    public static void main( String[] args )
    {
       Session session=HiberUtil.getSession();
       
       Book1 b1=new Book1();
       
       b1.setBook_Title("ABC");
       b1.setPrice(200);
       
       Book1 b2=new Book1();
     
       b2.setBook_Title("XYZ");
       b2.setPrice(300);
       
       Book1 b3=new Book1();
       
       b3.setBook_Title("PQR");
       b3.setPrice(500);
       
       Book1 b4=new Book1();
     
       b4.setBook_Title("ASD");
       b4.setPrice(300);
       
     
      
      
       Transaction t=session.beginTransaction();
       
         
       //Inserting records
       session.save(b1);
         session.save(b2);
         session.save(b3);
         session.save(b4);
         
         
        
         t.commit();
         
         //Fetching records
         
         /*  Query q=session.createQuery("From Book1");
         
         //Starting from 2nd record    
         q.setFirstResult(1);
         
         //Fetching maximum 2 records
         q.setMaxResults(2);
         
         List<Book1> blist=q.list();
         System.out.println(blist);  */
         
         
            
        //Updataing record
        
       /* q=session.createQuery("update Book set book_Title=:bname " +  "where  bid=:id");
        
         q.setParameter("bname", "SDF");
         q.setParameter("id",1);
                
         t=session.beginTransaction();
        
        q.executeUpdate();
        
        t.commit();
        */
         
         
         //Aggregate functions 
         Query q=session.createQuery("Select avg(price) from Book1");
         
         List<Long> maxPrice=q.list(); 
       
         System.out.println("Average price = "+maxPrice);
       
         //count()
         q=session.createQuery("Select count(bid) from Book1");
         
         List<Long> Bid=q.list(); 
       
         System.out.println("Tital number of books = "+Bid);
         
         //Sum()
        q=session.createQuery("Select sum(price) from Book1");
         
         List<Long> totalPrice=q.list(); 
       
         System.out.println("Total Price of books = "+totalPrice);
         
         
         //HCQL(Hibernate Criteria Query lang)
         
         @SuppressWarnings("deprecation")
		
         
         Criteria c=session.createCriteria(Book1.class);
        
         //Fetching books whose price is greater than 200 
          c.add(Restrictions.gt("price", (long)200));
          c.addOrder(Order.desc("price"));
          List<Book1> blist=c.list();
          System.out.println(blist);
         
          //Native SQl
          SQLQuery nq=session.createSQLQuery("Select * from Book1");
           nq.addEntity(Book1.class);
           List<Book1> blist1=nq.list();
           System.out.println(blist1);
          
         
        
       session.close();
       
       
       
       
    }
}
