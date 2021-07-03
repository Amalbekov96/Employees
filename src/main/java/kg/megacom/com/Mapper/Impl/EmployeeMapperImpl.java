package kg.megacom.com.Mapper.Impl;

import kg.megacom.com.Dto.EmployeeDto;
import kg.megacom.com.Mapper.EmployeeMapper;
import kg.megacom.com.Model.Employees;

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
