/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import User.CoupleUserDirectory;

/**
 *
 * @author athipathi
 */
public class EcoSystem {
    private static EcoSystem business;
    CoupleUserDirectory coupleUserlist;

    public EcoSystem() {
        this.coupleUserlist = new CoupleUserDirectory();
        this.Name = "System";
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
