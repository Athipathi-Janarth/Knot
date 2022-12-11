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
public class StylistDirectory {
   private ArrayList<Stylist> stylistDirectory = new ArrayList<>(); 

    public ArrayList<Stylist> getStylistDirectory() {
        return stylistDirectory;
    }

    public StylistDirectory() {
    }

    public void setStylistDirectory(ArrayList<Stylist> stylistDirectory) {
        this.stylistDirectory = stylistDirectory;
    }

}
