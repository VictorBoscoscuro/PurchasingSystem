/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchasingsystem.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import purchasingsystem.connections.MyConnectionPSDB;

/**
 *
 * @author victo
 */
public class UserMainForm extends javax.swing.JFrame {

    private Long id_username_login;
    
    public UserMainForm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public UserMainForm(Long id_username_login) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu principal");
        this.id_username_login = id_username_login;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAlertas = new javax.swing.JButton();
        btnNumAlerts = new javax.swing.JButton();
        btnInformesCC = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnArticulos = new javax.swing.JButton();
        backImgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlertas.setBackground(new java.awt.Color(255, 51, 51));
        btnAlertas.setFont(new java.awt.Font("Dubai", 1, 28)); // NOI18N
        btnAlertas.setForeground(new java.awt.Color(255, 255, 255));
        btnAlertas.setText("Alertas");
        btnAlertas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAlertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlertasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlertas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 40));

        btnNumAlerts.setBackground(new java.awt.Color(255, 153, 51));
        btnNumAlerts.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNumAlerts.setText("?");
        btnNumAlerts.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNumAlerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumAlertsActionPerformed(evt);
            }
        });
        jPanel1.add(btnNumAlerts, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 40, 30));

        btnInformesCC.setBackground(new java.awt.Color(51, 51, 255));
        btnInformesCC.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnInformesCC.setForeground(new java.awt.Color(255, 255, 255));
        btnInformesCC.setText("Informes CC");
        btnInformesCC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInformesCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformesCCActionPerformed(evt);
            }
        });
        jPanel1.add(btnInformesCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 170, 60));

        btnProveedores.setBackground(new java.awt.Color(51, 51, 255));
        btnProveedores.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 170, 60));

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/purchasingsystem/img/back-ico.png"))); // NOI18N
        btnBack.setText("   Volver");
        btnBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 130, 40));

        btnArticulos.setBackground(new java.awt.Color(51, 51, 255));
        btnArticulos.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        btnArticulos.setForeground(new java.awt.Color(255, 255, 255));
        btnArticulos.setText("Artículos");
        btnArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 170, 60));

        backImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/purchasingsystem/img/backMain.jpg"))); // NOI18N
        backImgLabel.setMaximumSize(new java.awt.Dimension(1000, 600));
        backImgLabel.setMinimumSize(new java.awt.Dimension(1000, 600));
        backImgLabel.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.add(backImgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1030, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlertasActionPerformed

    private void btnNumAlertsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumAlertsActionPerformed
        String sql = "SELECT COUNT(id_user) AS cantidad_usuarios FROM users;";
        PreparedStatement ps = null;
        ResultSet rs = null;
        MyConnectionPSDB mycon = new MyConnectionPSDB();
        Connection con = mycon.getMyConnection();
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                int cantidad_alertas = rs.getInt("cantidad_usuarios");
                JOptionPane.showMessageDialog(null, "Hay "+cantidad_alertas+ " alertas activas");
                       
            } else System.out.println("No funca");
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "SQL Error");
        } finally {
            try{
                rs.close(); 
            } catch(Exception e){}
            try{
                ps.close();
            } catch(Exception e) {}
            try{
                con.close();
            } catch(Exception e){}
        }
    }//GEN-LAST:event_btnNumAlertsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminChooseForm form = new AdminChooseForm(id_username_login);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInformesCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformesCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInformesCCActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

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
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backImgLabel;
    private javax.swing.JButton btnAlertas;
    private javax.swing.JButton btnArticulos;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInformesCC;
    private javax.swing.JButton btnNumAlerts;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
