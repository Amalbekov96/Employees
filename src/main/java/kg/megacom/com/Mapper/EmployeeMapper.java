package kg.megacom.com.Mapper;

import kg.megacom.com.Dto.EmployeeDto;
import kg.megacom.com.Model.Employees;

public interface EmployeeMapper {
    Employees toEmployee(EmployeeDto employeeDto);
    EmployeeDto toEmployeeDto(Employees employees);
}
