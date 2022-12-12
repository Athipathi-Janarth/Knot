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
public class CateringOrderDirectory {
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    private ArrayList<CateringOrder> cateringOrders = new ArrayList<>();

    public CateringOrderDirectory() {

    }

    public ArrayList<CateringOrder> getCateringOrders() {
        return cateringOrders;
    }

    public void setCateringOrders(ArrayList<CateringOrder> cateringOrders) {
        this.cateringOrders = cateringOrders;
    }
    
    public void addCateringOrder(CateringOrder order){
        this.cateringOrders.add(order);
        this.orderId++;
    }
        
    public CateringOrder updateOrder(CateringOrder order) {
        System.out.println("Updating emploee");
        if (order != null) {
            for (int i = 0; i < cateringOrders.size(); i++) {
                System.out.println("gng to update Order "+ order.getOrderId());
                if (order.getOrderId() == cateringOrders.get(i).getOrderId()) {
                    cateringOrders.set(i, order);
                    return order;
                }
            }
        }
        return null;
    }
    
}
