/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.CateringMenuItem;
import Model.MenuItem.CateringMenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class CateringMenu extends Menu {
     private int menuItemId = 0;
    private ArrayList<CateringMenuItem> cateringMenu = new ArrayList<>();

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public CateringMenu(int id, String name) {
        super(id, name);
    }

    public ArrayList<CateringMenuItem> getCateringMenu() {
        if(cateringMenu ==null){
            cateringMenu = new ArrayList<>();
        }
        return cateringMenu;
    }
    
    public CateringMenuItem getMenuItem(int menuItemId) {
        for (CateringMenuItem menuItem : cateringMenu) {
            if (menuItem.getId() == menuItemId) {
                return menuItem;
            }
        }
        return null;
    }


    public void setCateringMenu(ArrayList<CateringMenuItem> cateringMenu) {
        this.cateringMenu = cateringMenu;
    }
    
    public void addCateringMenuItem (CateringMenuItem menuItem){
        this.cateringMenu.add(menuItem);
        this.incrementId();
        System.out.println("creating menu Item "+ this.getMenuItemId());
    }
    
    public CateringMenuItem updateMenuItem(CateringMenuItem menuItem){    
        System.out.println("updating menu Item Id" + menuItem.getId());
        if (menuItem != null) {
            for (int i = 0; i < cateringMenu.size(); i++) {
                System.out.println("gng to update menu "+ menuItem.getId());
                if (menuItem.getId() == cateringMenu.get(i).getId()) {
                    System.out.println("found item to be updated");
                    cateringMenu.set(i, menuItem);
                    return menuItem;
                }
            }
        }
        return null;
    }
    
    
    public void deleteCateringMenuItem (int menuItemId){
        this.cateringMenu.remove(getMenuItem(menuItemId));
    }
    
    public void incrementId(){
        this.menuItemId++;
    }
    
}
