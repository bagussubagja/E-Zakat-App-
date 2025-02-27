 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.zakat.app.muzakki_features;

import e.zakat.app.auth_screen.muzakki.*;
import e.zakat.app.initial_screen.ChooseRoles;
import e.zakat.app.muzakki_features.fitrah.ChooseMosqueFitrah;
import e.zakat.app.muzakki_features.history.HistoryTransactionMuzakki;
import e.zakat.app.muzakki_features.maal.ChooseMosqueMaal;
import e.zakat.app.muzakki_features.kalkulator.InputSalaryZakat;
import e.zakat.app.muzakki_updateprofile.UpdateMuzakki;
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
public class HomePageMuzakki extends javax.swing.JFrame {
    public static String choosenMenu;
    
    /**
     * Creates new form LoginMuzakki
     */
    public HomePageMuzakki() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-homepage.png")));
    
    Image img1 = myimage.getImage();
    Image img2 = img1.getScaledInstance(IconLabel.getWidth(), IconLabel.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon i = new ImageIcon(img2);
    
    IconLabel.setIcon(i);
    UsernameLabel.setText(LoginMuzakki.name);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_select_menu = new javax.swing.JButton();
        IconLabel = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        CopyrightLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        radio_zakat_maal = new javax.swing.JRadioButton();
        radio_riwayat_transaksi = new javax.swing.JRadioButton();
        radio_zakat_fitrah = new javax.swing.JRadioButton();
        radio_kalkulator_zakat1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page Muzakki");
        setBackground(new java.awt.Color(238, 238, 238));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-app.png")));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel1.setText("é-Zakat - Muzakki");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel2.setText("Selamat datang, ");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        jLabel3.setText("Menu Utama");

        btn_select_menu.setBackground(new java.awt.Color(24, 152, 139));
        btn_select_menu.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btn_select_menu.setForeground(new java.awt.Color(238, 238, 238));
        btn_select_menu.setText("Pilih Menu");
        btn_select_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_select_menuActionPerformed(evt);
            }
        });

        IconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconLabelMouseClicked(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(221, 221, 221));
        btn_exit.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        btn_exit.setText("Keluar");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        UsernameLabel.setText("Alif Ilman Nurrohman");

        buttonGroup1.add(radio_zakat_maal);
        radio_zakat_maal.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        radio_zakat_maal.setText("Bayar Zakat Maal");
        radio_zakat_maal.setIconTextGap(10);
        radio_zakat_maal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_zakat_maalActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_riwayat_transaksi);
        radio_riwayat_transaksi.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        radio_riwayat_transaksi.setText("Riwayat Transaksi");
        radio_riwayat_transaksi.setIconTextGap(10);
        radio_riwayat_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_riwayat_transaksiActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_zakat_fitrah);
        radio_zakat_fitrah.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        radio_zakat_fitrah.setText("Bayar Zakat Fitrah");
        radio_zakat_fitrah.setIconTextGap(10);
        radio_zakat_fitrah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_zakat_fitrahActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_kalkulator_zakat1);
        radio_kalkulator_zakat1.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        radio_kalkulator_zakat1.setText("Kalkulator Zakat");
        radio_kalkulator_zakat1.setIconTextGap(10);
        radio_kalkulator_zakat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_kalkulator_zakat1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel4.setText("Klik Icon Ka'bah untuk Edit Profil!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsernameLabel))
                    .addComponent(radio_zakat_maal)
                    .addComponent(radio_zakat_fitrah)
                    .addComponent(radio_riwayat_transaksi)
                    .addComponent(radio_kalkulator_zakat1))
                .addContainerGap(365, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(492, 492, 492))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_select_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(464, 464, 464))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UsernameLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_zakat_maal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_zakat_fitrah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_kalkulator_zakat1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio_riwayat_transaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_select_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98)))
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_select_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_select_menuActionPerformed
        // TODO add your handling code here:
        InputSalaryZakat inputSalaryZakat = new InputSalaryZakat();
        ChooseMosqueMaal chooseMosqueMaal = new ChooseMosqueMaal();
        ChooseMosqueFitrah chooseMosqueFitrah = new ChooseMosqueFitrah();
        HistoryTransactionMuzakki historyTransactionMuzakki = new HistoryTransactionMuzakki();
        
        if(radio_zakat_maal.isSelected()){
        this.dispose();
        choosenMenu = "Zakat Maal";
            System.out.println("Menu Pilihan : '"+choosenMenu+"'");
        chooseMosqueMaal.show();
        }else if(radio_zakat_fitrah.isSelected()){
        this.dispose();
        choosenMenu = "Zakat Fitrah";
        System.out.println("Menu Pilihan : '"+choosenMenu+"'");
        chooseMosqueFitrah.show();
        }else if(radio_kalkulator_zakat1.isSelected()){
        this.dispose();
        inputSalaryZakat.show();
        }else if(radio_riwayat_transaksi.isSelected()){
        this.dispose();
        historyTransactionMuzakki.show();
        }
        
    }//GEN-LAST:event_btn_select_menuActionPerformed

    private void radio_zakat_maalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_zakat_maalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_zakat_maalActionPerformed

    private void radio_riwayat_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_riwayat_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_riwayat_transaksiActionPerformed

    private void radio_zakat_fitrahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_zakat_fitrahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_zakat_fitrahActionPerformed

    private void radio_kalkulator_zakat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_kalkulator_zakat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_kalkulator_zakat1ActionPerformed

    private void IconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconLabelMouseClicked
        // TODO add your handling code here:
        UpdateMuzakki updateMuzakki = null;
        try {
            updateMuzakki = new UpdateMuzakki();
        } catch (SQLException ex) {
            Logger.getLogger(HomePageMuzakki.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        updateMuzakki.show();
    }//GEN-LAST:event_IconLabelMouseClicked

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
            java.util.logging.Logger.getLogger(HomePageMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageMuzakki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JLabel IconLabel;
    public javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_select_menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton radio_kalkulator_zakat1;
    private javax.swing.JRadioButton radio_riwayat_transaksi;
    private javax.swing.JRadioButton radio_zakat_fitrah;
    private javax.swing.JRadioButton radio_zakat_maal;
    // End of variables declaration//GEN-END:variables
}
