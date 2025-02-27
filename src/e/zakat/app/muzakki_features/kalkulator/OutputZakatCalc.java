 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.zakat.app.muzakki_features.kalkulator;

import e.zakat.app.muzakki_features.maal.*;
import e.zakat.app.auth_screen.muzakki.*;
import e.zakat.app.initial_screen.ChooseRoles;
import java.awt.Image;
import java.awt.Toolkit; 
import java.sql.*;  
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author bagus
 */
public class OutputZakatCalc extends javax.swing.JFrame {

    /**
     * Creates new form LoginMuzakki
     */
    public OutputZakatCalc() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-output-zakat.png")));
    
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
        IconLabel = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        CopyrightLabel = new javax.swing.JLabel();
        AlamatLabel1 = new javax.swing.JLabel();
        ZakatLabel = new javax.swing.JLabel();
        AlamatLabel = new javax.swing.JLabel();
        AlamatLabel2 = new javax.swing.JLabel();
        AlamatLabel3 = new javax.swing.JLabel();
        SalaryInputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Output Kalkulator Zakat");
        setBackground(new java.awt.Color(238, 238, 238));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-app.png")));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel1.setText("é-Zakat - Kalkulator Zakat");

        btn_back.setBackground(new java.awt.Color(221, 221, 221));
        btn_back.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        btn_back.setText("Kembali");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        AlamatLabel1.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        AlamatLabel1.setText("<html>Berdasarkan Peraturan Menteri Agama Nomor 31 tahun 2019, kadar zakat yang<br>harus dikeluarkan adalah sebesar 2.5% dari total pendapatan selama sebulan</html>");

        ZakatLabel.setFont(new java.awt.Font("Poppins Medium", 0, 64)); // NOI18N
        ZakatLabel.setText("0");

        AlamatLabel.setBackground(new java.awt.Color(170, 170, 170));
        AlamatLabel.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        AlamatLabel.setText("Ketahui besaran zakatmu!");

        AlamatLabel2.setBackground(new java.awt.Color(170, 170, 170));
        AlamatLabel2.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        AlamatLabel2.setText("Pendapatan per bulan");

        AlamatLabel3.setBackground(new java.awt.Color(170, 170, 170));
        AlamatLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        AlamatLabel3.setText("Jumlah zakat Anda per bulan");

        SalaryInputLabel.setBackground(new java.awt.Color(170, 170, 170));
        SalaryInputLabel.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        SalaryInputLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AlamatLabel)
                        .addGap(57, 57, 57)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(AlamatLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AlamatLabel2)
                                .addGap(42, 42, 42)
                                .addComponent(SalaryInputLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AlamatLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ZakatLabel)))))
                .addGap(0, 120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlamatLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(AlamatLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(AlamatLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZakatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlamatLabel2)
                            .addComponent(SalaryInputLabel))
                        .addGap(44, 44, 44)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(IconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)))
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        InputSalaryZakat inputSalaryZakat = new InputSalaryZakat();
        this.dispose();
        inputSalaryZakat.show();
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(OutputZakatCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputZakatCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputZakatCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputZakatCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutputZakatCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlamatLabel;
    private javax.swing.JLabel AlamatLabel1;
    private javax.swing.JLabel AlamatLabel2;
    private javax.swing.JLabel AlamatLabel3;
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JLabel IconLabel;
    public javax.swing.JLabel SalaryInputLabel;
    public javax.swing.JLabel ZakatLabel;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
