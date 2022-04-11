package com.egrubc.employeecrudbackend.service.impl;

import com.egrubc.employeecrudbackend.model.Employee;
import com.egrubc.employeecrudbackend.repository.EmployeeRepository;
import com.egrubc.employeecrudbackend.service.EmployeeServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
