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
    private int menuItemId = 0;
    private ArrayList<BakeryMenuItem> bakeryMenu = new ArrayList<>();

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public BakeryMenu(int id, String name) {
        super(id, name);
    }

    public ArrayList<BakeryMenuItem> getBakeryMenu() {
        if(bakeryMenu ==null){
            bakeryMenu = new ArrayList<>();
        }
        return bakeryMenu;
    }
    
    public BakeryMenuItem getMenuItem(int menuItemId) {
        for (BakeryMenuItem menuItem : bakeryMenu) {
            if (menuItem.getId() == menuItemId) {
                return menuItem;
            }
        }
        return null;
    }


    public void setBakeryMenu(ArrayList<BakeryMenuItem> bakeryMenu) {
        this.bakeryMenu = bakeryMenu;
    }
    
    public void addBakeryMenuItem (BakeryMenuItem menuItem){
        this.bakeryMenu.add(menuItem);
        this.incrementId();
        System.out.println("creating menu Item "+ this.getMenuItemId());
    }
    
    public BakeryMenuItem updateMenuItem(BakeryMenuItem menuItem){    
        System.out.println("updating menu Item Id" + menuItem.getId());
        if (menuItem != null) {
            for (int i = 0; i < bakeryMenu.size(); i++) {
                System.out.println("gng to update menu "+ menuItem.getId());
                if (menuItem.getId() == bakeryMenu.get(i).getId()) {
                    System.out.println("found item to be updated");
                    bakeryMenu.set(i, menuItem);
                    return menuItem;
                }
            }
        }
        return null;
    }
    
    
    public void deleteBakeryMenuItem (int menuItemId){
        this.bakeryMenu.remove(getMenuItem(menuItemId));
    }
    
    public void incrementId(){
        this.menuItemId++;
    }
}
