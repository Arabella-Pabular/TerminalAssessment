/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;
import classes.Employee;
import com.opencsv.exceptions.CsvValidationException;
import java.awt.Dialog;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ajbab
 */
public class FrmDeleteEmployee extends javax.swing.JDialog {

   

    /**
     * Creates new form FrmNewStudent
     * @param _employee
     */
    
    public FrmDeleteEmployee(Employee _employee) {
        initComponents();
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        txtEmployeeNo.setText(_employee.GetEmployeeNo());
        txtLastname.setText(_employee.GetLastName());
        txtFirstname.setText(_employee.GetFirstName());
        txtEmployeeAddress.setText(_employee.GetEmployeeAddress());
        txtPhone.setText(_employee.GetPhone());
        txtDOB.setText(_employee.GetDOB());
        txtPosition.setText(_employee.GetPosition());
        txtStatus.setText(_employee.GetStatus());
        txtSSS.setText(_employee.GetSSSNo());
        txtPhilhealth.setText(_employee.GetPhilhealthNo());
        txtTin.setText(_employee.GetTinNo());
        txtPagibig.setText(_employee.GetPagibigNo());
        txtsupervisor.setText(_employee.GetImmediateSupervisor());
        txtBasicSalary.setText(_employee.GetBasicSalary());
        txtRice.setText(_employee.GetRiceSubsidy());
        txtPhoneAllowance.setText(_employee.GetPhoneAllowance());
        txtClothingAllowance.setText(_employee.GetClothingAllowance());
        txtGross.setText(_employee.GetGrossSemiMonthlyRate());
        txtHourRate.setText(_employee.GetHourRate());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmployeeNo = new javax.swing.JLabel();
        txtEmployeeNo = new javax.swing.JTextField();
        lblemployName = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        lblEmployeeAddress = new javax.swing.JLabel();
        txtEmployeeAddress = new javax.swing.JTextField();
        btnSaveEmployee = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        lblEmployeePhone = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSSS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhilhealth = new javax.swing.JTextField();
        txtPagibig = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsupervisor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRice = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhoneAllowance = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtClothingAllowance = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHourRate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtGross = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtBasicSalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        lblEmployeeNo.setText("Employee No. :");

        txtEmployeeNo.setEditable(false);
        txtEmployeeNo.setBackground(new java.awt.Color(255, 255, 255));

        lblemployName.setText("Last Name:");

        txtLastname.setEditable(false);
        txtLastname.setBackground(new java.awt.Color(255, 255, 255));

        lblEmployeeAddress.setText("Employee Address:");

        txtEmployeeAddress.setEditable(false);
        txtEmployeeAddress.setBackground(new java.awt.Color(255, 255, 255));

        btnSaveEmployee.setText("Delete Employee Record");
        btnSaveEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteEmployee(evt);
            }
        });
        btnSaveEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FrameClose(evt);
            }
        });

        txtPhone.setEditable(false);
        txtPhone.setBackground(new java.awt.Color(255, 255, 255));

        lblEmployeePhone.setText("Phone:");

        lblDOB.setText("Date of Birth:");

        txtDOB.setEditable(false);
        txtDOB.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Position:");

        jLabel2.setText("Status:");

        txtPosition.setEditable(false);
        txtPosition.setBackground(new java.awt.Color(255, 255, 255));

        txtStatus.setEditable(false);
        txtStatus.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("SSS No.:");

        txtSSS.setEditable(false);
        txtSSS.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("PhilHealth No.:");

        jLabel5.setText("Pag-Ibig No.:");

        txtPhilhealth.setEditable(false);
        txtPhilhealth.setBackground(new java.awt.Color(255, 255, 255));

        txtPagibig.setEditable(false);
        txtPagibig.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        jLabel6.setText("First Name:");

        jLabel7.setText("Immediate Supervisor:");

        jLabel8.setText("Rice Subsidy:");

        jLabel9.setText("Phone Allowance:");

        jLabel10.setText("Clothing Allowance:");

        jLabel11.setText("TIN No.:");

        jLabel12.setText("Hourly Rate:");

        jLabel13.setText("Gross Semi Monthly Rate:");

        jLabel14.setText("Basic Salary:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmployeeNo)
                    .addComponent(lblemployName)
                    .addComponent(lblEmployeeAddress)
                    .addComponent(lblDOB)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtEmployeeNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeePhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtFirstname))
                        .addGap(52, 52, 52)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPhilhealth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txtSSS, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPosition, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPagibig))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtTin, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(txtGross, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtHourRate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(btnSaveEmployee)
                            .addGap(82, 82, 82)
                            .addComponent(btnClose))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(339, 339, 339)
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(txtClothingAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeNo)
                            .addComponent(txtEmployeeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmployeePhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblemployName)
                            .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmployeeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmployeeAddress))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtsupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhilhealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtPhoneAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPagibig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtClothingAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtHourRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtGross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnSaveEmployee))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FrameClose(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FrameClose
        this.dispose();
    }//GEN-LAST:event_FrameClose

    private void DeleteEmployee(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteEmployee
       
           Employee _employee = new Employee();
       
       _employee.SetEmployeeNo(txtEmployeeNo.getText());
        _employee.SetEmployeeLastName(txtLastname.getText());
        _employee.SetFirstName(txtFirstname.getText());
       _employee.SetEmployeeAddress(txtEmployeeAddress.getText());
        _employee.SetPhone(txtPhone.getText());
       _employee.SetDOB(txtDOB.getText());
       _employee.SetPosition(txtPosition.getText());
        _employee.SetStatus(txtStatus.getText());
       _employee.SetSSS(txtSSS.getText());
        _employee.SetPhilhealth(txtPhilhealth.getText());
       _employee.SetPagibig(txtPagibig.getText());
       _employee.SetTinNo(txtTin.getText());
        _employee.SetBasicSalary(txtBasicSalary.getText());
       _employee.SetRice(txtRice.getText());
       _employee.SetPhoneAllowance(txtPhoneAllowance.getText());
        _employee.SetClothingAllowance(txtClothingAllowance.getText());
       _employee.SetGrossSemiMonthlyRate(txtGross.getText());
        _employee.SetHourRate(txtHourRate.getText());
       _employee.SetSupervisor(txtsupervisor.getText());
         
        String csvFilename = "Employees.csv";
  
        try {
            
            _employee.DeleteEmployee(csvFilename);
            txtEmployeeNo.setText("");
        txtLastname.setText("");
        txtEmployeeAddress.setText("");
        txtPhone.setText("");
        txtDOB.setText("");
        txtPosition.setText("");
        txtStatus.setText("");
        txtSSS.setText("");
        txtPhilhealth.setText("");
        txtPagibig.setText("");
        txtFirstname.setText("");
        txtTin.setText("");
        txtsupervisor.setText("");
        txtBasicSalary.setText("");
        txtRice.setText("");
        txtPhoneAllowance.setText("");
        txtClothingAllowance.setText("");
        txtGross.setText("");
        txtHourRate.setText("");
            
        } catch (IOException | CsvValidationException ex){
            Logger.getLogger(FrmDeleteEmployee.class.getName()).log(Level.INFO, "An unexpected error occurred.", ex);
        }
        
    }//GEN-LAST:event_DeleteEmployee

    private void btnDelete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete
        // TODO add your handling code here:
                
       
    }//GEN-LAST:event_btnDelete

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
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSaveEmployee;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmployeeAddress;
    private javax.swing.JLabel lblEmployeeNo;
    private javax.swing.JLabel lblEmployeePhone;
    private javax.swing.JLabel lblemployName;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtClothingAllowance;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmployeeAddress;
    private javax.swing.JTextField txtEmployeeNo;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtGross;
    private javax.swing.JTextField txtHourRate;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPagibig;
    private javax.swing.JTextField txtPhilhealth;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhoneAllowance;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtRice;
    private javax.swing.JTextField txtSSS;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTin;
    private javax.swing.JTextField txtsupervisor;
    // End of variables declaration//GEN-END:variables
}
