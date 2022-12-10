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
     public enum Type{
        Bakery("Bakery"), Catering("Catering"), Decor("Decor"),Venue("Venue"),
        Stylist("Stylist"), Designer("Designer");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Organization(String name,Type type){
        this.name=name;
        this.type=type;
    }
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
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
    private Type type;
    private long enterpiseId;

    public EmployeeDirectory getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeDirectory employees) {
        this.employees = employees;
    }
    private EmployeeDirectory employees;    
}
