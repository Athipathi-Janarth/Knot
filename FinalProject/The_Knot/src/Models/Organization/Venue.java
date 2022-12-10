/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Organization;

import Models.Organization.Organization;

/**
 *
 * @author nageshsairam
 */
public class Venue extends Organization {

    public Venue(String name) {
        super(name);
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
    
    private int capacity;
    private float pricePerday;
}
