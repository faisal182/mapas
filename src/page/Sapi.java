/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Sapi extends javax.swing.JFrame {

    /**
     * Creates new form Sapi
     */
    public Sapi() {
        initComponents();
    }
    
    private void simpan(){
        
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
        jLabel3 = new javax.swing.JLabel();
        txtNoReg = new javax.swing.JTextField();
        txtJenisSapi = new javax.swing.JTextField();
        txtBobotAwal = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("No Reg Sapi");

        jLabel2.setText("Jenis Sapi");

        jLabel3.setText("Bobot_Awal");

        txtNoReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoRegKeyPressed(evt);
            }
        });

        txtJenisSapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisSapiActionPerformed(evt);
            }
        });

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("UBAH");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBersih.setText("BERSIH");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtJenisSapi))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBobotAwal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnBersih)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJenisSapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBobotAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnBersih))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJenisSapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisSapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisSapiActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String regSapi, jenis;
        int bobot;
        
        regSapi = txtNoReg.getText();
        jenis = txtJenisSapi.getText();
        bobot = Integer.parseInt(txtBobotAwal.getText());
        
        if (empty(regSapi) || empty(jenis) || bobot==0) {
            JOptionPane.showMessageDialog(null, "Data yang Anda masukkan belum lengkap!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection con = new database.connection().configDB();
                String get = "SELECT * FROM sapi WHERE no_reg = '"+regSapi+"'";
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet hasil = st.executeQuery(get);
                
                if (hasil.next()) {
                    JOptionPane.showMessageDialog(null, "Nomor Reg Sapi tidak boleh ada yang sama.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        String sql = "INSERT INTO sapi VALUES (?, ?, ?)";
                        java.sql.PreparedStatement stat = (PreparedStatement)con.prepareStatement(sql);
                        stat.setString(1, regSapi);
                        stat.setString(2, jenis);
                        stat.setInt(3, bobot);
                        stat.executeUpdate();

                        JOptionPane.showMessageDialog(null, "Data BERHASIL Ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "GAGAL Menambahkan Data", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                        System.out.println(e);
                    }
                }
            } catch (Exception e) {}
        }
        bersih();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete_sapi();
        bersih();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtNoRegKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoRegKeyPressed
        if (evt.getKeyCode()== KeyEvent.VK_ENTER){
            search_sapi();
        }
    }//GEN-LAST:event_txtNoRegKeyPressed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        bersih();
       
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String regSapi, jenis;
        int bobot;
        
        regSapi = txtNoReg.getText();
        jenis = txtJenisSapi.getText();
        bobot = Integer.parseInt(txtBobotAwal.getText());
        
        if (empty(regSapi) || empty(jenis) || bobot==0) {
            JOptionPane.showMessageDialog(null, "Data yang Anda masukkan belum lengkap!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
        } else {
           
            try {
                Connection con = new database.connection().configDB();
                String sql = "UPDATE sapi SET jenis = ?, bobot_awal = ? "
                        + " WHERE no_reg = '"+regSapi+"'";
                java.sql.PreparedStatement stat = (PreparedStatement)con.prepareStatement(sql);
                stat.setString(1, jenis);
                stat.setInt(2, bobot);
                stat.executeUpdate();

                JOptionPane.showMessageDialog(null, "Data BERHASIL diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "GAGAL Mengubah Data", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
        }
        bersih();
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Sapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sapi().setVisible(true);
            }
        });
    }
    
    private void bersih(){
         txtNoReg.setText(""); 
        txtJenisSapi.setText(""); 
        txtBobotAwal.setText(""); 
    }
     private static boolean empty(final String s) {
        return s == null || s.trim().isEmpty();
    }

     private void search_sapi() {
        String reg = txtNoReg.getText();
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM sapi WHERE "
                    + "no_reg = '"+reg+"' ";
            java.sql.Statement stmt = con.createStatement();
            java.sql.ResultSet hasil = stmt.executeQuery(sql);
            
            while (hasil.next()) {
                String jenis = hasil.getString("jenis");
                String bobot = hasil.getString("bobot_awal");
                
                txtJenisSapi.setText(jenis);
                txtBobotAwal.setText(bobot);
                
                
            }
        } catch (Exception e) {
        
        }
    }
     
     private void delete_sapi() {
        String reg = txtNoReg.getText();
         int x = JOptionPane.showConfirmDialog(null, "Data Sapi dengan\n\nNo Reg: "+reg+" akan Anda hapus, yakin?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (x == JOptionPane.YES_OPTION) {
                try {
                    Connection con = new database.connection().configDB();
                    String sql = "DELETE FROM sapi WHERE no_reg = '"+reg+"'";
                    java.sql.Statement st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtBobotAwal;
    private javax.swing.JTextField txtJenisSapi;
    private javax.swing.JTextField txtNoReg;
    // End of variables declaration//GEN-END:variables
}
