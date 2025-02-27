/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.zakat.app.AmilZakat_Features.DataAntrian;

import e.zakat.app.AmilZakat_Features.DataTransaksi.DataTransaksiMaal_AmilZakat;
import e.zakat.app.KoneksiDB;
import e.zakat.app.auth_screen.amilzakat.LoginAmilZakat;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author bagus
 */
public class TampilkanDataFitrah_AmilZakat extends javax.swing.JFrame {

    /**
     * Creates new form TampilkanDataFitrah_AmilZakat
     */
    public TampilkanDataFitrah_AmilZakat() {
        initComponents();
        display_table();
        UsernameLabel.setText(LoginAmilZakat.mosqueName);
    
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
        UsernameLabel = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_data_fitrah = new javax.swing.JTable();
        CopyrightLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tampil Data Fitrah");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-app.png")));
        setPreferredSize(new java.awt.Dimension(1280, 720));

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel1.setText("é-Zakat - Riwayat Pembayaran Zakat");

        UsernameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        UsernameLabel.setText("Alif Ilman Nurrohman");

        btn_back.setBackground(new java.awt.Color(221, 221, 221));
        btn_back.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        btn_back.setText("Kembali");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        table_data_fitrah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Lengkap", "Alamat", "Waktu Antrian", "Kode Pos"
            }
        ));
        jScrollPane1.setViewportView(table_data_fitrah);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(357, 357, 357)
                        .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UsernameLabel)
                        .addGap(476, 476, 476))))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameLabel)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        DataTransaksiFitrah_AmilZakat fitrah_AmilZakat = new DataTransaksiFitrah_AmilZakat();
        this.dispose();
        fitrah_AmilZakat.show();
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
            java.util.logging.Logger.getLogger(TampilkanDataFitrah_AmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilkanDataFitrah_AmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilkanDataFitrah_AmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilkanDataFitrah_AmilZakat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilkanDataFitrah_AmilZakat().setVisible(true);
            }
        });
    }
    
    private void display_table()
    {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("No");
        table.addColumn("Nama");
        table.addColumn("Jenis Zakat");
        table.addColumn("Nominal");
        table.addColumn("Masjid");
        table.addColumn("Nomor HP");
        table.addColumn("Tanggal");
        JTableHeader Theader = table_data_fitrah.getTableHeader();
        Theader.setFont(new Font("Poppins", Font.BOLD, 16));
        table_data_fitrah.setFont(new Font("Poppins", Font.PLAIN, 16));
        
        try {
            int counter = 1;
            //Query
            String sql = "SELECT * FROM data_zakat_amilzakat where type_zakat = 'Zakat Fitrah' AND mosque = '"+LoginAmilZakat.mosqueName+"'; ";
            
            //Koneksi
//            java.sql.Connection Hubung = (Connection)koneksi_DB.configDB()();
            java.sql.Connection hubung = (Connection)KoneksiDB.configDB();
            
            //Parameter Java SQL
            java.sql.Statement s = hubung.createStatement();
            
            //Eksekusi
            java.sql.ResultSet rs = s.executeQuery(sql);
            
            //Looping
            while (rs.next()) {
                table.addRow(new Object[]{
                   counter++,rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), rs.getString(6), rs.getString(7) 
                });
                
            }
            table_data_fitrah.setModel(table);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CopyrightLabel;
    public javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_data_fitrah;
    // End of variables declaration//GEN-END:variables
}
