/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Organization.Catering;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class CateringDirectory {
    private ArrayList<Catering> cateringDirectory;

    public ArrayList<Catering> getCateringDirectory() {
        return cateringDirectory;
    }

    public void setCateringDirectory(ArrayList<Catering> cateringDirectory) {
        this.cateringDirectory = cateringDirectory;
    }

    public CateringDirectory(ArrayList<Catering> cateringDirectory) {
        this.cateringDirectory = cateringDirectory;
    }
    
}
