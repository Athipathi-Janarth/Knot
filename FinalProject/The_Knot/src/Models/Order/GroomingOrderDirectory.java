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
public class GroomingOrderDirectory extends OrderDirectory {

    public GroomingOrderDirectory(ArrayList<GroomingOrder> droomingDirectory, ArrayList<Order> orderDirectory) {
        super(orderDirectory);
        this.droomingDirectory = droomingDirectory;
    }

    public ArrayList<GroomingOrder> getDroomingDirectory() {
        return droomingDirectory;
    }

    public void setDroomingDirectory(ArrayList<GroomingOrder> droomingDirectory) {
        this.droomingDirectory = droomingDirectory;
    }
    private ArrayList<GroomingOrder> droomingDirectory;
}
