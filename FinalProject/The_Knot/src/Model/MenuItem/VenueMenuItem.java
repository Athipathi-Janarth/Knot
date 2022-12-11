/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.MenuItem;

import Model.Menus.MenuItem;

/**
 *
 * @author nageshsairam
 */
public class VenueMenuItem  extends MenuItem {

     private String type;
    private int capacity;
    private String photo;

    public VenueMenuItem(String type, int capacity, String photo, String itemName, int id, float price) {
        super(itemName, id, price);
        this.type = type;
        this.capacity = capacity;
        this.photo = photo;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPhoto() {
        return photo;
    }

}
