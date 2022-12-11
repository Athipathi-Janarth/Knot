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
public class DecorOrderDirectory extends OrderDirectory {
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    private ArrayList<DecorOrder> decorOrders =  new ArrayList<>();

    public DecorOrderDirectory() {
    }

    public ArrayList<DecorOrder> getDecorOrders() {
        return decorOrders;
    }

    public void setDecorOrders(ArrayList<DecorOrder> decorOrders) {
        this.decorOrders = decorOrders;
    }

    public void addDecorOrder(DecorOrder order){
        this.decorOrders.add(order);
        this.orderId++;
    }
}
