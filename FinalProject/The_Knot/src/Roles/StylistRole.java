/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import javax.swing.JPanel;
import ui.StylistPanel.mainPanelStylist;

/**
 *
 * @author vikashsingh
 */
public class StylistRole extends Role{
    
    @Override
    public JPanel createWorkArea() {
       return new mainPanelStylist();
       
    }
    
    
    
}
