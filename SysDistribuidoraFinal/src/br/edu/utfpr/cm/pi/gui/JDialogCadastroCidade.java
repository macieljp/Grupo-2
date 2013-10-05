/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.gui;

import br.edu.utfpr.cm.pi.conexao.TransactionManager;
import br.edu.utfpr.cm.pi.daos.DaoCidade;
import br.edu.utfpr.cm.pi.daos.DaoEstado;
import br.edu.utfpr.cm.pi.entidades.Cidade;
import br.edu.utfpr.cm.pi.entidades.Estado;
import br.edu.utfpr.cm.pi.util.Util;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulo
 */
public class JDialogCadastroCidade extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastroCidade
     */
    List<Estado> estados;
    List<Cidade> cidades;

    public JDialogCadastroCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        carregarComboBoxEstado();
        carregarTabelaComCidades();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonFechar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextFieldNomeCidade = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxEstados = new javax.swing.JComboBox();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCidades = new javax.swing.JTable();
        jButtonPesProdAtualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSeparator1.setMaximumSize(new java.awt.Dimension(665, 1));
        jSeparator1.setMinimumSize(new java.awt.Dimension(665, 1));
        jSeparator1.setPreferredSize(new java.awt.Dimension(665, 1));

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Close.png"))); // NOI18N
        jButtonFechar.setToolTipText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonApagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/trash.png"))); // NOI18N
        jButtonApagar.setToolTipText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/clear02.png"))); // NOI18N
        jButtonLimpar.setToolTipText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/save01.png"))); // NOI18N
        jButtonSalvar.setToolTipText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jTextFieldNomeCidade.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTextFieldNomeCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCidadeActionPerformed(evt);
            }
        });

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabelCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelCodigo.setText("Código:");

        jLabelDescricao.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelDescricao.setText("Cidade:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro de Cidade");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Estado:");

        jComboBoxEstados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jSeparator3.setMaximumSize(new java.awt.Dimension(665, 1));
        jSeparator3.setMinimumSize(new java.awt.Dimension(665, 1));
        jSeparator3.setPreferredSize(new java.awt.Dimension(665, 1));

        jSeparator4.setMaximumSize(new java.awt.Dimension(665, 1));
        jSeparator4.setMinimumSize(new java.awt.Dimension(665, 1));
        jSeparator4.setPreferredSize(new java.awt.Dimension(665, 1));

        jTableCidades.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCidades);

        jButtonPesProdAtualizar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesProdAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/update.png"))); // NOI18N
        jButtonPesProdAtualizar.setToolTipText("Atualizar");
        jButtonPesProdAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesProdAtualizarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/add_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelDescricao)
                                    .addComponent(jLabelCodigo)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCodigo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jButtonSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonLimpar)
                                .addGap(2, 2, 2)
                                .addComponent(jButtonApagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 612, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPesProdAtualizar)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 602, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonLimpar)
                        .addComponent(jButtonSalvar)
                        .addComponent(jButtonApagar))
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesProdAtualizar)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(365, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed

        dispose();

    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        limparFormulario();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        cadastrarCidade();
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNomeCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCidadeActionPerformed

    private void jButtonPesProdAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesProdAtualizarActionPerformed
        // TODO add your handling code here:
        editarCidade();
    }//GEN-LAST:event_jButtonPesProdAtualizarActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        // TODO add your handling code here:
        deletarCidade();
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogCadastroEstado(null, true));
        carregarComboBoxEstado();
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
            java.util.logging.Logger.getLogger(JDialogCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastroCidade dialog = new JDialogCadastroCidade(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonPesProdAtualizar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxEstados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTableCidades;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNomeCidade;
    // End of variables declaration//GEN-END:variables

    private void limparFormulario() {
        jTextFieldCodigo.setText(null);
        jTextFieldNomeCidade.setText(null);
        jTextFieldNomeCidade.setBackground(Color.white);
    }

    private void cadastrarCidade() {
        if (validarCampos()) {
            Cidade cidade = new Cidade();
            if (new Util().validarID(jTextFieldCodigo.getText())) {
                cidade.setId(Integer.parseInt(jTextFieldCodigo.getText()));
                cidade.setNome(jTextFieldNomeCidade.getText());
                cidade.setEstado(estados.get(jComboBoxEstados.getSelectedIndex()));
            } else {
                cidade.setNome(jTextFieldNomeCidade.getText());
                cidade.setEstado(estados.get(jComboBoxEstados.getSelectedIndex()));
            }


            try {
                TransactionManager.beginTransaction();
                DaoCidade dGP = new DaoCidade();
                dGP.persist(cidade);
                TransactionManager.commit();
                JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!");
                limparFormulario();
                carregarTabelaComCidades();
            } catch (Exception e) {
                TransactionManager.rollback();
                JOptionPane.showMessageDialog(rootPane, "A cidade não pode ser cadastrado");
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Verifique os erros antes de continuar!");
        }
    }

    private void abrirJanelaDePesquisa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void editarCidade() {
        int linha = jTableCidades.getSelectedRow();
        if (linha != -1) {
            Cidade cidade = cidades.get(linha);
            preencherFormularioComDados(cidade);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para editar!.");
            return;
        }
    }

    private void carregarComboBoxEstado() {
        estados = new DaoEstado().list();
        jComboBoxEstados.removeAllItems();
        for (int i = 0; i < estados.size(); i++) {
            jComboBoxEstados.addItem(estados.get(i).getNome() + " - " + estados.get(i).getSigla());
        }
    }

    private boolean validarCampos() {
        int erros = 0;
        if (jTextFieldNomeCidade.getText() == null || jTextFieldNomeCidade.getText().equals("")) {
            jTextFieldNomeCidade.setBackground(new Color(247, 169, 157));
            erros++;
        }
        if (erros != 0) {
            return false;
        }
        return true;
    }

    private void carregarTabelaComCidades() {
        DaoCidade dGP = new DaoCidade();
        cidades = dGP.list();
        mostrarCidades(cidades);
    }

    private void mostrarCidades(List<Cidade> cidades) {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Código", "Nome", "Estado", "Sigla"});

        if (cidades != null) {
            for (Cidade cidade : cidades) {
                model.addRow(new Object[]{cidade.getId(), cidade.getNome(), cidade.getEstado().getNome(), cidade.getEstado().getSigla()});
            }
            jTableCidades.setModel(model);
        }
    }

    private void deletarCidade() {
        if (new Util().validarID(jTextFieldCodigo.getText())) {
            try {
                TransactionManager.beginTransaction();
                Integer id = Integer.parseInt(jTextFieldCodigo.getText());
                DaoCidade dE = new DaoCidade();
                Cidade cidade = dE.retrive(id);
                dE.delete(cidade);
                TransactionManager.commit();
                carregarTabelaComCidades();
                limparFormulario();
                JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir!");
                TransactionManager.rollback();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma cidade para excluir!");
        }
    }

    private void preencherFormularioComDados(Cidade cidade) {
        jTextFieldCodigo.setText(String.valueOf(cidade.getId()));
        jTextFieldNomeCidade.setText(cidade.getNome());
        jComboBoxEstados.setSelectedIndex(buscarIndiceDoEstado(cidade));
    }

    private int buscarIndiceDoEstado(Cidade cidade) {
        for (int i = 0; i < estados.size(); i++) {
            if (cidade.getEstado().getId() == estados.get(i).getId()) {
                return i;
            }
        }
        return 0;
    }
}
