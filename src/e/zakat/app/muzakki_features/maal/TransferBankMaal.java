 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.zakat.app.muzakki_features.maal;

import e.zakat.app.KoneksiDB;
import e.zakat.app.auth_screen.muzakki.*;
import e.zakat.app.initial_screen.ChooseRoles;
import e.zakat.app.muzakki_features.HomePageMuzakki;
import java.awt.Image;
import java.awt.Toolkit; 
import java.sql.*;  
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author bagus
 */
public class TransferBankMaal extends javax.swing.JFrame {
    public static String phone_number;
    /**
     * Creates new form LoginMuzakki
     */
    public TransferBankMaal() throws SQLException {
        initComponents();
        ChoosenMosqueLabel.setText(ChooseMosqueMaal.choosenMosque);
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-payment2.png")));
    
     Connection hubung = (Connection)KoneksiDB.configDB();
     Statement stm = hubung.createStatement(); 
     String sql_mosque = "SELECT * FROM mosque where name = '"+ ChooseMosqueMaal.choosenMosque + "'; ";
     ResultSet result_mosque = stm.executeQuery(sql_mosque);
     if(result_mosque.next()){
     phone_number = result_mosque.getString("phone_number");
     NamaAmilZakatLabel.setText("A/N " + result_mosque.getString("contact_person") + " (" + phone_number + ")" );
     AlamatAmilZakatLabel.setText(result_mosque.getString("address") + " " + result_mosque.getString("region") + " " + result_mosque.getString("postalcode"));
     NoRekBCA.setText(result_mosque.getString("bca_account_number") + " (Bank BCA)");
     NoRekBNI.setText(result_mosque.getString("bni_account_number") + " (Bank BNI)");
     NoRekMandiri.setText(result_mosque.getString("mandiri_account_number") + " (Bank Mandiri)");
     }
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
        btn_confirm_pay = new javax.swing.JButton();
        IconLabel = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        CopyrightLabel = new javax.swing.JLabel();
        AlamatLabel = new javax.swing.JLabel();
        AlamatLabel1 = new javax.swing.JLabel();
        MoqsueLabel = new javax.swing.JLabel();
        ChoosenMosqueLabel = new javax.swing.JLabel();
        AlamatLabel3 = new javax.swing.JLabel();
        AlamatLabel2 = new javax.swing.JLabel();
        AlamatLabel4 = new javax.swing.JLabel();
        AlamatLabel5 = new javax.swing.JLabel();
        AlamatLabel6 = new javax.swing.JLabel();
        AlamatLabel7 = new javax.swing.JLabel();
        NoRekBNI = new javax.swing.JLabel();
        NamaAmilZakatLabel = new javax.swing.JLabel();
        AlamatAmilZakatLabel = new javax.swing.JLabel();
        NoRekMandiri = new javax.swing.JLabel();
        NoRekBCA = new javax.swing.JLabel();
        NoHpAmilZakatLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer Bank Information");
        setBackground(new java.awt.Color(238, 238, 238));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-app.png")));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel1.setText("é-Zakat - Zakat Maal");

        btn_confirm_pay.setBackground(new java.awt.Color(24, 152, 139));
        btn_confirm_pay.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btn_confirm_pay.setForeground(new java.awt.Color(238, 238, 238));
        btn_confirm_pay.setText("Ya, saya sudah bayar");
        btn_confirm_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirm_payActionPerformed(evt);
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

        AlamatLabel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        AlamatLabel.setText("Informasi Pembayaran Bank Transfer");

        AlamatLabel1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AlamatLabel1.setText("Narahubung");

        MoqsueLabel.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        MoqsueLabel.setText("Masjid Pilihan :");

        ChoosenMosqueLabel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        ChoosenMosqueLabel.setText("masjid_piilihan");

        AlamatLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        AlamatLabel3.setText("Informasi Terkait :");

        AlamatLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AlamatLabel2.setText("Nomor Rekening");

        AlamatLabel4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AlamatLabel4.setText("Alamat Masjid");

        AlamatLabel5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AlamatLabel5.setText(":");

        AlamatLabel6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AlamatLabel6.setText(":");

        AlamatLabel7.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AlamatLabel7.setText(":");

        NoRekBNI.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        NoRekBNI.setText("9023847598 (Bank BRI Syariah)");

        NamaAmilZakatLabel.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        NamaAmilZakatLabel.setText("A/N Nikita Sabila (08123456789)");

        AlamatAmilZakatLabel.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        AlamatAmilZakatLabel.setText("Jl. A.H Nasution No.177, Kec. Ujung Berung 40386");

        NoRekMandiri.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        NoRekMandiri.setText("9023847598 (Bank BNI)");

        NoRekBCA.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        NoRekBCA.setText("9023847598 (Bank BCA)");

        NoHpAmilZakatLabel4.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        NoHpAmilZakatLabel4.setText("<html>Pembayaran akan diverifikasi secara manual oleh admin maksimal 30 menit,<br>jika melebihi batas waktu, silahkan hubungi narahubung</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(AlamatLabel)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MoqsueLabel)
                                .addGap(18, 18, 18)
                                .addComponent(ChoosenMosqueLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(AlamatLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AlamatLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(AlamatLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AlamatLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(AlamatLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(AlamatLabel7))))
                                    .addComponent(AlamatLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NamaAmilZakatLabel)
                                    .addComponent(NoRekMandiri)
                                    .addComponent(NoRekBNI)
                                    .addComponent(NoRekBCA)
                                    .addComponent(AlamatAmilZakatLabel))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(NoHpAmilZakatLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(416, 416, 416)
                        .addComponent(btn_confirm_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlamatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MoqsueLabel)
                            .addComponent(ChoosenMosqueLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AlamatLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlamatLabel1)
                            .addComponent(AlamatLabel5)
                            .addComponent(NamaAmilZakatLabel))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlamatLabel4)
                            .addComponent(AlamatLabel6)
                            .addComponent(AlamatAmilZakatLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlamatLabel2)
                            .addComponent(AlamatLabel7)
                            .addComponent(NoRekBCA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoRekBNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoRekMandiri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(NoHpAmilZakatLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_confirm_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        ChoosePaymentMaal choosePaymentMaal = new ChoosePaymentMaal();
        this.dispose();
        choosePaymentMaal.show();
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_confirm_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirm_payActionPerformed
        // TODO add your handling code here:
        
        try {
            String success = "Sukses";
            String sql_history = "INSERT INTO zakat_history(type_zakat, nominal, mosque, phone_number, status, date) VALUES ('" + HomePageMuzakki.choosenMenu + "', '" + OutputZakatMaal.nominal + "', '" + ChooseMosqueMaal.choosenMosque + "', '" + phone_number + "', '" + success +"', NOW());";
            System.out.println(sql_history);
            Connection hubung = (Connection)KoneksiDB.configDB();
            Statement stm = hubung.createStatement();
            int x = stm.executeUpdate(sql_history);
            if (x != 0) {
                PaymentSuccessMaal paymentSuccessMaal = new PaymentSuccessMaal();
                this.dispose();
                paymentSuccessMaal.show();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.toString());
        }
        
    }//GEN-LAST:event_btn_confirm_payActionPerformed

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
            java.util.logging.Logger.getLogger(TransferBankMaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferBankMaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferBankMaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferBankMaal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TransferBankMaal().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TransferBankMaal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlamatAmilZakatLabel;
    private javax.swing.JLabel AlamatLabel;
    private javax.swing.JLabel AlamatLabel1;
    private javax.swing.JLabel AlamatLabel2;
    private javax.swing.JLabel AlamatLabel3;
    private javax.swing.JLabel AlamatLabel4;
    private javax.swing.JLabel AlamatLabel5;
    private javax.swing.JLabel AlamatLabel6;
    private javax.swing.JLabel AlamatLabel7;
    private javax.swing.JLabel ChoosenMosqueLabel;
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JLabel IconLabel;
    private javax.swing.JLabel MoqsueLabel;
    private javax.swing.JLabel NamaAmilZakatLabel;
    private javax.swing.JLabel NoHpAmilZakatLabel4;
    private javax.swing.JLabel NoRekBCA;
    private javax.swing.JLabel NoRekBNI;
    private javax.swing.JLabel NoRekMandiri;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_confirm_pay;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
