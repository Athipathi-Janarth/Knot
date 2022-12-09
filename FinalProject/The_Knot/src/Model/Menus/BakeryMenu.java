/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.BakeryMenuItem;
import Model.Menus.Menu;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class BakeryMenu extends Menu {
      private ArrayList<BakeryMenuItem> bakeryMenu;

    public BakeryMenu(ArrayList<BakeryMenuItem> bakeryMenu, int id, String name) {
        super(id, name);
        this.bakeryMenu = bakeryMenu;
    }

    public ArrayList<BakeryMenuItem> getBakeryMenu() {
        return bakeryMenu;
    }

    public void setBakeryMenu(ArrayList<BakeryMenuItem> bakeryMenu) {
        this.bakeryMenu = bakeryMenu;
    }
}
