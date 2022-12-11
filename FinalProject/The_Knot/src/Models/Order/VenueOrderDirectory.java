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
    private int orderId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public VenueOrderDirectory() {
    }

    public ArrayList<VenueOrder> getVenueOrder() {
        return venueOrders;
    }

    public void setVenueOrder(ArrayList<VenueOrder> venueOrder) {
        this.venueOrders = venueOrder;
    }

 
   private ArrayList<VenueOrder> venueOrders = new ArrayList<>();
   public void addVenueOrder(VenueOrder order){
        this.venueOrders.add(order);
        this.orderId++;
    }

}
