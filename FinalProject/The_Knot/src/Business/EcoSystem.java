/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Employee.Employee;
import Employee.EmployeeDirectory;
import Network.Network;
import User.CoupleUser;
import User.CoupleUserDirectory;
import java.util.ArrayList;

/**
 *
 * @author athipathi
 */
public class EcoSystem {
    private static EcoSystem business;
    CoupleUserDirectory coupleUserlist;
    EmployeeDirectory  employeeList;
    ArrayList<Network> networkList;
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }

    public EcoSystem() {
        this.coupleUserlist = new CoupleUserDirectory();
        networkList=new ArrayList<Network>();
        this.Name = "System";
    }
    
    public ArrayList<Network> getNetworkList() {
        if(networkList==null){
            networkList=new ArrayList<Network>();
        }
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean isUnique(String name){
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        return true;
    }
     public Network retriveNetwork(String name){
         Network net=new Network();
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(name)){
                net= network;
            }
        }
        return net;
    }
    String Name;
    
    
     public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
      public static void setInstance(EcoSystem system) {
        business = system;
    }
      
    public CoupleUserDirectory getCoupledirectory() {
        if(coupleUserlist==null){
        this.coupleUserlist = new CoupleUserDirectory();
        }
        return coupleUserlist;
    }

    public void setCoupledirectory(CoupleUserDirectory coupleUserlist) {
        this.coupleUserlist = coupleUserlist;
    }
     public EmployeeDirectory getEmployeedirectory() {
        if(employeeList==null){
        this.employeeList = new EmployeeDirectory();
        }
        return employeeList;
    }

    public void setEmployeedirectory(EmployeeDirectory employeeList) {
        this.employeeList = employeeList;
    }
    public boolean checkIfUserIsUnique(EcoSystem system,String name){
        boolean flag=true;
        for(CoupleUser user : system.getCoupledirectory().getCoupleUserList()){
            if(user.getUserName().equalsIgnoreCase(name)){
                flag = false;
            }
        }
        for(Employee emp : system.getEmployeedirectory().getEmployeeList()){
            if(emp.getUserName().equalsIgnoreCase(name)){
                flag = false;
            }
        }
        return flag;
    }
}
