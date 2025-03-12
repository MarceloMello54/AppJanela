package Interfaces;

import metTriangulo.Condicao;
import metTriangulo.Triangulo;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FrmTriangulo extends javax.swing.JInternalFrame {

    // instancia de objetos para acesso as classes
    // Triângulo.java
    Triangulo tri = new Triangulo();
    Condicao dados = new Condicao();

    String tipoT = null;
    public Image image;

    public FrmTriangulo() {
        initComponents();

        txtLadoA.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);
        setResizable(true);

        jButton2 = new javax.swing.JButton();
        txtResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLadoA = new javax.swing.JTextField();
        txtLadoB = new javax.swing.JTextField();
        txtLadoC = new javax.swing.JTextField();
        imgPainel = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtResultado.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Identificação: Tipos de Triângulo");

        jLabel2.setText("Lado A");

        jLabel3.setText("Lado B");

        jLabel4.setText("Lado C");

        txtLadoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLadoAKeyPressed(evt);
            }
        });

        txtLadoB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLadoBKeyPressed(evt);
            }
        });

        imgPainel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnVerificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(btnVerificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        txtLadoA.setText("");
        txtLadoB.setText("");
        txtLadoC.setText("");
        txtResultado.setText("");
        imgPainel.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtLadoAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoAKeyPressed
        // DEFINIR FOCO PARA PROXIMO CAMPO

        txtLadoA.addKeyListener(new KeyAdapter() {

            public void KeyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    txtLadoB.requestFocus();
                }
            }

        });

    }//GEN-LAST:event_txtLadoAKeyPressed

    private void txtLadoBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadoBKeyPressed
        // DEFINIR FOCO PARA PROXIMO CAMPO

        txtLadoB.addKeyListener(new KeyAdapter() {

            public void KeyPressed(KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    txtLadoC.requestFocus();
                }
            }

        });
    }//GEN-LAST:event_txtLadoBKeyPressed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed

        // chamada do método verificarTipo() - tipo de dados a, b, e c
        try {
            // leitura dos campos 'LADOS' no formulário
            float fladoA = Float.parseFloat(txtLadoA.getText());
            float fladoB = Float.parseFloat(txtLadoB.getText());
            float fladoC = Float.parseFloat(txtLadoC.getText());

            // popular a classe 'model Triangulo.java' com valores lidos
            tri.setfLadoA(fladoA);
            tri.setfLadoB(fladoB);
            tri.setfLadoC(fladoC);
            // verificar se valores foram um trianglo
            if (dados.verificaDados(fladoA, fladoB, fladoC)) {
                txtResultado.setText("Valores foram um Triangulo");

                // verificar tipos de triangulo
                tipoT = dados.verificaTipo(fladoA, fladoB, fladoC);
            } else {
                txtResultado.setText("Não é Triangulo");
                tipoT = "/metTriangulo/naoTriangulo.png";
            }

            // exibir no painel a imagem do triangulo vencedor
          imgPainel(tipoT);
    
         
           
        } catch (NumberFormatException e) {

            // aviso : valor invalido digitado
            String msg = "Digite somente numeros nas caixas";
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel imgPainel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLadoA;
    private javax.swing.JTextField txtLadoB;
    private javax.swing.JTextField txtLadoC;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables

    
     private void imgPainel(String tipoT) {
        
    
        // instanciar um objeto para imagem icon 
        ImageIcon figura ;
        // inicializar a imagem no objeto ' figura'
        figura = new ImageIcon( getClass().getResource(tipoT));
        
        // redimensionar a figura de acordo com o componente LABEL
        
        figura.setImage(figura.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH));
        imgPainel.setIcon(figura);
    
    
    }

    private void validaNumero(JTextField numero) {
        // declaração de uma variavek de apoio 
      
        
      // valida de preechimento da caixa de texto 
      if(numero.getText().length()!=0 ){
          
          // se verdadeiro, executa comandos do try
          try{ 
              float valor=Float.parseFloat(numero.getText().replaceAll(",","."));
          } catch (NumberFormatException e){
              // se falso, trata a exceção solicitando 
              String msg= "Esse camo so aceita numeros";
             JOptionPane.showMessageDialog( null, msg, "informação",
                     JOptionPane.INFORMATION_MESSAGE);
             numero.setText("");
             numero.requestFocusInWindow();
             
          }
        
      }
    }
}
