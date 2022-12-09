/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Order;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class VenueOrderDirectory extends OrderDirectory {

    public ArrayList<VenueOrder> getVenueOrder() {
        return venueOrder;
    }

    public void setVenueOrder(ArrayList<VenueOrder> venueOrder) {
        this.venueOrder = venueOrder;
    }
    
    private ArrayList<VenueOrder> venueOrder;
    public VenueOrderDirectory(ArrayList<Order> orderDirectory) {
        super(orderDirectory);
    }

}
