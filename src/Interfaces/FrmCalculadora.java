package Interfaces;

import Met.Calculadora.Metodos;

public class FrmCalculadora extends javax.swing.JInternalFrame {



    // declaração deatributos dea classe
    boolean ponto = true;
    String conteudo;

    String valor1, valor2;
    Double resultado;
    String operador;

    public FrmCalculadora() {

   

        initComponents();
        // construtor de classe - frm

        txtResultado.setText("0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        setIconifiable(true);
        setMaximizable(true);
        setClosable(true);
        setResizable(true);

        painel = new javax.swing.JPanel();
        btnUmx = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        bnt7 = new javax.swing.JButton();
        btnX2 = new javax.swing.JButton();
        btnXy = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnTrocaSinal = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnCs = new javax.swing.JButton();
        btnIgualzin = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnPorcentagem = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        txtMarca = new javax.swing.JLabel();
        txtModelo1 = new javax.swing.JLabel();
        txtHistorico = new javax.swing.JTextField();

        painel.setBackground(new java.awt.Color(0, 0, 0));
        painel.setForeground(new java.awt.Color(0, 0, 0));

        btnUmx.setBackground(new java.awt.Color(113, 113, 113));
        btnUmx.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnUmx.setForeground(new java.awt.Color(255, 255, 255));
        btnUmx.setText("¹/x  ");
        btnUmx.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnUmx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmxActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(30, 30, 30));
        btn5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(30, 30, 30));
        btn6.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        bnt7.setBackground(new java.awt.Color(30, 30, 30));
        bnt7.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        bnt7.setForeground(new java.awt.Color(255, 255, 255));
        bnt7.setText("7");
        bnt7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        bnt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt7ActionPerformed(evt);
            }
        });

        btnX2.setBackground(new java.awt.Color(113, 113, 113));
        btnX2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnX2.setForeground(new java.awt.Color(255, 255, 255));
        btnX2.setText("X²");
        btnX2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnX2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnX2ActionPerformed(evt);
            }
        });

        btnXy.setBackground(new java.awt.Color(113, 113, 113));
        btnXy.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnXy.setForeground(new java.awt.Color(255, 255, 255));
        btnXy.setText("x^y");
        btnXy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnXy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXyActionPerformed(evt);
            }
        });

        btnBackspace.setBackground(new java.awt.Color(113, 113, 113));
        btnBackspace.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        btnBackspace.setForeground(new java.awt.Color(255, 255, 255));
        btnBackspace.setText("←");
        btnBackspace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(30, 30, 30));
        btn8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(30, 30, 30));
        btn9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMais.setBackground(new java.awt.Color(255, 102, 0));
        btnMais.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnMais.setForeground(new java.awt.Color(255, 255, 255));
        btnMais.setText("+");
        btnMais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(255, 102, 0));
        btnMenos.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos.setText("-");
        btnMenos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnTrocaSinal.setBackground(new java.awt.Color(113, 113, 113));
        btnTrocaSinal.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnTrocaSinal.setForeground(new java.awt.Color(255, 255, 255));
        btnTrocaSinal.setText("±\t");
        btnTrocaSinal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnTrocaSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocaSinalActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(30, 30, 30));
        btn3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(30, 30, 30));
        btn2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(30, 30, 30));
        btn1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnMultiplicacao.setBackground(new java.awt.Color(255, 102, 0));
        btnMultiplicacao.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacao.setText("×");
        btnMultiplicacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(30, 30, 30));
        btn4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(30, 30, 30));
        btn0.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPonto.setBackground(new java.awt.Color(113, 113, 113));
        btnPonto.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnPonto.setText(".");
        btnPonto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(255, 102, 0));
        btnDivisao.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("÷");
        btnDivisao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnCs.setBackground(new java.awt.Color(113, 113, 113));
        btnCs.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCs.setForeground(new java.awt.Color(255, 255, 255));
        btnCs.setText("C");
        btnCs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnCs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCsActionPerformed(evt);
            }
        });

        btnIgualzin.setBackground(new java.awt.Color(255, 102, 0));
        btnIgualzin.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnIgualzin.setForeground(new java.awt.Color(255, 255, 255));
        btnIgualzin.setText("=");
        btnIgualzin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnIgualzin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualzinActionPerformed(evt);
            }
        });

        btnRaiz.setBackground(new java.awt.Color(113, 113, 113));
        btnRaiz.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(255, 255, 255));
        btnRaiz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnRaiz.setLabel("√");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnPorcentagem.setBackground(new java.awt.Color(113, 113, 113));
        btnPorcentagem.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnPorcentagem.setForeground(new java.awt.Color(255, 255, 255));
        btnPorcentagem.setText("%");
        btnPorcentagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentagemActionPerformed(evt);
            }
        });

        txtResultado.setBackground(new java.awt.Color(0, 0, 0));
        txtResultado.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setToolTipText("");
        txtResultado.setBorder(null);

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtModelo1.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtModelo1.setForeground(new java.awt.Color(255, 255, 255));
        txtModelo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtHistorico.setBackground(new java.awt.Color(0, 0, 0));
        txtHistorico.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txtHistorico.setForeground(new java.awt.Color(153, 153, 153));
        txtHistorico.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtHistorico.setToolTipText("");
        txtHistorico.setBorder(null);

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUmx, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTrocaSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIgualzin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnX2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXy, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(btnCs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addComponent(txtHistorico)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtResultado)))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnt7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUmx, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXy, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnX2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgualzin, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrocaSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(txtModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 699, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUmxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmxActionPerformed

    }//GEN-LAST:event_btnUmxActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // metodo para caractere string
        teclaNumerica("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // metodo para caractere string
        teclaNumerica("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void bnt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt7ActionPerformed
        // metodo para caractere string
        teclaNumerica("7");
    }//GEN-LAST:event_bnt7ActionPerformed

    private void btnX2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnX2ActionPerformed

        // numero elevado ao quadrado
        conteudo = txtResultado.getText();
        if (conteudo.length() > 0) {
            resultado = Math.pow(Double.parseDouble(conteudo), 2);
            txtResultado.setText(resultado.toString());

        }

    }//GEN-LAST:event_btnX2ActionPerformed

    private void btnXyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXyActionPerformed

        // potenciação x elevado a y
        if (!txtResultado.getText().equals("")) {
            valor1 = txtResultado.getText();
            operador = "x^y";
            this.txtHistorico.setText(valor1 + "^");
            txtResultado.setText("");

        }
    }//GEN-LAST:event_btnXyActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        //efeito backspace - apaga caractere  esquerda do visor

        conteudo = txtResultado.getText();
        if (conteudo.length() > 1) {

            // atributo de conteudo sera acessado como um String de caracteres, iniciado a direita o  primeiro elemento
            conteudo = conteudo.substring(0, conteudo.length() - 1);
            txtResultado.setText(conteudo);
        } else {
            txtResultado.setText("0");
        }

    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // metodo para caractere string
        teclaNumerica("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // metodo para caractere string
        teclaNumerica("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        // soma valor1 e utiliza o operado ' +' par efetuar operação
        if (!txtResultado.getText().equals("")) {
            valor1 = txtResultado.getText();
            operador = " + ";
            this.txtHistorico.setText(valor1 + " + ");
            txtResultado.setText("");

        }
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // Subtraçõo valor1 e utiliza o operado ' +' par efetuar operação

        if (!txtResultado.getText().equals("")) {
            valor1 = txtResultado.getText();
            operador = " - ";
            this.txtHistorico.setText(valor1 + " - ");

            txtResultado.setText("");

        }
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        // MULTIPLICAÇÃO valor1 e utiliza o operado ' +' par efetuar operação
        if (!txtResultado.getText().equals("")) {
            valor1 = txtResultado.getText();
            operador = " * ";
            this.txtHistorico.setText(valor1 + " × ");
            txtResultado.setText("");
        }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // metodo para caractere string
        teclaNumerica("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // metodo para caractere string
        teclaNumerica("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed

        // atributo reeb valor do vsor da calculadora
        conteudo = txtResultado.getText();

        // se o conteudo for menor ou igual a 0 (exibir 0)
        if (conteudo.length() <= 0) {
            txtResultado.setText("0");

        } else // se exibir " ponto" não poedra inserir outro
        if (txtResultado.getText().contains(".")) {
            ponto = false;
        } else {
            txtResultado.setText(txtResultado.getText() + ".");
        }

    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed

        // DIVISAO valor1 e utiliza o operado ' +' par efetuar operação
        if (!txtResultado.getText().equals("")) {
            valor1 = txtResultado.getText();
            operador = " / ";
            this.txtHistorico.setText(valor1 + " ÷ ");
            txtResultado.setText("");
    }//GEN-LAST:event_btnDivisaoActionPerformed
    }
    private void btnTrocaSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocaSinalActionPerformed
        // troca de sinal do numero no painel de visualização
        conteudo = txtResultado.getText();
        if (conteudo.length() > 0) {

            resultado = (-1) * Double.parseDouble(conteudo);

            txtResultado.setText(resultado.toString());

        }
    }//GEN-LAST:event_btnTrocaSinalActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // metodo para caractere string
        teclaNumerica("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // metodo para caractere string
        teclaNumerica("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        // raiz quadrada de um numero
        conteudo = txtResultado.getText();
        if (Double.parseDouble(conteudo) > 0) {

            resultado = Math.sqrt(Double.parseDouble(conteudo));
            txtResultado.setText(resultado.toString());
            this.txtHistorico.setText("√" + conteudo);
        } else if (Double.parseDouble(conteudo) == 0) {
            this.txtHistorico.setText("√(0)");

        } else {

            txtResultado.setText("Error < 0");
        }
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnIgualzinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualzinActionPerformed
        // instanciar de um objeto para crasse Metodos

        Metodos met = new Metodos();

// atributo para resultado da operação selecionada
        String resultCalc;

        valor2 = txtResultado.getText();

        if (!valor2.equals("")) {
            resultCalc = met.operacoes(valor1, valor2, operador);
            String temp = valor2;

            txtResultado.setText(resultCalc);
            this.txtHistorico.setText(txtHistorico.getText() + valor2);

        }

        valor1 = "0";
        valor2 = "0";
    }//GEN-LAST:event_btnIgualzinActionPerformed

    private void btnPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentagemActionPerformed
        valor2 = txtResultado.getText();
        // calculo da porcentagem
        if (!valor2.equals("0")) {
            this.txtHistorico.setText(txtHistorico.getText() + valor2 + " %");

            double num1 = Double.parseDouble(valor1);
            double num2 = Double.parseDouble(valor2) / 100;

            resultado = (num1 * num2);
            txtResultado.setText(resultado.toString());

        }
    }//GEN-LAST:event_btnPorcentagemActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // metodo para caractere string
        teclaNumerica("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnCsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCsActionPerformed
        // limpa textfild e inicializar valor
        this.txtResultado.setText("0");
        this.txtResultado.setText("");
        this.txtHistorico.setText("0");
        this.txtHistorico.setText("");
    }//GEN-LAST:event_btnCsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt7;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnCs;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgualzin;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorcentagem;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnTrocaSinal;
    private javax.swing.JButton btnUmx;
    private javax.swing.JButton btnX2;
    private javax.swing.JButton btnXy;
    private javax.swing.JPanel painel;
    private javax.swing.JTextField txtHistorico;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    private void teclaNumerica(String tecla) {

        if (txtResultado.getText().equals("0")) {
            txtResultado.setText(tecla);
        } else {
            txtResultado.setText(txtResultado.getText() + tecla);

        }

    }

}
