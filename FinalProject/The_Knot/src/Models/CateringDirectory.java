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
    private ArrayList<Catering> cateringList =  new ArrayList<>();

    public ArrayList<Catering> getCateringList() {
        return cateringList;
    }

    public void setCateringList(ArrayList<Catering> cateringList) {
        this.cateringList = cateringList;
    }

}
