package charteredaccountant;

import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
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
        jLabel7 = new javax.swing.JLabel();
        landlineTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        basicSalaryTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        grossSalaryTextField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        validateNameLabel = new javax.swing.JLabel();
        validateMobileRequiredLabel = new javax.swing.JLabel();
        validateMobileCorrectLabel = new javax.swing.JLabel();
        validateLandlineLabel = new javax.swing.JLabel();
        validateEmailRequiredLabel = new javax.swing.JLabel();
        validateEmailCorrectLabel = new javax.swing.JLabel();
        validateAddressLabel = new javax.swing.JLabel();
        validateBasicSalaryLabel = new javax.swing.JLabel();
        validateGrossSalaryLabel = new javax.swing.JLabel();
        validatePanRequiredLabel = new javax.swing.JLabel();
        validatePanCorrectLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        adharTextField = new javax.swing.JTextField();
        validationRequiredLabel = new javax.swing.JLabel();
        validationCorrectLabel = new javax.swing.JLabel();
        serviceTaxLabel = new javax.swing.JLabel();
        esicjLabel = new javax.swing.JLabel();
        providentFundLabel = new javax.swing.JLabel();

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

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Landline");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Email ID");

        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Address");

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        jScrollPane1.setViewportView(addressTextArea);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("PAN");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Service Tax");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Provident Fund");

        panTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panTextFieldFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("ESIC");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setText("Basic Salalry");

        basicSalaryTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                basicSalaryTextFieldFocusLost(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("Gross Salary");

        grossSalaryTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                grossSalaryTextFieldFocusLost(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        submitButton.setText("Submit");
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

        validateLandlineLabel.setEnabled(false);

        validateEmailRequiredLabel.setEnabled(false);

        validateEmailCorrectLabel.setEnabled(false);

        validateAddressLabel.setEnabled(false);

        validateBasicSalaryLabel.setEnabled(false);

        validateGrossSalaryLabel.setEnabled(false);

        validatePanRequiredLabel.setEnabled(false);

        validatePanCorrectLabel.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Adhar");

        adharTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                adharTextFieldFocusLost(evt);
            }
        });

        serviceTaxLabel.setEnabled(false);

        esicjLabel.setEnabled(false);

        providentFundLabel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(initailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(validateNameLabel)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel1)))
                        .addContainerGap(582, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel19)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(providentFundLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(basicSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(validateBasicSalaryLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(validateGrossSalaryLabel)
                                    .addComponent(grossSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(serviceTaxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(esicjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(panTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(jLabel4))
                                        .addComponent(validatePanRequiredLabel)
                                        .addComponent(validatePanCorrectLabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(backButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(submitButton)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(adharTextField)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(validationCorrectLabel)
                                                    .addComponent(validationRequiredLabel))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(clearButton)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9))
                                            .addComponent(validateEmailRequiredLabel)
                                            .addComponent(validateEmailCorrectLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(validateAddressLabel)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(220, 220, 220)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(validateLandlineLabel)
                                            .addComponent(landlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(validateMobileRequiredLabel)
                                    .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(validateMobileCorrectLabel))))))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateNameLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(landlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validateLandlineLabel)
                    .addComponent(validateMobileRequiredLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateMobileCorrectLabel)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateAddressLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grossSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(basicSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateEmailRequiredLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateEmailCorrectLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validateBasicSalaryLabel)
                    .addComponent(validateGrossSalaryLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel14)
                        .addComponent(esicjLabel)
                        .addComponent(providentFundLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(serviceTaxLabel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(adharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validatePanRequiredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validatePanCorrectLabel)
                    .addComponent(validationRequiredLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validationCorrectLabel)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(submitButton)
                    .addComponent(clearButton))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearText(){
            nameTextField.setText("");
            mobileNumberTextField.setText("");
            landlineTextField.setText("");
            emailTextField.setText("");
            addressTextArea.setText("");
            basicSalaryTextField.setText("");
            grossSalaryTextField.setText("");
            serviceTaxLabel.setText("");
            esicjLabel.setText("");
            providentFundLabel.setText("");
            panTextField.setText("");
            adharTextField.setText("");
    }
    
    private void basicSalaryTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_basicSalaryTextFieldFocusLost
        double basic_salary = Double.parseDouble(basicSalaryTextField.getText().toString());
        if(basic_salary < 10000){
            esicjLabel.setText("1.75");
            double pf_amt = basic_salary * 1.75;
            providentFundLabel.setText(String.valueOf(pf_amt));
        }else if(basic_salary > 21000){
            esicjLabel.setText("4.75");
            double pf_amt = basic_salary * 4.75;
            providentFundLabel.setText(String.valueOf(pf_amt));
        }
    }//GEN-LAST:event_basicSalaryTextFieldFocusLost

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

    private void panTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panTextFieldFocusLost
        String pan = panTextField.getText().toString();
        Pattern p = Pattern.compile(consts.GSTIN_REGEX);
        Matcher m = p.matcher(pan);
        if(pan.isEmpty()){
            validatePanRequiredLabel.setVisible(true);
            validatePanRequiredLabel.setText("Please enter the pan");
            validatePanRequiredLabel.setForeground(Color.red);
        }
        if(m.matches()){
            
        }else{
            validatePanCorrectLabel.setVisible(true);
            validatePanCorrectLabel.setText("Please enter correct pan number");
            validatePanCorrectLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_panTextFieldFocusLost

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String initial = initailComboBox.getSelectedItem().toString();
        String fullName = nameTextField.getText().toString();
        double mobile_number = Double.parseDouble(mobileNumberTextField.getText().toString());
        double landline_number = Double.parseDouble(landlineTextField.getText().toString());
        String email = emailTextField.getText().toString();
        String address = addressTextArea.getText().toString();
        double basic_salary = Double.parseDouble(basicSalaryTextField.getText().toString());
        double gross_salary = Double.parseDouble(grossSalaryTextField.getText().toString());
        float service_tax = Float.parseFloat(serviceTaxLabel.getText().toString());
        float esic = Float.parseFloat(esicjLabel.getText().toString());
        double provident_fund = Double.parseDouble(providentFundLabel.getText().toString());
        String pan = panTextField.getText().toString();
        String aadhar = adharTextField.getText().toString();
        
        if(fullName.isEmpty()){
            validateNameLabel.setEnabled(true);
            validateNameLabel.setText("Please enter the name");
            validateNameLabel.setForeground(Color.red);
        }
        
        if(landlineTextField.getText().isEmpty()){
            validateLandlineLabel.setEnabled(true);
            validateLandlineLabel.setText("Please enter the landline");
            validateLandlineLabel.setForeground(Color.red);
        }
        
        if(addressTextArea.getText().isEmpty()){
            validateAddressLabel.setEnabled(true);
            validateAddressLabel.setText("Please enter the address");
            validateAddressLabel.setForeground(Color.red);
        }
        
        if(basicSalaryTextField.getText().isEmpty()){
            validateBasicSalaryLabel.setEnabled(true);
            validateBasicSalaryLabel.setText("Please enter the basic salary");
            validateBasicSalaryLabel.setForeground(Color.red);
        }
        
        if(grossSalaryTextField.getText().isEmpty()){
            grossSalaryTextField.setEnabled(true);
            grossSalaryTextField.setText("Please enter the gorss salary");
            grossSalaryTextField.setForeground(Color.red);
        }
        
        ConnectionSQL sql;
        Connection con = null;
        Statement stmt = null;
        try {
            sql = new ConnectionSQL();
            con=sql.conn;
            String query = "Insert into registration values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 0);
            pst.setString(2, initial);
            pst.setString(3, fullName);
            pst.setDouble(4, mobile_number);
            pst.setDouble(5, landline_number);
            pst.setString(6, email);
            pst.setString(7, address);
            pst.setDouble(8, basic_salary);
            pst.setDouble(9, gross_salary);
            pst.setFloat(10, service_tax);
            pst.setFloat(11, esic);
            pst.setDouble(12, provident_fund);
            pst.setString(13, pan);
            pst.setString(14, aadhar);
            int rs = pst.executeUpdate();
            System.out.println("Result set" +rs);
            clearText();

            JOptionPane.showMessageDialog(this, "Data is successfully entered");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error : " +ex);
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void grossSalaryTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grossSalaryTextFieldFocusLost
        double gross_salary = Double.parseDouble(grossSalaryTextField.getText().toString());
        int service_tax_percent;
        double service_tax;
        if(gross_salary < 250000){
            serviceTaxLabel.setEnabled(true);
            serviceTaxLabel.setText(String.valueOf("0"));
        }else if(gross_salary >= 250001 && gross_salary <= 500000){
            serviceTaxLabel.setEnabled(true);
            service_tax_percent = 5;
            double before_cess = (service_tax_percent * gross_salary) / 100;
            double after_cess = (3 * before_cess) / 100;
            service_tax = before_cess + after_cess;
            serviceTaxLabel.setText(String.valueOf(service_tax));
        }else if(gross_salary >= 500001 && gross_salary <= 1000000){
            serviceTaxLabel.setEnabled(true);
            service_tax_percent = 20;
            double before_cess = (service_tax_percent * gross_salary) / 100;
            double after_cess = (3 * before_cess) / 100;
            service_tax = before_cess + after_cess;
            serviceTaxLabel.setText(String.valueOf(service_tax));
        }else if(gross_salary >= 1000001){
            serviceTaxLabel.setEnabled(true);
            service_tax_percent = 30;
            double before_cess = (service_tax_percent * gross_salary) / 100;
            double after_cess = (3 * before_cess) / 100;
            service_tax = before_cess + after_cess;
            serviceTaxLabel.setText(String.valueOf(service_tax));
        }
    }//GEN-LAST:event_grossSalaryTextFieldFocusLost

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        OptionsPanel op = new OptionsPanel();
        op.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearText();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void adharTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_adharTextFieldFocusLost
        String adhar = adharTextField.getText().toString();
        Pattern p = Pattern.compile(consts.AADHAR_REGEX);
        Matcher m = p.matcher(adhar);
        if(adhar.isEmpty()){
            validationRequiredLabel.setVisible(true);
            validationRequiredLabel.setText("Please enter the adhar");
            validationRequiredLabel.setForeground(Color.red);
        }
        if(m.matches()){
            //Do nothing
        }else{
            validationCorrectLabel.setVisible(true);
            validationCorrectLabel.setText("Please enter correct aadhar number");
            validationCorrectLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_adharTextFieldFocusLost

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
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JTextField adharTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField basicSalaryTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel esicjLabel;
    private javax.swing.JTextField grossSalaryTextField;
    private javax.swing.JComboBox<String> initailComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField landlineTextField;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField panTextField;
    private javax.swing.JLabel providentFundLabel;
    private javax.swing.JLabel serviceTaxLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel validateAddressLabel;
    private javax.swing.JLabel validateBasicSalaryLabel;
    private javax.swing.JLabel validateEmailCorrectLabel;
    private javax.swing.JLabel validateEmailRequiredLabel;
    private javax.swing.JLabel validateGrossSalaryLabel;
    private javax.swing.JLabel validateLandlineLabel;
    private javax.swing.JLabel validateMobileCorrectLabel;
    private javax.swing.JLabel validateMobileRequiredLabel;
    private javax.swing.JLabel validateNameLabel;
    private javax.swing.JLabel validatePanCorrectLabel;
    private javax.swing.JLabel validatePanRequiredLabel;
    private javax.swing.JLabel validationCorrectLabel;
    private javax.swing.JLabel validationRequiredLabel;
    // End of variables declaration//GEN-END:variables
}
