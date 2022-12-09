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
public class GroomingMenuItem extends MenuItem {

    public GroomingMenuItem(String itemName, int id, float price) {
        super(itemName, id, price);
    }
    private String eventType;
    private String theme;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }
}
