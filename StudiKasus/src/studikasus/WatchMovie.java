/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studikasus;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class WatchMovie extends javax.swing.JFrame {
    String[] data = new String[5];
    int umur;
    Film[] listFilm = new Film[100];
    int jumlahFilm = 0;
    String[] p = new String[10];
 
    /**
     * Creates new form WatchMovie
     */
    public WatchMovie(String[] data, int umur) {
        this.data = data;
        this.umur = umur;
        initComponents();
        this.setLocationRelativeTo(null);
        addWindowListener(new WatchMovie.CustomWindowAdapter(this));
        
        //Set Banyaknya Film
        getFilm();
        System.out.println(jumlahFilm);
        String [] namaFilm = new String[jumlahFilm];
        int counter = 0;
        for (int i = 0; i < listFilm.length; i++) {
            if (listFilm[i] != null) {
                //Check Kondisi Kategori Pelanggan
                if (data[4].equalsIgnoreCase("reguler")) {
                    if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler")) namaFilm[counter++] = listFilm[i].getFilmDetail(0);
                } else if (data[4].equalsIgnoreCase("gold")) {
                    if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler") || listFilm[i].getFilmDetail(5).equalsIgnoreCase("new"))
                        namaFilm[counter++] = listFilm[i].getFilmDetail(0);                          
                } else if (data[4].equalsIgnoreCase("platinum")) {
                    namaFilm[counter++] = listFilm[i].getFilmDetail(0);
                }
            } else {
                break;
            }
        }
        
        CB.setMaximumRowCount(8);
        CB.setModel(new javax.swing.DefaultComboBoxModel(namaFilm));
        
        jLabel7.setText(listFilm[0].getFilmDetail(1));
        jLabel8.setText(listFilm[0].getFilmDetail(2));
        jLabel9.setText(listFilm[0].getFilmDetail(3));
        jLabel10.setText(listFilm[0].getFilmDetail(4));
        this.setResizable(false);
    }
    
    private void saveHistori() {
        String path = new File("").getAbsolutePath()+ "\\src\\studikasus\\HistoriFilm.txt";
        File myFile = new File(path);

        try {
            String temp = "";
            FileWriter fw = new FileWriter(myFile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < p.length; i++) {
                if (p[i]!=null) {
                    temp += p[i] + "\n";
                    System.out.println(p[i]);
                }
            }
            bw.write(temp);
            bw.close();
            fw.close();
        } catch (Exception f) {

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

        jColorChooser1 = new javax.swing.JColorChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CB = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 390));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setMaximumSize(new java.awt.Dimension(720, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(910, 90));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Halo User Jalafix");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-40, 0, 770, 90);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pilih tontonan mu");

        CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Film List" }));
        CB.setToolTipText("");
        CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBActionPerformed(evt);
            }
        });

        jButton1.setText("Select");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Genre                         ->");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tahun Rilis                 ->");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Rekomendasi Umur   ->");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sinopsis                     ->");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel6)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 90, 756, 296);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Film[] getFilm() {
        //READ FILE
        String path = new File("").getAbsolutePath()+ "\\src\\studikasus\\jenisjenisFilm.txt";
        File myFile = new File(path);

        try {
            FileReader fr = new FileReader(myFile);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(", ");
                for (int i = 0; i < listFilm.length; i++) {
                    if (listFilm[i] == null) {
                        if (temp.length == 5)
                            listFilm[i] = new Film(temp[0], temp[1], temp[2], temp[3], temp[4]);
                        else if (temp.length == 6)
                            listFilm[i] = new Film(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5]);

                        System.out.println(listFilm[i].getFilmDetail(5));
                        
                        //Check Kondisi Kategori Pelanggan
                        if (data[4].equalsIgnoreCase("reguler")) {
                            if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler")) jumlahFilm++;
                        } else if (data[4].equalsIgnoreCase("gold")) {
                            if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler") || listFilm[i].getFilmDetail(5).equalsIgnoreCase("new"))
                                jumlahFilm++;                            
                        } else if (data[4].equalsIgnoreCase("platinum")) {
                            jumlahFilm++;
                        }
                        break;
                    }
                }
            }
            br.close();
            fr.close();
        } catch (Exception f) {
            System.out.println("An error occurred.");
            f.printStackTrace();
        }
        
        return listFilm;
    }
    
    private void CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBActionPerformed
        String selectedItem = (String)CB.getSelectedItem();
        
        for (Film listFilm1 : listFilm) {
            if (selectedItem.equalsIgnoreCase(listFilm1.getFilmDetail(0))) {
                jLabel7.setText(listFilm1.getFilmDetail(1));
                jLabel8.setText(listFilm1.getFilmDetail(2));
                jLabel9.setText(listFilm1.getFilmDetail(3));
                jLabel10.setText(listFilm1.getFilmDetail(4));
                break;
            }
        }
    }//GEN-LAST:event_CBActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (p[9] == null) {
            for(int i=0;i<p.length;i++){
                if(p[i] == null){
                   p[i]=(String)CB.getSelectedItem();
                   break;
                }                 
            }
        } else {
            for (int i = 0; i < p.length - 1; i++) {
                p[i] = p[i + 1];
            }
            p[9] = (String)CB.getSelectedItem();
        }
        JOptionPane.showMessageDialog(this, "Menonton!");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MainMenu mm = new MainMenu(data, umur);
        mm.setVisible(true);
        saveHistori();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(WatchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WatchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WatchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WatchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new WatchMovie().setVisible(true);
            }
        });
    }
    
    
    class CustomWindowAdapter extends WindowAdapter {
 
        WatchMovie window = null;
 
        CustomWindowAdapter(WatchMovie window) {
            this.window = window;
        }
 
        // implement windowClosing method
        public void windowClosing(WindowEvent e) {
            saveHistori();
            
            window.dispose();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    // End of variables declaration//GEN-END:variables
}
