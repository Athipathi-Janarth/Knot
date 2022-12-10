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
    String networkname;
    int id;

    public String getNetworkname() {
        return networkname;
    }
    
    public Employee(String name, String userName, String password,Role role,String network){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.role=role;
        this.networkname=network;
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
