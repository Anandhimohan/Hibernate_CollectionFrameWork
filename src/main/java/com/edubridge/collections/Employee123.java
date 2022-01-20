package com.edubridge.collections;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  
@Table(name="Employees123")  
public class Employee123 {

			    @Id  
			    @GeneratedValue(strategy=GenerationType.AUTO)  
			private int Emp_id;    
			private String Emp_name;    
			private String emailId;
			public int getEmp_id() {
				return Emp_id;
			}
			public void setEmp_id(int emp_id) {
				Emp_id = emp_id;
			}
			public String getEmp_name() {
				return Emp_name;
			}
			public void setEmp_name(String emp_name) {
				Emp_name = emp_name;
			}
			public String getEmailId() {
				return emailId;
			}
			public void setEmailId(String emailId) {
				this.emailId = emailId;
			}    
			
	}



