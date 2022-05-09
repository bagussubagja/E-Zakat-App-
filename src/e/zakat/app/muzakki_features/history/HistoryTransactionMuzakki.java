 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package e.zakat.app.muzakki_features.history;

import e.zakat.app.muzakki_features.*;
import e.zakat.app.auth_screen.muzakki.*;
import e.zakat.app.initial_screen.ChooseRoles;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit; 
import java.sql.*;  
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author bagus
 */
public class HistoryTransactionMuzakki extends javax.swing.JFrame {

    /**
     * Creates new form LoginMuzakki
     */
    public HistoryTransactionMuzakki() {
        initComponents();
   
    ImageIcon myimage2 = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-copyright.png")));
    
    Image img3 = myimage2.getImage();
    Image img4 = img3.getScaledInstance(CopyrightLabel.getWidth(), CopyrightLabel.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon j = new ImageIcon(img4);
    
    CopyrightLabel.setIcon(j);
    
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment( JLabel.CENTER );
    
    JTableHeader Theader = TableHistory.getTableHeader();
    Theader.setFont(new Font("Poppins", Font.BOLD, 16));
    ((DefaultTableCellRenderer)Theader.getDefaultRenderer())
            .setHorizontalAlignment(JLabel.CENTER);
    TableHistory.setFont(new Font("Poppins", Font.PLAIN, 16));
    TableHistory.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
    TableHistory.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
    TableHistory.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
    TableHistory.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    TableHistory.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
    TableHistory.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
    TableHistory.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
    
    TableHistory.getColumnModel().getColumn(0).setPreferredWidth(50);
    TableHistory.getColumnModel().getColumn(0).setMaxWidth(50);
    TableHistory.getColumnModel().getColumn(1).setPreferredWidth(150);
    TableHistory.getColumnModel().getColumn(1).setMaxWidth(150);
    TableHistory.getColumnModel().getColumn(2).setPreferredWidth(180);
    TableHistory.getColumnModel().getColumn(2).setMaxWidth(180);
    TableHistory.getColumnModel().getColumn(3).setPreferredWidth(300);
    TableHistory.getColumnModel().getColumn(3).setMaxWidth(300);
    TableHistory.getColumnModel().getColumn(4).setPreferredWidth(170);
    TableHistory.getColumnModel().getColumn(4).setMaxWidth(170);
    TableHistory.getColumnModel().getColumn(5).setPreferredWidth(100);
    TableHistory.getColumnModel().getColumn(5).setMaxWidth(100);
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
        btn_back = new javax.swing.JButton();
        CopyrightLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHistory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("History Transaction Muzakki");
        setBackground(new java.awt.Color(238, 238, 238));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon-app.png")));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 32)); // NOI18N
        jLabel1.setText("é-Zakat - Riwayat Pembayaran Zakat");

        btn_back.setBackground(new java.awt.Color(221, 221, 221));
        btn_back.setFont(new java.awt.Font("Poppins Light", 0, 18)); // NOI18N
        btn_back.setText("Kembali");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        UsernameLabel.setText("Alif Ilman Nurrohman");

        jScrollPane1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N

        TableHistory.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        TableHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Jenis Zakat", "Besaran Zakat", "Masjid Pilihan", "Narahubung", "Status", "Waktu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableHistory.setRowHeight(32);
        TableHistory.setRowMargin(2);
        TableHistory.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableHistory);
        if (TableHistory.getColumnModel().getColumnCount() > 0) {
            TableHistory.getColumnModel().getColumn(0).setResizable(false);
            TableHistory.getColumnModel().getColumn(1).setResizable(false);
            TableHistory.getColumnModel().getColumn(2).setResizable(false);
            TableHistory.getColumnModel().getColumn(3).setResizable(false);
            TableHistory.getColumnModel().getColumn(4).setResizable(false);
            TableHistory.getColumnModel().getColumn(5).setResizable(false);
            TableHistory.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(555, 555, 555)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(UsernameLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameLabel)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(CopyrightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        HomePageMuzakki homePageMuzakki = new HomePageMuzakki();
        this.dispose();
        homePageMuzakki.show();
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
            java.util.logging.Logger.getLogger(HistoryTransactionMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryTransactionMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryTransactionMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryTransactionMuzakki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new HistoryTransactionMuzakki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JTable TableHistory;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
