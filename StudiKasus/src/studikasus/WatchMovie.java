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

/**
 *
 * @author User
 */
public class WatchMovie extends javax.swing.JFrame {
    String kategori;
    Film[] listFilm = new Film[100];
    int jumlahFilm = 0;
    String[] p = new String[10];
 
    /**
     * Creates new form WatchMovie
     */
    public WatchMovie(String kategori) {
        this.kategori = kategori;
        initComponents();
        addWindowListener(new WatchMovie.CustomWindowAdapter(this));
        
        //Set Banyaknya Film
        getFilm();
        System.out.println(jumlahFilm);
        String [] namaFilm = new String[jumlahFilm];
        int counter = 0;
        for (int i = 0; i < listFilm.length; i++) {
            if (listFilm[i] != null) {
                //Check Kondisi Kategori Pelanggan
                if (kategori.equalsIgnoreCase("reguler")) {
                    if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler")) namaFilm[counter++] = listFilm[i].getFilmDetail(0);
                } else if (kategori.equalsIgnoreCase("gold")) {
                    if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler") || listFilm[i].getFilmDetail(5).equalsIgnoreCase("new"))
                        namaFilm[counter++] = listFilm[i].getFilmDetail(0);                          
                } else if (kategori.equalsIgnoreCase("platinum")) {
                    namaFilm[counter++] = listFilm[i].getFilmDetail(0);
                }
            } else {
                break;
            }
        }
        
        CB.setMaximumRowCount(8);
        CB.setModel(new javax.swing.DefaultComboBoxModel(namaFilm));
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

        jLabel2.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
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

        jLabel3.setText("Genre                         ->");

        jLabel4.setText("Tahun Rilis                 ->");

        jLabel5.setText("Rekomendasi Umur   ->");

        jLabel6.setText("Sinopsis                     ->");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(153, 153, 153))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 90, 790, 294);

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
                        if (kategori.equalsIgnoreCase("reguler")) {
                            if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler")) jumlahFilm++;
                        } else if (kategori.equalsIgnoreCase("gold")) {
                            if (listFilm[i].getFilmDetail(5).equalsIgnoreCase("reguler") || listFilm[i].getFilmDetail(5).equalsIgnoreCase("new"))
                                jumlahFilm++;                            
                        } else if (kategori.equalsIgnoreCase("platinum")) {
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
    }//GEN-LAST:event_jButton1ActionPerformed

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
            
            window.dispose();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB;
    private javax.swing.JButton jButton1;
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