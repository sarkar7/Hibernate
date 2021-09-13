package com.codeonist.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.codeonist.bean.Employee;
import com.codeonist.util.HibernateUtil;

public class EmployeeDao {

	public List<Employee> getEmployees() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Employee", Employee.class).list();
		}
	}

	public void saveEmployee(Employee employee) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(employee);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
