package com.ust.Employee_info.service;

import com.ust.Employee_info.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Optional<Employee> getEmployeeById(int empid);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(int empid);
}
