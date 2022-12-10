/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.DecorMenu;

/**
 *
 * @author nageshsairam
 */
public class Decor extends Organization {

    public Decor(String name) {
        super(name);
    }
    
    private DecorMenu menu;

    public DecorMenu getMenu() {
        return menu;
    }

    public void setMenu(DecorMenu menu) {
        this.menu = menu;
    }
}
