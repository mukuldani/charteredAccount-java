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
        jLabel4 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ownerComboBox = new javax.swing.JComboBox<>();
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
        serviceTaxTextField = new javax.swing.JTextField();
        jLAbel = new javax.swing.JLabel();
        esicTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        providentFundTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        vatTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        panTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        gstinTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cinTextField = new javax.swing.JTextField();
        ptComboBox = new javax.swing.JComboBox<>();
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
        validateVatRequiedLabel = new javax.swing.JLabel();
        validateVatCorrectLabel = new javax.swing.JLabel();
        validateGstinCorrectLabel = new javax.swing.JLabel();
        validatePanRequiredLabel = new javax.swing.JLabel();
        validatePanCorrectLabel = new javax.swing.JLabel();
        validateCinRequiedLabel = new javax.swing.JLabel();
        validateCinCorrectLabel = new javax.swing.JLabel();
        validationGstinRequiredLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Registration");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Initial");

        initailComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Mrs", "M/S" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Status");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proprioty ", "Partnership", "Company ", "Trust" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Owner");

        ownerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual ", "Company" }));

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

        jLAbel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLAbel.setText("VAT IN");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Service Tax");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("GSTIN");

        vatTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                vatTextFieldFocusLost(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Provident Fund");

        panTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                panTextFieldFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setText("ESIC");

        gstinTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                gstinTextFieldFocusLost(evt);
            }
        });
        gstinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstinTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("PT EC/ RC");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setText("Company CIN");

        cinTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cinTextFieldFocusLost(evt);
            }
        });

        ptComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PT EC", "PT RC" }));

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

        submitButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        clearButton.setText("Clear");

        validateNameLabel.setEnabled(false);

        validateMobileRequiredLabel.setEnabled(false);

        validateMobileCorrectLabel.setEnabled(false);

        validateLandlineLabel.setEnabled(false);

        validateEmailRequiredLabel.setEnabled(false);

        validateEmailCorrectLabel.setEnabled(false);

        validateAddressLabel.setEnabled(false);

        validateBasicSalaryLabel.setEnabled(false);

        validateGrossSalaryLabel.setEnabled(false);

        validateVatRequiedLabel.setEnabled(false);

        validateVatCorrectLabel.setEnabled(false);

        validateGstinCorrectLabel.setEnabled(false);

        validatePanRequiredLabel.setEnabled(false);

        validatePanCorrectLabel.setEnabled(false);

        validateCinRequiedLabel.setEnabled(false);

        validateCinCorrectLabel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(initailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ownerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(validateNameLabel)
                                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(validateMobileRequiredLabel)
                                            .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(validateMobileCorrectLabel))
                                        .addGap(36, 36, 36)))
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(validateLandlineLabel)
                                            .addComponent(landlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel1)))
                        .addContainerGap(349, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel19)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel12)
                                .addComponent(jLAbel)
                                .addComponent(jLabel16)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel10)))
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
                                    .addComponent(serviceTaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel15)
                                    .addGap(18, 18, 18)
                                    .addComponent(esicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(providentFundTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(vatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(55, 55, 55)
                                            .addComponent(jLabel13))
                                        .addComponent(validateVatRequiedLabel)
                                        .addComponent(validateVatCorrectLabel)
                                        .addComponent(validatePanRequiredLabel)
                                        .addComponent(validatePanCorrectLabel)
                                        .addComponent(ptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(panTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel17)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gstinTextField)
                                        .addComponent(cinTextField)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(validateGstinCorrectLabel)
                                                .addComponent(validationGstinRequiredLabel)
                                                .addComponent(validateCinRequiedLabel)
                                                .addComponent(validateCinCorrectLabel))
                                            .addGap(0, 0, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(backButton)
                        .addGap(58, 58, 58)
                        .addComponent(submitButton)
                        .addGap(73, 73, 73)
                        .addComponent(clearButton)))
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
                    .addComponent(jLabel4)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(initailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(validateNameLabel)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(ownerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(landlineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validateMobileRequiredLabel)
                    .addComponent(validateLandlineLabel))
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
                        .addComponent(serviceTaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(esicTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(providentFundTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAbel)
                    .addComponent(jLabel13)
                    .addComponent(gstinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validateVatRequiedLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(validateVatCorrectLabel)
                            .addComponent(validationGstinRequiredLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validateGstinCorrectLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(panTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(cinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validatePanRequiredLabel)
                    .addComponent(validateCinRequiedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validatePanCorrectLabel)
                    .addComponent(validateCinCorrectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ptComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(submitButton)
                    .addComponent(clearButton))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gstinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstinTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gstinTextFieldActionPerformed

    private void basicSalaryTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_basicSalaryTextFieldFocusLost
        double basic_salary = Double.parseDouble(basicSalaryTextField.getText().toString());
        if(basic_salary < 10000){
            esicTextField.setText("1.75");
            double pf_amt = basic_salary * 1.75;
            providentFundTextField.setText(String.valueOf(pf_amt));
        }else if(basic_salary > 21000){
            esicTextField.setText("4.75");
            double pf_amt = basic_salary * 4.75;
            providentFundTextField.setText(String.valueOf(pf_amt));
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
            validateMobileCorrectLabel.setVisible(true);
            validateMobileCorrectLabel.setText("Thank you!!");
            validateMobileCorrectLabel.setForeground(Color.green);
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
            validateEmailCorrectLabel.setVisible(true);
            validateEmailCorrectLabel.setText("Thank You!!");
            validateEmailCorrectLabel.setForeground(Color.green);
        }else{
            validateEmailCorrectLabel.setVisible(true);
            validateEmailCorrectLabel.setText("Please enter correct mobile number");
            validateEmailCorrectLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void gstinTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gstinTextFieldFocusLost
        String gstin = gstinTextField.getText().toString();
        Pattern p = Pattern.compile(consts.GSTIN_REGEX);
        Matcher m = p.matcher(gstin);
        if(gstin.isEmpty()){
            validationGstinRequiredLabel.setVisible(true);
            validationGstinRequiredLabel.setText("Please enter the email");
            validationGstinRequiredLabel.setForeground(Color.red);
        }
        if(m.matches()){
            validateGstinCorrectLabel.setVisible(true);
            validateGstinCorrectLabel.setText("Thank You!!");
            validateGstinCorrectLabel.setForeground(Color.green);
        }else{
            validateGstinCorrectLabel.setVisible(true);
            validateGstinCorrectLabel.setText("Please enter correct mobile number");
            validateGstinCorrectLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_gstinTextFieldFocusLost

    private void panTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_panTextFieldFocusLost
        String pan = panTextField.getText().toString();
        Pattern p = Pattern.compile(consts.GSTIN_REGEX);
        Matcher m = p.matcher(pan);
        if(pan.isEmpty()){
            validatePanRequiredLabel.setVisible(true);
            validatePanRequiredLabel.setText("Please enter the email");
            validatePanRequiredLabel.setForeground(Color.red);
        }
        if(m.matches()){
            validatePanCorrectLabel.setVisible(true);
            validatePanCorrectLabel.setText("Thank You!!");
            validatePanCorrectLabel.setForeground(Color.green);
        }else{
            validatePanCorrectLabel.setVisible(true);
            validatePanCorrectLabel.setText("Please enter correct pan number");
            validatePanCorrectLabel.setForeground(Color.red);
        }
    }//GEN-LAST:event_panTextFieldFocusLost

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String initial = initailComboBox.getSelectedItem().toString();
        String fullName = nameTextField.getText().toString();
        String status = statusComboBox.getSelectedItem().toString();
        String owner = ownerComboBox.getSelectedItem().toString();
        double mobile_number = Double.parseDouble(mobileNumberTextField.getText().toString());
        double landline_number = Double.parseDouble(landlineTextField.getText().toString());
        String email = emailTextField.getText().toString();
        String address = addressTextArea.getText().toString();
        double basic_salary = Double.parseDouble(basicSalaryTextField.getText().toString());
        double gross_salary = Double.parseDouble(grossSalaryTextField.getText().toString());
        float service_tax = Float.parseFloat(serviceTaxTextField.getText().toString());
        float esic = Float.parseFloat(esicTextField.getText().toString());
        double provident_fund = Double.parseDouble(providentFundTextField.getText().toString());
        String vat = vatTextField.getText().toString();
        String gstin = gstinTextField.getText().toString();
        String pan = panTextField.getText().toString();
        String cin = cinTextField.getText().toString();
        String pt = ptComboBox.getSelectedItem().toString();
        
        if(fullName.isEmpty()){
            validateNameLabel.setEnabled(true);
            validateNameLabel.setText("Please enter the name");
            validateNameLabel.setForeground(Color.red);
        }else{
            validateNameLabel.setEnabled(true);
            validateNameLabel.setText("Thank You!!");
            validateNameLabel.setForeground(Color.GREEN);
        }
        
        if(landlineTextField.getText().isEmpty()){
            validateLandlineLabel.setEnabled(true);
            validateLandlineLabel.setText("Please enter the name");
            validateLandlineLabel.setForeground(Color.red);
        }else{
            validateLandlineLabel.setEnabled(true);
            validateLandlineLabel.setText("Thank You!!");
            validateLandlineLabel.setForeground(Color.GREEN);
        }
        
        if(addressTextArea.getText().isEmpty()){
            validateAddressLabel.setEnabled(true);
            validateAddressLabel.setText("Please enter the name");
            validateAddressLabel.setForeground(Color.red);
        }else{
            validateAddressLabel.setEnabled(true);
            validateAddressLabel.setText("Thank You!!");
            validateAddressLabel.setForeground(Color.GREEN);
        }
        
        if(basicSalaryTextField.getText().isEmpty()){
            validateBasicSalaryLabel.setEnabled(true);
            validateBasicSalaryLabel.setText("Please enter the name");
            validateBasicSalaryLabel.setForeground(Color.red);
        }else{
            validateBasicSalaryLabel.setEnabled(true);
            validateBasicSalaryLabel.setText("Thank You!!");
            validateBasicSalaryLabel.setForeground(Color.GREEN);
        }
        
        if(basicSalaryTextField.getText().isEmpty()){
            grossSalaryTextField.setEnabled(true);
            grossSalaryTextField.setText("Please enter the name");
            grossSalaryTextField.setForeground(Color.red);
        }else{
            grossSalaryTextField.setEnabled(true);
            grossSalaryTextField.setText("Thank You!!");
            grossSalaryTextField.setForeground(Color.GREEN);
        }
        
        ConnectionSQL sql;
        Connection con = null;
        Statement stmt = null;
        try {
            sql = new ConnectionSQL();
            con=sql.conn;
            String query = "Insert into registration values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, 0);
            pst.setString(2, initial);
            pst.setString(3, fullName);
            pst.setString(4, status);
            pst.setString(5, owner);
            pst.setDouble(6, mobile_number);
            pst.setDouble(7, landline_number);
            pst.setString(8, email);
            pst.setString(9, address);
            pst.setDouble(10, basic_salary);
            pst.setDouble(11, gross_salary);
            pst.setFloat(12, service_tax);
            pst.setFloat(13, esic);
            pst.setDouble(14, provident_fund);
            pst.setString(15, vat);
            pst.setString(16, gstin);
            pst.setString(17, pan);
            pst.setString(18, cin);
            pst.setString(19, pt);
            int rs = pst.executeUpdate();
            System.out.println("Result set" +rs);
            JOptionPane.showMessageDialog(this, "Data is successfully entered");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error : " +ex);
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void vatTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vatTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_vatTextFieldFocusLost

    private void cinTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cinTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cinTextFieldFocusLost

    private void grossSalaryTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_grossSalaryTextFieldFocusLost
        double gross_salary = Double.parseDouble(grossSalaryTextField.getText().toString());
        double sal_year = gross_salary * 12;
        if(sal_year > 900000){
            serviceTaxTextField.setText("14");
        }else{
            serviceTaxTextField.setText("0");
        }
    }//GEN-LAST:event_grossSalaryTextFieldFocusLost

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
    private javax.swing.JButton backButton;
    private javax.swing.JTextField basicSalaryTextField;
    private javax.swing.JTextField cinTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField esicTextField;
    private javax.swing.JTextField grossSalaryTextField;
    private javax.swing.JTextField gstinTextField;
    private javax.swing.JComboBox<String> initailComboBox;
    private javax.swing.JLabel jLAbel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField landlineTextField;
    private javax.swing.JTextField mobileNumberTextField;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox<String> ownerComboBox;
    private javax.swing.JTextField panTextField;
    private javax.swing.JTextField providentFundTextField;
    private javax.swing.JComboBox<String> ptComboBox;
    private javax.swing.JTextField serviceTaxTextField;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel validateAddressLabel;
    private javax.swing.JLabel validateBasicSalaryLabel;
    private javax.swing.JLabel validateCinCorrectLabel;
    private javax.swing.JLabel validateCinRequiedLabel;
    private javax.swing.JLabel validateEmailCorrectLabel;
    private javax.swing.JLabel validateEmailRequiredLabel;
    private javax.swing.JLabel validateGrossSalaryLabel;
    private javax.swing.JLabel validateGstinCorrectLabel;
    private javax.swing.JLabel validateLandlineLabel;
    private javax.swing.JLabel validateMobileCorrectLabel;
    private javax.swing.JLabel validateMobileRequiredLabel;
    private javax.swing.JLabel validateNameLabel;
    private javax.swing.JLabel validatePanCorrectLabel;
    private javax.swing.JLabel validatePanRequiredLabel;
    private javax.swing.JLabel validateVatCorrectLabel;
    private javax.swing.JLabel validateVatRequiedLabel;
    private javax.swing.JLabel validationGstinRequiredLabel;
    private javax.swing.JTextField vatTextField;
    // End of variables declaration//GEN-END:variables
}
