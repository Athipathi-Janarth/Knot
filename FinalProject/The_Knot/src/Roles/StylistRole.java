/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.EcoSystem;
import Employee.Employee;
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

    @Override
    public JPanel createWorkArea(EcoSystem system, Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
