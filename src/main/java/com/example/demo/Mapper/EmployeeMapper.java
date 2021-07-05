package com.example.demo.Mapper;

import com.example.demo.Dto.EmployeeDto;
import com.example.demo.Model.Employees;

public interface EmployeeMapper {
    Employees toEmployee(EmployeeDto employeeDto);
    EmployeeDto toEmployeeDto(Employees employees);
}
