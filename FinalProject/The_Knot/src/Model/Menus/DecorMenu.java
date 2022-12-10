/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.DecorMenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class DecorMenu extends Menu {
    private ArrayList<DecorMenuItem> cateringMenu;

    public DecorMenu(ArrayList<DecorMenuItem> cateringMenu, int id, String name) {
        super(id, name);
        this.cateringMenu = cateringMenu;
    }

    public ArrayList<DecorMenuItem> getCateringMenu() {
        return cateringMenu;
    }

    public void setCateringMenu(ArrayList<DecorMenuItem> cateringMenu) {
        this.cateringMenu = cateringMenu;
    }
          
}
