/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.BakeryMenuItem;
import Model.MenuItem.DecorMenuItem;
import Model.MenuItem.VenueMenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class VenueMenu extends Menu {
    private int menuItemId = 0;
    private ArrayList<VenueMenuItem> venueMenu = new ArrayList<>();

    public int getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    public ArrayList<VenueMenuItem> getVenueMenu() {
        return venueMenu;
    }

    public void setVenueMenu(ArrayList<VenueMenuItem> venueMenu) {
        this.venueMenu = venueMenu;
    }

  public VenueMenu(int id, String name) {
        super(id, name);
    }

    public ArrayList<VenueMenuItem> getDecorMenu() {
        if(venueMenu ==null){
            venueMenu = new ArrayList<>();
        }
        return venueMenu;
    }

    public void setVenueMenuList(ArrayList<VenueMenuItem> decorMenu) {
        this.venueMenu = venueMenu;
    }
     public VenueMenuItem getMenuItem(int menuItemId) {
        for (VenueMenuItem menuItem : venueMenu) {
            if (menuItem.getId() == menuItemId) {
                return menuItem;
            }
        }
        return null;
    }
      public void addVenueMenuItem (VenueMenuItem menuItem){
        this.venueMenu.add(menuItem);
        this.incrementId();
    }
    
    public void deleteVenueMenuItem (int menuItemId){
        this.venueMenu.remove(getMenuItem(menuItemId));
        this.incrementId();
    }
    
    public void incrementId(){
        this.menuItemId++;
    }
          
}
