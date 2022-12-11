/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.DecorMenu;
import Model.Menus.DecorMenu;
import Model.Menus.VenueMenu;
import Models.Order.OrderDirectory;

/**
 *
 * @author nageshsairam
 */
public class Decor extends Organization {
    public Decor(String name,Type type) {
        super(name,type);
    }
    
    private DecorMenu menu = new DecorMenu(1, this.getName() + "menu" );

    public DecorMenu getMenu() {
        if(menu ==null){
            menu = new DecorMenu(1, this.getName() + "menu" );
        }
        return menu;
    }

    public void setMenu(DecorMenu menu) {
        this.menu = menu;
    }
    
    private OrderDirectory orders;

    public OrderDirectory getOrders() {
        return orders;
    }

    public void setOrders(OrderDirectory orders) {
        this.orders = orders;
    }
}
