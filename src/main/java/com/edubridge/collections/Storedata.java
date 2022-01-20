package com.edubridge.collections;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class Storedata {

	
	

	public static void main(String[] args) {    
	     
	    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();    
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();    
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();    
	    Session session=factory.openSession();    
	    Transaction t=session.beginTransaction();      
	          
	    
	    
	    Employee123 emp=new Employee123();
	    emp.setEmp_name("Rachita Verma");
	    emp.setEmailId("rachita@gmail.com");
	    
	    Employee123 emp1 = new Employee123();
	    emp1.setEmp_name("Divya Sharma");
	    emp1.setEmailId("divya@gmail.com");
	    
	   
	    
	    List<Employee123> e1=new ArrayList<Employee123>(); 
	    e1.add(emp);
	    e1.add(emp1);
	    
	     
	    
	    Department12 dept=new Department12(); 
	    dept.setDname("HR");
	    dept.setDlocation("Bangalore");
	    dept.setEmp(e1);
	   
	      
	    session.persist(dept);  
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success"); 

}
}


