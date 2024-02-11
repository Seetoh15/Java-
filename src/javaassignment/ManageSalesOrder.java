/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yipzh
 */
public class ManageSalesOrder extends javax.swing.JFrame {

    DefaultTableModel model;
    Salesperson obj1 = new Salesperson();
    DataValidation obj2 = new DataValidation();
    ArrayList<String[]> arrayList = new ArrayList<>(), furnitureList = new ArrayList<>(), filteredList = new ArrayList<>(), searchResult = new ArrayList<>();
    int orderID;
    String price;
    /**
     * Creates new form ManageSalesOrder
     */
    public ManageSalesOrder() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        displayOrders();
        setCmbFurnitureOptions();
        txtQuantity.setText("0");
    }
    
    private void displayOrders(){
        model.setRowCount(0);
        obj1.readFurnitureFile();
        obj1.readSalesOrderFile();
        arrayList = obj1.generateSalesOrderTableDetails();
        for (String[] array : arrayList){
            if (array.length == 10){
                model.insertRow(model.getRowCount(), new Object[]{array[0],array[1],array[3],array[4],array[5],array[6],array[7],array[9]});
            }
        }
    }
    
    private void searchOrFilterOrder(ArrayList<String[]> al){
        model.setRowCount(0);
        for (String[] array : al){
            if (array.length == 10){
                model.insertRow(model.getRowCount(), new Object[]{array[0],array[1],array[3],array[4],array[5],array[6],array[7],array[9]});
            }
        }
    }
    
    private void setCmbFurnitureOptions(){
        furnitureList = obj1.getFurnitureList();
        cmbFurniture.addItem("None");
        for (String[] furniture : furnitureList){
            cmbFurniture.addItem(furniture[1]);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearchBar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        txtClient = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        cmbFurniture = new javax.swing.JComboBox<>();
        btnClearForm = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();
        cmbFilter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Date Created", "Furniture", "Quantity", "Price", "Total Amount", "Client Name", "Status"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        cmbFurniture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFurnitureActionPerformed(evt);
            }
        });

        btnClearForm.setText("Clear Form");
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        cmbFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Created by me" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Manage Sales Order");

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Quantity:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Furniture:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Billed to:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnClearForm)
                                        .addGap(45, 45, 45))
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnFilter)
                    .addComponent(cmbFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFurniture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearForm)
                    .addComponent(jLabel4))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModify)
                    .addComponent(btnRemove))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        orderID = Integer.parseInt(model.getValueAt(table.getSelectedRow(), 0).toString());
        String furniture = model.getValueAt(table.getSelectedRow(), 2).toString();
        String quantity = model.getValueAt(table.getSelectedRow(), 3).toString();
        price = model.getValueAt(table.getSelectedRow(), 4).toString();
        String client = model.getValueAt(table.getSelectedRow(), 6).toString();
        
        int index = 0;
        for (String[] list : furnitureList){
            if (furniture.equals(list[1])){
                index = furnitureList.indexOf(list); //furniture array list products start from 0
                break;
            }
        }
        cmbFurniture.setSelectedIndex(index + 1); //0 is none so start from 1
        txtQuantity.setText(quantity);
        txtClient.setText(client);
    }//GEN-LAST:event_tableMouseClicked

    private void cmbFurnitureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFurnitureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFurnitureActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRowCount() < 1){
            JOptionPane.showMessageDialog(null, "No row selected.","Error",JOptionPane.ERROR_MESSAGE);
        } else if (table.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "More than one row selected.","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            int n = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this account?", "Delete Account", JOptionPane.YES_NO_OPTION);
            if (n==JOptionPane.YES_OPTION){
                obj1.setOrderID(orderID);
                try {
                    obj1.deleteOrder();
                } catch (IOException ex) {
                    Logger.getLogger(WorkerProfile.class.getName()).log(Level.SEVERE, null, ex);
                }
                displayOrders();
                JOptionPane.showMessageDialog(null,"Order deleted.","Success",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRowCount() < 1){
            JOptionPane.showMessageDialog(null, "No row selected.","Error",JOptionPane.ERROR_MESSAGE);
        } else if (table.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "More than one row selected.","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            String quantity, client, furniture;
            int furnitureID;
            furnitureID = cmbFurniture.getSelectedIndex();
            furniture = cmbFurniture.getSelectedItem().toString();
            quantity = txtQuantity.getText();
            client = txtClient.getText();
            String status = model.getValueAt(table.getSelectedRow(), 7).toString();
            
            if (status.equals("pending") || status.equals("Pending")){
                if (!furniture.equals("None") && !client.isBlank()){
                    if(obj2.containsOnlyNumbers(quantity)){
                        if (Integer.parseInt(quantity) > 0){
                            obj1.setOrderID(orderID);
                            obj1.modifyOrder(furnitureID, quantity, client, price);
                            try {
                                obj1.overwriteFile("salesOrder.txt",obj1.getOrderList(),8);
                            } catch (IOException ex) {
                                Logger.getLogger(ManageSalesOrder.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            displayOrders();
                            JOptionPane.showMessageDialog(null, "Order modified successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Quantity must be larger than 0.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Quantity field should only consist of digits(0-9).","Error",JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Fields cannot be left empty.","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "You are only allowed to modify orders with status 'pending'.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        // TODO add your handling code here:
        cmbFurniture.setSelectedIndex(0);
        txtQuantity.setText("0");
        txtClient.setText("");
    }//GEN-LAST:event_btnClearFormActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearchBar.getText().toLowerCase();
        if (keyword.equals("")){
            displayOrders();
        } else {
            searchResult.clear();
            for (String[] array : arrayList){
                if (array[0].equals(keyword) || array[3].toLowerCase().contains(keyword) || array[7].toLowerCase().contains(keyword)){
                    searchResult.add(array);
                }
            }
            searchOrFilterOrder(searchResult);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        String creator = cmbFilter.getSelectedItem().toString();
        if (creator.equals("All")){
            displayOrders();
        } else { //created by me
            try {
                obj1.getStaffID();
            } catch (IOException ex) {
                Logger.getLogger(ManageSalesOrder.class.getName()).log(Level.SEVERE, null, ex);
            }
            int staffID = obj1.returnStaffID();
            filteredList.clear();
            for (String[] array : arrayList){
                if (staffID == Integer.parseInt(array[8])){
                    filteredList.add(array);
                }
            }
            searchOrFilterOrder(filteredList);
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        SalespersonHome a = new SalespersonHome();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSalesOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSalesOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbFilter;
    private javax.swing.JComboBox<String> cmbFurniture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtClient;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearchBar;
    // End of variables declaration//GEN-END:variables

}
