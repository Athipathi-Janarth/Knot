/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.CateringMenu;
import Model.Menus.CateringMenu;
import Models.Order.OrderDirectory;

/**
 *
 * @author nageshsairam
 */
public class Catering extends Organization {

    public Catering(String name,Type type) {
        super(name,type);
    }
    private CateringMenu menu = new CateringMenu(1, this.getName() + "menu" );

    public CateringMenu getMenu() {
        if(menu ==null){
            menu = new CateringMenu(1, this.getName() + "menu" );
        }
        return menu;
    }

    public void setMenu(CateringMenu menu) {
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
