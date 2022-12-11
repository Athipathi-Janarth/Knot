/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Employee.Employee;
import Employee.EmployeeDirectory;
import Models.Order.MasterOrderDirectory;
import Models.Order.Order;
import Models.Order.OrderDirectory;
import Network.Network;
import Payment.PaymentDirectory;
import User.CoupleUser;
import User.CoupleUserDirectory;
import User.SingleUser;
import User.SingleUserDirectory;
import java.util.ArrayList;

/**
 *
 * @author athipathi
 */
public class EcoSystem {

    public MasterOrderDirectory getMasterOrderList() {
        if(masterOrderList ==null){
            masterOrderList = new MasterOrderDirectory();
        }
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderDirectory masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    private static EcoSystem business;
    
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }

    
    public EcoSystem() {
        this.employeeList=new EmployeeDirectory();
        this.coupleUserlist = new CoupleUserDirectory();
        this.singleUserlist = new SingleUserDirectory();
        networkList=new ArrayList<Network>();
        this.Name = "System1";
    }
    
    public ArrayList<Network> getNetworkList() {
        if(networkList==null){
            networkList=new ArrayList<Network>();
        }
        return networkList;
    }

    public  void setNetworkList(ArrayList<Network> networkList) {
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
     private CoupleUserDirectory coupleUserlist;
     private EmployeeDirectory  employeeList;
     private SingleUserDirectory  singleUserlist;
     private ArrayList<Network> networkList;
     private MasterOrderDirectory masterOrderList;
     private PaymentDirectory paymentList;

    public PaymentDirectory getPaymentList() {
        if(paymentList == null){
            paymentList = new PaymentDirectory();
        }
        return paymentList;
    }

    public void setPaymentList(PaymentDirectory paymentList) {
        this.paymentList = paymentList;
    }
    
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
      
    public  CoupleUserDirectory getCoupledirectory() {
        if(coupleUserlist==null){
        this.coupleUserlist = new CoupleUserDirectory();
        }
        return coupleUserlist;
    }

    public  void setCoupledirectory(CoupleUserDirectory coupleUserlist) {
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

    public SingleUserDirectory getSingleUserlist() {
        if(singleUserlist==null){
        this.singleUserlist = new SingleUserDirectory();
        }
        return singleUserlist;
    }

    public void setSingleUserlist(SingleUserDirectory singleUserlist) {
        this.singleUserlist = singleUserlist;
    }
    
    public boolean checkIfUserIsUnique(EcoSystem system,String name){
        boolean flag=true;
        for(CoupleUser user : system.getCoupledirectory().getCoupleUserList()){
            if(user.getUserName().equalsIgnoreCase(name)){
                flag = false;
            }
        }
        for(SingleUser user : system.getSingleUserlist().getSingleUserList()){
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
