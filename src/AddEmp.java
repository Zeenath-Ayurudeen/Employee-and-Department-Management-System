import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */

public class AddEmp extends javax.swing.JFrame {
    PreparedStatement pst;
    Connection conn;

    /**
     * Creates new form AddEmp
     */
    public AddEmp() {
        initComponents();
        try {
    String url = "jdbc:mysql://localhost/oop_assignment";
    String user = "root";
    String password = "";


    conn = DriverManager.getConnection(url, user, password);
    System.out.println("Connected!conn...");
    } catch (Exception ex) {
    System.out.println("Error : " + ex.getMessage());
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddEmpPanel = new javax.swing.JPanel();
        AddEmp = new javax.swing.JLabel();
        EmpID = new javax.swing.JLabel();
        EPFNOTxt = new javax.swing.JTextField();
        EmpName = new javax.swing.JLabel();
        EmpNameTxt = new javax.swing.JTextField();
        Dpt = new javax.swing.JLabel();
        DptTxt = new javax.swing.JTextField();
        Designation = new javax.swing.JLabel();
        DesignationTxt = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        CNOTxt = new javax.swing.JTextField();
        CLEAR = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        EPFNo = new javax.swing.JLabel();
        EmpIDTxt = new javax.swing.JTextField();
        ContactNo = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        AddressTxt = new javax.swing.JTextField();
        DOBTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddEmpPanel.setBackground(new java.awt.Color(255, 255, 255));

        AddEmp.setBackground(new java.awt.Color(255, 255, 255));
        AddEmp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AddEmp.setForeground(new java.awt.Color(0, 102, 102));
        AddEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddEmp.setText("Add Employee");

        EmpID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmpID.setText("Employee ID");

        EPFNOTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        EmpName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmpName.setText("Employee Name");

        EmpNameTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        Dpt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Dpt.setText("Department");

        DptTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        Designation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Designation.setText("Designation");

        DesignationTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        Address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Address.setText("Address");

        CNOTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        CLEAR.setBackground(new java.awt.Color(255, 51, 51));
        CLEAR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CLEAR.setForeground(new java.awt.Color(255, 255, 255));
        CLEAR.setText("CLEAR");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        ADD.setBackground(new java.awt.Color(0, 102, 102));
        ADD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        BACK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        EPFNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EPFNo.setText("EPF No.");

        EmpIDTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        ContactNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ContactNo.setText("Contact No.");

        DOB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DOB.setText("DOB");
        DOB.setToolTipText("");

        AddressTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        DOBTxt.setSelectionColor(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout AddEmpPanelLayout = new javax.swing.GroupLayout(AddEmpPanel);
        AddEmpPanel.setLayout(AddEmpPanelLayout);
        AddEmpPanelLayout.setHorizontalGroup(
            AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddEmpPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddEmpPanelLayout.createSequentialGroup()
                        .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DptTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dpt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Designation, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DesignationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EPFNo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EPFNOTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CNOTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddEmpPanelLayout.createSequentialGroup()
                        .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        AddEmpPanelLayout.setVerticalGroup(
            AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddEmpPanelLayout.createSequentialGroup()
                .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpID)
                    .addComponent(EPFNo))
                .addGap(6, 6, 6)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EPFNOTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpName)
                    .addComponent(Address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dpt)
                    .addComponent(DOB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DptTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOBTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Designation)
                    .addComponent(ContactNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesignationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNOTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLEAR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddEmpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
    HRManager java  = new HRManager();
            java.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_BACKActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
                try {
       String employeeid = EmpIDTxt.getText();        
       String employeename = EmpNameTxt.getText();
       String department = DptTxt.getText();
       String designation = DesignationTxt.getText();
       String epfno = EPFNOTxt.getText();
       String address = AddressTxt.getText();
       String age = DOBTxt.getText();
       String contactno =CNOTxt.getText();
       
       String sql = "INSERT INTO employee VALUES(?,?,?,?,?,?,?,?)";
      
       pst = conn.prepareStatement(sql);

       pst.setString(1, employeeid);
       pst.setString(2, employeename);
       pst.setString(3, department);
       pst.setString(4, designation);
       pst.setString(5, epfno);
       pst.setString(6, address);
       pst.setString(7, age);
       pst.setString(8, contactno);
        if (pst.executeUpdate() > 0) {
        JOptionPane.showMessageDialog(this, "Employee Record Inserted");
        
         }
    
    }
        catch (HeadlessException | SQLException ex) {
        System.out.println("Error : " + ex.getMessage());
            }

    }//GEN-LAST:event_ADDActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
    EmpIDTxt.setText("");
    EmpNameTxt.setText("");
    DptTxt.setText("");
    DesignationTxt.setText("");
    EPFNOTxt.setText("");
    AddressTxt.setText("");
    DOBTxt.setText("");
    CNOTxt.setText("");
    }//GEN-LAST:event_CLEARActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JLabel AddEmp;
    private javax.swing.JPanel AddEmpPanel;
    private javax.swing.JLabel Address;
    private javax.swing.JTextField AddressTxt;
    private javax.swing.JButton BACK;
    private javax.swing.JButton CLEAR;
    private javax.swing.JTextField CNOTxt;
    private javax.swing.JLabel ContactNo;
    private javax.swing.JLabel DOB;
    private javax.swing.JTextField DOBTxt;
    private javax.swing.JLabel Designation;
    private javax.swing.JTextField DesignationTxt;
    private javax.swing.JLabel Dpt;
    private javax.swing.JTextField DptTxt;
    private javax.swing.JTextField EPFNOTxt;
    private javax.swing.JLabel EPFNo;
    private javax.swing.JLabel EmpID;
    private javax.swing.JTextField EmpIDTxt;
    private javax.swing.JLabel EmpName;
    private javax.swing.JTextField EmpNameTxt;
    // End of variables declaration//GEN-END:variables
}
