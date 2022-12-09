/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import Roles.Role;
import User.CoupleUser;
import java.util.ArrayList;

/**
 *
 * @author vikashsingh
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name, String userName, String password,Role role){
        Employee employee = new Employee(name, userName, password,role);
        employeeList.add(employee);
        return employee;
    }
    public Employee authenticateUser(String username, String password){
        for (Employee emp : employeeList)
            if (emp.getUserName().equals(username) && emp.getPassword().equals(password)){
                return emp;
            }
        return null;
    }
}