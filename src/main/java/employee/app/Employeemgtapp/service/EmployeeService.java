package employee.app.Employeemgtapp.service;

import employee.app.Employeemgtapp.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee findEmployeeByEmployeeId(Long employeeId);

    Collection<Employee> getAllEmployee();

    Employee updateEmployee(Employee employee, Long employeeId);

    void deleteEmployeeByEmployeeId(Long employeeId);

}
