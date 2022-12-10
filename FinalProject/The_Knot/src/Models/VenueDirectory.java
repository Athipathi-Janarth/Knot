/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Models.Organization.Venue;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class VenueDirectory {
    private ArrayList<Venue> venueDirectory = new ArrayList<>();

    public ArrayList<Venue> getVenueDirectory() {
        return venueDirectory;
    }

    public void setVenueDirectory(ArrayList<Venue> venueDirectory) {
        this.venueDirectory = venueDirectory;
    }
    
}
