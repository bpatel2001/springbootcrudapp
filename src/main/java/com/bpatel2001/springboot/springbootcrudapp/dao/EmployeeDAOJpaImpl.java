package com.bpatel2001.springboot.springbootcrudapp.dao;

import com.bpatel2001.springboot.springbootcrudapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // Define field for entitymanager
    private EntityManager entityManager;

    // Set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        // Create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // Execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // Return the results
        return employees;
    }

    @Override
    public Employee findById(int theId) {

        // Get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // Return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        // Save Employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        // Find employee by ID
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // Remove employee
        entityManager.remove(theEmployee);
    }
}
