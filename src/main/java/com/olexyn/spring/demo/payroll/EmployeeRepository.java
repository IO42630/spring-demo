package com.olexyn.spring.demo.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Employee : domain type <br>
 * Long : id
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
