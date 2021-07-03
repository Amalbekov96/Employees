package kg.megacom.com.Service.Impl;

import kg.megacom.com.Model.Salary;
import kg.megacom.com.Repository.SalaryRepo;
import kg.megacom.com.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryRepo salaryRepo;


    @Override
    public Salary create(Salary salary) {
        return null;
    }

    @Override
    public Salary update(Salary salary) {
        return null;
    }

    @Override
    public Salary find(Long id) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }
}
