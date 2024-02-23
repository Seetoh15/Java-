/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yipzh
 */
public class GenerateApprovedSalesReport extends javax.swing.JFrame {

    DefaultTableModel model;
    ApprovedSalesReport obj1 = new ApprovedSalesReport();
    Staff obj2 = new Staff();
    ArrayList<String[]> reportDetails, filteredReportDetails;
    /**
     * Creates new form GenerateApprovedSalesReport
     */
    public GenerateApprovedSalesReport() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        displayReport();
        calculateTotalAmount();
    }
    
    private void displayReport(){
        model.setRowCount(0);
        obj1.readFurnitureFile();
        obj1.readApprovedSOFile();
        obj1.countOverallQuantity();
        reportDetails = obj1.generateReportDetails();
        for (String[] details : reportDetails){
            int amount = Integer.parseInt(details[2]) * Integer.parseInt(details[3]);
            if (details.length == 4){
                model.insertRow(model.getRowCount(), new Object[]{details[0],details[1],details[2],details[3],amount});
            }
        }
    }
    
    private void calculateTotalAmount(){
        int total = 0;
        // Get the index of the last column
        int lastColumnIndex = model.getColumnCount() - 1;

        // Retrieve all the values in the last column
        for (int row = 0; row < model.getRowCount(); row++) {
            String value = model.getValueAt(row, lastColumnIndex).toString();
            total = total + Integer.parseInt(value);
        }
        txtTotal.setText(String.valueOf(total));
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
        jLabel1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        btnFilter = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Furniture", "Price (RM)", "Quantity", "Amount (RM)"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Total Sales:");

        txtTotal.setEditable(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cmbMonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2022", "2023", "2024" }));
        cmbYear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnFilter.setText("Filter");
        btnFilter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        btnViewAll.setText("View All");
        btnViewAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnBack.setText("Return to menu");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Approved Sales Report");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78)
                                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFilter)
                    .addComponent(btnViewAll))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
        String month = String.valueOf(cmbMonth.getSelectedItem());
        String year = String.valueOf(cmbYear.getSelectedItem());
        if (!month.equals("Month") && !year.equals("Year")){
            obj1.filterReportByMonthAndYear(Integer.parseInt(month), Integer.parseInt(year));
            obj1.countQuantity();
            filteredReportDetails = obj1.generateFilteredReportDetails();
            model.setRowCount(0);
            for (String[] details : filteredReportDetails){
                int amount = Integer.parseInt(details[2]) * Integer.parseInt(details[3]);
                if (details.length == 4){
                    model.insertRow(model.getRowCount(), new Object[]{details[0],details[1],details[2],details[3],amount});
                }
            }
            calculateTotalAmount();
        } else if (month.equals("Month") && !year.equals("Year")){
            obj1.filterReportByYear(Integer.parseInt(year));
            obj1.countQuantity();
            filteredReportDetails = obj1.generateFilteredReportDetails();
            model.setRowCount(0);
            for (String[] details : filteredReportDetails){
                int amount = Integer.parseInt(details[2]) * Integer.parseInt(details[3]);
                if (details.length == 4){
                    model.insertRow(model.getRowCount(), new Object[]{details[0],details[1],details[2],details[3],amount});
                }
            }
            calculateTotalAmount();
        } else {
            JOptionPane.showMessageDialog(null, "Select year to proceed.","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnFilterActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        // TODO add your handling code here:
        model.setRowCount(0);
        for (String[] details : reportDetails){
            int amount = Integer.parseInt(details[2]) * Integer.parseInt(details[3]);
            if (details.length == 4){
                model.insertRow(model.getRowCount(), new Object[]{details[0],details[1],details[2],details[3],amount});
            }
        }
        calculateTotalAmount();
        cmbMonth.setSelectedIndex(0);
        cmbYear.setSelectedIndex(0);
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        obj2.readFile();
        String userType = obj2.getLastSessionUserType();
        if (userType.equals("Admin")){
            AdminHome a = new AdminHome();
            a.setVisible(true);
            this.setVisible(false);
        } else if (userType.equals("Officer")){
            OfficerHome a = new OfficerHome();
            a.setVisible(true);
            this.setVisible(false);
        }
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
            java.util.logging.Logger.getLogger(GenerateApprovedSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerateApprovedSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerateApprovedSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerateApprovedSalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerateApprovedSalesReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
