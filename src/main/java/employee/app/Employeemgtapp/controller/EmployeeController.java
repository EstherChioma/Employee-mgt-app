package employee.app.Employeemgtapp.controller;

import employee.app.Employeemgtapp.model.Employee;
import employee.app.Employeemgtapp.repository.EmployeeRepository;
import employee.app.Employeemgtapp.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeServiceImpl employeeService;

    EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/")
    public String showHome(Model model){
        return "index";
    }

    @GetMapping("/registration_form")
    public String showRegistrationForm(Model model){
        Employee employee = new Employee();

        model.addAttribute("employee", employee);
        return "registration_form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee, Model model){
        model.addAttribute("employee", employee);
        employeeService.saveEmployee(employee);
        return "display_form";
    }

}
