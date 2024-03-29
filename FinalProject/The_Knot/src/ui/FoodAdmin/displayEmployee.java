/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FoodAdmin;

import Business.EcoSystem;
import Employee.Employee;
import Enterprise.Enterprise;
import Models.Organization.Organization;
import Network.Network;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vikashsingh
 */
public class displayEmployee extends javax.swing.JPanel {

    /**
     * Creates new form networkPanel
     */
    EcoSystem system;
    Employee emp;
    public displayEmployee(EcoSystem system,Employee emp) {
        initComponents();
        this.system=system;
        this.emp=emp;
        adminPanelCard.setBackground(new Color(0,0,0,90));
        popData();
    }
    
    public void popData() {

        DefaultTableModel model = (DefaultTableModel) networkTable.getModel();

        model.setRowCount(0);

        for (Network network :system.getNetworkList()){
            if(emp.getNetworkname().equals(network.getName())){
            for(Enterprise ent: network.getEnterpriseDirectory().getEnterpriseList()){
                if (ent.getEnterpriseType()==Enterprise.EnterpriseType.FoodManagement){  
                    for(Organization org:ent.getOrganizationList().getOrganizationList()){
                       for (Employee employee : org.getEmployees().getEmployeeList()) {
                            Object row[] = new Object[2];
                            row[0] = employee.getName();
                            row[1] = employee.getUserName();
                            ((DefaultTableModel) networkTable.getModel()).addRow(row);
                        }
                    }
                }
            }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanelCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        adminBackgroundImg = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(977, 630));
        setLayout(null);

        networkTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Business Users", "User Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkTable);

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        add(adminPanelCard);
        adminPanelCard.setBounds(0, 0, 1010, 630);

        adminBackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/foodAdminBg.png"))); // NOI18N
        add(adminBackgroundImg);
        adminBackgroundImg.setBounds(0, 0, 980, 640);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminBackgroundImg;
    private javax.swing.JPanel adminPanelCard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkTable;
    // End of variables declaration//GEN-END:variables
}
