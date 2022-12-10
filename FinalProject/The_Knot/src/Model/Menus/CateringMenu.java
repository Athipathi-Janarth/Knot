/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menus;

import Model.MenuItem.CateringMenuItem;
import java.util.ArrayList;

/**
 *
 * @author nageshsairam
 */
public class CateringMenu extends Menu {
      private ArrayList<CateringMenuItem> cateringMenu = new ArrayList<>();

    public CateringMenu(ArrayList<CateringMenuItem> cateringMenu, int id, String name) {
        super(id, name);
        this.cateringMenu = cateringMenu;
    }

    public ArrayList<CateringMenuItem> getCateringMenu() {
        if(cateringMenu ==null){
            cateringMenu = new ArrayList<>();
        }
        return cateringMenu;
    }

    public void setCateringMenu(ArrayList<CateringMenuItem> cateringMenu) {
        this.cateringMenu = cateringMenu;
    }

    
}
