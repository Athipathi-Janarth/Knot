/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.User;

import Business.EcoSystem;
import Model.MenuItem.BakeryMenuItem;
import Model.MenuItem.CateringMenuItem;
import Model.MenuItem.DecorMenuItem;
import Model.MenuItem.StylistMenuItem;
import Model.MenuItem.VenueMenuItem;
import Models.Order.Order;
import Models.Order.VenueOrder;
import Models.Organization.Bakery;
import Models.Organization.Catering;
import Models.Organization.Decor;
import Models.Organization.Stylist;
import Models.Organization.Venue;
import Network.Network;
import User.CoupleUser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author athipathi
 */
public class planWeddingPanel extends javax.swing.JPanel {

    /**
     * Creates new form networkPanel
     */
     EcoSystem system;
    CoupleUser user;
    public planWeddingPanel(EcoSystem system,CoupleUser user) {
        initComponents();
        this.system= system;
        this.user = user;
        adminPanelCard.setBackground(new Color(0,0,0,90));
        displayAlltables(system);
    }
    
    public void displayAlltables(EcoSystem system){
        venueTable.getColumn("Image").setCellRenderer(new CellRenderer());
        //decorTable.getColumn("Image").setCellRenderer(new CellRenderer());
        //stylistTable.getColumn("Image").setCellRenderer(new CellRenderer());
        //cakeTable.getColumn("Image").setCellRenderer(new CellRenderer());
        displayVenueTable(system);
        displayCateringTable(system);
        displayDecorTable(system);
        displayCakeTable(system);
        displayStylistTable(system);
    }
     public ImageIcon ResizeImageTable(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    public void displayVenueTable(EcoSystem system){
        DefaultTableModel model = (DefaultTableModel) venueTable.getModel();
         model.setRowCount(0);
        for(int i=0; i < system.getNetworkList().size();i++){
            Network network = system.getNetworkList().get(i);
            for(int j=0; j < network.getVenueDirectory().getVenueDirectory().size();j++){
                Venue venue = network.getVenueDirectory().getVenueDirectory().get(j);
                for(int k=0; k < venue.getMenu().getVenueMenu().size(); k++){
                    VenueMenuItem menuItem = venue.getMenu().getVenueMenu().get(k);
                    javax.swing.JLabel photo2;
                    photo2=new JLabel();
                    photo2.setIcon(ResizeImageTable(menuItem.getPhoto()));
                    model.addRow(new Object[]{
                      photo2,
                      menuItem.getItemName(),
                      menuItem.getType(),
                      menuItem.getCapacity(),
                      menuItem.getPrice(),
                      menuItem,
                      venue
                    });
                }
            }
        }
    }
    
    public void displayCakeTable(EcoSystem system){
        DefaultTableModel model = (DefaultTableModel) cakeTable.getModel();
        model.setRowCount(0);
        for(int i=0;i<system.getNetworkList().size();i++){
            Network network = system.getNetworkList().get(i);
            for (int j=0;  j <  network.getBakeryDirectory().getBakeries().size(); j++) {
                Bakery bakery = network.getBakeryDirectory().getBakeries().get(j);
                for (int k=0; k < bakery.getMenu().getBakeryMenu().size();k++) {
                    BakeryMenuItem menuItem = bakery.getMenu().getBakeryMenu().get(k);
                    javax.swing.JLabel photo2;
                    photo2=new JLabel();
                    photo2.setIcon(ResizeImageTable(menuItem.getPhoto()));
                    model.addRow(new Object[]{
                        photo2,
                        menuItem.getItemName(),
                        menuItem.getFlavour(),
                        menuItem.getServes(),
                        menuItem.getPrice(),
                        menuItem,
                        bakery
                    });
                }
            }
        }
    }
    
    public void displayDecorTable(EcoSystem system){
        DefaultTableModel model = (DefaultTableModel) decorTable.getModel();
        model.setRowCount(0);
        for(int i=0;i<system.getNetworkList().size();i++){
            Network network = system.getNetworkList().get(i);
            for(int j=0; j < network.getDecorDirectory().getDecorDirectory().size();j++){
                Decor decor = network.getDecorDirectory().getDecorDirectory().get(j);
                for(int k=0; k < decor.getMenu().getDecorMenu().size(); k++){
                        DecorMenuItem menuItem = decor.getMenu().getDecorMenu().get(k);
                        javax.swing.JLabel photo2;
                        photo2=new JLabel();
                        photo2.setIcon(ResizeImageTable(menuItem.getPhoto()));
                        model.addRow(new Object[]{
                          photo2,
                          menuItem.getItemName(),
                          menuItem.getEventtype(),
                          menuItem.getTheme(),
                          menuItem.getPrice(),
                          menuItem,
                          decor
                        });
                }
            }
        }
    }
    public void displayCateringTable(EcoSystem system){
        DefaultTableModel model = (DefaultTableModel) cateringTable.getModel();
        model.setRowCount(0);
        for(int i=0;i<system.getNetworkList().size();i++){
            Network network = system.getNetworkList().get(i);
            for(int j=0 ; j < network.getCateringDirectory().getCateringList().size(); j++){
                Catering catering = network.getCateringDirectory().getCateringList().get(j);
                for(int k=0; k < catering.getMenu().getCateringMenu().size(); k++){
                        CateringMenuItem menuItem = catering.getMenu().getCateringMenu().get(k);
                        model.addRow(new Object[]{
                          menuItem.getItemName(),
                          menuItem.getPrice(),
                          menuItem,
                          catering
                        });
                }
            }
        }
    }
    
    public void displayStylistTable(EcoSystem system){
        DefaultTableModel model = (DefaultTableModel) stylistTable.getModel();
         model.setRowCount(0);
        for(int i=0; i < system.getNetworkList().size();i++){
            Network network = system.getNetworkList().get(i);
            for(int j=0; j < network.getVenueDirectory().getVenueDirectory().size();j++){
                Stylist stylist = network.getStylistDirectory().getStylistDirectory().get(j);
                for(int k=0; k < stylist.getMenu().getStylistMenu().size(); k++){
                    StylistMenuItem menuItem = stylist.getMenu().getStylistMenu().get(k);
                    javax.swing.JLabel photo2;
                    photo2=new JLabel();
                    photo2.setIcon(ResizeImageTable(menuItem.getPhoto()));
                    model.addRow(new Object[]{
                      photo2,
                      menuItem.getEventType(),
                      menuItem.getItemName(),
                      menuItem.getTheme(),
                      menuItem.getPrice(),
                      menuItem,
                      stylist
                    });
                }
            }
        }
    }
    
    class CellRenderer implements TableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {

            TableColumn tb = venueTable.getColumn("Image");
            tb.setMaxWidth(60);
            tb.setMinWidth(60);

            venueTable.setRowHeight(60);
            return (Component) value;          
        }

    }
//    class CellRenderer implements TableCellRenderer {
//
//        @Override
//        public Component getTableCellRendererComponent(JTable table,
//                Object value,
//                boolean isSelected,
//                boolean hasFocus,
//                int row,
//                int column) {
//
//            
//            TableColumn tb = decorTable.getColumn("Image");
//            tb.setMaxWidth(60);
//            tb.setMinWidth(60);
//
//            decorTable.setRowHeight(60);
//            
////             TableColumn tb2 = cakeTable.getColumn("Image");
////            tb2.setMaxWidth(60);
////            tb2.setMinWidth(60);
////
////            cakeTable.setRowHeight(60);
////            
////            TableColumn tb3 = stylistTable.getColumn("Image");
////            tb3.setMaxWidth(60);
////            tb3.setMinWidth(60);
////
////            stylistTable.setRowHeight(60);
//            return (Component) value;          
//        }
//
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanelCard = new javax.swing.JPanel();
        userTabs = new javax.swing.JTabbedPane();
        venuePanel = new javax.swing.JPanel();
        tabCard = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        venueTable = new javax.swing.JTable();
        btnBookVenue = new javax.swing.JButton();
        tabBg = new javax.swing.JLabel();
        decoartionPanel = new javax.swing.JPanel();
        tabCard1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        decorTable = new javax.swing.JTable();
        btnBookVenue1 = new javax.swing.JButton();
        tabBg1 = new javax.swing.JLabel();
        cateringPanel = new javax.swing.JPanel();
        tabCard2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        cateringTable = new javax.swing.JTable();
        btnBookVenue2 = new javax.swing.JButton();
        tabBg2 = new javax.swing.JLabel();
        cakePanel = new javax.swing.JPanel();
        tabCard3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cakeTable = new javax.swing.JTable();
        orderCake = new javax.swing.JButton();
        tabBg3 = new javax.swing.JLabel();
        groomingPanel = new javax.swing.JPanel();
        tabCard4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        stylistTable = new javax.swing.JTable();
        btnBookVenue4 = new javax.swing.JButton();
        tabBg4 = new javax.swing.JLabel();
        designerPanel = new javax.swing.JPanel();
        tabCard5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        venueTable5 = new javax.swing.JTable();
        btnBookVenue5 = new javax.swing.JButton();
        tabBg5 = new javax.swing.JLabel();
        adminBackgroundImg = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(977, 630));
        setSize(new java.awt.Dimension(1090, 630));
        setLayout(null);

        adminPanelCard.setFocusable(false);
        adminPanelCard.setOpaque(false);

        userTabs.setFocusTraversalKeysEnabled(false);
        userTabs.setFocusable(false);
        userTabs.setRequestFocusEnabled(false);
        userTabs.setVerifyInputWhenFocusTarget(false);

        venuePanel.setOpaque(false);
        venuePanel.setLayout(null);

        venueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Image", "Venue Name", "Event Type", "Capacity", "Price", "menuItem", "venueObject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(venueTable);
        if (venueTable.getColumnModel().getColumnCount() > 0) {
            venueTable.getColumnModel().getColumn(5).setMinWidth(0);
            venueTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            venueTable.getColumnModel().getColumn(5).setMaxWidth(0);
            venueTable.getColumnModel().getColumn(6).setMinWidth(0);
            venueTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            venueTable.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        btnBookVenue.setText("Book Venue");
        btnBookVenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookVenueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCardLayout = new javax.swing.GroupLayout(tabCard);
        tabCard.setLayout(tabCardLayout);
        tabCardLayout.setHorizontalGroup(
            tabCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCardLayout.createSequentialGroup()
                .addGroup(tabCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCardLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCardLayout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnBookVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        tabCardLayout.setVerticalGroup(
            tabCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCardLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182)
                .addComponent(btnBookVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        venuePanel.add(tabCard);
        tabCard.setBounds(0, 0, 870, 520);
        tabCard.setBackground(new Color(0,0,0,90));

        tabBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/venue.jpeg"))); // NOI18N
        tabBg.setMinimumSize(new java.awt.Dimension(870, 520));
        venuePanel.add(tabBg);
        tabBg.setBounds(0, 0, 870, 520);

        userTabs.addTab("Venue", venuePanel);

        decoartionPanel.setOpaque(false);
        decoartionPanel.setLayout(null);

        decorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Name", "Event Type", "Theme", "Price", "menuItem", "decorObject"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(decorTable);
        if (decorTable.getColumnModel().getColumnCount() > 0) {
            decorTable.getColumnModel().getColumn(5).setMinWidth(0);
            decorTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            decorTable.getColumnModel().getColumn(5).setMaxWidth(0);
            decorTable.getColumnModel().getColumn(6).setMinWidth(0);
            decorTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            decorTable.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        btnBookVenue1.setText("Book Venue");

        javax.swing.GroupLayout tabCard1Layout = new javax.swing.GroupLayout(tabCard1);
        tabCard1.setLayout(tabCard1Layout);
        tabCard1Layout.setHorizontalGroup(
            tabCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard1Layout.createSequentialGroup()
                .addGroup(tabCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCard1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCard1Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnBookVenue1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        tabCard1Layout.setVerticalGroup(
            tabCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156)
                .addComponent(btnBookVenue1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        decoartionPanel.add(tabCard1);
        tabCard1.setBounds(0, 0, 870, 520);
        tabCard1.setBackground(new Color(0,0,0,90));

        tabBg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eventdecor.jpg"))); // NOI18N
        tabBg1.setMinimumSize(new java.awt.Dimension(870, 520));
        decoartionPanel.add(tabBg1);
        tabBg1.setBounds(0, 0, 870, 520);

        userTabs.addTab("Decoration", decoartionPanel);

        cateringPanel.setOpaque(false);
        cateringPanel.setLayout(null);

        cateringTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "cuisine", "price", "cateringObject", "menuItem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(cateringTable);
        if (cateringTable.getColumnModel().getColumnCount() > 0) {
            cateringTable.getColumnModel().getColumn(2).setMinWidth(0);
            cateringTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            cateringTable.getColumnModel().getColumn(2).setMaxWidth(0);
            cateringTable.getColumnModel().getColumn(3).setMinWidth(0);
            cateringTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            cateringTable.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        btnBookVenue2.setText("Book Venue");

        javax.swing.GroupLayout tabCard2Layout = new javax.swing.GroupLayout(tabCard2);
        tabCard2.setLayout(tabCard2Layout);
        tabCard2Layout.setHorizontalGroup(
            tabCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard2Layout.createSequentialGroup()
                .addGroup(tabCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCard2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCard2Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnBookVenue2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        tabCard2Layout.setVerticalGroup(
            tabCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addComponent(btnBookVenue2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        cateringPanel.add(tabCard2);
        tabCard2.setBounds(0, 0, 870, 520);
        tabCard2.setBackground(new Color(0,0,0,90));

        tabBg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/foodAdminBg.png"))); // NOI18N
        tabBg2.setMinimumSize(new java.awt.Dimension(870, 520));
        cateringPanel.add(tabBg2);
        tabBg2.setBounds(0, 0, 870, 520);

        userTabs.addTab("Catering", cateringPanel);

        cakePanel.setOpaque(false);
        cakePanel.setLayout(null);

        cakeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Image", "Name", "Flavour", "Price", "Serves", "BakeryObject", "menuItem"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(cakeTable);
        if (cakeTable.getColumnModel().getColumnCount() > 0) {
            cakeTable.getColumnModel().getColumn(5).setMinWidth(0);
            cakeTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            cakeTable.getColumnModel().getColumn(5).setMaxWidth(0);
            cakeTable.getColumnModel().getColumn(6).setMinWidth(0);
            cakeTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            cakeTable.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        orderCake.setText("Order Cake");
        orderCake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderCakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabCard3Layout = new javax.swing.GroupLayout(tabCard3);
        tabCard3.setLayout(tabCard3Layout);
        tabCard3Layout.setHorizontalGroup(
            tabCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard3Layout.createSequentialGroup()
                .addGroup(tabCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCard3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCard3Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(orderCake, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        tabCard3Layout.setVerticalGroup(
            tabCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(orderCake, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        cakePanel.add(tabCard3);
        tabCard3.setBounds(0, 0, 870, 520);
        tabCard3.setBackground(new Color(0,0,0,90));

        tabBg3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/weddingcake.jpeg"))); // NOI18N
        tabBg3.setMinimumSize(new java.awt.Dimension(870, 520));
        cakePanel.add(tabBg3);
        tabBg3.setBounds(0, 0, 870, 520);

        userTabs.addTab("Wedding Cakes", cakePanel);

        groomingPanel.setOpaque(false);
        groomingPanel.setLayout(null);

        stylistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Image", "Event Type", "Package", "Theme", "Price", "menuItem", "stylistObj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(stylistTable);
        if (stylistTable.getColumnModel().getColumnCount() > 0) {
            stylistTable.getColumnModel().getColumn(5).setMinWidth(0);
            stylistTable.getColumnModel().getColumn(5).setPreferredWidth(0);
            stylistTable.getColumnModel().getColumn(5).setMaxWidth(0);
            stylistTable.getColumnModel().getColumn(6).setMinWidth(0);
            stylistTable.getColumnModel().getColumn(6).setPreferredWidth(0);
            stylistTable.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        btnBookVenue4.setText("Book Venue");

        javax.swing.GroupLayout tabCard4Layout = new javax.swing.GroupLayout(tabCard4);
        tabCard4.setLayout(tabCard4Layout);
        tabCard4Layout.setHorizontalGroup(
            tabCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard4Layout.createSequentialGroup()
                .addGroup(tabCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCard4Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCard4Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnBookVenue4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        tabCard4Layout.setVerticalGroup(
            tabCard4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(btnBookVenue4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        groomingPanel.add(tabCard4);
        tabCard4.setBounds(0, 0, 870, 520);
        tabCard4.setBackground(new Color(0,0,0,90));

        tabBg4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desingerBg.jpeg"))); // NOI18N
        tabBg4.setMinimumSize(new java.awt.Dimension(870, 520));
        groomingPanel.add(tabBg4);
        tabBg4.setBounds(0, 0, 870, 520);

        userTabs.addTab("Stylist", groomingPanel);

        designerPanel.setLayout(null);

        venueTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Image", "Venue Name", "Event Type", "Location", "Capacity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(venueTable5);

        btnBookVenue5.setText("Book Venue");

        javax.swing.GroupLayout tabCard5Layout = new javax.swing.GroupLayout(tabCard5);
        tabCard5.setLayout(tabCard5Layout);
        tabCard5Layout.setHorizontalGroup(
            tabCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard5Layout.createSequentialGroup()
                .addGroup(tabCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCard5Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCard5Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnBookVenue5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        tabCard5Layout.setVerticalGroup(
            tabCard5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCard5Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145)
                .addComponent(btnBookVenue5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        designerPanel.add(tabCard5);
        tabCard5.setBounds(0, 0, 870, 520);
        tabCard5.setBackground(new Color(0,0,0,90));

        tabBg5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/desingerBg.jpeg"))); // NOI18N
        tabBg5.setMinimumSize(new java.awt.Dimension(870, 520));
        designerPanel.add(tabBg5);
        tabBg5.setBounds(0, 0, 870, 520);

        userTabs.addTab("Designer", designerPanel);

        javax.swing.GroupLayout adminPanelCardLayout = new javax.swing.GroupLayout(adminPanelCard);
        adminPanelCard.setLayout(adminPanelCardLayout);
        adminPanelCardLayout.setHorizontalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(userTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        adminPanelCardLayout.setVerticalGroup(
            adminPanelCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelCardLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(userTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        userTabs.setBackground(new Color(0,0,0,0));

        add(adminPanelCard);
        adminPanelCard.setBounds(0, 0, 1090, 630);

        adminBackgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wedding-Background_Image.jpeg"))); // NOI18N
        adminBackgroundImg.setPreferredSize(new java.awt.Dimension(977, 630));
        add(adminBackgroundImg);
        adminBackgroundImg.setBounds(0, 0, 1090, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookVenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookVenueActionPerformed
        int selectedRowIndex = venueTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) venueTable.getModel();
        Venue organization = (Venue) model.getValueAt(selectedRowIndex, 6);
        VenueMenuItem venuMenuItem = (VenueMenuItem) model.getValueAt(selectedRowIndex, 4);
        Order order = new Order(new Date(), Order.OrderStatus.PENDING,  user.getUserName(), organization.getId(), organization.getName(), venuMenuItem.getPrice(),venuMenuItem.getItemName() );
        System.out.println(venuMenuItem.getItemName());
        VenueOrder venueOrder = new VenueOrder(new Date(), Order.OrderStatus.PENDING,  user.getUserName(), organization.getId(), organization.getName(), venuMenuItem.getPrice(),venuMenuItem.getItemName());
        System.out.println(system.getMasterOrderList());
        order = system.getMasterOrderList().addOrder(order);
        venueOrder.setOrderId(order.getOrderId());
        venueOrder.setWeddingDate(user.getWeddingDate());
        organization.getOrders().addVenueOrder(venueOrder);
    }//GEN-LAST:event_btnBookVenueActionPerformed

    private void orderCakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderCakeActionPerformed
//        int selectedRowIndex = cakeTable.getSelectedRow();
//        DefaultTableModel model = (DefaultTableModel) cakeTable.getModel();
//        
//        Bakery organization = (Bakery) model.getValueAt(selectedRowIndex, 5);
//        VenueMenuItem venuMenuItem = (VenueMenuItem) model.getValueAt(selectedRowIndex, 4);
//        Order order = new Order(new Date(), Order.OrderStatus.PENDING,  user.getUserName(), organization.getId(), organization.getName(), venuMenuItem.getPrice());
//        VenueOrder venueOrder = new VenueOrder(new Date(), Order.OrderStatus.PENDING,  user.getUserName(), organization.getId(), organization.getName(), venuMenuItem.getPrice());
//        System.out.println(system.getMasterOrderList());
//        order = system.getMasterOrderList().addOrder(order);
//        venueOrder.setOrderId(order.getOrderId());
//        venueOrder.setWeddingDate(user.getWeddingDate());
//        organization.getOrders().addVenueOrder(venueOrder);
    }//GEN-LAST:event_orderCakeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminBackgroundImg;
    private javax.swing.JPanel adminPanelCard;
    private javax.swing.JButton btnBookVenue;
    private javax.swing.JButton btnBookVenue1;
    private javax.swing.JButton btnBookVenue2;
    private javax.swing.JButton btnBookVenue4;
    private javax.swing.JButton btnBookVenue5;
    private javax.swing.JPanel cakePanel;
    private javax.swing.JTable cakeTable;
    private javax.swing.JPanel cateringPanel;
    private javax.swing.JTable cateringTable;
    private javax.swing.JPanel decoartionPanel;
    private javax.swing.JTable decorTable;
    private javax.swing.JPanel designerPanel;
    private javax.swing.JPanel groomingPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton orderCake;
    private javax.swing.JTable stylistTable;
    private javax.swing.JLabel tabBg;
    private javax.swing.JLabel tabBg1;
    private javax.swing.JLabel tabBg2;
    private javax.swing.JLabel tabBg3;
    private javax.swing.JLabel tabBg4;
    private javax.swing.JLabel tabBg5;
    private javax.swing.JPanel tabCard;
    private javax.swing.JPanel tabCard1;
    private javax.swing.JPanel tabCard2;
    private javax.swing.JPanel tabCard3;
    private javax.swing.JPanel tabCard4;
    private javax.swing.JPanel tabCard5;
    private javax.swing.JTabbedPane userTabs;
    private javax.swing.JPanel venuePanel;
    private javax.swing.JTable venueTable;
    private javax.swing.JTable venueTable5;
    // End of variables declaration//GEN-END:variables
}
