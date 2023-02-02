package com.example.training.controller;

import com.example.training.controller.request.EmployeeRequest;
import com.example.training.entity.Employee;
import com.example.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/employee")
public class WelcomeController {

    private final EmployeeService service;

    @Autowired
    public WelcomeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Employee> get(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Employee> save(@RequestBody EmployeeRequest request){
        return ResponseEntity.ok(service.save(request));
    }

    @PutMapping
    public ResponseEntity<Employee> edit(@RequestBody EmployeeRequest request){
        return ResponseEntity.ok(service.edit(request));
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
