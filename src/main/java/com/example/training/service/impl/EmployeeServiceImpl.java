package com.example.training.service.impl;

import com.example.training.controller.request.EmployeeRequest;
import com.example.training.entity.Employee;
import com.example.training.repository.EmployeeRepository;
import com.example.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository rep;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository rep) {
        this.rep = rep;
    }

    @Override
    public List<Employee> findAll() {
        return rep.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return rep.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public Employee save(EmployeeRequest request) {
        return rep.save(requestToEntity(new Employee(), request));
    }

    @Override
    public Employee edit(EmployeeRequest request) {
        Employee employee = rep.findById(request.getId()).orElseThrow(RuntimeException::new);
        return rep.save(requestToEntity(employee, request));
    }

    @Override
    public void delete(Long id) {
        rep.deleteById(id);
    }

    private Employee requestToEntity(Employee employee, EmployeeRequest request){
        return employee
                .setLastName(request.getLastName())
                .setFirstName(request.getFirstName())
                .setMiddleName(request.getMiddleName());
    }
}
