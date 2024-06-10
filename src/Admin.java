
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class Admin extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
   

    /**
     * Creates new form CreateAcc
     */
    public Admin() {
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
    
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminPanel = new javax.swing.JPanel();
        CreateAcc = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        FNTxt = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PWTxt = new javax.swing.JPasswordField();
        CREATE = new javax.swing.JButton();
        Role = new javax.swing.JComboBox<>();
        JobTitle = new javax.swing.JLabel();
        UNTxt = new javax.swing.JTextField();
        DELETE = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        CreateAcc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CreateAcc.setForeground(new java.awt.Color(0, 102, 102));
        CreateAcc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateAcc.setText("Create Account");

        FullName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FullName.setText("FullName");

        UserName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UserName.setText("UserName");

        Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Password.setText("Password");

        PWTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWTxtActionPerformed(evt);
            }
        });

        CREATE.setBackground(new java.awt.Color(0, 102, 102));
        CREATE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CREATE.setForeground(new java.awt.Color(255, 255, 255));
        CREATE.setText("CREATE");
        CREATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEActionPerformed(evt);
            }
        });

        Role.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR Manager", "HR Assistant" }));

        JobTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JobTitle.setText("JobTitle");

        DELETE.setBackground(new java.awt.Color(255, 51, 51));
        DELETE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        BACK.setText("<");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(UserName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FNTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FullName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PWTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                .addComponent(JobTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UNTxt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CREATE)
                                    .addComponent(DELETE)))))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BACK)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(CreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BACK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UNTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PWTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JobTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CREATE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CREATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEActionPerformed
try {
    String fullname = FNTxt.getText();
    String username = UNTxt.getText();
    String password = PWTxt.getText();
    String jobtitle = (String) Role.getSelectedItem();

    String sql = "INSERT INTO createacc (fullname, username, password, jobtitle) VALUES (?, ?, ?, ?)";
    pst = conn.prepareStatement(sql);

    pst.setString(1, fullname);
    pst.setString(2, username);
    pst.setString(3, password);
    pst.setString(4, jobtitle);

    if (pst.executeUpdate() > 0) {
        JOptionPane.showMessageDialog(this, "User Record Inserted");
    }

} catch (HeadlessException | SQLException ex) {
    System.out.println("Error : " + ex.getMessage());
}
    }//GEN-LAST:event_CREATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        try {
    String username = UNTxt.getText();

    String sql = "DELETE FROM createacc WHERE username=?";
    pst = conn.prepareStatement(sql);

    pst.setString(1, username);

    if (pst.executeUpdate() > 0) {
        JOptionPane.showMessageDialog(this, "User Record Deleted");
    }

} catch (HeadlessException | SQLException ex) {
    System.out.println("Error : " + ex.getMessage());
}
    }//GEN-LAST:event_DELETEActionPerformed

    private void PWTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PWTxtActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        Login java  = new Login();
            java.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_BACKActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JButton BACK;
    private javax.swing.JButton CREATE;
    private javax.swing.JLabel CreateAcc;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField FNTxt;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel JobTitle;
    private javax.swing.JPasswordField PWTxt;
    private javax.swing.JLabel Password;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JTextField UNTxt;
    private javax.swing.JLabel UserName;
    // End of variables declaration//GEN-END:variables
}
