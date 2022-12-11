/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.FinanceAdmin;


import Business.EcoSystem;
import Employee.Employee;
import Payment.Payment;
import Payment.PaymentDirectory;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author vikashsingh
 */
public class paymentPanel extends javax.swing.JPanel {
//    [7:40 PM, 12/5/2022] Athi Dsem: mainPanelSysAdmin-> mainPanelFoodAdmin
//[7:41 PM, 12/5/2022] Athi Dsem: enterprisePanel->organisation Panel
//[7:41 PM, 12/5/2022] Athi Dsem: manageAdminPanel->manageBusinessUserPanel
//[7:42 PM, 12/5/2022] Athi Dsem: manage Networkpanel-> dsplay Employees
    /**
     * Creates new form networkPanel
     */
    EcoSystem system;
    public paymentPanel(EcoSystem system,Employee employee) {
        initComponents();
        this.system=system;
        adminPanelCard.setBackground(new Color(0,0,0,90));
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) paymentTable.getModel();
        model.setRowCount(0);
        for(int i=0;i< system.getPaymentList().getPaymentList().size();i++){
            Payment menuItem = system.getPaymentList().getPaymentList().get(i); 
            javax.swing.JLabel photo2;            
            model.addRow(new Object[]{
             menuItem.getPaymentId(),
              menuItem.getUsername(),
              menuItem.getOrgname(),
              menuItem.getPaymentDate(),
              menuItem.getAmount(),
              menuItem.getStatus().getValue()
            });
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
        paymentTable = new javax.swing.JTable();
        adminBackgroundImg = new javax.swing.JLabel();

        setSize(new java.awt.Dimension(977, 630));
        setLayout(null);

        paymentTable.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Payment ID", "User ", "Organization", "Payment Date", "Amount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(paymentTable);

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable paymentTable;
    // End of variables declaration//GEN-END:variables
}