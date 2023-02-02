package com.example.training.controller.request;

public class EmployeeRequest {

    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;

    public EmployeeRequest() {
    }

    public Long getId() {
        return id;
    }

    public EmployeeRequest setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public EmployeeRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public EmployeeRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getMiddleName() {
        return middleName;
    }

    public EmployeeRequest setMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }
}
