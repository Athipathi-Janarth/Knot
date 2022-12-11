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
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    private ArrayList<BakeryOrder> bakeryOrders = new ArrayList<>();

    public BakeryOrderDirectory() {

    }

    public ArrayList<BakeryOrder> getBakeryOrders() {
        return bakeryOrders;
    }

    public void setBakeryOrders(ArrayList<BakeryOrder> bakeryOrders) {
        this.bakeryOrders = bakeryOrders;
    }
    
    public void addBakeryOrder(BakeryOrder order){
        this.bakeryOrders.add(order);
        this.orderId++;
    }
        
    public BakeryOrder updateOrder(BakeryOrder order) {
        System.out.println("Updating emploee");
        if (order != null) {
            for (int i = 0; i < bakeryOrders.size(); i++) {
                System.out.println("gng to update Order "+ order.getOrderId());
                if (order.getOrderId() == bakeryOrders.get(i).getOrderId()) {
                    bakeryOrders.set(i, order);
                    return order;
                }
            }
        }
        return null;
    }
    
    
}
