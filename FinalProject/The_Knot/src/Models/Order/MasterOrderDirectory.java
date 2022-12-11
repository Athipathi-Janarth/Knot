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
public class MasterOrderDirectory extends OrderDirectory {
    private long orderId= 1;
    private ArrayList<Order> masterOrderList =  new ArrayList<Order>();

    public MasterOrderDirectory() {
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Order> getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(ArrayList<Order> masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    
    public Order addOrder(Order order){
        order.setOrderId(this.orderId);
        this.masterOrderList.add(order);
        this.orderId++;
        return order;
    }
    
    public Order updateOrder(Order order) {
        System.out.println("Updating emploee");
        if (order != null) {
            for (int i = 0; i < masterOrderList.size(); i++) {
                System.out.println("gng to update Order "+ order.getOrderId());
                if (order.getOrderId() == masterOrderList.get(i).getOrderId()) {
                    masterOrderList.set(i, order);
                    return order;
                }
            }
        }
        return null;
    }
}
