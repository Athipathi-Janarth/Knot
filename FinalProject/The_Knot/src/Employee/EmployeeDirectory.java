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
    private static int employeeId = 1;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String name, String userName, String password,Role role,String network, long orgId){
        Employee employee = new Employee(name, userName, password, role, network, orgId);
        employee.setId( EmployeeDirectory.employeeId);
        employeeList.add(employee);
        EmployeeDirectory.employeeId++;
        return employee;
    }
    
    public Employee authenticateUser(String username, String password){
        for (Employee emp : employeeList){
            System.out.print(emp.getUserName());
            System.out.print(" ");
            System.out.print(emp.getPassword());
            System.out.println();
            if (emp.getUserName().equals(username) && emp.getPassword().equals(password)){
                return emp;
            }
        }
        return null;
    }
}