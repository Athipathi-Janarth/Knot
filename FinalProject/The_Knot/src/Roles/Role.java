/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import javax.swing.JPanel;
/**
 *
 * @author vikashsingh
 */
public abstract class Role {
    
    public enum RoleType{
        FoodAdmin("Food Admin"),
        Caterer("Caterer"),
        Baker("Baker"),
        DecorAdmin("Decor Admin"),
        VenueManager("Venue Manager"),
        DecorationManager("Decoration Manager "),
        GroomingAdmin("Grooming Admin"), 
        Stylist ("Stylist"),
        Designer("Designer"), 
        FinanceAdmin("Finance Admin");
    
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea();

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}