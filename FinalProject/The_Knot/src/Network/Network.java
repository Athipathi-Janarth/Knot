/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import Enterprise.Enterprise;
import Enterprise.EnterpriseDirectory;

/**
 *
 * @author athipathi
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString() {
        return name;
    }
     public Enterprise retriveEnterprise(String name){
         Enterprise ent=new Enterprise();
        for(Enterprise enterprise : enterpriseDirectory.getEnterpriseList()){
            if(enterprise.getEnterpriseName().equalsIgnoreCase(name)){
                ent= enterprise;
            }
        }
        return ent;
    }

}