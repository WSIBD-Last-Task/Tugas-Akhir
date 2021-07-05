/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.Koneksi;

/**
 *
 * @author Khoirunnisa
 */
public class Login extends javax.swing.JFrame {
    
    private final Connection conn;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        // cek koneksi
        conn = koneksi.Koneksi.cekKoneksi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_masuk_small = new javax.swing.JLabel();
        btn_daftar = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_username = new javax.swing.JTextField();
        btn_pesan_for_masuk = new javax.swing.JLabel();
        btn_masuk = new javax.swing.JLabel();
        bg_masuk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_masuk_small.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_masuk_small.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_masuk_for_login.png"))); // NOI18N
        jPanel1.add(btn_masuk_small, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 100, 50));

        btn_daftar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_daftar_for_login.png"))); // NOI18N
        btn_daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_daftarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_daftarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_daftarMouseExited(evt);
            }
        });
        jPanel1.add(btn_daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, 120, 50));

        txt_password.setBackground(new java.awt.Color(255, 255, 255));
        txt_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_password.setBorder(null);
        jPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 480, 40));

        txt_username.setBackground(new java.awt.Color(255, 255, 255));
        txt_username.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txt_username.setBorder(null);
        txt_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 480, 40));

        btn_pesan_for_masuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_pesan_for_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_pesan.png"))); // NOI18N
        btn_pesan_for_masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pesan_for_masukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pesan_for_masukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pesan_for_masukMouseExited(evt);
            }
        });
        jPanel1.add(btn_pesan_for_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, 480, 80));

        btn_masuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_masuk_big.png"))); // NOI18N
        btn_masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_masukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_masukMouseExited(evt);
            }
        });
        jPanel1.add(btn_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 480, 80));

        bg_masuk.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        bg_masuk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Masuk.png"))); // NOI18N
        jPanel1.add(bg_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseClicked
        // TODO add your handling code here:
        PreparedStatement st;
        ResultSet rs;
        
        //get username & password
        String username = txt_username.getText();
        String password = String.valueOf(txt_password.getPassword());
        
        //check on mysql that username & password are match with select query
        String query = "SELECT * FROM `admin` WHERE `username` = ? AND `password`= ?";
        
        //if username or password are empty
        if(username.trim().equals("") && !password.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Username Anda", "Username Kosong",2);
        } else if (!username.trim().equals("") && password.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Masukkan Password Anda", "Password Kosong",2);
        } else {
            try {
                st = Koneksi.cekKoneksi().prepareStatement(query);

                st.setString(1, username);
                st.setString(2, password);
                rs = st.executeQuery();

                if(rs.next()){
                    //show a new form
                    Admin form = new Admin();
                    form.setVisible(true);
                    form.pack();
                    form.setLocationRelativeTo(null);
                    //close current form(login)
                    this.dispose();
                } else {
                    //error message
                    JOptionPane.showMessageDialog(null, "Username / Password Tidak Valid","Login Error",2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }//GEN-LAST:event_btn_masukMouseClicked

    private void btn_daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMouseClicked
        // TODO add your handling code here:
        Daftar daftar = new Daftar();
        daftar.setVisible(true);
        daftar.pack();
        daftar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_daftarMouseClicked

    private void btn_masukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseEntered
        // TODO add your handling code here:
        btn_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_masuk_big_hover.png"))); // NOI18N
    }//GEN-LAST:event_btn_masukMouseEntered

    private void btn_masukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseExited
        // TODO add your handling code here:
        btn_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_masuk_big.png"))); // NOI18N
        
    }//GEN-LAST:event_btn_masukMouseExited

    private void btn_pesan_for_masukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesan_for_masukMouseEntered
        // TODO add your handling code here:
        btn_pesan_for_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_pesanMakanan_hover.png"))); // NOI18N
    }//GEN-LAST:event_btn_pesan_for_masukMouseEntered

    private void btn_pesan_for_masukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesan_for_masukMouseExited
        // TODO add your handling code here:
        btn_pesan_for_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_pesan.png"))); // NOI18N
    }//GEN-LAST:event_btn_pesan_for_masukMouseExited

    private void btn_daftarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMouseEntered
        // TODO add your handling code here:
        btn_daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_daftar_hover_forMasuk.png"))); // NOI18N
    }//GEN-LAST:event_btn_daftarMouseEntered

    private void btn_daftarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_daftarMouseExited
        // TODO add your handling code here:
        btn_daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_daftar_for_login.png"))); // NOI18N
    }//GEN-LAST:event_btn_daftarMouseExited

    private void btn_pesan_for_masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pesan_for_masukMouseClicked
        // TODO add your handling code here:
        User user = new User();
        user.setVisible(true);
        user.pack();
        user.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_pesan_for_masukMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_masuk;
    private javax.swing.JLabel btn_daftar;
    private javax.swing.JLabel btn_masuk;
    private javax.swing.JLabel btn_masuk_small;
    private javax.swing.JLabel btn_pesan_for_masuk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
