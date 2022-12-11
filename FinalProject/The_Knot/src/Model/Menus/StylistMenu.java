/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.StylistMenuItem;
import Model.MenuItem.StylistMenuItem;
import Model.MenuItem.StylistMenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class StylistMenu extends Menu {

    private ArrayList<StylistMenuItem> stylistMenu =  new ArrayList<>();

    public ArrayList<StylistMenuItem> getStylistMenu() {
        if(stylistMenu ==null){
            stylistMenu = new ArrayList<>();
        }
        return stylistMenu;
    }

    public void setStylistMenu(ArrayList<StylistMenuItem> stylistMenu) {
        this.stylistMenu = stylistMenu;
    }

    public StylistMenu( int id, String name) {
        super(id, name);
    }
    
    private int menuItemId = 0;

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }
    
        public void addStylistMenuItem (StylistMenuItem menuItem){
        this.stylistMenu.add(menuItem);
        this.incrementId();
    }
     public StylistMenuItem getMenuItem(int menuItemId) {
        for (StylistMenuItem menuItem : stylistMenu) {
            if (menuItem.getId() == menuItemId) {
                return menuItem;
            }
        }
        return null;
    }
    public void deleteStylistMenuItem (int menuItemId){
        this.stylistMenu.remove(getMenuItem(menuItemId));
        this.incrementId();
    }
    
    public void incrementId(){
        this.menuItemId++;
    }
}
