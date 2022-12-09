/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;

import Model.Menus.MenuItem;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nageshsairam
 */

enum OrderStatus {
  ACCEPT,
  REJECT
}

public class Order {

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public Order(float total, Date orderDate, ArrayList<MenuItem> items, OrderStatus status) {
        this.total = total;
        this.orderDate = orderDate;
        this.items = items;
        this.status = status;
    }
    private float total;
    private Date orderDate;
    private ArrayList<MenuItem> items;
    private OrderStatus status;
}
