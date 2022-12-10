/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

/**
 *
 * @author nageshsairam
 */
public class MenuItem {

    public String getItemName() {
        return itemName;
    }

    public MenuItem(String itemName, int id, float price) {
        this.itemName = itemName;
        this.id = id;
        this.price = price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
   private String itemName;
   private int id;
   private float price;
}
