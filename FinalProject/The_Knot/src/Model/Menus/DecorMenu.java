/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.BakeryMenuItem;
import Model.MenuItem.DecorMenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class DecorMenu extends Menu {
     private int menuItemId = 0;
    private ArrayList<DecorMenuItem> decorMenu = new ArrayList<>();

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public DecorMenu( int id, String name) {
        super(id, name);
      
    }

    public ArrayList<DecorMenuItem> getDecorMenu() {
        if(decorMenu ==null){
            decorMenu = new ArrayList<>();
        }
        return decorMenu;
    }

    public DecorMenuItem getMenuItem(int menuItemId) {
        for (DecorMenuItem menuItem : decorMenu) {
            if (menuItem.getId() == menuItemId) {
                return menuItem;
            }
        }
        return null;
    }
     public void addDecorMenuItem (DecorMenuItem menuItem){
        this.decorMenu.add(menuItem);
        this.incrementId();
    }
    
    public void deleteDecorMenuItem (int menuItemId){
        this.decorMenu.remove(getMenuItem(menuItemId));
        this.incrementId();
    }
    
    public void incrementId(){
        this.menuItemId++;
    }
          
}
