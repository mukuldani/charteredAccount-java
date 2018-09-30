package charteredaccountant;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewCustomerData extends javax.swing.JFrame {

    private int regis_id;
    private float hra;
    private float da;
    private int basicSalary;
    private int ta;
    private int grossSalary;
    private float esic;
    private float pf;
    private float serviceTax;
    
    public ViewCustomerData() {
        initComponents();
        this.setBounds(385, 40, 530, 655);
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
        jLabel11 = new javax.swing.JLabel();
        basicSalaryjTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        hrajLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dajLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        taxjTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        grossSalaryjLabel = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        esicjLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pfjLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        serviceTaxjLabel = new javax.swing.JLabel();

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

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Basic Salary(per month)");

        basicSalaryjTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        basicSalaryjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                basicSalaryjTextFieldFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("HRA");

        hrajLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hrajLabel.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("DA");

        dajLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dajLabel.setText("jLabel15");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("TA");

        taxjTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        taxjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                taxjTextFieldFocusLost(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setText("Gross Salary");

        grossSalaryjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        grossSalaryjLabel.setText("jLabel18");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setText("ESIC");

        esicjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esicjLabel.setText("jLabel20");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel21.setText("PF");

        pfjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pfjLabel.setText("jLabel22");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setText("Service Tax");

        serviceTaxjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        serviceTaxjLabel.setText("jLabel24");

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
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(hrajLabel))
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel23))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serviceTaxjLabel)
                                    .addComponent(grossSalaryjLabel))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
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
                        .addComponent(jScrollPane2)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(updatejButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jLabel19)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dajLabel)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(esicjLabel)))))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(taxjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(deletejButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(pfjLabel))))))
                    .addComponent(basicSalaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel10)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(basicSalaryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(taxjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dajLabel)
                    .addComponent(jLabel14)
                    .addComponent(hrajLabel)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(grossSalaryjLabel)
                    .addComponent(jLabel19)
                    .addComponent(esicjLabel)
                    .addComponent(jLabel21)
                    .addComponent(pfjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(serviceTaxjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(updatejButton)
                    .addComponent(deletejButton))
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
        basicSalaryjTextField.setText("");
        hrajLabel.setText("");
        dajLabel.setText("");
        taxjTextField.setText("");
        grossSalaryjLabel.setText("");
        esicjLabel.setText("");
        pfjLabel.setText("");
        serviceTaxjLabel.setText("");
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
            if(regis_id > 0){
                String tax_details_query = "Select * from cust_tax_details where regis_id = "+regis_id;
                PreparedStatement pst1 = con.prepareStatement(tax_details_query);
                ResultSet rs_tax = pst1.executeQuery();
                while(rs_tax.next()){
                    int tax_details_id = rs_tax.getInt(1);
                    int basic_salary = rs_tax.getInt(3);
                    float hra = rs_tax.getInt(4);
                    float da = rs_tax.getInt(5);
                    int ta = rs_tax.getInt(6);
                    int gross_salary = rs_tax.getInt(7);
                    float esic = rs_tax.getInt(8);
                    float pf = rs_tax.getInt(9);
                    float service_tax = rs_tax.getInt(10);
                    
                    basicSalaryjTextField.setText(String.valueOf(basic_salary));
                    hrajLabel.setText(String.valueOf(hra));
                    dajLabel.setText(String.valueOf(da));
                    taxjTextField.setText(String.valueOf(ta));
                    grossSalaryjLabel.setText(String.valueOf(gross_salary));
                    esicjLabel.setText(String.valueOf(esic));
                    pfjLabel.setText(String.valueOf(pf));
                    serviceTaxjLabel.setText(String.valueOf(service_tax));
                }
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
        
        basicSalary = Integer.parseInt(basicSalaryjTextField.getText());
        hra = Float.parseFloat(hrajLabel.getText());
        da = Float.parseFloat(dajLabel.getText());
        ta = Integer.parseInt(taxjTextField.getText());
        grossSalary = Integer.parseInt(grossSalaryjLabel.getText());
        esic = Float.parseFloat(esicjLabel.getText());
        pf = Float.parseFloat(pfjLabel.getText());
        serviceTax = Float.parseFloat(serviceTaxjLabel.getText());
        
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
                String update_tax_details = "Update cust_tax_details SET basic_salary = ?, hra = ?, da = ?, "
                        + "ta = ?, gross_salary = ?, esic = ?, pf = ?, service_tax = ? where regis_id = ?";
                PreparedStatement pst1 = con.prepareStatement(update_tax_details);
                pst1.setInt(1, basicSalary);
                pst1.setFloat(2, hra);
                pst1.setFloat(3, da);
                pst1.setInt(4, ta);
                pst1.setInt(5, grossSalary);
                pst1.setFloat(6, esic);
                pst1.setFloat(7, pf);
                pst1.setFloat(8, serviceTax);
                pst1.setInt(9, regis_id);
                int row1 = pst1.executeUpdate();
                if(row1 > 0){
                    JOptionPane.showMessageDialog(this, "Customer Details Updated", "Success", 
                            JOptionPane.INFORMATION_MESSAGE);
                    clearScreen();
                }
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

    private void basicSalaryjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_basicSalaryjTextFieldFocusLost
        basicSalary = Integer.parseInt(basicSalaryjTextField.getText());
        String residenceType = residenceTypejComboBox.getSelectedItem().toString();
        String employeeType = employeeTypejComboBox.getSelectedItem().toString();
        
        //HRA Calculation
        if(residenceType.equals("City")){
            hra = (40 * basicSalary) / 100;
            hrajLabel.setVisible(true);
            hrajLabel.setText(String.valueOf(hra));
        }else if(residenceType.equals("Town") || residenceType.equals("Village")){
            hra = (50 * basicSalary) / 100;
            hrajLabel.setVisible(true);
            hrajLabel.setText(String.valueOf(hra));
        }
        
        //DA Calculation
        if(employeeType.equals("Government")){
            da = (10 * basicSalary) / 100;
            dajLabel.setVisible(true);
            dajLabel.setText(String.valueOf(da));
        }else if(employeeType.equals("Individual") || employeeType.equals("Private")){
            da = 0;
            dajLabel.setVisible(true);
            dajLabel.setText(String.valueOf(da));
        }
        
        //Service Tax Calculation
        if(basicSalary < 0){
            JOptionPane.showConfirmDialog(this, "Salary should be greater than zero","Error",JOptionPane.ERROR_MESSAGE);
        }else if(basicSalary > 0 && basicSalary <= 20834){
            serviceTax = 0;
            serviceTaxjLabel.setVisible(true);
            serviceTaxjLabel.setText(String.valueOf(serviceTax));
        }else if(basicSalary >= 20835 && basicSalary <= 41666){
            serviceTax = (5 * basicSalary) / 100;
            serviceTaxjLabel.setVisible(true);
            serviceTaxjLabel.setText(String.valueOf(serviceTax));
        }else if(basicSalary >= 41667 && basicSalary <= 83333){
            serviceTax = (20 * basicSalary) / 100;
            serviceTaxjLabel.setVisible(true);
            serviceTaxjLabel.setText(String.valueOf(serviceTax));
        }else if(basicSalary >= 83334){
            serviceTax = (30 * basicSalary) / 100;
            serviceTaxjLabel.setVisible(true);
            serviceTaxjLabel.setText(String.valueOf(serviceTax));
        }
    }//GEN-LAST:event_basicSalaryjTextFieldFocusLost

    private void taxjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_taxjTextFieldFocusLost
        ta = Integer.parseInt(taxjTextField.getText());
        grossSalary = (int) (basicSalary + hra + da + ta);
        grossSalaryjLabel.setVisible(true);
        grossSalaryjLabel.setText(String.valueOf(grossSalary));
        
        pf = (float) ((4.75 * grossSalary) / 100);
        pfjLabel.setVisible(true);
        pfjLabel.setText(String.valueOf(pf));
        
        esic = (float) ((1.75 * grossSalary) / 100);
        esicjLabel.setVisible(true);
        esicjLabel.setText(String.valueOf(esic));
    }//GEN-LAST:event_taxjTextFieldFocusLost


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
    private javax.swing.JTextField basicSalaryjTextField;
    private javax.swing.JLabel dajLabel;
    private javax.swing.JButton deletejButton;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JComboBox<String> employeeTypejComboBox;
    private javax.swing.JLabel esicjLabel;
    private javax.swing.JLabel fullNamejLabel;
    private javax.swing.JTextField fullNamejTextField;
    private javax.swing.JComboBox<String> genderjComboBox;
    private javax.swing.JLabel grossSalaryjLabel;
    private javax.swing.JLabel hrajLabel;
    private javax.swing.JComboBox<String> initialjComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel pfjLabel;
    private javax.swing.JTextArea residenceAddressjTextArea;
    private javax.swing.JComboBox<String> residenceTypejComboBox;
    private javax.swing.JButton searchjButton;
    private javax.swing.JLabel serviceTaxjLabel;
    private javax.swing.JTextField taxjTextField;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables
}
