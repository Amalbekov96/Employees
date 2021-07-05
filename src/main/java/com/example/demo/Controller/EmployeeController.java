package com.example.demo.Controller;

import com.example.demo.Model.Employees;
import com.example.demo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/find/{id}")
    public Employees findById(@PathVariable Long id){
        return  employeeService.find(id);
    }

    @GetMapping("/findAll")
    public List<Employees> findAll(){

        if(employeeService.findAll() == null){

            return new ArrayList<>();
        } else {
            return employeeService.findAll();
        }
    }

    @PostMapping("/save")
    public Employees save(@RequestBody Employees employee){ return employeeService.create(employee); }

    @PutMapping("/update/{id}")
    public Employees update(@RequestBody Employees employee, @PathVariable Long id){
        employee.setId(id);
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        employeeService.delete(id);
    }

}
