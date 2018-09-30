
package charteredaccountant;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TaxRegis extends javax.swing.JFrame {

    public ArrayList<CustomerData> arrayCustd = new ArrayList<CustomerData>();
    private float hra;
    private float da;
    private int basicSalary;
    private int ta;
    private int grossSalary;
    private float esic;
    private float pf;
    private float serviceTax;
    
    public TaxRegis(ArrayList<CustomerData> tempcust) {
        initComponents();
        this.setBounds(380, 160, 495, 380);
        arrayCustd = tempcust;
        userNameLabel.setEnabled(true);
        userNameLabel.setText(arrayCustd.get(0).getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salaryTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        serviceTaxLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        esicjlabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dajLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hrajLabel = new javax.swing.JLabel();
        nextjButton = new javax.swing.JButton();
        canceljButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        grossSalaryjLabel = new javax.swing.JLabel();
        tajTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pfjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Tax Details");

        userNameLabel.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Basic Salary (per month)");
        jLabel2.setToolTipText("");

        salaryTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        salaryTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                salaryTextFieldFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Service Tax");

        serviceTaxLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        serviceTaxLabel.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("ESIC");

        esicjlabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        esicjlabel.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("TA(per month)");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("DA");

        dajLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        dajLabel.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("HRA");

        hrajLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hrajLabel.setEnabled(false);

        nextjButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        nextjButton.setText("Next");
        nextjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextjButtonActionPerformed(evt);
            }
        });

        canceljButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        canceljButton.setText("Cancel");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Gross Salary");

        grossSalaryjLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        grossSalaryjLabel.setEnabled(false);

        tajTextField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tajTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tajTextFieldFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("PF");

        pfjLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pfjLabel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(userNameLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(hrajLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(esicjlabel)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(pfjLabel))
                                    .addComponent(tajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(dajLabel)
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(grossSalaryjLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(serviceTaxLabel))))
                            .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(nextjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canceljButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(userNameLabel)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hrajLabel)
                    .addComponent(jLabel8)
                    .addComponent(dajLabel)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(grossSalaryjLabel)
                    .addComponent(jLabel6)
                    .addComponent(tajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esicjlabel)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(pfjLabel)
                    .addComponent(jLabel4)
                    .addComponent(serviceTaxLabel))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextjButton)
                    .addComponent(canceljButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salaryTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_salaryTextFieldFocusLost
        basicSalary = Integer.parseInt(salaryTextField.getText());
        String residenceType = arrayCustd.get(0).getResidenceType();
        String employeeType = arrayCustd.get(0).getEmployeeType();
        
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
            serviceTaxLabel.setVisible(true);
            serviceTaxLabel.setText(String.valueOf(serviceTax));
        }else if(basicSalary >= 20835 && basicSalary <= 41666){
            serviceTax = (5 * basicSalary) / 100;
            serviceTaxLabel.setVisible(true);
            serviceTaxLabel.setText(String.valueOf(serviceTax));
        }else if(basicSalary >= 41667 && basicSalary <= 83333){
            serviceTax = (20 * basicSalary) / 100;
            serviceTaxLabel.setVisible(true);
            serviceTaxLabel.setText(String.valueOf(serviceTax));
        }else if(basicSalary >= 83334){
            serviceTax = (30 * basicSalary) / 100;
            serviceTaxLabel.setVisible(true);
            serviceTaxLabel.setText(String.valueOf(serviceTax));
        }
    }//GEN-LAST:event_salaryTextFieldFocusLost

    private void tajTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tajTextFieldFocusLost
        ta = Integer.parseInt(tajTextField.getText());
        grossSalary = (int) (basicSalary + hra + da + ta);
        grossSalaryjLabel.setVisible(true);
        grossSalaryjLabel.setText(String.valueOf(grossSalary));
        
        pf = (float) ((4.75 * grossSalary) / 100);
        pfjLabel.setVisible(true);
        pfjLabel.setText(String.valueOf(pf));
        
        esic = (float) ((1.75 * grossSalary) / 100);
        esicjlabel.setVisible(true);
        esicjlabel.setText(String.valueOf(esic));
    }//GEN-LAST:event_tajTextFieldFocusLost

    private void nextjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextjButtonActionPerformed
        CustomerData custd = new CustomerData();
        custd.setBasicSalary(basicSalary);
        custd.setHra(hra);
        custd.setDa(da);
        custd.setTa(ta);
        custd.setGrossSalary(grossSalary);
        custd.setEsic(esic);
        custd.setPf(pf);
        custd.setServiceTax(serviceTax);
        arrayCustd.add(custd);
        Summary summary = new Summary(arrayCustd);
        this.dispose();
        summary.setVisible(true);
    }//GEN-LAST:event_nextjButtonActionPerformed

    static ArrayList<CustomerData> t1 =null;
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaxRegis(t1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton canceljButton;
    private javax.swing.JLabel dajLabel;
    private javax.swing.JLabel esicjlabel;
    private javax.swing.JLabel grossSalaryjLabel;
    private javax.swing.JLabel hrajLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton nextjButton;
    private javax.swing.JLabel pfjLabel;
    private javax.swing.JTextField salaryTextField;
    private javax.swing.JLabel serviceTaxLabel;
    private javax.swing.JTextField tajTextField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
