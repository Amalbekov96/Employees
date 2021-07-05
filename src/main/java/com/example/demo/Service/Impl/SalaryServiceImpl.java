package com.example.demo.Service.Impl;

import com.example.demo.Model.Salary;
import com.example.demo.Repository.SalaryRepo;
import com.example.demo.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepo salaryRepo;


    @Override
    public Salary create(Salary salary) {
        return salaryRepo.save(salary);
    }

    @Override
    public Salary update(Salary salary) {
        return salaryRepo.save(salary);
    }

    @Override
    public Salary find(Long id) {
        return salaryRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        salaryRepo.deleteById(id);
    }

    @Override
    public List<Salary> findAll() {
        return salaryRepo.findAll();
    }
}
