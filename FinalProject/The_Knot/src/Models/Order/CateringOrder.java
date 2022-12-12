/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;

import Model.MenuItem.BakeryMenuItem;
import Model.MenuItem.CateringMenuItem;
import java.util.Date;

/**
 *
 * @author nageshsairam
 */
public class CateringOrder extends Order {

    public CateringOrder(Date orderDate, OrderStatus status, String username, long orgId, String orgName, float price, String itemName) {
        super(orderDate, status, username, orgId, orgName, price, itemName);
    }
   private CateringMenuItem menuItem;

}
