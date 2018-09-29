package charteredaccountant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Summary extends javax.swing.JFrame {

    public ArrayList<CustomerData> arrayCustd = new ArrayList<CustomerData>();
    
    public Summary(ArrayList<CustomerData> tempcust) {
        initComponents();
        arrayCustd = tempcust;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genderjLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mobileNumberjLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailIdjLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        residenceTypejLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        employeeTypejLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        residenceAddressjLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        officeAddressjLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        basicSalaryjLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        hrajLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        dajLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tajLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        grossSalaryjLabel = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        esicjLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pfjLabel = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        serviceTAxjLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Summary");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Name");

        namejLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        namejLabel.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Gender");

        genderjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        genderjLabel.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Mobile Number");

        mobileNumberjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        mobileNumberjLabel.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Email ID");

        emailIdjLabel.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Residence Type");

        residenceTypejLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        residenceTypejLabel.setText("jLabel11");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("Employee Type");

        employeeTypejLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        employeeTypejLabel.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setText("Residential Address");

        residenceAddressjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        residenceAddressjLabel.setText("jLabel15");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setText("Office Address");

        officeAddressjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        officeAddressjLabel.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setText("Basic Salary");

        basicSalaryjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        basicSalaryjLabel.setText("jLabel19");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setText("HRA");

        hrajLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        hrajLabel.setText("jLabel21");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel22.setText("DA");

        dajLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dajLabel.setText("jLabel23");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel24.setText("TA");

        tajLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tajLabel.setText("jLabel25");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setText("Gross Salary");

        grossSalaryjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        grossSalaryjLabel.setText("jLabel27");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel28.setText("ESIC");

        esicjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        esicjLabel.setText("jLabel29");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel30.setText("PF");

        pfjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pfjLabel.setText("jLabel31");

        jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel32.setText("Service Tax");

        serviceTAxjLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        serviceTAxjLabel.setText("jLabel33");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(namejLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(mobileNumberjLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(residenceTypejLabel)))
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(36, 36, 36)
                                            .addComponent(genderjLabel))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(emailIdjLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(basicSalaryjLabel)
                                            .addComponent(jLabel12)
                                            .addComponent(hrajLabel)
                                            .addComponent(dajLabel)
                                            .addComponent(tajLabel)
                                            .addComponent(grossSalaryjLabel)
                                            .addComponent(esicjLabel)
                                            .addComponent(pfjLabel)
                                            .addComponent(serviceTAxjLabel))
                                        .addGap(18, 18, 18)
                                        .addComponent(employeeTypejLabel))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel32))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(officeAddressjLabel)
                                            .addComponent(residenceAddressjLabel))))
                                .addGap(54, 54, 54)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namejLabel)
                    .addComponent(jLabel4)
                    .addComponent(genderjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(mobileNumberjLabel)
                    .addComponent(jLabel8)
                    .addComponent(emailIdjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(residenceTypejLabel)
                    .addComponent(jLabel12)
                    .addComponent(employeeTypejLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(residenceAddressjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(officeAddressjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(basicSalaryjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(hrajLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(dajLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tajLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(grossSalaryjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(esicjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(pfjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(serviceTAxjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        namejLabel.setText(arrayCustd.get(0).getInitial()+" "+arrayCustd.get(0).getName());
        genderjLabel.setText(arrayCustd.get(0).getGender());
        mobileNumberjLabel.setText(arrayCustd.get(0).getMobileNumber());
        emailIdjLabel.setText(arrayCustd.get(0).getEmail());
        residenceTypejLabel.setText(arrayCustd.get(0).getResidenceType());
        employeeTypejLabel.setText(arrayCustd.get(0).getEmployeeType());
        residenceAddressjLabel.setText(arrayCustd.get(0).getResidentialAddress());
        officeAddressjLabel.setText(arrayCustd.get(0).getOfficeAddress());
        basicSalaryjLabel.setText(String.valueOf(arrayCustd.get(1).getBasicSalary()));
        hrajLabel.setText(String.valueOf(arrayCustd.get(1).getHra()));
        dajLabel.setText(String.valueOf(arrayCustd.get(1).getDa()));
        tajLabel.setText(String.valueOf(arrayCustd.get(1).getTa()));
        grossSalaryjLabel.setText(String.valueOf(arrayCustd.get(1).getGrossSalary()));
        esicjLabel.setText(String.valueOf(arrayCustd.get(1).getEsic()));
        pfjLabel.setText(String.valueOf(arrayCustd.get(1).getPf()));
        serviceTAxjLabel.setText(String.valueOf(arrayCustd.get(1).getServiceTax()));
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = null;
        Statement stmt = null;
        ConnectionSQL sql;
        try {
            sql = new ConnectionSQL();
            con=sql.conn;
            String insert_customer_regis = "Insert into registration values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(insert_customer_regis);
            pst.setInt(1, 0);
            pst.setString(2, arrayCustd.get(0).getInitial());
            pst.setString(3, arrayCustd.get(0).getName());
            pst.setString(4, arrayCustd.get(0).getGender());
            pst.setString(5, arrayCustd.get(0).getMobileNumber());
            pst.setString(6, arrayCustd.get(0).getEmail());
            pst.setString(7, arrayCustd.get(0).getResidenceType());
            pst.setString(8, arrayCustd.get(0).getEmployeeType());
            pst.setString(9, arrayCustd.get(0).getResidentialAddress());
            pst.setString(10, arrayCustd.get(0).getOfficeAddress());
            int rows = pst.executeUpdate();
            if(rows > 0){
                String get_regis_query = "Select regis_id from registration where email = '"+arrayCustd.get(0).getEmail()+"'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(get_regis_query);
                int regis_id = 0;
                while(rs.next()){
                    regis_id = rs.getInt("regis_id");
                }
                if(regis_id > 0){
                    String insert_customer_tax_details = "Insert into cust_tax_details values(?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst1 = con.prepareStatement(insert_customer_tax_details);
                    pst1.setInt(1, 0);
                    pst1.setInt(2, regis_id);
                    pst1.setInt(3, arrayCustd.get(1).getBasicSalary());
                    pst1.setFloat(4, arrayCustd.get(1).getHra());
                    pst1.setFloat(5, arrayCustd.get(1).getDa());
                    pst1.setInt(6, arrayCustd.get(1).getTa());
                    pst1.setInt(7, arrayCustd.get(1).getGrossSalary());
                    pst1.setFloat(8, arrayCustd.get(1).getEsic());
                    pst1.setFloat(9, arrayCustd.get(1).getPf());
                    pst1.setFloat(10, arrayCustd.get(1).getServiceTax());
                    int rows1 = pst1.executeUpdate();
                    if(rows1 > 0){
                        JOptionPane.showMessageDialog(this, "Data Successfully Inserted", "Success",JOptionPane.INFORMATION_MESSAGE);
                        arrayCustd.removeAll(arrayCustd);
                        Registration regis = new Registration();
                        regis.setVisible(true);
                        this.dispose();
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Summary.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        arrayCustd.removeAll(arrayCustd);
        Registration regis = new Registration();
        regis.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    static ArrayList<CustomerData> t1 =null;
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
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Summary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Summary(t1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel basicSalaryjLabel;
    private javax.swing.JLabel dajLabel;
    private javax.swing.JLabel emailIdjLabel;
    private javax.swing.JLabel employeeTypejLabel;
    private javax.swing.JLabel esicjLabel;
    private javax.swing.JLabel genderjLabel;
    private javax.swing.JLabel grossSalaryjLabel;
    private javax.swing.JLabel hrajLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel mobileNumberjLabel;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JLabel officeAddressjLabel;
    private javax.swing.JLabel pfjLabel;
    private javax.swing.JLabel residenceAddressjLabel;
    private javax.swing.JLabel residenceTypejLabel;
    private javax.swing.JLabel serviceTAxjLabel;
    private javax.swing.JLabel tajLabel;
    // End of variables declaration//GEN-END:variables
}
