
package Interfaces;

import java.net.URL;
import javax.swing.ImageIcon;

public class FrmLampadas extends javax.swing.JInternalFrame {

     URL ender = null;
     int iContar = 0;
     boolean ignoreMouseMovedEvents = true;
    
    
    public FrmLampadas() {
        initComponents();
    
    
     this.imgLamp.setIcon( new ImageIcon(getClass().getResource("/img/off.jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgLamp = new javax.swing.JLabel();
        btnLigar = new javax.swing.JButton();
        btnDesligar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);
        setResizable(true);

        imgLamp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        imgLamp.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imgLampMouseMoved(evt);
            }
        });
        imgLamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imgLampMouseExited(evt);
            }
        });

        btnLigar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLigar.setText("Ligar");
        btnLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLigarActionPerformed(evt);
            }
        });

        btnDesligar.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnDesligar.setText("Desligar");
        btnDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesligarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Reparar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnLigar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDesligar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(imgLamp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(imgLamp, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLigar)
                    .addComponent(btnDesligar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imgLampMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLampMouseMoved

        if (ignoreMouseMovedEvents) {
            // chamada da função - parâmetro define ação
            fAction("on");
        }
    }//GEN-LAST:event_imgLampMouseMoved

    private void imgLampMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLampMouseExited

        if(ignoreMouseMovedEvents){
            // chamada da função - parâmetro define ação
            fAction("off");}

    }//GEN-LAST:event_imgLampMouseExited

    private void btnLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLigarActionPerformed

        // se o botão for acionado mais de 5x, a lâmpada será quebrada e os botões desabilitados
        if (iContar > 5) {
            ender = getClass().getResource("/img/broken.jpg");
            ImageIcon figura = new ImageIcon(ender);
            imgLamp.setIcon(figura);
            btnLigar.setEnabled(false);
            btnDesligar.setEnabled(false);
            ignoreMouseMovedEvents = false;
        }
        else {
            // chamada da função - parâmetro define ação
            fAction("on");
            iContar++;
        }
    }//GEN-LAST:event_btnLigarActionPerformed

    private void btnDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesligarActionPerformed

        // chamada da função - parâmetro define ação

        fAction("off");
    }//GEN-LAST:event_btnDesligarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fAction ("off");
        boolean True = false;
        iContar = 0;

        btnDesligar.setEnabled(true);
        btnLigar.setEnabled(true);
        ignoreMouseMovedEvents = true;

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesligar;
    private javax.swing.JButton btnLigar;
    private javax.swing.JLabel imgLamp;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

    
    // ------------------------------------------------------------------------------------------------------
    private void fAction(String estado) {
        
        // utilizar URL para definir endereço do arquivo
        if ("off".equals(estado)) {
            ender = getClass().getResource("/img/off.jpg");
        }
        else if ("on".equals(estado)) {
            ender = getClass().getResource("/img/on.jpg");
        }
        
        ImageIcon figura;
        figura = new ImageIcon(ender);
        imgLamp.setIcon(figura);
    }



}
