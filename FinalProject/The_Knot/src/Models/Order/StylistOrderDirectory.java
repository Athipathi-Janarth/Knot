/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;

import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class StylistOrderDirectory extends OrderDirectory {

    public StylistOrderDirectory(ArrayList<StylistOrder> stylingDirectory, ArrayList<Order> orderDirectory) {
        super(orderDirectory);
        this.stylingDirectory = stylingDirectory;
    }

    public ArrayList<StylistOrder> getStylingDirectory() {
        return stylingDirectory;
    }

    public void setStylingDirectory(ArrayList<StylistOrder> stylingDirectory) {
        this.stylingDirectory = stylingDirectory;
    }
    private ArrayList<StylistOrder> stylingDirectory;
}
