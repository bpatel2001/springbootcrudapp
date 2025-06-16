package com.bpatel2001.springboot.springbootcrudapp.dao;

import com.bpatel2001.springboot.springbootcrudapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
