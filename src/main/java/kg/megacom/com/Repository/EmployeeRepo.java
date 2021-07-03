package kg.megacom.com.Repository;

import kg.megacom.com.Model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employees, Long> {
}
