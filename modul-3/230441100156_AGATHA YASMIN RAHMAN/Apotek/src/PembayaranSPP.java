/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class PembayaranSPP extends javax.swing.JFrame {

    /**
     * Creates new form PembayaranSPP
     */
    public PembayaranSPP() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cb1 = new javax.swing.JCheckBox();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        cb10 = new javax.swing.JCheckBox();
        cb11 = new javax.swing.JCheckBox();
        cb12 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        btnbayar = new javax.swing.JButton();
        txtkali = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txttotal = new javax.swing.JButton();
        txtbayar = new javax.swing.JTextField();
        btnstatus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        totaltf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, java.awt.BorderLayout.LINE_START);

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, java.awt.BorderLayout.LINE_END);

        jLabel3.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SDN KELEYAN 2");
        jPanel2.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 110));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new java.awt.GridLayout(4, 0, 3, 3));

        cb1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb1.setText("Januari");
        jPanel4.add(cb1);

        cb2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb2.setText("Februari");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        jPanel4.add(cb2);

        cb3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb3.setText("Maret");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        jPanel4.add(cb3);

        cb4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb4.setText("April");
        jPanel4.add(cb4);

        cb5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb5.setText("Mei");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });
        jPanel4.add(cb5);

        cb6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb6.setText("Juni");
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });
        jPanel4.add(cb6);

        cb7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        cb7.setText("Juli");
        cb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7ActionPerformed(evt);
            }
        });
        jPanel4.add(cb7);

        cb8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb8.setText("Agustus");
        jPanel4.add(cb8);

        cb9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb9.setText("September");
        jPanel4.add(cb9);

        cb10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb10.setText("Oktober");
        cb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb10ActionPerformed(evt);
            }
        });
        jPanel4.add(cb10);

        cb11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb11.setText("November");
        jPanel4.add(cb11);

        cb12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb12.setText("Desmber");
        jPanel4.add(cb12);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 300, -1));

        jLabel6.setFont(new java.awt.Font("Stencil", 3, 18)); // NOI18N
        jLabel6.setText("Bulan :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, 20));

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        btnbayar.setText("Bayar");
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        txtkali.setEditable(false);
        txtkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkaliActionPerformed(evt);
            }
        });
        jPanel1.add(txtkali, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 80, -1));

        jTextField6.setEditable(false);
        jTextField6.setText("Rp 500,000");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 80, -1));

        txttotal.setText("Total");
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        jPanel1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        jPanel1.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, -1));

        btnstatus.setText("Status");
        btnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatusActionPerformed(evt);
            }
        });
        jPanel1.add(btnstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel4.setText("Nama :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 46, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 264, -1));

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Bulan dibayar", "Status", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabel1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 650, 400));

        totaltf.setEditable(false);
        totaltf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaltfActionPerformed(evt);
            }
        });
        jPanel1.add(totaltf, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 80, -1));

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

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb6ActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb7ActionPerformed

    private void cb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb10ActionPerformed

    private void btnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatusActionPerformed
        // TODO add your handling code here:
         if (tabel1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Silahkan Bayar Terlebih Dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Keluar dari metode jika tabel kosong
        }else{
            String status = "Lunas";
            String bulanBelumDibayar = "";

            // Cek status setiap checkbox untuk bulan
            if (!cb1.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Januari\n";
            }
            if (!cb2.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Februari\n";
            }
            if (!cb3.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Maret\n";
            }
            if (!cb4.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "April\n";
            }
            if (!cb5.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Mei\n";
            }
            if (!cb6.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Juni\n";
            }
            if (!cb7.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Juli\n";
            }
            if (!cb8.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Agustus\n";
            }
            if (!cb9.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "September\n";
            }
            if (!cb10.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Oktober\n";
            }
            if (!cb11.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "November\n";
            }
            if (!cb12.isSelected()) {
                status = "Menunggak";
                bulanBelumDibayar = bulanBelumDibayar + "Desember\n";
            }

            // Tampilkan status dan daftar bulan yang belum dibayar
            if (status.equals("Menunggak")) {
                JOptionPane.showMessageDialog(this,"Status: " + status + "\nBulan yang belum dibayar:\n" + bulanBelumDibayar);
            } else {
                JOptionPane.showMessageDialog(this,"Status: " + status + "\nSemua bulan telah dibayar.");
            }
        }
    }//GEN-LAST:event_btnstatusActionPerformed

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        // TODO add your handling code here:
    DefaultTableModel model = (DefaultTableModel) tabel1.getModel();
    String bulanDetail = "";
    String nama = txtnama.getText();
    String totalPembayaranText = totaltf.getText();
    int bulanTerpilih = 0; // Variabel untuk menghitung jumlah bulan yang dipilih

    // Memeriksa apakah checkbox bulan dipilih dan menambahkan detail ke dalam 'bulanDetail'
    if (cb1.isSelected()) { bulanDetail += "Januari, "; bulanTerpilih++; }
    if (cb2.isSelected()) { bulanDetail += "Februari, "; bulanTerpilih++; }
    if (cb3.isSelected()) { bulanDetail += "Maret, "; bulanTerpilih++; }
    if (cb4.isSelected()) { bulanDetail += "April, "; bulanTerpilih++; }
    if (cb5.isSelected()) { bulanDetail += "Mei, "; bulanTerpilih++; }
    if (cb6.isSelected()) { bulanDetail += "Juni, "; bulanTerpilih++; }
    if (cb7.isSelected()) { bulanDetail += "Juli, "; bulanTerpilih++; }
    if (cb8.isSelected()) { bulanDetail += "Agustus, "; bulanTerpilih++; }
    if (cb9.isSelected()) { bulanDetail += "September, "; bulanTerpilih++; }
    if (cb10.isSelected()) { bulanDetail += "Oktober, "; bulanTerpilih++; }
    if (cb11.isSelected()) { bulanDetail += "November, "; bulanTerpilih++; }
    if (cb12.isSelected()) { bulanDetail += "Desember, "; bulanTerpilih++; }

    // Menghapus koma terakhir jika ada
    if (!bulanDetail.isEmpty()) {
        bulanDetail = bulanDetail.substring(0, bulanDetail.length() - 2);
    }

    // Kondisi 1: Pastikan semua field (nama, bulan, dan total pembayaran) sudah diisi
    if (nama.isEmpty() || bulanDetail.isEmpty() || totalPembayaranText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Pastikan semua field (nama, bulan, dan total pembayaran) sudah diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Parsing total pembayaran
    int totalPembayaran;
    try {
        totalPembayaran = Integer.parseInt(totalPembayaranText); // Mengubah string total pembayaran menjadi angka
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Total pembayaran harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Ambil jumlah uang yang dibayarkan oleh pengguna dari txtbayar
    String jumlahUangText = txtbayar.getText();
    int jumlahUang;
    try {
        jumlahUang = Integer.parseInt(jumlahUangText); // Mengubah string jumlah uang menjadi angka
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Jumlah uang yang dimasukkan harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Menentukan status berdasarkan jumlah bulan yang dipilih
    String status;
    if (bulanTerpilih < 12) {
        status = "Nunggak"; // Jika bulan yang dipilih kurang dari 12, statusnya "Nunggak"
    } else {
        status = "Lunas";   // Jika bulan yang dipilih 12, statusnya "Lunas"
    }

    // Kondisi 6: Cek apakah jumlah uang lebih, kurang, atau pas
    if (jumlahUang < totalPembayaran) {
        JOptionPane.showMessageDialog(this, "Jumlah uang kurang! Pembayaran gagal.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Pembayaran gagal, keluar dari metode
    }

    // Kondisi 2: Cek apakah nama, bulan, dan total telah berubah dari data sebelumnya di tabel
    boolean namaSama = false;
    boolean bulanSama = false;
    boolean totalSama = false;

    for (int i = 0; i < model.getRowCount(); i++) {
        String namaDiTabel = (String) model.getValueAt(i, 0);
        String bulanDiTabel = (String) model.getValueAt(i, 1);

        // Cek apakah nama dan bulan sama
        if (nama.equals(namaDiTabel)) {
            namaSama = true;
            if (bulanDetail.equals(bulanDiTabel)) {
                bulanSama = true;
            }
        }

        // Cek apakah totalPembayaran di tabel bukan null
        Object totalValue = model.getValueAt(i, 3); // Kolom total ada di indeks ke-3
        if (totalValue != null && totalValue instanceof Integer) {
            int totalDiTabel = (Integer) totalValue;
            if (totalPembayaran == totalDiTabel) {
                totalSama = true;
            }
        }
    }

    // Kondisi 2: Jika nama, bulan, dan total tidak berubah
    if (namaSama && bulanSama && totalSama) {
        JOptionPane.showMessageDialog(this, "Nama, bulan, dan total tidak boleh sama dengan data yang sudah ada!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kondisi 3: Jika nama sama, bulan berubah, tetapi belum ada total
    if (namaSama && !bulanSama && totalPembayaran == 0) {
        JOptionPane.showMessageDialog(this, "Silakan hitung total sebelum melanjutkan!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Kondisi 4: Jika nama sama, hanya update bulan dan status di baris tersebut
    if (namaSama) {
        for (int i = 0; i < model.getRowCount(); i++) {
            String namaDiTabel = (String) model.getValueAt(i, 0);
            if (nama.equals(namaDiTabel)) {
                model.setValueAt(bulanDetail, i, 0); // Update bulan di kolom pertama (indeks 0)
                model.setValueAt(status, i, 1); // Update status di kolom kedua (indeks 1)
                model.setValueAt(totalPembayaran, i, 2); // Update total pembayaran di kolom ketiga (indeks 2)
                break;
            }
        }
    } else {
        // Kondisi 5: Jika nama baru, tambahkan baris baru di **baris pertama**
        model.insertRow(0, new Object[]{nama, bulanDetail, status, totalPembayaran});
    }

    // Jika jumlah uang lebih dari total, berikan kembalian
    if (jumlahUang > totalPembayaran) {
        int kembalian = jumlahUang - totalPembayaran;
        JOptionPane.showMessageDialog(this, "Pembayaran berhasil! Kembalian: " + kembalian, "Info", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(this, "Pembayaran berhasil! Uang pas.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }
                        
    }//GEN-LAST:event_btnbayarActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
        int totalPembayaran = 0;
        int hitung = 0;
        String bulanDetail = "";
        String nama = txtnama.getText();
        String totalPembayaranText = totaltf.getText();

        if (cb1.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Januari";
        }
        if (cb2.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Februari";
        }
        if (cb3.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Maret";
        }
        if (cb4.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "April";
        }
        if (cb5.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Mei";
        }
        if (cb6.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Juni";
        }
        if (cb7.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Juli";
        }
        if (cb8.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Agustus";
        }
        if (cb9.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "September";
        }
        if (cb10.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Oktober";
        }
        if (cb11.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "November";
        }
        if (cb12.isSelected()) {
            totalPembayaran += 500000;
            hitung++;
            bulanDetail += "Desember";
        }

        // Menghapus koma terakhir jika ada bulan yang dipilih
        if (nama.isEmpty() || bulanDetail.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Pastikan semua field (nama, bulan) sudah diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            totaltf.setText(String.valueOf(totalPembayaran));
            txtkali.setText(String.valueOf(hitung));
        }
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tabel1.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            model.setRowCount(0);
        }
        txtnama.setText("");
        txtkali.setText("");
        txtbayar.setText("");
        txtkali.setText("");

        // Uncheck semua checkbox bulan
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
        cb5.setSelected(false);
        cb6.setSelected(false);
        cb7.setSelected(false);
        cb8.setSelected(false);
        cb9.setSelected(false);
        cb10.setSelected(false);
        cb11.setSelected(false);
        cb12.setSelected(false);

        // Fokuskan kembali pada field nama agar pengguna dapat mulai mengisi dari awal
        txtnama.requestFocus();
    }//GEN-LAST:event_btnresetActionPerformed

    private void totaltfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaltfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaltfActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbayarActionPerformed

    private void txtkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkaliActionPerformed

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
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PembayaranSPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembayaranSPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbayar;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnstatus;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb10;
    private javax.swing.JCheckBox cb11;
    private javax.swing.JCheckBox cb12;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tabel1;
    private javax.swing.JTextField totaltf;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtkali;
    private javax.swing.JTextField txtnama;
    private javax.swing.JButton txttotal;
    // End of variables declaration//GEN-END:variables
}