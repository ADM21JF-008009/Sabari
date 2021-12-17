package com.cts.main;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.model.Employee;

public class MainTest {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setFirstname("sabari");
		employee.setLastName("v");
		employee.setMobileNo(999477652);
		employee.setSalary(10000);
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.save(employee);
		ses.getTransaction().commit();
		ses.close();
		
	}
}
