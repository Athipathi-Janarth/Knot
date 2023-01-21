/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.User;

import Business.EcoSystem;
import User.CoupleUser;
import ui.SystemAdmin.*;

/**
 *
 * @author athipathi
 */
public class mainPanelUser extends javax.swing.JPanel {

    /**
     * Creates new form mainPanelSysadmin
     */
    planWeddingPanel planPanel;
    requestsPanel requestPanel;
    estimationsPanel estimationPanel;
    EcoSystem system;
    CoupleUser user;
    public mainPanelUser(CoupleUser user, EcoSystem system) {
        initComponents();
        this.system = system;
        this.user = user;
        jLabel1.setText("Welcome "+user.getName());
        jLabel3.setText(user.getPartnerName());
        planPanel = new planWeddingPanel(system, user);
        splitPane.setRightComponent(planPanel);
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
        sysAdminMenuPanel = new javax.swing.JPanel();
        sysAdminProfileImg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPlanWedding = new javax.swing.JButton();
        btnRequests = new javax.swing.JButton();
        btnEstimations = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1210, 630));
        setPreferredSize(new java.awt.Dimension(1210, 630));
        setSize(new java.awt.Dimension(1210, 630));

        sysAdminProfileImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sysAdminProfileImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/couple-image.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome ");

        btnPlanWedding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/schedules.png"))); // NOI18N
        btnPlanWedding.setText("    Plan Your Wedding");
        btnPlanWedding.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPlanWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanWeddingActionPerformed(evt);
            }
        });

        btnRequests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request.png"))); // NOI18N
        btnRequests.setText("      Your Requests");
        btnRequests.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestsActionPerformed(evt);
            }
        });

        btnEstimations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request.png"))); // NOI18N
        btnEstimations.setText("       Your Estimation");
        btnEstimations.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstimations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstimationsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("&");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout sysAdminMenuPanelLayout = new javax.swing.GroupLayout(sysAdminMenuPanel);
        sysAdminMenuPanel.setLayout(sysAdminMenuPanelLayout);
        sysAdminMenuPanelLayout.setHorizontalGroup(
            sysAdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysAdminMenuPanelLayout.createSequentialGroup()
                .addGroup(sysAdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sysAdminMenuPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(sysAdminProfileImg))
                    .addGroup(sysAdminMenuPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(sysAdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(sysAdminMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sysAdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRequests, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlanWedding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEstimations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sysAdminMenuPanelLayout.setVerticalGroup(
            sysAdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysAdminMenuPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(sysAdminProfileImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlanWedding)
                .addGap(27, 27, 27)
                .addComponent(btnRequests)
                .addGap(27, 27, 27)
                .addComponent(btnEstimations)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(sysAdminMenuPanel);

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

    private void btnPlanWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanWeddingActionPerformed
        // TODO add your handling code here:
        
        splitPane.setRightComponent(planPanel);
        
    }//GEN-LAST:event_btnPlanWeddingActionPerformed

    private void btnRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestsActionPerformed
        // TODO add your handling code here:
        requestPanel = new requestsPanel(system, user);
        splitPane.setRightComponent(requestPanel);
    }//GEN-LAST:event_btnRequestsActionPerformed

    private void btnEstimationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstimationsActionPerformed
        // TODO add your handling code here:
        estimationPanel = new estimationsPanel(system, user);
        splitPane.setRightComponent(estimationPanel);
    }//GEN-LAST:event_btnEstimationsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstimations;
    private javax.swing.JButton btnPlanWedding;
    private javax.swing.JButton btnRequests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel sysAdminMenuPanel;
    private javax.swing.JLabel sysAdminProfileImg;
    // End of variables declaration//GEN-END:variables
}
