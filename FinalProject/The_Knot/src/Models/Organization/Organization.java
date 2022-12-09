/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Employee.EmployeeDirectory;
import Models.Order.OrderDirectory;

/**
 *
 * @author nageshsairam
 */
public class Organization {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getEnterpiseId() {
        return enterpiseId;
    }

    public void setEnterpiseId(long enterpiseId) {
        this.enterpiseId = enterpiseId;
    }
    private String name;
    private long id;
    private String type;
    private long enterpiseId;

    public EmployeeDirectory getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeDirectory employees) {
        this.employees = employees;
    }
    private EmployeeDirectory employees;    
}
