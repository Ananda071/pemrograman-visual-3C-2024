/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pemvismodul3;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Safira
 */
public class pembayaranspp extends javax.swing.JFrame {

    /**
     * Creates new form pembayaranspp
     */
    public pembayaranspp() {
        initComponents();
        lunas.setEditable(false);
        blmlunas.setEditable(false);
        blnbelumlunas.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jan = new javax.swing.JCheckBox();
        feb = new javax.swing.JCheckBox();
        mar = new javax.swing.JCheckBox();
        apr = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        ags = new javax.swing.JCheckBox();
        sep = new javax.swing.JCheckBox();
        okt = new javax.swing.JCheckBox();
        nov = new javax.swing.JCheckBox();
        des = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        spp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        blnbelumlunas = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lunas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        blmlunas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        bayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PEMBAYARAN SPP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jLabel11)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(41, 41, 41))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.GridLayout(3, 4));

        jan.setText("Januari");
        jPanel6.add(jan);

        feb.setText("Februari");
        jPanel6.add(feb);

        mar.setText("Maret");
        mar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marActionPerformed(evt);
            }
        });
        jPanel6.add(mar);

        apr.setText("April");
        jPanel6.add(apr);

        mei.setText("Mei");
        jPanel6.add(mei);

        juni.setText("Juni");
        jPanel6.add(juni);

        juli.setText("Juli");
        jPanel6.add(juli);

        ags.setText("Agustus");
        jPanel6.add(ags);

        sep.setText("September");
        jPanel6.add(sep);

        okt.setText("Oktober");
        jPanel6.add(okt);

        nov.setText("November");
        jPanel6.add(nov);

        des.setText("Desember");
        jPanel6.add(des);

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 330, 100));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Nama Siswa:");

        jLabel7.setText("SPP perbulan:");

        jLabel8.setText("Bulan yang ingin dibayar:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nama, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(spp))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(spp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 360, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\data2.png")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jPanel9.setBackground(new java.awt.Color(214, 214, 214));

        jLabel9.setText("Notifikasi!");

        jLabel10.setText("-");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 220, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Safira\\OneDrive\\Gambar\\notif.png")); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 376, 134));

        blnbelumlunas.setColumns(20);
        blnbelumlunas.setRows(5);
        jScrollPane1.setViewportView(blnbelumlunas);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 95, -1, -1));

        jLabel3.setText("Total pelunasan:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 24, -1, -1));
        jPanel4.add(lunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 21, 230, -1));

        jLabel5.setText("Bulan yang belum dibayar: ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));
        jPanel4.add(blmlunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 55, 230, -1));

        jLabel6.setText("Total yang belum dibayar: ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 58, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Bulan", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 206, -1, -1));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 9);
        jPanel8.add(reset, gridBagConstraints);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 0);
        jPanel8.add(keluar, gridBagConstraints);

        bayar.setText("Bayar");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.insets = new java.awt.Insets(0, 16, 0, 0);
        jPanel8.add(bayar, gridBagConstraints);

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 340, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
    String namaSiswa = nama.getText();
    
    // Check if name is empty
    if (namaSiswa.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nama siswa harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int sppPerBulan;
    try {
        sppPerBulan = Integer.parseInt(spp.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "SPP per bulan harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    List<String> bulanDibayar = new ArrayList<>();
    List<String> bulanBelumDibayar = new ArrayList<>();
    int totalPelunasan = 0;
    int totalBelumDibayar = 0;

    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) jTable1.getModel();
    JCheckBox[] checkBoxes = {jan, feb, mar, apr, mei, juni, juli, ags, sep, okt, nov, des};
    String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

    boolean atLeastOneSelected = false;
    for (int i = 0; i < checkBoxes.length; i++) {
        if (checkBoxes[i].isSelected()) {
            bulanDibayar.add(namaBulan[i]);
            totalPelunasan += sppPerBulan;
            atLeastOneSelected = true;
        } else {
            bulanBelumDibayar.add(namaBulan[i]);
            totalBelumDibayar += sppPerBulan;
        }
    }

    // Check if at least one month is selected
    if (!atLeastOneSelected) {
        JOptionPane.showMessageDialog(this, "Pilih setidaknya satu bulan untuk dibayar!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    lunas.setText(String.valueOf(totalPelunasan));
    blmlunas.setText(String.valueOf(totalBelumDibayar));
    blnbelumlunas.setText(String.join(", ", bulanBelumDibayar));

    // Menambahkan baris baru di atas data yang sudah ada
    model.insertRow(0, new Object[]{
        1, namaSiswa, String.join(", ", bulanDibayar), totalPelunasan
    });

    // Memperbarui nomor urut untuk semua baris
    for (int i = 1; i < model.getRowCount(); i++) {
        model.setValueAt(i + 1, i, 0);
    }

    // Update status in jLabel10
    if (bulanBelumDibayar.isEmpty()) {
        jLabel10.setText("Status: Sudah Lunas");
        jLabel10.setForeground(new java.awt.Color(0, 128, 0)); // Green color for paid
    } else {
        jLabel10.setText("Status: Menunggak");
        jLabel10.setForeground(new java.awt.Color(255, 0, 0)); // Red color for arrears
    }

    // Show success message
    JOptionPane.showMessageDialog(this, "Pembayaran berhasil diproses!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bayarActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
    nama.setText("");
        spp.setText("");
        lunas.setText("");
        blmlunas.setText("");
        blnbelumlunas.setText("");
        jLabel10.setText("");
        JCheckBox[] checkBoxes = {jan, feb, mar, apr, mei, juni, juli, ags, sep, okt, nov, des};
        for (JCheckBox cb : checkBoxes) {
            cb.setSelected(false);
        }
    }//GEN-LAST:event_resetActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
    dispose();
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(pembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaranspp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ags;
    private javax.swing.JCheckBox apr;
    private javax.swing.JButton bayar;
    private javax.swing.JTextField blmlunas;
    private javax.swing.JTextArea blnbelumlunas;
    private javax.swing.JCheckBox des;
    private javax.swing.JCheckBox feb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JCheckBox jan;
    private javax.swing.JCheckBox juli;
    private javax.swing.JCheckBox juni;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField lunas;
    private javax.swing.JCheckBox mar;
    private javax.swing.JCheckBox mei;
    private javax.swing.JTextField nama;
    private javax.swing.JCheckBox nov;
    private javax.swing.JCheckBox okt;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox sep;
    private javax.swing.JTextField spp;
    // End of variables declaration//GEN-END:variables
}
