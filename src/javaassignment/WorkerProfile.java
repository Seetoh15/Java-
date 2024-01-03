/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaassignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yipzh
 */
public class WorkerProfile extends javax.swing.JFrame {

    int staffID;
    DefaultTableModel model;
    Staff obj1 = new Staff();
    Admin obj2 = new Admin();
    ArrayList<String[]> detailsList = new ArrayList<>();
    /**
     * Creates new form WorkerProfile
     */
    public WorkerProfile() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        displayWorkerDetails();
    }
    
    private void displayWorkerDetails(){
        model.setRowCount(0);
        obj2.readFile();
        detailsList = obj2.getDetailsList();
        for (String[] details : detailsList){
            if (details.length == 7){
                if (!details[6].equals("Admin")){
                    model.insertRow(model.getRowCount(), new Object[]{details[0],details[1],details[2],details[3],details[4],details[5],details[6]});
                }
            }
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

        bgGender = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtUsername = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JPasswordField();
        cmbPosition = new javax.swing.JComboBox<>();
        btnSaveChanges = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        btnClearForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Username", "Password", "Full Name", "Gender", "Phone Number", "Position"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(2).setMinWidth(0);
            table.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        bgGender.add(rbMale);
        rbMale.setText("Male");

        bgGender.add(rbFemale);
        rbFemale.setText("Female");

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None--", "Officer", "Admin", "Salesperson" }));

        btnSaveChanges.setText("Edit Row");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        btnCreateAccount.setText("+ Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnClearForm.setText("Clear Form");
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearForm)
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnCreateAccount)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaveChanges)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteAccount)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClearForm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveChanges)
                    .addComponent(btnCreateAccount)
                    .addComponent(btnDeleteAccount))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminHome a = new AdminHome();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        staffID = Integer.parseInt(model.getValueAt(table.getSelectedRow(), 0).toString());
        String tbUsername = model.getValueAt(table.getSelectedRow(), 1).toString();
        String tbPassword = model.getValueAt(table.getSelectedRow(), 2).toString();
        String tbFullName = model.getValueAt(table.getSelectedRow(), 3).toString();
        String tbGender = model.getValueAt(table.getSelectedRow(), 4).toString();
        String tbPhoneNumber = model.getValueAt(table.getSelectedRow(), 5).toString();
        String tbPosition = model.getValueAt(table.getSelectedRow(), 6).toString();
        
        txtUsername.setText(tbUsername);
        txtPassword.setText(tbPassword);
        txtFullName.setText(tbFullName);
        txtPhoneNumber.setText(tbPhoneNumber);
        if (tbGender.equals("Male")){
            rbMale.setSelected(true);
        } else if (tbGender.equals("Female")){
            rbFemale.setSelected(true);
        }
        if (tbPosition.equals("Officer")){
            cmbPosition.setSelectedIndex(1);
        } else if (tbPosition.equals("Salesperson")){
            cmbPosition.setSelectedIndex(3);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRowCount() < 1){
            JOptionPane.showMessageDialog(null, "No row selected.","Error",JOptionPane.ERROR_MESSAGE);
        } else if (table.getSelectedRowCount() > 1){
            JOptionPane.showMessageDialog(null, "More than one row selected.","Error",JOptionPane.ERROR_MESSAGE);
        } else {
            String username, password, name, gender, phoneNumber, position;
            username = txtUsername.getText();
            password = String.valueOf(txtPassword.getPassword());
            name = txtFullName.getText();
            if (rbMale.isSelected()){
                gender = "Male";
            } else if (rbFemale.isSelected()){
                gender = "Female";
            } else {
                gender = "";
            }
            phoneNumber = txtPhoneNumber.getText();
            position = String.valueOf(cmbPosition.getSelectedItem());
            String[] details = {String.valueOf(staffID), username, password, name, gender, phoneNumber, position};
            
            obj2.setStaffID(staffID);
            obj2.getVerifiedUserDetails();
            int count = 0;
            for (var detail : details){
                obj2.changeDetails(detail, count);
                count ++;
            }
            try {
                obj2.overwriteFile("staffDetails.txt", obj2.getDetailsList(), 7);
            } catch (IOException ex) {
                Logger.getLogger(WorkerProfile.class.getName()).log(Level.SEVERE, null, ex);
            }

            displayWorkerDetails();
            //table.setValueAt(username, table.getSelectedRow(), 1);
            //table.setValueAt(password, table.getSelectedRow(), 2);
            //table.setValueAt(name, table.getSelectedRow(), 3);
            //table.setValueAt(gender, table.getSelectedRow(), 4);
            //table.setValueAt(phoneNumber, table.getSelectedRow(), 5);
            //table.setValueAt(position, table.getSelectedRow(), 6);
            
            JOptionPane.showMessageDialog(null,"Details edited successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        String username, password, name, gender, phoneNumber, position;
        username = txtUsername.getText();
        password = String.valueOf(txtPassword.getPassword());
        name = txtFullName.getText();
        if (rbMale.isSelected()){
            gender = "Male";
        } else if (rbFemale.isSelected()){
            gender = "Female";
        } else {
            gender = "";
        }
        phoneNumber = txtPhoneNumber.getText();
        position = String.valueOf(cmbPosition.getSelectedItem());
        try {
            obj2.getNewStaffID();
            obj2.createAccount(username, password, name, gender, phoneNumber, position);
        } catch (IOException ex) {
            Logger.getLogger(WorkerProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayWorkerDetails();
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        // TODO add your handling code here:
        txtUsername.setText("");
        txtPassword.setText("");
        txtFullName.setText("");
        bgGender.clearSelection();
        txtPhoneNumber.setText("");
        cmbPosition.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearFormActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        // TODO add your handling code here:
        obj2.setStaffID(staffID);
        try {
            obj2.deleteAccount();
        } catch (IOException ex) {
            Logger.getLogger(WorkerProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayWorkerDetails();
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

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
            java.util.logging.Logger.getLogger(WorkerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGender;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearForm;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
