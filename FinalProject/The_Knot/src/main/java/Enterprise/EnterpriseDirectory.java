/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;


import Network.Network;
import java.util.ArrayList;

/**
 *
 * @author athipathi
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(null!=type)switch (type) {
            case FoodManagement:
                //enterprise=new HospitalEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case EventDecor:
                //enterprise=new FosterCareEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Grooming:
                //enterprise = new AdoptionEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Finance:
                //enterprise = new FundingEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
    
    public boolean isUnique(String name){
        for(Enterprise enterprise : enterpriseList){
            /*if(name.equalsIgnoreCase(enterprise.getName())){
                return false;
            }*/
        }
        return true;
    }
}
