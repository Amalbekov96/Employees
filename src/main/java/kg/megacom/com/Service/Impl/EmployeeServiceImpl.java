package kg.megacom.com.Service.Impl;

import kg.megacom.com.Model.Employees;
import kg.megacom.com.Repository.EmployeeRepo;
import kg.megacom.com.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;


    @Override
    public Employees create( Employees employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employees update(Long id, Employees employees) {
        return null ;
    }

    @Override
    public Employees find(Long id) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }
}
