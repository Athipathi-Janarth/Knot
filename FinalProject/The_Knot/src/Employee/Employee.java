/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import Roles.Role;

/**
 *
 * @author vikashsingh
 */
public class Employee {
    
    String name;
    String userName;
    String password;
    Role role;
    int id;
    
    public Employee(String name, String userName, String password,Role role){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.role=role;
    }

    public Role getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    
}
