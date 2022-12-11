/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Model.Menus.VenueMenu;
import Models.Order.VenueOrderDirectory;

/**
 *
 * @author nageshsairam
 */
public class Venue extends Organization {

    public Venue(String name,Type type) {
        super(name,type);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getPricePerday() {
        return pricePerday;
    }

    public void setPricePerday(float pricePerday) {
        this.pricePerday = pricePerday;
    }
    private VenueMenu menu = new VenueMenu(1, this.getName() + "menu" );
    private int capacity;
    private float pricePerday;

    public VenueMenu getMenu() {
        if(menu ==null){
            menu = new VenueMenu(1, this.getName() + "menu" );
        }
        return menu;
    }
    private VenueOrderDirectory orders;

    public VenueOrderDirectory getOrders() {
        if(orders ==null){
            orders = new VenueOrderDirectory();
        }
        return orders;
    }

    public void setOrders(VenueOrderDirectory orders) {
        this.orders = orders;
    }
}
