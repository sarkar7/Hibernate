package com.codeonist.test;

import com.codeonist.bean.Employee;
import com.codeonist.dao.EmployeeDao;

public class HibernateTest {

	public static void main(String[] args) {

		EmployeeDao empDao = new EmployeeDao();
		//empDao.saveEmployee(new Employee("Sourabh Sarkar", 29, 2L, 1001L, 28L));

		for (Employee e : empDao.getEmployees()) {
			System.out.println(e.getName());
		}

	}

}
