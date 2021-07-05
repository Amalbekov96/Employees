package com.example.demo.Mapper;

import com.example.demo.Dto.SalaryDto;
import com.example.demo.Model.Salary;

public interface SalaryMapper {
    Salary toSalary(SalaryDto salaryDto);
    SalaryDto toSalaryDto(Salary salary);
}
