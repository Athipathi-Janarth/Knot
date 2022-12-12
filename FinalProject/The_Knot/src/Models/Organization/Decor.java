/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.DecorMenu;
import Models.Order.DecorOrderDirectory;

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
    private DecorOrderDirectory orders;

    public DecorOrderDirectory getOrders() {
        if(orders ==null){
            orders = new DecorOrderDirectory();
        }
        return orders;
    }

    public void setOrders(DecorOrderDirectory orders) {
        this.orders = orders;
    }
}
