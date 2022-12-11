/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;

import java.util.Date;

/**
 *
 * @author nageshsairam
 */
public class VenueOrder extends Order {

    public VenueOrder(Date orderDate, OrderStatus status, String username, long orgId, String orgName, float price, String itemName) {
        super(orderDate, status, username, orgId, orgName, price, itemName);
    }
    
    private Date weddingDate;

    public Date getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }

}
