/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import java.awt.Color;

/**
 *
 * @author athipathi
 */
public class enterprisePanel extends javax.swing.JPanel {

    /**
     * Creates new form networkPanel
     */
    public enterprisePanel() {
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
        enterpriseTable = new javax.swing.JTable();
        lblEnterprise = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        btnAddenterprise = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dropdownNetwork = new javax.swing.JComboBox<>();
        adminBackgroundImg = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(977, 630));
        setLayout(null);

        enterpriseTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Enterprise", "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseTable);

        lblEnterprise.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setText("Enterprise Name");

        txtEnterpriseName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        btnAddenterprise.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnAddenterprise.setText("Add Enterprise");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Network Name");

        dropdownNetwork.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(btnAddenterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPanelCardLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(dropdownNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(adminPanelCardLayout.createSequentialGroup()
                                .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dropdownNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterprise)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(btnAddenterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
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
    private javax.swing.JButton btnAddenterprise;
    private javax.swing.JComboBox<String> dropdownNetwork;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JTextField txtEnterpriseName;
    // End of variables declaration//GEN-END:variables
}
