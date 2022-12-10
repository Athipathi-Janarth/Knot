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
    private ArrayList<DecorMenuItem> decorMenu = new ArrayList<>();

    public DecorMenu(ArrayList<DecorMenuItem> decorMenu, int id, String name) {
        super(id, name);
        this.decorMenu = decorMenu;
    }

    public ArrayList<DecorMenuItem> getDecorMenu() {
        if(decorMenu ==null){
            decorMenu = new ArrayList<>();
        }
        return decorMenu;
    }

    public void setCateringMenu(ArrayList<DecorMenuItem> decorMenu) {
        this.decorMenu = decorMenu;
    }
          
}
