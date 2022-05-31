/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.zakat.app.auth_screen.amilzakat;

import e.zakat.app.KoneksiDB;
import e.zakat.app.auth_screen.muzakki.RegisterSuccessMuzakki;
import e.zakat.app.initial_screen.ChooseRoles;
import e.zakat.app.muzakki_features.HomePageMuzakki;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.*;  
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author bagus
 */
public class RegisterAmilZakat extends javax.swing.JFrame {

    /**
     * Creates new form RegisterAmilZakat
     */
    public RegisterAmilZakat() {
        initComponents();
        
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/auth-logo2.png")));
    
    Image img1 = myimage.getImage();
    Image img2 = img1.getScaledInstance(IconLabel.getWidth(), IconLabel.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon i = new ImageIcon(img2);
    
    IconLabel.setIcon(i);
    ImageIcon myimage2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-copyright.png")));
    
    Image img3 = myimage2.getImage();
    Image img4 = img3.getScaledInstance(CopyrightLabel.getWidth(), CopyrightLabel.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon j = new ImageIcon(img4);
    
    CopyrightLabel.setIcon(j);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IconLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edtAlamat = new javax.swing.JTextField();
        edtNama = new javax.swing.JTextField();
        edtKodePos = new javax.swing.JTextField();
        edtUsername = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        CopyrightLabel = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        edtPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        edtRegion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel1.setText("Daftar - é-Zakat");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Peran - Amil Zakat");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel3.setText("Nama Masjid");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel6.setText("Kode Pos");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel7.setText("Username");

        edtAlamat.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N

        edtNama.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        edtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNamaActionPerformed(evt);
            }
        });

        edtKodePos.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N

        edtUsername.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N

        btnRegister.setBackground(new java.awt.Color(24, 152, 139));
        btnRegister.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(238, 238, 238));
        btnRegister.setText("Daftar Sekarang");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(221, 221, 221));
        btn_back.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        btn_back.setText("Kembali");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        edtPassword.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        edtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPasswordActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel8.setText("Wilayah");

        edtRegion.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        edtRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtRegionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1168, Short.MAX_VALUE)
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(531, 531, 531)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(edtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(85, 85, 85)
                                        .addComponent(edtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(edtKodePos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IconLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtKodePos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CopyrightLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNamaActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        RegisterSuccessAmilZakat amilZakat = new RegisterSuccessAmilZakat();
        int id;
        String nama_masjid = edtNama.getText();
        String alamat = edtAlamat.getText();
        String kodePos = edtKodePos.getText();
        String username = edtUsername.getText();
        String password = edtPassword.getText();
        String wilayah = edtRegion.getText();
        String msg = "" + nama_masjid;

        try {
           

            String query = "INSERT INTO users_amilzakat(name, address, postalcode, username, password, region) VALUES ('" + nama_masjid + "', '" + alamat + "', '" + kodePos + "', '" + username + "', '" + password +"', '" + wilayah +"');";

            Connection hubung = (Connection)KoneksiDB.configDB();
            Statement stm = hubung.createStatement();

            int x = stm.executeUpdate(query);
            if (x == 0) {
                        JOptionPane.showMessageDialog(btnRegister, "Akun sudah ada!");
                    } else {
                        this.dispose();
                        amilZakat.show();
                    }
                    hubung.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        ChooseRoles chooseRoles = new ChooseRoles();
        this.dispose();
        chooseRoles.show();
    }//GEN-LAST:event_btn_backActionPerformed

    private void edtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPasswordActionPerformed

    private void edtRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtRegionActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAmilZakat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btn_back;
    private javax.swing.JTextField edtAlamat;
    private javax.swing.JTextField edtKodePos;
    private javax.swing.JTextField edtNama;
    private javax.swing.JTextField edtPassword;
    private javax.swing.JTextField edtRegion;
    private javax.swing.JTextField edtUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
