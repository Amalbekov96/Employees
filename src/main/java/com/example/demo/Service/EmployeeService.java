package com.example.demo.Service;


import com.example.demo.Model.Employees;

import java.util.List;

public interface EmployeeService {

    Employees create(Employees employees);
    Employees update(Employees employees);
    Employees find(Long id);
    void delete(Long id);
    List<Employees> findAll();

}
