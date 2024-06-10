
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class ViewDpt extends javax.swing.JFrame {
    PreparedStatement pst;
    Connection conn;
    ResultSet rs;

    /**
     * Creates new form ViewDept
     */
    public ViewDpt() {
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

        ViewDptPanel = new javax.swing.JPanel();
        ViewDpt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewDptTable = new javax.swing.JTable();
        BACK = new javax.swing.JButton();
        ViewAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewDptPanel.setBackground(new java.awt.Color(255, 255, 255));

        ViewDpt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ViewDpt.setForeground(new java.awt.Color(0, 102, 102));
        ViewDpt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ViewDpt.setText("View Department Details");
        ViewDpt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ViewDptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Department ID", "Department Name", "Designation"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ViewDptTable);

        BACK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        ViewAll.setBackground(new java.awt.Color(0, 102, 102));
        ViewAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewAll.setForeground(new java.awt.Color(255, 255, 255));
        ViewAll.setText("View All");
        ViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ViewDptPanelLayout = new javax.swing.GroupLayout(ViewDptPanel);
        ViewDptPanel.setLayout(ViewDptPanelLayout);
        ViewDptPanelLayout.setHorizontalGroup(
            ViewDptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDptPanelLayout.createSequentialGroup()
                .addGroup(ViewDptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ViewDpt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ViewDptPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewDptPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BACK)
                        .addGap(18, 18, 18)
                        .addComponent(ViewAll)))
                .addContainerGap())
        );
        ViewDptPanelLayout.setVerticalGroup(
            ViewDptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewDptPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ViewDpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ViewDptPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ViewDptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewDptPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
    HRAssistant java  = new HRAssistant();
            java.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_BACKActionPerformed

    private void ViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllActionPerformed
       try{
           String sql="SELECT * FROM department";
           pst = conn.prepareStatement(sql);
           rs = pst.executeQuery();
           DefaultTableModel model=(DefaultTableModel)ViewDptTable.getModel();
           model.setRowCount(0);
           if(rs.isBeforeFirst()){
               while(rs.next()){
                   model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3)});
               }
           }else{
              JOptionPane.showMessageDialog(this, "departments Record Not Found!");   
           }
        }catch (Exception ex){
            System.out.println("Error : " + ex.getMessage());            
        }
    }//GEN-LAST:event_ViewAllActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDpt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDpt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton ViewAll;
    private javax.swing.JLabel ViewDpt;
    private javax.swing.JPanel ViewDptPanel;
    private javax.swing.JTable ViewDptTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}