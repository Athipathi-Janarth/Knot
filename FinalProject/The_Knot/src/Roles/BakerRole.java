/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import javax.swing.JPanel;
import ui.BakerPanel.mainPanelBaker;

/**
 *
 * @author vikashsingh
 */
public class BakerRole extends Role{
    
    @Override
    public JPanel createWorkArea() {
       return new mainPanelBaker();
       
    }
    
    
    
}
