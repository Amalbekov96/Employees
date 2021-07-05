package com.example.demo.Repository;

import com.example.demo.Model.Salary;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SalaryRepo extends CrudRepository<Salary, Long> {
    @Override
    List<Salary> findAll();
}
