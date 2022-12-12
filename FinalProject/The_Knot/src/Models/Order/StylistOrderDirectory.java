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
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    private ArrayList<StylistOrder> stylistOrders = new ArrayList<>();

    public StylistOrderDirectory() {

    }

    public ArrayList<StylistOrder> getStylistOrders() {
        if(stylistOrders==null){
            stylistOrders = new ArrayList<>();
        }
        return stylistOrders;
    }

    public void setStylistOrders(ArrayList<StylistOrder> stylistOrders) {
        this.stylistOrders = stylistOrders;
    }
    
    public void addStylistOrder(StylistOrder order){
        this.stylistOrders.add(order);
        this.orderId++;
    }
        
    public StylistOrder updateOrder(StylistOrder order) {
        System.out.println("Updating emploee");
        if (order != null) {
            for (int i = 0; i < stylistOrders.size(); i++) {
                System.out.println("gng to update Order "+ order.getOrderId());
                if (order.getOrderId() == stylistOrders.get(i).getOrderId()) {
                    stylistOrders.set(i, order);
                    return order;
                }
            }
        }
        return null;
    }
    
    
}
