/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;

import Model.MenuItem.CateringMenuItem;
import Model.MenuItem.DecorMenuItem;
import Model.Menus.MenuItem;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nageshsairam
 */
public class DecorOrder extends Order  {

    public DecorOrder(Date orderDate, OrderStatus status, String username, long orgId, String orgName, float price, String itemName) {
        super(orderDate, status, username, orgId, orgName, price, itemName);
    }

    public DecorMenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(DecorMenuItem menuItem) {
        this.menuItem = menuItem;
    }
   private DecorMenuItem menuItem;

}
