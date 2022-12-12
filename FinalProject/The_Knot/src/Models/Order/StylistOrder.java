/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;

import Model.MenuItem.DecorMenuItem;
import Model.MenuItem.StylistMenuItem;
import java.util.Date;

/**
 *
 * @author nageshsairam
 */
public class StylistOrder extends Order {

    public StylistOrder(Date orderDate, OrderStatus status, String username, long orgId, String orgName, float price, String itemName) {
        super(orderDate, status, username, orgId, orgName, price, itemName);
    }

   private StylistMenuItem menuItem;

    public StylistMenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(StylistMenuItem menuItem) {
        this.menuItem = menuItem;
    }
}
