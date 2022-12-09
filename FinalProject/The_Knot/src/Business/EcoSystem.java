/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Network.Network;
import User.CoupleUserDirectory;
import java.util.ArrayList;

/**
 *
 * @author athipathi
 */
public class EcoSystem {
    private static EcoSystem business;
    CoupleUserDirectory coupleUserlist;
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
}
