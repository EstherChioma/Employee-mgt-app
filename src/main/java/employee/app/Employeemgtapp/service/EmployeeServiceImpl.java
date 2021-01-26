package employee.app.Employeemgtapp.service;

import employee.app.Employeemgtapp.model.Employee;
import employee.app.Employeemgtapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee employee1 = new Employee();
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        employee1.setDept(employee.getDept());
        employee1.setGender(employee.getGender());
        return employeeRepository.save(employee1);
    }

    @Override
    public Employee findEmployeeByEmployeeId(Long employeeId) {
        return employeeRepository.findEmployeeById(employeeId);
    }

    @Override
    public Collection<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee, Long employeeId) {
        Employee existingEmployee = employeeRepository.findEmployeeById(employeeId);
        existingEmployee.setName(employee.getName());
        existingEmployee.setGender(employee.getGender());
        existingEmployee.setDept(employee.getDept());
        existingEmployee.setAge(employee.getAge());
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployeeByEmployeeId(Long employeeId) {
         employeeRepository.deleteById(employeeId);
    }
}
