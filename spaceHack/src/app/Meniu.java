package app;

import java.awt.CardLayout;
import javax.swing.JPanel;

/* @author Iulian */
public class Meniu extends javax.swing.JFrame {
    
    private static data.Contact c = null;
    
    public Meniu(data.Contact c) {
        initComponents();
        lbMesaj.setText("Bun venit " + Mesaj(c));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btPasi = new javax.swing.JButton();
        jbEvidenta = new javax.swing.JButton();
        btBanci = new javax.swing.JButton();
        lbMesaj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meniul principal");

        jLabel1.setText("MENIU");

        btPasi.setText("Primii Pasi");
        btPasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPasiActionPerformed(evt);
            }
        });

        jbEvidenta.setText("Evidenta Acte");
        jbEvidenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEvidentaActionPerformed(evt);
            }
        });

        btBanci.setText("Oferte Banci");
        btBanci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBanciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btPasi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEvidenta)
                    .addComponent(btBanci, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPasi)
                .addGap(18, 18, 18)
                .addComponent(jbEvidenta)
                .addGap(18, 18, 18)
                .addComponent(btBanci)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPasiActionPerformed
        new Pasi().setVisible(true);
    }//GEN-LAST:event_btPasiActionPerformed

    private void jbEvidentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEvidentaActionPerformed
        // TODO add your handling code here:
        new jfDocumente().setVisible(true);
    }//GEN-LAST:event_jbEvidentaActionPerformed

    private void btBanciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBanciActionPerformed
        new Banca().setVisible(true);
    }//GEN-LAST:event_btBanciActionPerformed
    
    private String Mesaj(data.Contact c){
        String g = c.toString();
        String[] elem = g.split(",");
        int i = elem[1].length();
        String pren = elem[1].substring(10,i-1) ;
        return pren;
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBanci;
    private javax.swing.JButton btPasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbEvidenta;
    private javax.swing.JLabel lbMesaj;
    // End of variables declaration//GEN-END:variables
}
