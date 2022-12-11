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

    public DecorMenuItem(String eventtype, String Theme, String photo, String itemName, int id, float price) {
        super(itemName, id, price);
        this.eventtype = eventtype;
        this.Theme = Theme;
        this.photo = photo;
    }


     private String eventtype;
    private String Theme;
     private String photo;

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String Theme) {
        this.Theme = Theme;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
   
}
