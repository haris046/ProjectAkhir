/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import Controller.dI_data_karyawan;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.HashMap;
import javax.swing.table.TableModel;


/**
 *
 * @author FAQIH
 */
public class Data_Karyawan extends javax.swing.JFrame {
    private void ViewData(){
            dI_data_karyawan ck = new dI_data_karyawan();
            try{
                jTable.setModel(resultSetToTableModel(ck.UpdateJTable()));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }     
    }
    /**
     * Creates new form Data_Karyawan
     */
    public Data_Karyawan() {
        initComponents();
    }
    private void AmbilJk(String jk){
        if(jk.equals("laki-laki")){
            rdlk.setSelected(true);
        }else{
            rdpr.setSelected(true);
        }
    }
    private void AmbilStatus(String status){
        if (status.equals("menikah")){
            rdmk.setSelected(true);
     
        }
    }
    private void AmbilAgama(String agama){
        String[]ag = {"Islam","Kristen","Budha","Hindu"};
        cbagama.removeAllItems();
        cbagama.addItem(agama);
        for(int i = 0;i<ag.length;i++){
            if(!ag[i].equals(agama)){
                cbagama.addItem(ag[i]);
        }
    }
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txnip = new javax.swing.JTextField();
        txalamat = new javax.swing.JTextField();
        txnama = new javax.swing.JTextField();
        txjabatan = new javax.swing.JTextField();
        rdlk = new javax.swing.JRadioButton();
        rdpr = new javax.swing.JRadioButton();
        cbagama = new javax.swing.JComboBox<>();
        rdmk = new javax.swing.JRadioButton();
        rdbmk = new javax.swing.JRadioButton();
        cbsimpan = new javax.swing.JButton();
        cbtambah = new javax.swing.JButton();
        cbedit = new javax.swing.JButton();
        cbhapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Form Input Data Karyawan ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("NIP");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Jabatan");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Alamat");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Agama");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Status");

        buttonGroup1.add(rdlk);
        rdlk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rdlk.setText("Laki-laki");
        rdlk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlkActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdpr);
        rdpr.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rdpr.setText("Perempuan");
        rdpr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdprActionPerformed(evt);
            }
        });

        cbagama.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbagama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Budha", "Hindu" }));

        buttonGroup2.add(rdmk);
        rdmk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rdmk.setText("Menikah");

        buttonGroup2.add(rdbmk);
        rdbmk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rdbmk.setText("Belum Menikah");
        rdbmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbmkActionPerformed(evt);
            }
        });

        cbsimpan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbsimpan.setText("Simpan");
        cbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsimpanActionPerformed(evt);
            }
        });

        cbtambah.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbtambah.setText("Tambah");
        cbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtambahActionPerformed(evt);
            }
        });

        cbedit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbedit.setText("Edit");
        cbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbeditActionPerformed(evt);
            }
        });

        cbhapus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbhapus.setText("Hapus");
        cbhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbhapusActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
                "NIP", "Nama", "Jabatan", "Jenis Kelamin", "Agama", "Status", "Alamat"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(cbsimpan)
                        .addGap(18, 18, 18)
                        .addComponent(cbtambah)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdlk)
                                .addGap(18, 18, 18)
                                .addComponent(rdpr))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txnip, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdmk)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbmk)
                                        .addContainerGap(32, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbedit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbhapus)
                                                .addGap(11, 11, 11))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(rdmk)
                    .addComponent(rdbmk))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdlk)
                    .addComponent(rdpr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbsimpan)
                    .addComponent(cbtambah)
                    .addComponent(cbedit)
                    .addComponent(cbhapus))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdlkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlkActionPerformed

    private void rdprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdprActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdprActionPerformed

    private void rdbmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbmkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbmkActionPerformed

    private void cbsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsimpanActionPerformed
        // TODO add your handling code here:
        dI_data_karyawan ck = new dI_data_karyawan();
        ck.nip = txnip.getText();
        ck.nama = txnama.getText();
        ck.jabatan = txjabatan.getText();
        if(rdlk.isSelected()==true){
            ck.jenis_kelamin = "laki-laki";
        }else{
            ck.jenis_kelamin = "perempuan";
        }
        ck.agama = (String) cbagama.getSelectedItem();
        if(rdmk.isSelected()==true){
            ck.status = "Menikah";
        }else{
            ck.status = "Belum Menikah";  
        }
        ck.alamat = txalamat.getText();
        try{
            ck.simpan();
            JOptionPane.showMessageDialog(null, "Berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }ViewData();
    }//GEN-LAST:event_cbsimpanActionPerformed

    private void cbtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtambahActionPerformed
        // TODO add your handling code here:
        txnip.setText("");
        txnama.setText("");
        txjabatan.setText("");
        buttonGroup1.clearSelection();
        cbagama.setSelectedItem("");
        buttonGroup2.clearSelection();
        txalamat.setText("");
    }//GEN-LAST:event_cbtambahActionPerformed

    private void cbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbeditActionPerformed
        // TODO add your handling code here:
        dI_data_karyawan ck = new dI_data_karyawan();
        ck.nip = txnip.getText();
        ck.nama = txnama.getText();
        ck.jabatan = txjabatan.getText();
        if(rdlk.isSelected()==true){
            ck.jenis_kelamin = "Laki-laki";
        }else{
            ck.jenis_kelamin = "Perempuan";
        }
        ck.agama = (String) cbagama.getSelectedItem();
        if(rdmk.isSelected()==true){
            ck.status = "Menikah";
        }else{
            ck.status = "Belum Menikah";
        }
        ck.alamat = txalamat.getText();
        try{
            ck.rubah();
            JOptionPane.showMessageDialog(null, "Berhasil");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }ViewData();
    }//GEN-LAST:event_cbeditActionPerformed

    private void cbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbhapusActionPerformed
        // TODO add your handling code here:
        String ObjButtons[] = {"Yes","No"}; 
        int PromptResult = JOptionPane.showOptionDialog(null, "Yakin Mau Hapus ?", "Massage", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, ObjButtons, ObjButtons[1]);
 
        if(PromptResult==0){
            dI_data_karyawan ck = new dI_data_karyawan();
            ck.nip = txnip.getText();
            try{
                ck.hapus();
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus!");
                ViewData();
            }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }}
    }//GEN-LAST:event_cbhapusActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ViewData();
    }//GEN-LAST:event_formWindowOpened

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        int row = jTable.getSelectedColumn();
        txnip.setText(jTable.getModel().getValueAt(row, 0).toString());
        txnama.setText(jTable.getModel().getValueAt(row, 1).toString());
        txjabatan.setText(jTable.getModel().getValueAt(row, 2).toString());
        String jenis_kelamin = jTable.getModel().getValueAt(row, 3).toString();
        AmbilJk (jenis_kelamin);
        String agama = jTable.getModel().getValueAt(row, 4).toString();
        AmbilAgama (agama);
        String status = jTable.getModel().getValueAt(row, 5).toString();
        AmbilStatus (status);
        txalamat.setText(jTable.getModel().getValueAt(row, 6).toString());
        
    }//GEN-LAST:event_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbagama;
    private javax.swing.JButton cbedit;
    private javax.swing.JButton cbhapus;
    private javax.swing.JButton cbsimpan;
    private javax.swing.JButton cbtambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rdbmk;
    private javax.swing.JRadioButton rdlk;
    private javax.swing.JRadioButton rdmk;
    private javax.swing.JRadioButton rdpr;
    private javax.swing.JTextField txalamat;
    private javax.swing.JTextField txjabatan;
    private javax.swing.JTextField txnama;
    private javax.swing.JTextField txnip;
    // End of variables declaration//GEN-END:variables

    private TableModel resultSetToTableModel(ResultSet UpdateJTable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
