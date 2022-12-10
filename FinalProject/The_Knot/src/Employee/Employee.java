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
    long orgId; 
   
    public String getNetworkname() {
        return networkname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setNetworkname(String networkname) {
        this.networkname = networkname;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }
    
    public Employee(String name, String userName, String password,Role role,String network,long orgId){
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.role=role;
        this.networkname=network;
        this.orgId = orgId;
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
