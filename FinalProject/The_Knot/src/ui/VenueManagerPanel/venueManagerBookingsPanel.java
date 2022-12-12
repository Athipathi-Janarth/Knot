/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.VenueManagerPanel;

import Business.EcoSystem;
import Employee.Employee;
import Model.MenuItem.BakeryMenuItem;
import Model.MenuItem.VenueMenuItem;
import Model.Menus.VenueMenu;
import Models.Order.Order;
import Models.Order.VenueOrder;
import Models.Order.VenueOrderDirectory;
import Models.Organization.Organization;
import Models.Organization.Venue;
import Models.VenueDirectory;
import Network.Network;
import ui.SystemAdmin.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author athipathi
 */
public class venueManagerBookingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form networkPanel
     */
   EcoSystem system;
   Organization org;
   Employee employee;
   Venue venue;
   
    public venueManagerBookingsPanel(EcoSystem system,Employee employee) {
        initComponents();
        this.system=system;
        this.employee=employee;
        adminPanelCard.setBackground(new Color(0,0,0,90));
        venue = getVenue(employee.getOrgId());
        System.out.println("venue Orders " +venue.getOrders().getVenueOrder().size());
        populateRequestTable(venue.getOrders());
        populateBookingTable(venue.getOrders());
    }
    
    private Venue getVenue(long orgId){
       Network network = system.retriveNetwork(employee.getNetworkname());
        Venue currentVenue=null;
        ArrayList<Venue> venues = network.getVenueDirectory().getVenueDirectory();
       
        for(int i=0; i < venues.size();i++){         
            if(venues.get(i).getId() == orgId ){
                System.out.println("Venue found");
                currentVenue= venues.get(i);
            }
        }
       return currentVenue;
    }
        
    private void populateRequestTable(VenueOrderDirectory venueOrderDirectory){  
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        model.setRowCount(0);
        for(int i=0;i< venueOrderDirectory.getVenueOrder().size();i++){
            VenueOrder venuOrderItem = venueOrderDirectory.getVenueOrder().get(i);
            if(venuOrderItem.getStatus().getValue().equals(Order.OrderStatus.PENDING.getValue())){
              model.addRow(new Object[]{
                    venuOrderItem.getUserName(),
                    venuOrderItem.getPrice(),
                    venuOrderItem.getStatus(),
                    venuOrderItem.getWeddingDate(),
                    venuOrderItem.getOrderDate(),
                    venuOrderItem
              });  
            }
        }
    }
    
    
    private void populateBookingTable(VenueOrderDirectory venueOrderDirectory){  
        DefaultTableModel model = (DefaultTableModel) bookingTable.getModel();
        model.setRowCount(0);
        for(int i=0;i< venueOrderDirectory.getVenueOrder().size();i++){
            VenueOrder venuOrderItem = venueOrderDirectory.getVenueOrder().get(i);
            System.out.println(venuOrderItem.getStatus());
            if(venuOrderItem.getStatus().getValue().equals(Order.OrderStatus.CONFIRM.getValue())  || venuOrderItem.getStatus().getValue().equals(Order.OrderStatus.ACCEPT.getValue())){
                model.addRow(new Object[]{
                    venuOrderItem.getUserName(),
                    venuOrderItem.getPrice(),
                    venuOrderItem.getStatus(),
                    venuOrderItem.getWeddingDate(),
                    venuOrderItem.getOrderDate(),
                    venuOrderItem
                });
            }
        }
    }
//    

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
        requestTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        adminBackgroundImg = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(977, 630));
        setLayout(null);

        requestTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User", "Price", "Status", "WeddingDate", "Booking Date", "Order"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestTable);
        if (requestTable.getColumnModel().getColumnCount() > 0) {
            requestTable.getColumnModel().getColumn(5).setMinWidth(0);
            requestTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            requestTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Order Requests");

        bookingTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User", "Price", "Status", "Wedding Date", "Booking Date", "order"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bookingTable);
        if (bookingTable.getColumnModel().getColumnCount() > 0) {
            bookingTable.getColumnModel().getColumn(5).setMinWidth(0);
            bookingTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            bookingTable.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Upcoming / Past Orders");

        btnAccept.setText("Accept");
        btnAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcceptMouseClicked(evt);
            }
        });
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAccept)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        add(adminPanelCard);
        adminPanelCard.setBounds(0, 0, 1090, 630);

        adminBackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/venue.jpeg"))); // NOI18N
        add(adminBackgroundImg);
        adminBackgroundImg.setBounds(0, 0, 1090, 640);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int selectedRowIndex = requestTable.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Select an Order to accept");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        VenueOrder venuOrderItem  = (VenueOrder) model.getValueAt(selectedRowIndex, 5); 
        venuOrderItem.setStatus(Order.OrderStatus.ACCEPT);
        populateRequestTable(venue.getOrders());
        populateBookingTable(venue.getOrders());
        system.getMasterOrderList().updateOrder(venuOrderItem);
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnAcceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcceptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAcceptMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        int selectedRowIndex = requestTable.getSelectedRow();
        if(selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(this, "Select an Order to cancel");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();
        VenueOrder venuOrderItem  = (VenueOrder) model.getValueAt(selectedRowIndex, 5); 
        venuOrderItem.setStatus(Order.OrderStatus.REJECT);
        populateRequestTable(venue.getOrders());
        populateBookingTable(venue.getOrders());
        system.getMasterOrderList().updateOrder(venuOrderItem);
    }//GEN-LAST:event_btnCancelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminBackgroundImg;
    private javax.swing.JPanel adminPanelCard;
    private javax.swing.JTable bookingTable;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
