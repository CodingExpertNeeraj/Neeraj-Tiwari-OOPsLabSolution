package service;

import model.Department;
import model.Employee;

public class EmailService {
    public String generateEmail( Employee employee, Department department ) {
        String email = employee.getFirstName() + employee.getLastName() +'@' + department.getDepartmentName() + ".email.com" ; 
        return email;
    }
}

