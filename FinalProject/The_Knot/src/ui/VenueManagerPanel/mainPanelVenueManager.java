/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.VenueManagerPanel;

import Business.EcoSystem;
import Employee.Employee;
import ui.SystemAdmin.*;

/**
 *
 * @author athipathi
 */
public class mainPanelVenueManager extends javax.swing.JPanel {

    /**
     * Creates new form mainPanelSysadmin
     */
    EcoSystem system;
    Employee employee;
    venueManagerBookingsPanel bookings= new venueManagerBookingsPanel();
    venueManagerItemsPanel menu=new venueManagerItemsPanel();
    public mainPanelVenueManager(){
        initComponents();
    }
    public mainPanelVenueManager(EcoSystem system, Employee employee) {
        this.system = system;
        this.employee = employee;
        initComponents();
        splitPane.setRightComponent(bookings);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        bakerMenuPanel = new javax.swing.JPanel();
        bakerProfileImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBookings = new javax.swing.JButton();
        btnServices = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1210, 630));
        setPreferredSize(new java.awt.Dimension(1210, 630));
        setSize(new java.awt.Dimension(1210, 630));

        bakerProfileImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bakerProfileImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baker.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome Manager!");

        btnBookings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedules.png"))); // NOI18N
        btnBookings.setText("       View Bookings");
        btnBookings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBookings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingsActionPerformed(evt);
            }
        });

        btnServices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        btnServices.setText("       Manage Services");
        btnServices.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServicesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bakerMenuPanelLayout = new javax.swing.GroupLayout(bakerMenuPanel);
        bakerMenuPanel.setLayout(bakerMenuPanelLayout);
        bakerMenuPanelLayout.setHorizontalGroup(
            bakerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bakerMenuPanelLayout.createSequentialGroup()
                .addGroup(bakerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bakerMenuPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(bakerProfileImg))
                    .addGroup(bakerMenuPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(bakerMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bakerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnServices, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBookings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        bakerMenuPanelLayout.setVerticalGroup(
            bakerMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bakerMenuPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bakerProfileImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBookings)
                .addGap(27, 27, 27)
                .addComponent(btnServices)
                .addContainerGap(298, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(bakerMenuPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingsActionPerformed
        // TODO add your handling code here:
        
        splitPane.setRightComponent(bookings);
        
    }//GEN-LAST:event_btnBookingsActionPerformed

    private void btnServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServicesActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(menu);
    }//GEN-LAST:event_btnServicesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bakerMenuPanel;
    private javax.swing.JLabel bakerProfileImg;
    private javax.swing.JButton btnBookings;
    private javax.swing.JButton btnServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
