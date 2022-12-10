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
public class BakeryMenuItem  extends MenuItem {

    public BakeryMenuItem(String flavour, int serves, String photo, String itemName, int id, float price) {
        super(itemName, id, price);
        this.flavour = flavour;
        this.serves = serves;
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    private String flavour;
    private int serves;
    private String photo;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getServes() {
        return serves;
    }

    public void setServes(int serves) {
        this.serves = serves;
    }
}
