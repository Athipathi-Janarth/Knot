/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Finance;

import Models.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class KnotOrder {
   private long orderId;
   private ArrayList<Order> knotOrder; 

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Order> getKnotOrder() {
        return knotOrder;
    }

    public void setKnotOrder(ArrayList<Order> knotOrder) {
        this.knotOrder = knotOrder;
    }

    public KnotOrder(ArrayList<Order> knotOrder) {
        this.knotOrder = knotOrder;
    }
   
}
