package com.example.demo.Service.Impl;

import com.example.demo.Model.Employees;
import com.example.demo.Repository.EmployeeRepo;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employees create( Employees employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employees update(Employees employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employees find(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
         employeeRepo.deleteById(id);
    }

    @Override
    public List<Employees> findAll(){
        return employeeRepo.findAll();
    }
}
