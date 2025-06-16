package com.bpatel2001.springboot.springbootcrudapp.dao;

import com.bpatel2001.springboot.springbootcrudapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity Type, Primary Key>
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
