/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical.pkgcase.management;

import java.awt.event.KeyEvent;

/**
 *
 * @author pranali
 */
public class RegisterNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNewPatient
     */
    public RegisterNewPatient() {
        initComponents();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        maritalStatusGroup = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        personalPanel = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameInput = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        otherButton = new javax.swing.JRadioButton();
        singleButton = new javax.swing.JRadioButton();
        phoneLabel = new javax.swing.JLabel();
        phoneInput = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        maritalLabel = new javax.swing.JLabel();
        marriedButton = new javax.swing.JRadioButton();
        occupationLabel = new javax.swing.JLabel();
        occupationInput = new javax.swing.JTextField();
        bloodGroupLabel = new javax.swing.JLabel();
        bloodGroupComboBox = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        emailInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressInput = new javax.swing.JTextArea();
        pastMedicalLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pastMedicalInput = new javax.swing.JTextArea();
        registerButton = new javax.swing.JButton();
        dateInput = new javax.swing.JTextField();
        dateSeperatorLabel1 = new javax.swing.JLabel();
        monthInput = new javax.swing.JTextField();
        yearInput = new javax.swing.JTextField();
        dateSeperatorLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        personalPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Personal Details"));

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name:");

        firstNameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameInputKeyTyped(evt);
            }
        });

        lastNameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameInputKeyTyped(evt);
            }
        });

        genderLabel.setText("Gender");

        genderGroup.add(maleButton);
        maleButton.setText("Male");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        genderGroup.add(femaleButton);
        femaleButton.setSelected(true);
        femaleButton.setText("Female");

        genderGroup.add(otherButton);
        otherButton.setText("Other");

        maritalStatusGroup.add(singleButton);
        singleButton.setSelected(true);
        singleButton.setText("Single");

        phoneLabel.setText("Phone");

        phoneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneInputActionPerformed(evt);
            }
        });
        phoneInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneInputKeyTyped(evt);
            }
        });

        dobLabel.setText("DOB(DD/MM/YYYY)");

        maritalLabel.setText("Marital Status");

        maritalStatusGroup.add(marriedButton);
        marriedButton.setText("Married");

        occupationLabel.setText("Occupation");

        bloodGroupLabel.setText("Blood Group");

        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NA", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        bloodGroupComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupComboBoxActionPerformed(evt);
            }
        });

        emailLabel.setText("E-mail ID");

        addressLabel.setText("Address");

        addressInput.setColumns(20);
        addressInput.setLineWrap(true);
        addressInput.setRows(5);
        jScrollPane1.setViewportView(addressInput);

        pastMedicalLabel.setText("Past Medical");

        pastMedicalInput.setColumns(20);
        pastMedicalInput.setLineWrap(true);
        pastMedicalInput.setRows(5);
        jScrollPane2.setViewportView(pastMedicalInput);

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        dateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateInputActionPerformed(evt);
            }
        });
        dateInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateInputKeyTyped(evt);
            }
        });

        dateSeperatorLabel1.setText("//");

        monthInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                monthInputKeyTyped(evt);
            }
        });

        yearInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearInputKeyTyped(evt);
            }
        });

        dateSeperatorLabel2.setText("//");

        javax.swing.GroupLayout personalPanelLayout = new javax.swing.GroupLayout(personalPanel);
        personalPanel.setLayout(personalPanelLayout);
        personalPanelLayout.setHorizontalGroup(
            personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bloodGroupLabel)
                    .addComponent(firstNameLabel)
                    .addComponent(genderLabel)
                    .addComponent(phoneLabel)
                    .addComponent(dobLabel)
                    .addComponent(maritalLabel)
                    .addComponent(occupationLabel)
                    .addComponent(emailLabel)
                    .addComponent(addressLabel)
                    .addComponent(pastMedicalLabel))
                .addGap(18, 18, 18)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addComponent(firstNameInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameInput))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addGroup(personalPanelLayout.createSequentialGroup()
                        .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bloodGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(personalPanelLayout.createSequentialGroup()
                                .addComponent(maleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(femaleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otherButton))
                            .addGroup(personalPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(registerButton))
                            .addGroup(personalPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(marriedButton)
                                .addGap(54, 54, 54)
                                .addComponent(singleButton))
                            .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, personalPanelLayout.createSequentialGroup()
                                    .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dateSeperatorLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dateSeperatorLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yearInput))
                                .addComponent(emailInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(occupationInput, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneInput, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        personalPanelLayout.setVerticalGroup(
            personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalPanelLayout.createSequentialGroup()
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(lastNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleButton)
                    .addComponent(femaleButton)
                    .addComponent(otherButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateSeperatorLabel1)
                    .addComponent(monthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateSeperatorLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marriedButton)
                    .addComponent(singleButton)
                    .addComponent(maritalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupationLabel)
                    .addComponent(occupationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bloodGroupLabel)
                    .addComponent(bloodGroupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pastMedicalLabel))
                .addGap(18, 18, 18)
                .addComponent(registerButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalPanel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleButtonActionPerformed

    private void bloodGroupComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupComboBoxActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed

        String address;
    String dob;
    String email;
    String name;
    String blood;
    String phone;
    String pastMedical;
    String occupation;
    String marital;
    String gender;
    
    address=addressInput.getText();
    dob=dateInput.getText()+"/"+monthInput.getText()+"/"+yearInput.getText();
    email=emailInput.getText();
    name=firstNameInput.getText()+" "+lastNameInput.getText();
    blood=bloodGroupComboBox.getSelectedItem().toString();
    phone=phoneInput.getText();
    pastMedical=pastMedicalInput.getText();
    occupation=occupationInput.getText();
    
    address = address.replaceAll("\\\\", "-");

    if(maleButton.isSelected())
        gender="Male";
    else if(femaleButton.isSelected())
        gender="Female";
    else
        gender="Other";
    
    if(marriedButton.isSelected())
        marital="Married";
    else
        marital="Single";

        InsertPatientDetails ins = new InsertPatientDetails(name,address, dob, blood, email, phone, pastMedical, occupation, marital,gender);
        
        this.dispose();

    }//GEN-LAST:event_registerButtonActionPerformed

    private void firstNameInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameInputKeyTyped
        // TODO add your handling code here:
                char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();

    }//GEN-LAST:event_firstNameInputKeyTyped

    private void lastNameInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameInputKeyTyped
                char c=evt.getKeyChar();

    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameInputKeyTyped

    private void phoneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneInputActionPerformed

    private void phoneInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneInputKeyTyped
                char c=evt.getKeyChar();

    if(!(Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_phoneInputKeyTyped

    private void dateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateInputActionPerformed

    private void dateInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateInputKeyTyped
                char c=evt.getKeyChar();

    if(!(Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_dateInputKeyTyped

    private void monthInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_monthInputKeyTyped
                char c=evt.getKeyChar();

    if(!(Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_monthInputKeyTyped

    private void yearInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearInputKeyTyped
                char c=evt.getKeyChar();

    if(!(Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
        evt.consume();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_yearInputKeyTyped

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
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterNewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterNewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JComboBox<String> bloodGroupComboBox;
    private javax.swing.JLabel bloodGroupLabel;
    private javax.swing.JTextField dateInput;
    private javax.swing.JLabel dateSeperatorLabel1;
    private javax.swing.JLabel dateSeperatorLabel2;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel maritalLabel;
    private javax.swing.ButtonGroup maritalStatusGroup;
    private javax.swing.JRadioButton marriedButton;
    private javax.swing.JTextField monthInput;
    private javax.swing.JTextField occupationInput;
    private javax.swing.JLabel occupationLabel;
    private javax.swing.JRadioButton otherButton;
    private javax.swing.JTextArea pastMedicalInput;
    private javax.swing.JLabel pastMedicalLabel;
    private javax.swing.JPanel personalPanel;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JRadioButton singleButton;
    private javax.swing.JTextField yearInput;
    // End of variables declaration//GEN-END:variables
}