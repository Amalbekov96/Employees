package kg.megacom.com.Service;
import kg.megacom.com.Model.Salary;

public interface SalaryService {

    Salary create(Salary salary);
    Salary update(Salary salary);
    Salary find(Long id);
    Void delete(Long id);
}
