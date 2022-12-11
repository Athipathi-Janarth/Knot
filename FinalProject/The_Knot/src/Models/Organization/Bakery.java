/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.BakeryMenu;
import Models.Order.BakeryOrderDirectory;
import Models.Order.Order;

/**
 *
 * @author nageshsairam
 */
public class Bakery extends Organization {
    public Bakery(String name,Type type) {
        super(name,type);
    }
    
    private BakeryMenu menu = new BakeryMenu(1, this.getName() + "menu" );

    public BakeryMenu getMenu() {
        if(menu ==null){
            menu = new BakeryMenu(1, this.getName() + "menu" );
        }
        return menu;
    }

    public BakeryOrderDirectory getOrders() {
        return orders;
    }

    public void setOrders(BakeryOrderDirectory orders) {
        this.orders = orders;
    }

    public void setMenu(BakeryMenu menu) {
        this.menu = menu;
    }
    
    private BakeryOrderDirectory orders = new BakeryOrderDirectory();
}
