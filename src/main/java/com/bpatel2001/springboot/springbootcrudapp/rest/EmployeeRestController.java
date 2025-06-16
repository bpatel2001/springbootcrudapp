package com.bpatel2001.springboot.springbootcrudapp.rest;


import com.bpatel2001.springboot.springbootcrudapp.dao.EmployeeDAO;
import com.bpatel2001.springboot.springbootcrudapp.entity.Employee;
import com.bpatel2001.springboot.springbootcrudapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    // Quick and dirty: inject employee DAO
    // private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    // Expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

}
