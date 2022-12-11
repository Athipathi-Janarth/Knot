/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.GroomingMenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class GroomingMenu extends Menu {

    private ArrayList<GroomingMenuItem> groomingMenu =  new ArrayList<>();

    public ArrayList<GroomingMenuItem> getGroomingMenu() {
        if(groomingMenu ==null){
            groomingMenu = new ArrayList<>();
        }
        return groomingMenu;
    }

    public void setGroomingMenu(ArrayList<GroomingMenuItem> groomingMenu) {
        this.groomingMenu = groomingMenu;
    }

    public GroomingMenu(ArrayList<GroomingMenuItem> groomingMenu, int id, String name) {
        super(id, name);
        this.groomingMenu = groomingMenu;
    }
    

}
