/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.BakeryMenu;
import Models.Order.OrderDirectory;
import Models.Organization.Organization;

/**
 *
 * @author nageshsairam
 */
public class Bakery extends Organization {

    public Bakery() {
        super();
    }
    
    private BakeryMenu menu;

    public BakeryMenu getMenu() {
        return menu;
    }

    public void setMenu(BakeryMenu menu) {
        this.menu = menu;
    }
    private OrderDirectory orders;
}
