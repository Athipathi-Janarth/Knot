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
public class DecorMenuItem  extends MenuItem {

    public DecorMenuItem(String itemName, int id, float price) {
        super(itemName, id, price);
    }

    public String getDecorType() {
        return decorType;
    }

    public void setDecorType(String decorType) {
        this.decorType = decorType;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public long getVenueId() {
        return venueId;
    }

    public void setVenueId(long venueId) {
        this.venueId = venueId;
    }
    private String decorType;
    private String theme;
    private long venueId;
}
