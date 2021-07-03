package kg.megacom.com.Dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private String name;
    private String surname;
    private Boolean active;
}
