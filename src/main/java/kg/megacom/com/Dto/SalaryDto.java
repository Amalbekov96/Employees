package kg.megacom.com.Dto;

import kg.megacom.com.Model.Employees;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SalaryDto {
    private Long id;
    private String salary;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Employees employee_id;
}
