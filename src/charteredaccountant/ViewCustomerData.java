package charteredaccountant;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewCustomerData extends javax.swing.JFrame {

    private int regis_id;
    public ViewCustomerData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        fullNamejLabel = new javax.swing.JLabel();
        fullNamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        searchjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genderjComboBox = new javax.swing.JComboBox<>();
        initialjComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        mobileNumberjTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        residenceTypejComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        employeeTypejComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        residenceAddressjTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        officeAddressjTextArea = new javax.swing.JTextArea();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Customer Details");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        fullNamejLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        fullNamejLabel.setText("Full Name");

        fullNamejTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("User Details");

        updatejButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        deletejButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        deletejButton.setText("Delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        searchjButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Initial");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Gender");

        genderjComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        genderjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        initialjComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        initialjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Mrs", "Ms" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Mobile Number");

        mobileNumberjTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Email");

        emailjTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Residence Type");

        residenceTypejComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        residenceTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "City", "Town", "Village" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Employee Type");

        employeeTypejComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        employeeTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Government", "Private" }));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Residential Address");

        residenceAddressjTextArea.setColumns(20);
        residenceAddressjTextArea.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        residenceAddressjTextArea.setRows(5);
        jScrollPane1.setViewportView(residenceAddressjTextArea);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Office Address");
        jLabel10.setToolTipText("");

        officeAddressjTextArea.setColumns(20);
        officeAddressjTextArea.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        officeAddressjTextArea.setRows(5);
        jScrollPane2.setViewportView(officeAddressjTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNamejLabel)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(updatejButton)
                        .addGap(46, 46, 46)
                        .addComponent(deletejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fullNamejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(mobileNumberjTextField)
                                    .addComponent(emailjTextField))
                                .addGap(45, 45, 45))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(initialjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(residenceTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(employeeTypejComboBox, 0, 74, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullNamejLabel)
                    .addComponent(fullNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchjButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(genderjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initialjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mobileNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(residenceTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(employeeTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backButton)
                            .addComponent(updatejButton)
                            .addComponent(deletejButton))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearScreen(){
        fullNamejTextField.setText(""); 
        mobileNumberjTextField.setText("");
        emailjTextField.setText("");
        residenceAddressjTextArea.setText("");
        officeAddressjTextArea.setText("");
    }
    
    private void getCustomerDetails(){
        ConnectionSQL sql;
        Connection con = null;
        Statement stmt = null;
        try {
            sql = new ConnectionSQL();
            con=sql.conn;
            String fullName = fullNamejTextField.getText().toString();
            String query = "Select * from registration where fullName = '"+fullName+"'";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                regis_id = rs.getInt(1);
                String initial = rs.getString(2);
                String name = initial+ ""+ rs.getString(3);
                String gender = rs.getString(4);
                String mobile_number = rs.getString(5);
                String email = rs.getString(6);
                String residence_type = rs.getString(7);
                String employee_type = rs.getString(8);
                String residence_address = rs.getString(9);
                String office_address = rs.getString(10);
                
                initialjComboBox.setSelectedItem(initial);
                genderjComboBox.setSelectedItem(gender);
                mobileNumberjTextField.setText(mobile_number);
                emailjTextField.setText(email);
                residenceTypejComboBox.setSelectedItem(residence_type);
                employeeTypejComboBox.setSelectedItem(employee_type);
                residenceAddressjTextArea.setText(residence_address);
                officeAddressjTextArea.setText(office_address);
            }    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error : " +ex);
            Logger.getLogger(ViewCustomerData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        OptionsPanel op = new OptionsPanel();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        getCustomerDetails();
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        String initial = initialjComboBox.getSelectedItem().toString();
        String fullName = fullNamejTextField.getText().toString(); 
        String gender = genderjComboBox.getSelectedItem().toString();
        String mobile_number = mobileNumberjTextField.getText().toString();
        String email = emailjTextField.getText().toString();
        String residence_type = residenceTypejComboBox.getSelectedItem().toString();
        String employee_type = employeeTypejComboBox.getSelectedItem().toString();
        String residence_address = residenceAddressjTextArea.getText().toString();
        String office_address = officeAddressjTextArea.getText().toString();
        
        Connection con = null;
        Statement stmt = null;
        ConnectionSQL sql;
        
        try {
            sql = new ConnectionSQL();
            con=sql.conn;
            String update_cust_details = "Update registration set initial =?, fullName = ?, gender = ?, "
                    + "mobile_number = ?, email = ?, residential_type = ?, employee_type = ?, "
                    + "residential_address = ?, office_address = ? where regis_id = ?";
            PreparedStatement pst = con.prepareStatement(update_cust_details);
            pst.setString(1, initial);
            pst.setString(2, fullName);
            pst.setString(3, gender);
            pst.setString(4, mobile_number);
            pst.setString(5, email);
            pst.setString(6, residence_type);
            pst.setString(7, employee_type);
            pst.setString(8, residence_address);
            pst.setString(9, office_address);
            pst.setInt(10, regis_id);
            int row = pst.executeUpdate();
            if(row > 0){
                JOptionPane.showMessageDialog(this, "Customer Details Updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                clearScreen();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error : " +ex);
            Logger.getLogger(ViewCustomerData.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        Connection con = null;
        Statement stmt = null;
        ConnectionSQL sql;
        try {
            sql = new ConnectionSQL();
            con=sql.conn;
            String delete_tax_details = "Delete from cust_tax_details where regis_id = ?";
            PreparedStatement pst = con.prepareStatement(delete_tax_details);
            pst.setInt(1, regis_id);
            int row = pst.executeUpdate();
            if(row > 0){
                String delete_cust = "Delete from registration where regis_id = ?";
                PreparedStatement pst1 = con.prepareStatement(delete_cust);
                pst1.setInt(1, regis_id);
                int row1 = pst1.executeUpdate(); 
                if(row1 > 0){
                    JOptionPane.showMessageDialog(this, "Customer Details Deleted", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearScreen();
                }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error : " +ex);
            Logger.getLogger(ViewCustomerData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deletejButtonActionPerformed


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
            java.util.logging.Logger.getLogger(ViewCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCustomerData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCustomerData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JComboBox<String> employeeTypejComboBox;
    private javax.swing.JLabel fullNamejLabel;
    private javax.swing.JTextField fullNamejTextField;
    private javax.swing.JComboBox<String> genderjComboBox;
    private javax.swing.JComboBox<String> initialjComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mobileNumberjTextField;
    private javax.swing.JTextArea officeAddressjTextArea;
    private javax.swing.JTextArea residenceAddressjTextArea;
    private javax.swing.JComboBox<String> residenceTypejComboBox;
    private javax.swing.JButton searchjButton;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}