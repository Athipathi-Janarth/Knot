/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.BakerPanel;

import ui.SystemAdmin.*;
import java.awt.Color;

/**
 *
 * @author athipathi
 */
public class bakerBookingsPanel extends javax.swing.JPanel {

    /**
     * Creates new form networkPanel
     */
    public bakerBookingsPanel() {
        initComponents();
        adminPanelCard.setBackground(new Color(0,0,0,90));
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
        jLabel1 = new javax.swing.JLabel();
        txtNetwork = new javax.swing.JTextField();
        btnAddnetwork = new javax.swing.JButton();
        adminBackgroundImg = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(977, 630));
        setLayout(null);

        networkTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Networks"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkTable);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Network Name");

        txtNetwork.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        btnAddnetwork.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnAddnetwork.setText("Add Network");

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(btnAddnetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(btnAddnetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        add(adminPanelCard);
        adminPanelCard.setBounds(0, 0, 1090, 630);

        adminBackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminBg.jpeg"))); // NOI18N
        adminBackgroundImg.setPreferredSize(new java.awt.Dimension(977, 630));
        add(adminBackgroundImg);
        adminBackgroundImg.setBounds(0, 0, 1090, 630);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminBackgroundImg;
    private javax.swing.JPanel adminPanelCard;
    private javax.swing.JButton btnAddnetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable networkTable;
    private javax.swing.JTextField txtNetwork;
    // End of variables declaration//GEN-END:variables
}
