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
public class DecorOrder extends Order  {

    public DecorOrder(float total, Date orderDate, ArrayList<MenuItem> items, OrderStatus status) {
        super(total, orderDate, items, status);
    }

    
}
