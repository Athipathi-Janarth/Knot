/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import Enterprise.Enterprise;
import Enterprise.EnterpriseDirectory;
import Models.BakeryDirectory;
import Models.CateringDirectory;
import Models.DecorDirectory;
import Models.GroomingDirectory;

/**
 *
 * @author athipathi
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private BakeryDirectory bakeryDirectory = new BakeryDirectory();
    private CateringDirectory cateringDirectory = new CateringDirectory();
    private DecorDirectory decorDirectory = new DecorDirectory();
    private GroomingDirectory groomingDirectory = new GroomingDirectory();

    public BakeryDirectory getBakeryDirectory() {
        if(bakeryDirectory == null){
           bakeryDirectory = new BakeryDirectory();
        }
        return bakeryDirectory;
    }

    public void setBakeryDirectory(BakeryDirectory bakeryDirectory) {
        this.bakeryDirectory = bakeryDirectory;
    }

    public CateringDirectory getCateringDirectory() {
        if(cateringDirectory == null){
            cateringDirectory = new CateringDirectory();
        }
        return cateringDirectory;
    }

    public void setCateringDirectory(CateringDirectory cateringDirectory) {
        this.cateringDirectory = cateringDirectory;
    }

    public DecorDirectory getDecorDirectory() {
        if(decorDirectory == null){
            decorDirectory = new DecorDirectory();
        }
        return decorDirectory;
    }

    public void setDecorDirectory(DecorDirectory decorDirectory) {
        this.decorDirectory = decorDirectory;
    }

    public GroomingDirectory getGroomingDirectory() {
        if(groomingDirectory == null){
            groomingDirectory = new GroomingDirectory();
        }
        return groomingDirectory;
    }

    public void setGroomingDirectory(GroomingDirectory groomingDirectory) {
        this.groomingDirectory = groomingDirectory;
    }

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