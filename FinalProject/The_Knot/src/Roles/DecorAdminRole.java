/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import javax.swing.JPanel;
import ui.DecorAdmin.mainPanelDecorAdmin;

/**
 *
 * @author vikashsingh
 */
public class DecorAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea() {
       return new mainPanelDecorAdmin();
       
    }
    
    
    
}
