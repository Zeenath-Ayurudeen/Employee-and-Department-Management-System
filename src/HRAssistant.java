/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class HRAssistant extends javax.swing.JFrame {

    /**
     * Creates new form HRAssistant
     */
    public HRAssistant() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HRAssistantPanel = new javax.swing.JPanel();
        ViewDept = new javax.swing.JButton();
        ViewEmp = new javax.swing.JButton();
        HRAssistant = new javax.swing.JLabel();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HRAssistantPanel.setBackground(new java.awt.Color(255, 255, 255));

        ViewDept.setBackground(new java.awt.Color(0, 102, 102));
        ViewDept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewDept.setForeground(new java.awt.Color(255, 255, 255));
        ViewDept.setText("<html>\n<center>View</center><center>Department</center><center>Details</center>\n</html>");
        ViewDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDeptActionPerformed(evt);
            }
        });

        ViewEmp.setBackground(new java.awt.Color(0, 102, 102));
        ViewEmp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        ViewEmp.setText("<html><center>View</center><center>Employee</center><center>Details</cente r> </html>");
        ViewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewEmpActionPerformed(evt);
            }
        });

        HRAssistant.setBackground(new java.awt.Color(255, 255, 255));
        HRAssistant.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        HRAssistant.setForeground(new java.awt.Color(0, 102, 102));
        HRAssistant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HRAssistant.setText("HR Assistant Home");

        BACK.setText("<");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HRAssistantPanelLayout = new javax.swing.GroupLayout(HRAssistantPanel);
        HRAssistantPanel.setLayout(HRAssistantPanelLayout);
        HRAssistantPanelLayout.setHorizontalGroup(
            HRAssistantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRAssistantPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HRAssistantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HRAssistantPanelLayout.createSequentialGroup()
                        .addComponent(ViewDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(ViewEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HRAssistantPanelLayout.createSequentialGroup()
                        .addComponent(BACK)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(HRAssistant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        HRAssistantPanelLayout.setVerticalGroup(
            HRAssistantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HRAssistantPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BACK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HRAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(HRAssistantPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewDept, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRAssistantPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HRAssistantPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDeptActionPerformed
        {setVisible(false);
            ViewDpt department=new ViewDpt();
            department.setVisible(true);       }
    }//GEN-LAST:event_ViewDeptActionPerformed

    private void ViewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewEmpActionPerformed
        {setVisible(false);
            ViewEmp employee=new ViewEmp();
            employee.setVisible(true);}
    }//GEN-LAST:event_ViewEmpActionPerformed

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
            java.util.logging.Logger.getLogger(HRAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRAssistant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JLabel HRAssistant;
    private javax.swing.JPanel HRAssistantPanel;
    private javax.swing.JButton ViewDept;
    private javax.swing.JButton ViewEmp;
    // End of variables declaration//GEN-END:variables
}