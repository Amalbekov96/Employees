package com.example.demo.Repository;

import com.example.demo.Model.Employees;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employees, Long> {
    @Override
    List<Employees> findAll();
}
