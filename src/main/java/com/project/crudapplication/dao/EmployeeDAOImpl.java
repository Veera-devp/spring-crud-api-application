package com.project.crudapplication.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.crudapplication.entity.Employee;

import jakarta.persistence.EntityManager;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOImpl(EntityManager theEntityManager)
	{
		entityManager = theEntityManager;
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		Session curr = entityManager.unwrap(Session.class);
		Query<Employee> theQuery = curr.createQuery("from Employee",Employee.class);
		List<Employee> emp = theQuery.getResultList();
		return emp;
	}

	@Override
	public Employee findById(int theId) {
		// TODO Auto-generated method stub
		Session curr = entityManager.unwrap(Session.class);
		Employee theEmployee = curr.get(Employee.class, theId);
		
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		Session curr = entityManager.unwrap(Session.class);
		curr.saveOrUpdate(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		Session curr = entityManager.unwrap(Session.class);
		Query theQuery = curr.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}
	
}
