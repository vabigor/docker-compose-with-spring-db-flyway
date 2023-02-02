package com.example.training.service;

import com.example.training.controller.request.EmployeeRequest;
import com.example.training.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(Long id);
    Employee save(EmployeeRequest request);
    Employee edit(EmployeeRequest request);
    void delete(Long id);

}
