/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import javax.swing.JPanel;
import ui.FoodAdmin.mainPanelFoodAdmin;

/**
 *
 * @author vikashsingh
 */
public class FoodAdminRole extends Role{

    @Override
    public JPanel createWorkArea() {
       return new mainPanelFoodAdmin();
       
    }

    
    
}
