/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Organization.Stylist;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class DesignerDirectory {
   private ArrayList<Stylist> designerDirectory = new ArrayList<>(); 

    public ArrayList<Stylist> getGroomingDirectory() {
        return designerDirectory;
    }

    public DesignerDirectory() {
    }

    public void setGroomingDirectory(ArrayList<Stylist> groomingDirectory) {
        this.designerDirectory = groomingDirectory;
    }

}
