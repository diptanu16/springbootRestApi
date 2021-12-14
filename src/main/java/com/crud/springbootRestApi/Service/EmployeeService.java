package com.crud.springbootRestApi.Service;

import com.crud.springbootRestApi.Entity.Employee;
import com.crud.springbootRestApi.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    //add user
    public Employee addEmployee(Employee employee) {
        try{
            return employeeRepository.save(employee);
        }catch(Exception e) {
            return null;
        }

    }

    //get all users
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    //get user by id
    public Employee getEmployeeById(String id) {
        Optional<Employee> employee = employeeRepository.findById(id);
            return employee.orElse(null);
        }
    //update user
    public Employee updateEmployee(String id, Employee employee){
        Employee employee2 = employeeRepository.findById(id).orElse(null);
        if(employee2 !=null){
            employee2.setName(employee.getName());
            employee2.setEmail(employee.getEmail());
            employee2.setRole(employee.getRole());
            return employeeRepository.save(employee2);
        }else {
            return null;
        }
    }
        //delete user

        public boolean deleteEmployee(String id){
            try{
                employeeRepository.deleteById(id);
                return true;
            }
            catch (Exception e){
                return  false;
            }
        }

    }

