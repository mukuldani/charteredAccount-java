package charteredaccountant;

import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Registration extends javax.swing.JFrame {

    public ArrayList<CustomerData> arrayCustd = new ArrayList<CustomerData>();
    public Registration() {
        initComponents();
        this.setBounds(300, 140, 714, 480);
    }
    Constants consts = new Constants();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        initailComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mobileNumberTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        residentialAddressTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        validateNameLabel = new javax.swing.JLabel();
        validateMobileRequiredLabel = new javax.swing.JLabel();
        validateMobileCorrectLabel = new javax.swing.JLabel();
        validateEmailRequiredLabel = new javax.swing.JLabel();
        validateEmailCorrectLabel = new javax.swing.JLabel();
        validateResidenceAddressLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        officeAddressTextArea = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        validationOfficeAddress = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        residenceTypejComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        employeeTypejComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Initial");

        initailComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Mrs", "M/S" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Mobile Number");

        mobileNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileNumberTextFieldFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Email ID");

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Residential Address");

        residentialAddressTextArea.setColumns(20);
        residentialAddressTextArea.setRows(5);
        jScrollPane1.setViewportView(residentialAddressTextArea);

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        submitButton.setText("Next");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        validateNameLabel.setEnabled(false);

        validateMobileRequiredLabel.setEnabled(false);

        validateMobileCorrectLabel.setEnabled(false);

        validateEmailRequiredLabel.setEnabled(false);

        validateEmailCorrectLabel.setEnabled(false);

        validateResidenceAddressLabel.setEnabled(false);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        officeAddressTextArea.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        officeAddressTextArea.setText("Office Address");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        validationOfficeAddress.setToolTipText("");
        validationOfficeAddress.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Residence Type");

        residenceTypejComboBox.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        residenceTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "City", "Town", "Village" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Employee Type");

        employeeTypejComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Private", "Government" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(initailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validateNameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(officeAddressTextArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validationOfficeAddress)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(validateResidenceAddressLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(validateMobileRequiredLabel)
                                .addComponent(validateMobileCorrectLabel)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(residenceTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(validateEmailRequiredLabel)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(validateEmailCorrectLabel)
                                .addComponent(employeeTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2)))
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(backButton)
                .addGap(59, 59, 59)
                .addComponent(submitButton)
                .addGap(72, 72, 72)
                .addComponent(clearButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(initailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateNameLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateMobileRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validateMobileCorrectLabel)
                            .addComponent(validateEmailRequiredLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateEmailCorrectLabel)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(residenceTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(employeeTypejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(23, 23, 23)))
                .addComponent(validateResidenceAddressLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(officeAddressTextArea)))
                .addGap(17, 17, 17)
                .addComponent(validationOfficeAddress)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(submitButton)
                    .addComponent(clearButton))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearText(){
            nameTextField.setText("");
            mobileNumberTextField.setText("");
            emailTextField.setText("");
            residentialAddressTextArea.setText("");
            validationOfficeAddress.setText("");
    }
    
    //Validation on Mobile Mumber
    private void mobileNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileNumberTextFieldFocusLost
        String mob_number = mobileNumberTextField.getText().toString();
        Pattern p = Pattern.compile(consts.MOBILE_REGEX);
        Matcher m = p.matcher(mob_number);
        if(mob_number.isEmpty()){
            validateMobileRequiredLabel.setVisible(true);
            validateMobileRequiredLabel.setText("Please enter the mobile number");
            validateMobileRequiredLabel.setForeground(Color.red);
        }
        if(m.find() && m.group().equals(mob_number)){
            
        }else{
            validateMobileCorrectLabel.setVisible(true);
            validateMobileCorrectLabel.setText("Please enter the correct mobile number");
            validateMobileCorrectLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_mobileNumberTextFieldFocusLost

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        String email = emailTextField.getText().toString();
        Pattern p = Pattern.compile(consts.EMAIL_REGEX);
        Matcher m = p.matcher(email);
        if(email.isEmpty()){
            validateEmailRequiredLabel.setVisible(true);
            validateEmailRequiredLabel.setText("Please enter the email");
            validateEmailRequiredLabel.setForeground(Color.red);
        }
        if(m.matches()){
           
        }else{
            validateEmailCorrectLabel.setVisible(true);
            validateEmailCorrectLabel.setText("Please enter correct email id");
            validateEmailCorrectLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String initial = initailComboBox.getSelectedItem().toString();
        String fullName = nameTextField.getText().toString();
        String gender = genderComboBox.getSelectedItem().toString();
        String mobile_number = mobileNumberTextField.getText().toString();
        String email = emailTextField.getText().toString();
        String residentialAddress = residentialAddressTextArea.getText().toString();
        String officeAddress = officeAddressTextArea.getText().toString();
        String residenceType = residenceTypejComboBox.getSelectedItem().toString();
        String employeeType = employeeTypejComboBox.getSelectedItem().toString();
        
        if(fullName.isEmpty()){
            validateNameLabel.setEnabled(true);
            validateNameLabel.setText("Please enter the name");
            validateNameLabel.setForeground(Color.red);
        }
        
        
        if(residentialAddressTextArea.getText().isEmpty()){
            validateResidenceAddressLabel.setEnabled(true);
            validateResidenceAddressLabel.setText("Please enter the residential address");
            validateResidenceAddressLabel.setForeground(Color.red);
        }
        
        
        if(officeAddressTextArea.getText().isEmpty()){
            validationOfficeAddress.setEnabled(true);
            validationOfficeAddress.setText("Please enter the office address");
            validationOfficeAddress.setForeground(Color.red);
        }  
      
        if(!fullName.isEmpty() && !email.isEmpty() && !residentialAddress.isEmpty() && !officeAddress.isEmpty()){
            CustomerData custd = new CustomerData();
            custd.setInitial(initial);
            custd.setName(fullName);
            custd.setGender(gender);
            custd.setMobileNumber(mobile_number);
            custd.setEmail(email);
            custd.setResidentialAddress(residentialAddress);
            custd.setOfficeAddress(officeAddress);
            custd.setResidenceType(residenceType);
            custd.setEmployeeType(employeeType);
            arrayCustd.add(custd);
            TaxRegis tax = new TaxRegis(arrayCustd);
            tax.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        OptionsPanel op = new OptionsPanel();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearText();
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> employeeTypejComboBox;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JComboBox<String> initailComboBox;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel officeAddressTextArea;
    private javax.swing.JComboBox<String> residenceTypejComboBox;
    private javax.swing.JTextArea residentialAddressTextArea;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel validateEmailCorrectLabel;
    private javax.swing.JLabel validateEmailRequiredLabel;
    private javax.swing.JLabel validateMobileCorrectLabel;
    private javax.swing.JLabel validateMobileRequiredLabel;
    private javax.swing.JLabel validateNameLabel;
    private javax.swing.JLabel validateResidenceAddressLabel;
    private javax.swing.JLabel validationOfficeAddress;
    // End of variables declaration//GEN-END:variables
}
