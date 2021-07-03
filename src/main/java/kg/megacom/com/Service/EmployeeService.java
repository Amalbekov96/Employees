package kg.megacom.com.Service;


import kg.megacom.com.Model.Employees;

public interface EmployeeService {

    Employees create(Employees employees);

    Employees update(Long id, Employees employees);

    Employees find(Long id);
    Void delete(Long id);

}
