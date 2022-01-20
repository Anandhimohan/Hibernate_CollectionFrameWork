package com.edubridge.collections;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  
@Table(name="Department121") 

public class Department12 {
		
			    @Id  
			    @GeneratedValue(strategy=GenerationType.AUTO)  
			private int Department_id;    
			private String Dname;   
			  
			@OneToMany(cascade = CascadeType.ALL)
			@JoinTable(name="DepartmentJoin121",joinColumns=@JoinColumn(name="Department_id") )
			
			private List<Employee123> emp;
			
			
			
			
			public int getDepartment_id() {
				return Department_id;
			}

			public void setDepartment_id(int department_id) {
				Department_id = department_id;
			}

			public String getDname() {
				return Dname;
			}

			public void setDname(String dname) {
				Dname = dname;
			}

			public List<Employee123> getEmp() {
				return emp;
			}

			public void setEmp(List<Employee123> emp) {
				this.emp = emp;
			}

			public String getDlocation() {
				return Dlocation;
			}

			public void setDlocation(String dlocation) {
				Dlocation = dlocation;
			}

			private String Dlocation;
			  
			
			}      




