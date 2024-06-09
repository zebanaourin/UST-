package com.ust.Employee_info.repository;

import com.ust.Employee_info.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Employee entity.
 * Extends JpaRepository to provide basic CRUD operations.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
