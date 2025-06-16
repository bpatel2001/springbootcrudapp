package com.bpatel2001.springboot.springbootcrudapp.service;

import com.bpatel2001.springboot.springbootcrudapp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}

