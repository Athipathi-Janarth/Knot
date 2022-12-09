/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Model.Menus.MenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class Cart {
    private ArrayList<MenuItem> cartItems;

    public Cart(ArrayList<MenuItem> cartItems) {
        this.cartItems = cartItems;
    }

    public ArrayList<MenuItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(ArrayList<MenuItem> cartItems) {
        this.cartItems = cartItems;
    }
    
    private float total;

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
