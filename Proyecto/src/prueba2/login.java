/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba2;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prueba1.Conexion;

public class login extends javax.swing.JFrame {
    Conexion cx;
    int idUsuario;
    public login() {
        initComponents();
        this.setTitle("Iniciar Sesión");
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon_login.png"));
        this.setIconImage(img);
        this.setLocationRelativeTo(null);
        cx=new Conexion("bdsocialsphere");
        cx.conectar();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        btnRegistrate = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(0, 51, 51));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_out.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 50, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("INICIAR SESIÓN");

        btnAcceder.setBackground(new java.awt.Color(0, 51, 51));
        btnAcceder.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_into.png"))); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        btnRegistrate.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistrate.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        btnRegistrate.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_signup.png"))); // NOI18N
        btnRegistrate.setText("Regístrate");
        btnRegistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrateActionPerformed(evt);
            }
        });

        txtContraseña.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Contraseña:");

        txtNombreUsuario.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Usuario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 590, 680));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        btnSalir1.setBackground(new java.awt.Color(0, 51, 51));
        btnSalir1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_exit.png"))); // NOI18N
        btnSalir1.setBorder(null);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        presentacion p = new presentacion();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        try {
            String usuario=txtNombreUsuario.getText();
            String contraseña=String.valueOf(txtContraseña.getPassword());
            String query="SELECT * FROM usuario WHERE nombreUsuario='"+usuario+"' and contraseña='"+contraseña+"'";
            Statement st=cx.conectar().createStatement();
            ResultSet rs=st.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(this, "EL USUARIO SÍ ESTÁ EN LA BASE DE DATOS");
                idUsuario = rs.getInt("idUsuario"); // Obtener el id del usuario
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso. ID de usuario: " + idUsuario);
                System.out.println("Inicio de sesion exitoso. ID de usuario: " + idUsuario);
                Muro Muro = new Muro(idUsuario);
                Muro.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "EL USUARIO NO ESTÁ EN LA BASE DE DATOS");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnRegistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrateActionPerformed
        this.setVisible(false);
        signUp su = new signUp();
        su.setVisible(true);
        su.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnRegistrateActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalir1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnRegistrate;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
