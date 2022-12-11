/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.StylistMenu;
import Model.Menus.StylistMenu;
import Models.Organization.Organization;

/**
 *
 * @author nageshsairam
 */
public class Stylist extends Organization {


     private StylistMenu menu = new StylistMenu(1, this.getName() + "menu" );

    public StylistMenu getMenu() {
        if(menu ==null){
            menu = new StylistMenu(1, this.getName() + "menu" );
        }
        return menu;
    }
    public void setMenu(StylistMenu menu) {
        this.menu = menu;
    }

    public Stylist(String name,Type type) {
        super(name,type);
    }
    
}
