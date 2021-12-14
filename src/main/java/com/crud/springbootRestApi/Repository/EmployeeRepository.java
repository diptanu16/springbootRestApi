package com.crud.springbootRestApi.Repository;

import com.crud.springbootRestApi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
