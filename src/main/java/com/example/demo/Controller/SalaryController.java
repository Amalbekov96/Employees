package com.example.demo.Controller;

import com.example.demo.Model.Salary;
import com.example.demo.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SalaryController {

    @Autowired
    private SalaryService salaryService;


    @GetMapping("/find/{id}")
    private Salary getSalaryById(@PathVariable("id") Long id){
        return salaryService.find(id);
    }

    @GetMapping("/findAll")
    private List<Salary> getAllSalaries(){
        return salaryService.findAll();
    }

    @PostMapping("/save")
    private Salary createSalary(@RequestBody Salary salary){
        return salaryService.create(salary);
    }


    @PutMapping("/update/{id}")
    private Salary updateSalary(@PathVariable("id") Long id, @RequestBody Salary salary){
        salary.setId(id);
        return salaryService.update(salary);
    }


    @DeleteMapping("/delete/{id}")
    private void deleteSalary(@PathVariable("id") Long id)
    {
        salaryService.delete(id);
    }

}
