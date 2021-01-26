package employee.app.Employeemgtapp.repository;

import employee.app.Employeemgtapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findEmployeeById(Long employeeId);
}
