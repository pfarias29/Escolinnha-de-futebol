package Telas;

import Classes.Equipe;
import Classes.Partida;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CriandoPartida extends javax.swing.JFrame {
    private ArrayList<Partida> partida = new ArrayList<>();
    private String botao;

    public CriandoPartida() throws FileNotFoundException, IOException {
        initComponents();
        
        // abre o arquivo
        File arquivo = new File ("src/Dados/dadosPartida.txt");
        File arquivo1 = new File ("src/Dados/nomeEquipe.txt");
        File arquivo2 = new File ("src/Dados/dadosArbitros");
        
        // lê o arquivo
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            while (br.ready()){
                String [] linha = br.readLine().split(";");
                // String data, float horario, String local, (arbitro), String resultado
                //Partida partida = new Partida(linha[0], Float.parseFloat(linha[1]), linha[2], linha[3], linha[4], linha[5], linha[6]);
                
                partida.add(partida);
            }
            
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        carregarTabelaPartida();
    }
    
    public void carregarTabelaPartida(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Data", "Horario", "Local", "Arbitro", "Time A", "Time B", "Resultado"},0){;
        @Override
        public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (int i=0; i < partida.size();i++){ 
            Object linha[] = new Object[] {partida.get(i).getData(),
                                           partida.get(i).getHorario(),
                                           partida.get(i).getLocal(),
                                           partida.get(i).getArbitro(),
                                           partida.get(i).getEquipe(),
                                           partida.get(i).getEquipe(),
                                           partida.get(i).getResultado()};
            modelo.addRow(linha);
        }
        // Atualizando Tabela
        tblPartidas.setModel(modelo);
        
                // Alterando o tamanho da tabela
        tblPartidas.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblPartidas.getColumnModel().getColumn(1).setPreferredWidth(10);
        tblPartidas.getColumnModel().getColumn(2).setPreferredWidth(50);
        tblPartidas.getColumnModel().getColumn(3).setPreferredWidth(100);
        tblPartidas.getColumnModel().getColumn(4).setPreferredWidth(5);
        tblPartidas.getColumnModel().getColumn(5).setPreferredWidth(5);
        tblPartidas.getColumnModel().getColumn(6).setPreferredWidth(20);
    
    }
    // combobox Local
    public void carregarLocal(){
        // Remove os itens da ComboBox
        cmbLocalPartida.removeAllItems();
        
        // Selecionando o primeiro item
        cmbLocalPartida.addItem("Selecione um local");
        
        for (int i=0; i < partida.size();i++){
            cmbLocalPartida.addItem(partida.get(i).getLocal());
        }    
    }
    // combobox Arbitro
    public void carregarArbitro(){
        // Remove os itens da ComboBox
        cmbArbitro.removeAllItems();
        
        // Selecionando o primeiro item
        cmbArbitro.addItem("Selecione um arbitro");
        
        //for (int i=0; i < arbitros.size();i++){
        //    cmbArbitro.addItem(arbitros.getArbitro());
        //}    
    }
    // combobox Equipe A
    public void carregarEquipeA(){
        // Remove os itens da ComboBox
        cmbEquipeA.removeAllItems();
        
        // Selecionando o primeiro item
        cmbEquipeA.addItem("Selecione uma equipe");
        
        //for (int i=0; i < equipe.size();i++){
        //    cmbEquipeA.addItem(equipe.get(i).getEquipe());
        //}    
    }
    // combobox Equipe A
    public void carregarEquipeB(){
        // Remove os itens da ComboBox
        cmbEquipeB.removeAllItems();
        
        // Selecionando o primeiro item
        cmbEquipeB.addItem("Selecione uma equipe");
        
        //for (int i=0; i < equipe.size();i++){
        //    cmbEquipeA.addItem(equipe.get(i).getEquipe());
        //}    
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        lblHorario = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        lbllocalConfronto = new javax.swing.JLabel();
        cmbLocalPartida = new javax.swing.JComboBox<>();
        lblArbitro = new javax.swing.JLabel();
        cmbArbitro = new javax.swing.JComboBox<>();
        lblX = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        cmbEquipeA = new javax.swing.JComboBox<>();
        cmbEquipeB = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblImage = new javax.swing.JLabel();
        btnNovaPartida = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPartidas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Partidas");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 102));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/campoFutebol.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Cadastro de Partidas"));

        lblData.setText("Data:");

        txtData.setBackground(new java.awt.Color(204, 204, 204));

        lblHorario.setText("Horário:");

        txtHorario.setBackground(new java.awt.Color(204, 204, 204));

        lbllocalConfronto.setText("Local do Confronto:");

        cmbLocalPartida.setBackground(new java.awt.Color(204, 204, 204));
        cmbLocalPartida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o local", "Campo 1", "Campo 2", "Campo 3", "Campo 4", "Campo 5", "Campo 6", "Campo 7" }));
        cmbLocalPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocalPartidaActionPerformed(evt);
            }
        });

        lblArbitro.setText("Arbitro do confronto:");

        cmbArbitro.setBackground(new java.awt.Color(204, 204, 204));
        cmbArbitro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o árbitro", "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblX.setText("X");

        lblResultado.setText("Resultado:");

        txtResultado.setBackground(new java.awt.Color(204, 204, 204));

        cmbEquipeA.setBackground(new java.awt.Color(204, 204, 204));
        cmbEquipeA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipe A", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEquipeA.setToolTipText("Equipe A");
        cmbEquipeA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbEquipeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEquipeAActionPerformed(evt);
            }
        });

        cmbEquipeB.setBackground(new java.awt.Color(204, 204, 204));
        cmbEquipeB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipe B", "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEquipeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEquipeBActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gol.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblResultado)
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbllocalConfronto)
                                .addGap(18, 18, 18)
                                .addComponent(cmbLocalPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblArbitro)
                                    .addComponent(cmbEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(cmbArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(lblX)
                                        .addGap(28, 28, 28)
                                        .addComponent(cmbEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblData)
                        .addGap(32, 32, 32)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHorario)
                        .addGap(18, 18, 18)
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblData)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHorario)
                            .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLocalPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllocalConfronto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblArbitro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblX)
                    .addComponent(cmbEquipeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEquipeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultado)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        cmbEquipeA.getAccessibleContext().setAccessibleName("Equipe A");

        btnNovaPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jogando.png"))); // NOI18N
        btnNovaPartida.setText("Nova Partida");
        btnNovaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPartidaActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salvar1.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editar1.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excluirJogador.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));

        tblPartidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblPartidas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblPartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horário", "Local", "Árbitro", "Time A", "Time B", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPartidas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNovaPartida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnSair)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovaPartida)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCancelar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Variavel global do botão para identificar se é para editar, salvar...
        botao = "editar";
        
        // Limpando os campos
        txtData.setText("");
        txtHorario.setText("");
        cmbLocalPartida.removeAllItems();
        cmbLocalPartida.addItem("Selecione um Local!");
        cmbArbitro.removeAllItems();
        cmbArbitro.addItem("Selecione um Arbitro!");
        cmbEquipeA.removeAllItems();
        cmbEquipeA.addItem("Selecione uma Equipe!");
        cmbEquipeB.removeAllItems();
        cmbEquipeB.addItem("Selecione uma equipe!");
        txtResultado.setText("");
        
        //Habilitar / Desabilitar botões
        btnNovaPartida.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        
        // Habilitar / Desabilitar campos de texto
        txtData.setEnabled(true);
        txtHorario.setEnabled(true);
        cmbLocalPartida.setEnabled(true);
        cmbArbitro.setEnabled(true);
        cmbEquipeA.setEnabled(true);
        cmbEquipeB.setEnabled(true);
        txtResultado.setEnabled(true);
        
          // cursor no campo código
        txtData.requestFocus();
        
        carregarTabelaPartida();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cmbLocalPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocalPartidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLocalPartidaActionPerformed

    private void cmbEquipeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEquipeAActionPerformed
        // Verificar questão de arquivos -Apenas 10
    }//GEN-LAST:event_cmbEquipeAActionPerformed

    private void cmbEquipeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEquipeBActionPerformed
        // Verificar 
    }//GEN-LAST:event_cmbEquipeBActionPerformed

    private void btnNovaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPartidaActionPerformed
        // Variavel global do botão para identificar se é para editar, salvar...
        botao = "novo";
        
        // Limpando os campos
        txtData.setText("");
        txtHorario.setText("");
        cmbLocalPartida.removeAllItems();
        cmbLocalPartida.addItem("Selecione um Local!");
        cmbArbitro.removeAllItems();
        cmbArbitro.addItem("Selecione um Arbitro!");
        cmbEquipeA.removeAllItems();
        cmbEquipeA.addItem("Selecione uma Equipe!");
        cmbEquipeB.removeAllItems();
        cmbEquipeB.addItem("Selecione uma equipe!");
        txtResultado.setText("");
        
        //Habilitar / Desabilitar botões
        btnNovaPartida.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        
        // Habilitar / Desabilitar campos de texto
        txtData.setEnabled(true);
        txtHorario.setEnabled(true);
        cmbLocalPartida.setEnabled(true);
        cmbArbitro.setEnabled(true);
        cmbEquipeA.setEnabled(true);
        cmbEquipeB.setEnabled(true);
        txtResultado.setEnabled(true);
        
          // cursor no campo código
        txtData.requestFocus();
        
        carregarTabelaPartida();
    }//GEN-LAST:event_btnNovaPartidaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // verifica se todos os campos estão preenchidos
        //"Data", "Horario", "Local", "Arbitro", "Time A", "Time B", "Resultado"
        if(txtData.getText().equals("") || txtHorario.getText().equals("") || cmbLocalPartida.getSelectedItem().equals("") || cmbArbitro.getSelectedItem().equals("") || cmbEquipeA.getSelectedItem().equals("") || cmbEquipeB.getSelectedItem().equals("") || txtResultado.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            // cursor no campo código
            txtData.requestFocus();
            
            //salvando os dados
            String data = txtData.getText();
            float horario = Float.parseFloat(txtHorario.getText());
            String local = (String) cmbLocalPartida.getSelectedItem();
            String arbitro = (String) cmbArbitro.getSelectedItem();
            String equipeA = (String) cmbEquipeA.getSelectedItem();
            String equipeB = (String) cmbEquipeB.getSelectedItem();
            String resultado = txtResultado.getText();
            
            File arquivo = new File("src/Dados/dadosPartidas.txt");        
            
            // verifica se for pra "Salvar"
            if (botao.equals("novo")){
                Partida partida = new Partida(data, horario, local, arbitro, equipeA, equipeB, resultado);
                
                // carregando as partidas
                partida.add(partida);
                
                try{
                   FileWriter fw = new FileWriter(arquivo);
                   BufferedWriter bw = new BufferedWriter(fw);
                   
                   bw.write(data + ";" + horario + ";" + local + ";" + arbitro + ";" + equipeA + ";" + equipeB + ";" + resultado);
                   bw.newLine();
                   
                   bw.close();
                } catch(IOException e) {
                   JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
                   return;
                }
                
                //JOptionPane.showMessageDialog(null,"Partida cadastrada com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }else if(botao.equals("editar")){     //Verifica se é para "editar"
                //selecionando na tabela a linha para editar
                int index = tblPartidas.getSelectedRow();
                
                // caso não seja possível abrir o arquivo
                try {
                    FileReader fr = new FileReader(arquivo);
                    BufferedReader br = new BufferedReader(fr);
                    
                    ArrayList<String> partidas = new ArrayList<>();
                    
                    for(int j = 0; br.ready(); j++) {
                        if (j != index) {
                            String linha = br.readLine();
                            partidas.add(linha);
                        } else {
                            partidas.add(data + ";" + horario + ";" + local + ";" + arbitro + ";" + equipeA + ";" + equipeB + ";" + resultado);
                        }
                    }
                    br.close();
                    
                    FileWriter fw = new FileWriter(arquivo);
                    BufferedWriter bw = new BufferedWriter(fw);
                                        
                    for(int j = 0; j < partidas.size(); j++) {
                        bw.write(partidas.get(j));
                    }
                    
                    bw.close();
                    
                } catch(IOException e) {
                    JOptionPane.showMessageDialog(null, "Não foi pssível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // passando os valores possiveis editáveis
                partida.get(index).setData(data);
                partida.get(index).setHorario(horario);
                partida.get(index).setLocal(local);
                partida.get(index).setArbitro(arbitro);
                partida.get(index).setEquipe(equipeA);
                partida.get(index).setEquipe(equipeB);
                partida.get(index).setResultado(resultado);      
            }
            
            // atualizando tabela de partidas
            carregarTabelaPartida();
            JOptionPane.showMessageDialog(null, "Partida cadastrada com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            
            // Limpando os campos
            txtData.setText("");
            txtHorario.setText("");
            cmbLocalPartida.removeAllItems();
            cmbLocalPartida.addItem("Selecione um Local!");
            cmbArbitro.removeAllItems();
            cmbArbitro.addItem("Selecione um Arbitro!");
            cmbEquipeA.removeAllItems();
            cmbEquipeA.addItem("Selecione uma Equipe!");
            cmbEquipeB.removeAllItems();
            cmbEquipeB.addItem("Selecione uma equipe!");
            txtResultado.setText("");
            
            //Habilitar / Desabilitar botões
            btnNovaPartida.setEnabled(true);
            btnSalvar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
            btnPesquisar.setEnabled(true);
            
            // Habilitar / Desabilitar campos de texto
            txtData.setEnabled(false);
            txtHorario.setEnabled(false);
            cmbLocalPartida.setEnabled(false);
            cmbArbitro.setEnabled(false);
            cmbEquipeA.setEnabled(false);
            cmbEquipeB.setEnabled(false);
            txtResultado.setEnabled(false);
            
            
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        tblPartidas.clearSelection();
        
        // Limpando os campos
        txtData.setText("");
        txtHorario.setText("");
        cmbLocalPartida.removeAllItems();
        cmbLocalPartida.addItem("Selecione um Local!");
        cmbArbitro.removeAllItems();
        cmbArbitro.addItem("Selecione um Arbitro!");
        cmbEquipeA.removeAllItems();
        cmbEquipeA.addItem("Selecione uma Equipe!");
        cmbEquipeB.removeAllItems();
        cmbEquipeB.addItem("Selecione uma equipe!");
        txtResultado.setText("");
        
        //Habilitar / Desabilitar botões
        btnNovaPartida.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(true);
        
        // Habilitar / Desabilitar campos de texto
        txtData.setEnabled(false);
        txtHorario.setEnabled(false);
        cmbLocalPartida.setEnabled(false);
        cmbArbitro.setEnabled(false);
        cmbEquipeA.setEnabled(false);
        cmbEquipeB.setEnabled(false);
        txtResultado.setEnabled(false);

        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // Verifica qual linha foi selecionada 
        int index = tblPartidas.getSelectedRow();
        
        //Verifica se a linha é correta
        if (index >=0 && index < partida.size()){
            partida.remove(index);
        }
        
        carregarTabelaPartida();
        // Limpando os campos
        txtData.setText("");
        txtHorario.setText("");
        cmbLocalPartida.removeAllItems();
        cmbLocalPartida.addItem("Selecione um Local!");
        cmbArbitro.removeAllItems();
        cmbArbitro.addItem("Selecione um Arbitro!");
        cmbEquipeA.removeAllItems();
        cmbEquipeA.addItem("Selecione uma Equipe!");
        cmbEquipeB.removeAllItems();
        cmbEquipeB.addItem("Selecione uma equipe!");
        txtResultado.setText("");
        
        //Habilitar / Desabilitar botões
        btnNovaPartida.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        
        // Habilitar / Desabilitar campos de texto
        txtData.setEnabled(false);
        txtHorario.setEnabled(false);
        cmbLocalPartida.setEnabled(false);
        cmbArbitro.setEnabled(false);
        cmbEquipeA.setEnabled(false);
        cmbEquipeB.setEnabled(false);
        txtResultado.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (partida.isEmpty()){ //se estiver vazia
            JOptionPane.showMessageDialog(null, "A lista está vazia!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else {
            // Limpando os campos
        txtData.setText("");
        txtHorario.setText("");
        cmbLocalPartida.removeAllItems();
        cmbLocalPartida.addItem("Selecione um Local!");
        cmbArbitro.removeAllItems();
        cmbArbitro.addItem("Selecione um Arbitro!");
        cmbEquipeA.removeAllItems();
        cmbEquipeA.addItem("Selecione uma Equipe!");
        cmbEquipeB.removeAllItems();
        cmbEquipeB.addItem("Selecione uma equipe!");
        txtResultado.setText("");
        
        //Habilitar / Desabilitar botões
        btnNovaPartida.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnPesquisar.setEnabled(false);
        
        // Habilitar / Desabilitar campos de texto
        txtData.setEnabled(false);
        txtHorario.setEnabled(false);
        cmbLocalPartida.setEnabled(false);
        cmbArbitro.setEnabled(false);
        cmbEquipeA.setEnabled(false);
        cmbEquipeB.setEnabled(false);
        txtResultado.setEnabled(false);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
                if ("nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriandoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriandoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriandoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriandoPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CriandoPartida().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(CriandoPartida.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovaPartida;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbArbitro;
    private javax.swing.JComboBox<String> cmbEquipeA;
    private javax.swing.JComboBox<String> cmbEquipeB;
    private javax.swing.JComboBox<String> cmbLocalPartida;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblArbitro;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lbllocalConfronto;
    private javax.swing.JTable tblPartidas;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables

    }


