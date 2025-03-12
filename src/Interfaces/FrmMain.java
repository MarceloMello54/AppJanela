package Interfaces;

public class FrmMain extends javax.swing.JFrame {

    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jDesktop = new javax.swing.JDesktopPane();
        jMenuProjetos = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuBlocoNOtas = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuLampadas = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jDesktop.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktop)
                .addContainerGap())
        );

        jMenuProjetos.setBackground(new java.awt.Color(204, 102, 0));
        jMenuProjetos.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, new java.awt.Color(0, 0, 0)));
        jMenuProjetos.setForeground(new java.awt.Color(0, 0, 0));
        jMenuProjetos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenu1.setText("Projetos");

        jMenuBlocoNOtas.setBackground(null);
        jMenuBlocoNOtas.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBlocoNOtas.setText("Bloco de Notas");
        jMenuBlocoNOtas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBlocoNOtas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBlocoNOtasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuBlocoNOtas);

        jMenuItem5.setBackground(null);
        jMenuItem5.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem5.setText("Calculadora");
        jMenuItem5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem2.setBackground(null);
        jMenuItem2.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem2.setText("FileTXT");
        jMenuItem2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setBackground(null);
        jMenuItem4.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem4.setText("Par ou Impar");
        jMenuItem4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setBackground(null);
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setText("MiniCalculadora");
        jMenuItem1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.add(jMenuItem1);

        jMenuLampadas.setBackground(null);
        jMenuLampadas.setForeground(new java.awt.Color(0, 0, 0));
        jMenuLampadas.setText("Lampadas");
        jMenuLampadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuLampadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLampadasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuLampadas);

        jMenuItem6.setBackground(null);
        jMenuItem6.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem6.setText("Triangulo");
        jMenuItem6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuProjetos.add(jMenu1);

        jMenuSobre.setText("Sobre");
        jMenuProjetos.add(jMenuSobre);

        setJMenuBar(jMenuProjetos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLampadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLampadasActionPerformed

        FrmLampadas lampada = new FrmLampadas();
        this.jDesktop.add(lampada);
        lampada.setVisible(true);


    }//GEN-LAST:event_jMenuLampadasActionPerformed

    private void jMenuBlocoNOtasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBlocoNOtasActionPerformed
        FrmBlocodeNotas Bloco = new FrmBlocodeNotas();
        this.jDesktop.add(Bloco);
        Bloco.setVisible(true);

        // título do app
        Bloco.setTitle("Bloco de Notas");
        // setar o app sem o modo Restaurar/ Maximizar
        Bloco.setResizable(false);


    }//GEN-LAST:event_jMenuBlocoNOtasActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrmCalculadora Cal = new FrmCalculadora();
        this.jDesktop.add(Cal);
        Cal.setVisible(true);
        // título do app
        Cal.setTitle("Calculadora ");
        // setar o app sem o modo Restaurar/ Maximizar
        Cal.setResizable(false);


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        FrmFileTXT File = new FrmFileTXT();
        this.jDesktop.add(File);
        File.setVisible(true);

        // título do app
        File.setTitle("Cadastro Cliente ");
        // setar o app sem o modo Restaurar/ Maximizar
        File.setResizable(false);


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FrmTriangulo Tri = new FrmTriangulo();
        
        this.jDesktop.add(Tri);
        Tri.setVisible(true);

        // título do app
        Tri.setTitle("Consulta Triangulo ");
        // setar o app sem o modo Restaurar/ Maximizar
        Tri.setResizable(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmParImpar Parin = new FrmParImpar();
        
        
        this.jDesktop.add(Parin);
        Parin.setVisible(true);

        // título do app
        Parin.setTitle("Consulta de Pares ou Impares ");
        // setar o app sem o modo Restaurar/ Maximizar
        Parin.setResizable(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuBlocoNOtas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuLampadas;
    private javax.swing.JMenuBar jMenuProjetos;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
