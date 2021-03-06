/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DeathGrant;

import  DBoperations.DBoperationWithFinal;
import DBoperations.DBoperations;
import Member.MemberDetails;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Thilina
 */
public class UpdateDeathGrant extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDeathGrant
     */
    DBoperations db = new DBoperations();
    DBoperationWithFinal DBWithFinal = new DBoperationWithFinal();
    public UpdateDeathGrant() {
        initComponents();
    }
     MemberDetails member;
 public void setFields(DeathGrantDetails Deathgrant)
    {
        txtEmpNo.setText(new Integer(Deathgrant.getEmpNo()).toString());
        txtFirstName.setText(Deathgrant.getFirstName());
        txtLastName.setText(Deathgrant.getLastName());
        
        txtDOD.setText(Deathgrant.getDod());
        cbGender.setSelectedItem(Deathgrant.getGender());
        txtDGNo.setText(new Integer(Deathgrant.getDeathGrantNo()).toString());
        txtRelationship.setText(Deathgrant.getRelationship());
        txtDeathCertificateNo.setText(Deathgrant.getLastName());
        txtAmount.setText(new Float(Deathgrant.getAmount()).toString());
        
    
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDeathGrantNo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpNo = new javax.swing.JTextField();
        btnValidate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtEmpFirsttName = new javax.swing.JTextField();
        txtEmpLastName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmpPrison = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNICNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDGNo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtRelationship = new javax.swing.JTextField();
        cbGender = new javax.swing.JComboBox();
        txtDeathCertificateNo = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        txtDOD = new javax.swing.JTextField();
        btnSubmit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Death Grant details");
        setLocationByPlatform(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Death Grant Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        txtDeathGrantNo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Emp No");

        txtEmpNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNoActionPerformed(evt);
            }
        });

        btnValidate.setText("Validate");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Emp First Name");

        txtEmpFirsttName.setEditable(false);
        txtEmpFirsttName.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpFirsttName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpFirsttName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpFirsttNameActionPerformed(evt);
            }
        });

        txtEmpLastName.setEditable(false);
        txtEmpLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpLastNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Emp Last Name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Prison");

        txtEmpPrison.setEditable(false);
        txtEmpPrison.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpPrison.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpPrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpPrisonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("NIC No:");

        txtNICNo.setEditable(false);
        txtNICNo.setBackground(new java.awt.Color(255, 255, 255));
        txtNICNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNICNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNICNoMouseExited(evt);
            }
        });
        txtNICNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICNoActionPerformed(evt);
            }
        });
        txtNICNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNICNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNICNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNICNoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Death Grant No");

        txtDGNo.setEditable(false);
        txtDGNo.setBackground(new java.awt.Color(255, 255, 255));
        txtDGNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDGNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDGNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtDeathGrantNoLayout = new javax.swing.GroupLayout(txtDeathGrantNo);
        txtDeathGrantNo.setLayout(txtDeathGrantNoLayout);
        txtDeathGrantNoLayout.setHorizontalGroup(
            txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDeathGrantNoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtDeathGrantNoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpNo)
                            .addComponent(txtDGNo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtDeathGrantNoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnValidate)
                            .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEmpFirsttName)
                                .addComponent(txtEmpLastName)
                                .addComponent(txtEmpPrison, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNICNo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        txtDeathGrantNoLayout.setVerticalGroup(
            txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtDeathGrantNoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDGNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnValidate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmpFirsttName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(txtDeathGrantNoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpPrison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtDeathGrantNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNICNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("First Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Last Name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Relationship");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Date of Death");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Death Certificate No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Amount");

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyTyped(evt);
            }
        });

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLastNameKeyTyped(evt);
            }
        });

        txtRelationship.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRelationship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationshipActionPerformed(evt);
            }
        });
        txtRelationship.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRelationshipKeyTyped(evt);
            }
        });

        cbGender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        cbGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenderActionPerformed(evt);
            }
        });

        txtDeathCertificateNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAmount.setText("1000.00");
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        txtAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAmountKeyTyped(evt);
            }
        });

        txtDOD.setEditable(false);
        txtDOD.setBackground(new java.awt.Color(255, 255, 255));
        txtDOD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDeathCertificateNo)
                            .addComponent(txtAmount)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRelationship, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDOD))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDOD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDeathCertificateNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSubmit1.setText("Submit");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDeathGrantNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnSubmit1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDeathGrantNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNoActionPerformed

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed

         member = DBWithFinal.getMemberByID(Integer.parseInt(txtEmpNo.getText()));
        if (member == null) {
            JOptionPane.showMessageDialog(this, "Member No is not valid");

        } else {

            txtNICNo.setText(member.getNicNo());
            txtEmpFirsttName.setText(member.getLastName());
            txtEmpLastName.setText(member.getLastName());
            txtEmpPrison.setText(member.getPrison());

        }
    }//GEN-LAST:event_btnValidateActionPerformed

    private void txtEmpFirsttNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpFirsttNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpFirsttNameActionPerformed

    private void txtEmpLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpLastNameActionPerformed

    private void txtEmpPrisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpPrisonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpPrisonActionPerformed

    private void txtNICNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNICNoMouseExited

    }//GEN-LAST:event_txtNICNoMouseExited

    private void txtNICNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICNoActionPerformed

    private void txtNICNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNoKeyPressed

    }//GEN-LAST:event_txtNICNoKeyPressed

    private void txtNICNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNoKeyReleased

    }//GEN-LAST:event_txtNICNoKeyReleased

    private void txtNICNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICNoKeyTyped

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
     
    }//GEN-LAST:event_txtFirstNameKeyReleased
private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {                                         
       

    }
    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtRelationshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationshipActionPerformed

    private void cbGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenderActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtDGNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDGNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDGNoActionPerformed
   public boolean isAlpha(String name) {
    char[] chars = name.toCharArray();

    for (char c : chars) {
        if(!Character.isLetter(c)) {
            return false;
        }
    }

    return true;
}
    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        DeathGrantDetails ed = new DeathGrantDetails();

        try{
            ed.setDeathGrantNo(new Integer(txtDGNo.getText()));
            ed.setFirstName(txtFirstName.getText());
            ed.setLastName(txtLastName.getText());
            ed.setDod(txtDOD.getText());
            ed.setRelationship(txtRelationship.getText());
            ed.setGender((String)cbGender.getSelectedItem());
            ed.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
            ed.setAmount(Float.parseFloat(txtAmount.getText()));
            ed.setDeathCertificateNo(txtDeathCertificateNo.getText());
            ed.setMemTransOwnId(member.getOwnerID());
            ed.setAccountNo(member.getAccountNo());
            boolean result = db.updateDeathGrant(ed);
           
            if(result)
            {
                JOptionPane.showMessageDialog(this, "pending for Authorization....");
                //clearFields();
                this.dispose();
            }
            else
            JOptionPane.showMessageDialog(this, "Error occurs while inserting");
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Member details are not valid");
        }
    }//GEN-LAST:event_btnSubmit1ActionPerformed

    private void txtFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        String in = txtFirstName.getText();
        if(c!=' '){
        if(!Character.isLetter(c)|| Character.isDigit(c)){
           evt.consume();
           Toolkit tk = Toolkit.getDefaultToolkit();
             tk.beep();}}
    }//GEN-LAST:event_txtFirstNameKeyTyped

    private void txtLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        String in = txtLastName.getText();
        if(c!=' '){
        if(!Character.isLetter(c)|| Character.isDigit(c)){
           evt.consume();
           Toolkit tk = Toolkit.getDefaultToolkit();
             tk.beep();}}
    }//GEN-LAST:event_txtLastNameKeyTyped

    private void txtRelationshipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRelationshipKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        String in = txtRelationship.getText();
        if(c!=' '){
        if(!Character.isLetter(c)|| Character.isDigit(c)){
           evt.consume();
           Toolkit tk = Toolkit.getDefaultToolkit();
             tk.beep();}}
    }//GEN-LAST:event_txtRelationshipKeyTyped

    private void txtAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAmountKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        String in = txtAmount.getText();
        if(c!=' '){
        if(! Character.isDigit(c)){
           evt.consume();
           Toolkit tk = Toolkit.getDefaultToolkit();
             tk.beep();}}
    }//GEN-LAST:event_txtAmountKeyTyped

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
            java.util.logging.Logger.getLogger(UpdateDeathGrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeathGrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeathGrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeathGrant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeathGrant().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JButton btnValidate;
    private javax.swing.JComboBox cbGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDGNo;
    private javax.swing.JTextField txtDOD;
    private javax.swing.JTextField txtDeathCertificateNo;
    private javax.swing.JPanel txtDeathGrantNo;
    private javax.swing.JTextField txtEmpFirsttName;
    private javax.swing.JTextField txtEmpLastName;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtEmpPrison;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNICNo;
    private javax.swing.JTextField txtRelationship;
    // End of variables declaration//GEN-END:variables
}
