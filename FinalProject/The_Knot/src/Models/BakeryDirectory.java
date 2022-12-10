/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Organization.Bakery;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class BakeryDirectory {
    private ArrayList<Bakery> bakeries = new ArrayList<>();

    public ArrayList<Bakery> getBakeries() {
        return bakeries;
    }

    public BakeryDirectory() {
    }

    public void setBakeries(ArrayList<Bakery> bakeries) {
        this.bakeries = bakeries;
    }

}
