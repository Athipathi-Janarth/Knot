/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.GroomingMenu;
import Models.Organization.Organization;

/**
 *
 * @author nageshsairam
 */
public class Designer extends Organization {

    public GroomingMenu getMenu() {
        return menu;
    }

    public void setMenu(GroomingMenu menu) {
        this.menu = menu;
    }

    public Designer(String name) {
        super(name);
    }
    private GroomingMenu menu;
    
}
