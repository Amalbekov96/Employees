package com.example.demo.Service;
import com.example.demo.Model.Salary;

import java.util.List;

public interface SalaryService {

    Salary create(Salary salary);
    Salary update(Salary salary);
    Salary find(Long id);
    void delete(Long id);
    List<Salary> findAll();
}
