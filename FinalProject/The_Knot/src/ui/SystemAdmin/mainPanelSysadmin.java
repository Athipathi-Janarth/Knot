/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

/**
 *
 * @author athipathi
 */
public class mainPanelSysadmin extends javax.swing.JPanel {

    /**
     * Creates new form mainPanelSysadmin
     */
    networkPanel network = new networkPanel();
    enterprisePanel enterprise = new enterprisePanel();
    manageAdminPanel manageAdmin=new manageAdminPanel();
    public mainPanelSysadmin() {
        initComponents();
        splitPane.setRightComponent(network);
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
        btnNetwork = new javax.swing.JButton();
        btnEnterprise = new javax.swing.JButton();
        btnAdmins = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1210, 630));
        setPreferredSize(new java.awt.Dimension(1210, 630));
        setSize(new java.awt.Dimension(1210, 630));

        sysAdminProfileImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sysAdminProfileImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminGirl.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome SysAdmin!");

        btnNetwork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        btnNetwork.setText("       Manage Network");
        btnNetwork.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetworkActionPerformed(evt);
            }
        });

        btnEnterprise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manageIcon.png"))); // NOI18N
        btnEnterprise.setText("       Manage Enterprises");
        btnEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseActionPerformed(evt);
            }
        });

        btnAdmins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admins.png"))); // NOI18N
        btnAdmins.setText("       Manage Admins");
        btnAdmins.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminsActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(sysAdminMenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sysAdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEnterprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        sysAdminMenuPanelLayout.setVerticalGroup(
            sysAdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sysAdminMenuPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(sysAdminProfileImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNetwork)
                .addGap(27, 27, 27)
                .addComponent(btnEnterprise)
                .addGap(27, 27, 27)
                .addComponent(btnAdmins)
                .addContainerGap(229, Short.MAX_VALUE))
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

    private void btnNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetworkActionPerformed
        // TODO add your handling code here:
        
        splitPane.setRightComponent(network);
        
    }//GEN-LAST:event_btnNetworkActionPerformed

    private void btnEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(enterprise);
    }//GEN-LAST:event_btnEnterpriseActionPerformed

    private void btnAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminsActionPerformed
        // TODO add your handling code here:
        splitPane.setRightComponent(manageAdmin);
    }//GEN-LAST:event_btnAdminsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmins;
    private javax.swing.JButton btnEnterprise;
    private javax.swing.JButton btnNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel sysAdminMenuPanel;
    private javax.swing.JLabel sysAdminProfileImg;
    // End of variables declaration//GEN-END:variables
}
