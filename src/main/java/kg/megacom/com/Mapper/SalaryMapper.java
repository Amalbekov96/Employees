package kg.megacom.com.Mapper;

import kg.megacom.com.Dto.SalaryDto;
import kg.megacom.com.Model.Salary;

public interface SalaryMapper {
    Salary toSalary(SalaryDto salaryDto);
    SalaryDto toSalaryDto(Salary salary);
}
