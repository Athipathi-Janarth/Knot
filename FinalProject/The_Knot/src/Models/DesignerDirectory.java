/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Organization.Designer;
import Models.Organization.Stylist;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class DesignerDirectory {
   private ArrayList<Designer> designerDirectory = new ArrayList<>(); 

    public ArrayList<Designer> getDesignerDirectory() {
        return designerDirectory;
    }

    public DesignerDirectory() {
    }

    public void setDesignerDirectory(ArrayList<Designer> designerDirectory) {
        this.designerDirectory = designerDirectory;
    }

}
