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
public class BakeryOrderDirectory extends OrderDirectory {

    public ArrayList<BakeryOrder> getBakeryOrders() {
        return bakeryOrders;
    }

    public BakeryOrderDirectory(ArrayList<BakeryOrder> bakeryOrders, ArrayList<Order> orderDirectory) {
        super(orderDirectory);
        this.bakeryOrders = bakeryOrders;
    }


    public void setBakeryOrders(ArrayList<BakeryOrder> bakeryOrders) {
        this.bakeryOrders = bakeryOrders;
    }
    private ArrayList<BakeryOrder> bakeryOrders;
}
