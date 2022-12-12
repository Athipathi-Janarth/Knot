/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.CateringMenu;
import Models.Order.CateringOrderDirectory;

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
    
    private CateringOrderDirectory orders = new CateringOrderDirectory();

    public CateringOrderDirectory getOrders() {
        if(orders==null){
            orders = new CateringOrderDirectory();
        }
        return orders;
    }

    public void setOrders(CateringOrderDirectory orders) {
        this.orders = orders;
    }

    
}
