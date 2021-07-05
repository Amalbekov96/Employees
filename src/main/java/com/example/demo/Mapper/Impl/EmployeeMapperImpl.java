package com.example.demo.Mapper.Impl;

import com.example.demo.Dto.EmployeeDto;
import com.example.demo.Mapper.EmployeeMapper;
import com.example.demo.Model.Employees;

public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public Employees toEmployee(EmployeeDto employeeDto) {
        Employees employee = new Employees();

        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setSurname(employeeDto.getSurname());
        employee.setActive(employeeDto.getActive());
        return employee;
    }

    @Override
    public EmployeeDto toEmployeeDto(Employees employee) {

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setSurname(employee.getSurname());
        employeeDto.setActive(employee.getActive());

        return employeeDto;
    }
}
