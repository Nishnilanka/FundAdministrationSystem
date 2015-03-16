
package DeathGrant;

import DBoperations.DBoperationWithFinal;
import DBoperations.DBoperations;
import Member.MemberDetails;
import javax.swing.JOptionPane;
import DeathGrant.DeathGrantDetails;
import java.awt.Toolkit;
/**
 *
 * @author Thilina
 */
public class UpdateDeathGrantLoan extends javax.swing.JFrame {
DBoperations db = new DBoperations();
DBoperationWithFinal DBWithFinal = new DBoperationWithFinal();
    /**
     * Creates new form UpdateDeathGrantLoan
     */
    public UpdateDeathGrantLoan() {
        initComponents();
    }
    MemberDetails member;
    DeathGrantDetails deathgrant;
    public void setFields(DeathGrantDetails deathgrant)
{
        txtEmpNo.setText(new Integer(deathgrant.getEmpNo()).toString());
        member=DBWithFinal.getMemberByID(Integer.parseInt(txtEmpNo.getText()));
        txtEmpFirsttName.setText(deathgrant.getEmpFirstName());
        txtEmpLastName.setText(deathgrant.getEmpLastName());
        txtNICNo.setText(deathgrant.getNicNo());
        txtEmpPrison.setText(deathgrant.getPrison());
        txtDeathGrantNo2.setText(new Integer(deathgrant.getDeathGrantNo()).toString());
        txtFirsttName.setText(deathgrant.getFirstName());
        txtLastName.setText(deathgrant.getLastName());
        txtRelationship.setText(deathgrant.getRelationship());
        txtEmpPrison.setText(deathgrant.getPrison());   
        txtLoanAmount.setText(new Float(deathgrant.getAmount()).toString());
        txtMonthlyPayment.setText(new Float(deathgrant.getMonthlyPayment()).toString());
        txtChequeNo.setText(deathgrant.getChequeNo());
        txtVoucherNo.setText(deathgrant.getVoucherNo());
        txtDeathCertificateNo.setText(deathgrant.getDeathCertificateNo());
        txtDeathCertificateNo.setText(deathgrant.getDeathCertificateNo()); 
       txtDGLoanNo.setText(new Integer(deathgrant.getLoanNo()).toString());
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        txtDeathGrantNo2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtFirsttName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtRelationship = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDeathCertificateNo = new javax.swing.JTextField();
        txtEmpNo = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtEmpFirsttName = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtEmpLastName = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtEmpPrison = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtNICNo = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtDGLoanNo = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtLoanAmount = new javax.swing.JTextField();
        txtMonthlyPayment = new javax.swing.JTextField();
        txtChequeNo = new javax.swing.JTextField();
        txtVoucherNo = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        cbDate = new org.freixas.jcalendar.JCalendarCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Death Grant Loan");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Death Grant Loan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Death Grant No");

        txtDeathGrantNo2.setEditable(false);
        txtDeathGrantNo2.setBackground(new java.awt.Color(255, 255, 255));
        txtDeathGrantNo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDeathGrantNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeathGrantNo2txtDeathGrantNoActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("First Name");

        txtFirsttName.setEditable(false);
        txtFirsttName.setBackground(new java.awt.Color(255, 255, 255));
        txtFirsttName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFirsttName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirsttNametxtFirsttNameActionPerformed(evt);
            }
        });

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNametxtLastNameActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Last Name");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Relationship");

        txtRelationship.setEditable(false);
        txtRelationship.setBackground(new java.awt.Color(255, 255, 255));
        txtRelationship.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRelationship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRelationshiptxtRelationshipActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Death Certificate No");

        txtDeathCertificateNo.setEditable(false);
        txtDeathCertificateNo.setBackground(new java.awt.Color(255, 255, 255));
        txtDeathCertificateNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDeathCertificateNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDeathCertificateNotxtDeathCertificateNoMouseExited(evt);
            }
        });
        txtDeathCertificateNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeathCertificateNotxtDeathCertificateNoActionPerformed(evt);
            }
        });
        txtDeathCertificateNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDeathCertificateNotxtDeathCertificateNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeathCertificateNotxtDeathCertificateNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeathCertificateNotxtDeathCertificateNoKeyTyped(evt);
            }
        });

        txtEmpNo.setEditable(false);
        txtEmpNo.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNotxtEmpNoActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Emp No");

        txtEmpFirsttName.setEditable(false);
        txtEmpFirsttName.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpFirsttName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpFirsttName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpFirsttNametxtEmpFirsttNameActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Emp First Name");

        txtEmpLastName.setEditable(false);
        txtEmpLastName.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpLastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpLastNametxtEmpLastNameActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Emp Last Name");

        txtEmpPrison.setEditable(false);
        txtEmpPrison.setBackground(new java.awt.Color(255, 255, 255));
        txtEmpPrison.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmpPrison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpPrisontxtEmpPrisonActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Prison");

        txtNICNo.setEditable(false);
        txtNICNo.setBackground(new java.awt.Color(255, 255, 255));
        txtNICNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNICNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNICNotxtNICNoMouseExited(evt);
            }
        });
        txtNICNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNICNotxtNICNoActionPerformed(evt);
            }
        });
        txtNICNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNICNotxtNICNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNICNotxtNICNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNICNotxtNICNoKeyTyped(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("NIC No:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Death Grant Loan No");

        txtDGLoanNo.setEditable(false);
        txtDGLoanNo.setBackground(new java.awt.Color(255, 255, 255));
        txtDGLoanNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtFirsttName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDeathGrantNo2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmpNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmpFirsttName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtDGLoanNo, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDeathCertificateNo)
                        .addComponent(txtNICNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRelationship)
                        .addComponent(txtEmpLastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmpPrison, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDGLoanNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDeathGrantNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFirsttName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpFirsttName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmpPrison, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNICNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRelationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeathCertificateNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Loan amount");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Monthly Payment");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Cheque No");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Voucher No");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Date");

        txtLoanAmount.setEditable(false);
        txtLoanAmount.setBackground(new java.awt.Color(255, 255, 255));
        txtLoanAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoanAmount.setText("1 2000.00");

        txtMonthlyPayment.setEditable(false);
        txtMonthlyPayment.setBackground(new java.awt.Color(255, 255, 255));
        txtMonthlyPayment.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMonthlyPayment.setText("1000.00");

        txtChequeNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChequeNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtChequeNoKeyTyped(evt);
            }
        });

        txtVoucherNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtVoucherNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVoucherNoKeyTyped(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cbDate.setDate(new java.util.Date());
        cbDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoanAmount)
                    .addComponent(txtMonthlyPayment)
                    .addComponent(txtChequeNo)
                    .addComponent(txtVoucherNo)
                    .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtChequeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtVoucherNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDeathGrantNo2txtDeathGrantNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeathGrantNo2txtDeathGrantNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathGrantNo2txtDeathGrantNoActionPerformed

    private void txtFirsttNametxtFirsttNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirsttNametxtFirsttNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirsttNametxtFirsttNameActionPerformed

    private void txtLastNametxtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNametxtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNametxtLastNameActionPerformed

    private void txtRelationshiptxtRelationshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRelationshiptxtRelationshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRelationshiptxtRelationshipActionPerformed

    private void txtDeathCertificateNotxtDeathCertificateNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeathCertificateNotxtDeathCertificateNoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathCertificateNotxtDeathCertificateNoMouseExited

    private void txtDeathCertificateNotxtDeathCertificateNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeathCertificateNotxtDeathCertificateNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathCertificateNotxtDeathCertificateNoActionPerformed

    private void txtDeathCertificateNotxtDeathCertificateNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeathCertificateNotxtDeathCertificateNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathCertificateNotxtDeathCertificateNoKeyPressed

    private void txtDeathCertificateNotxtDeathCertificateNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeathCertificateNotxtDeathCertificateNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathCertificateNotxtDeathCertificateNoKeyReleased

    private void txtDeathCertificateNotxtDeathCertificateNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeathCertificateNotxtDeathCertificateNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeathCertificateNotxtDeathCertificateNoKeyTyped

    private void txtEmpNotxtEmpNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNotxtEmpNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNotxtEmpNoActionPerformed

    private void txtEmpFirsttNametxtEmpFirsttNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpFirsttNametxtEmpFirsttNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpFirsttNametxtEmpFirsttNameActionPerformed

    private void txtEmpLastNametxtEmpLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpLastNametxtEmpLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpLastNametxtEmpLastNameActionPerformed

    private void txtEmpPrisontxtEmpPrisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpPrisontxtEmpPrisonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpPrisontxtEmpPrisonActionPerformed

    private void txtNICNotxtNICNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNICNotxtNICNoMouseExited

    }//GEN-LAST:event_txtNICNotxtNICNoMouseExited

    private void txtNICNotxtNICNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNICNotxtNICNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICNotxtNICNoActionPerformed

    private void txtNICNotxtNICNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNotxtNICNoKeyPressed

    }//GEN-LAST:event_txtNICNotxtNICNoKeyPressed

    private void txtNICNotxtNICNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNotxtNICNoKeyReleased

    }//GEN-LAST:event_txtNICNotxtNICNoKeyReleased

    private void txtNICNotxtNICNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICNotxtNICNoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNICNotxtNICNoKeyTyped

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       
        try{
            DeathGrantDetails ed = new DeathGrantDetails();

            ed.setDeathGrantNo(Integer.parseInt(txtDeathGrantNo2.getText()));
            ed.setEmpNo(Integer.parseInt(txtEmpNo.getText()));
            ed.setAccountNo(member.getAccountNo());
            ed.setMemTransOwnId(member.getOwnerID());
            ed.setChequeNo(txtChequeNo.getText());
            ed.setDate(cbDate.getDate().toString());
            ed.setVoucherNo(txtVoucherNo.getText());
            ed.setLoanAmount(Float.parseFloat(txtLoanAmount.getText()));
            ed.setMonthlyPayment(Float.parseFloat(txtMonthlyPayment.getText()));

            boolean r = db.updateDeathLoan(ed);
            if(r)
            {
                    JOptionPane.showMessageDialog(this, "pending for Authorization....");
                this.dispose();
            }
            else
            JOptionPane.showMessageDialog(this, "Error occurs while inserting");
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(this, "Death Grant details are not valid");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDateActionPerformed

    }//GEN-LAST:event_cbDateActionPerformed

    private void txtChequeNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChequeNoKeyTyped
        // TODO add your handling code here:
                char c=evt.getKeyChar();
        String in =txtChequeNo.getText();
        if(in.length()>5 ||!Character.isDigit(c)){
        evt.consume();
           Toolkit tk = Toolkit.getDefaultToolkit();
             tk.beep();}
    }//GEN-LAST:event_txtChequeNoKeyTyped

    private void txtVoucherNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVoucherNoKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        String in =txtVoucherNo.getText();
        if(!Character.isDigit(c)){
           evt.consume();
           Toolkit tk = Toolkit.getDefaultToolkit();
             tk.beep();}
    }//GEN-LAST:event_txtVoucherNoKeyTyped

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
            java.util.logging.Logger.getLogger(UpdateDeathGrantLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeathGrantLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeathGrantLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeathGrantLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeathGrantLoan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private org.freixas.jcalendar.JCalendarCombo cbDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtChequeNo;
    private javax.swing.JTextField txtDGLoanNo;
    private javax.swing.JTextField txtDeathCertificateNo;
    private javax.swing.JTextField txtDeathGrantNo2;
    private javax.swing.JTextField txtEmpFirsttName;
    private javax.swing.JTextField txtEmpLastName;
    private javax.swing.JTextField txtEmpNo;
    private javax.swing.JTextField txtEmpPrison;
    private javax.swing.JTextField txtFirsttName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLoanAmount;
    private javax.swing.JTextField txtMonthlyPayment;
    private javax.swing.JTextField txtNICNo;
    private javax.swing.JTextField txtRelationship;
    private javax.swing.JTextField txtVoucherNo;
    // End of variables declaration//GEN-END:variables
}
