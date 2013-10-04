/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.gui;

import br.edu.utfpr.cm.pi.util.ReportManage;
import br.edu.utfpr.cm.pi.util.Util;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author JoaoPaulo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        colocarTema();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        jToolBarMenu = new javax.swing.JToolBar();
        btCadastrarCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btPesquisarCliente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        lbDuffBeer = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnFornecedor = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnProduto = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        jMenuItem15 = new javax.swing.JMenuItem();
        jSeparator19 = new javax.swing.JPopupMenu.Separator();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator20 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator21 = new javax.swing.JPopupMenu.Separator();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator22 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(860, 640));
        setMinimumSize(new java.awt.Dimension(860, 640));
        setPreferredSize(new java.awt.Dimension(860, 640));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMenu.setMaximumSize(new java.awt.Dimension(50, 860));
        pnMenu.setMinimumSize(new java.awt.Dimension(50, 860));
        pnMenu.setPreferredSize(new java.awt.Dimension(50, 860));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBarMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBarMenu.setRollover(true);
        jToolBarMenu.setMaximumSize(new java.awt.Dimension(860, 50));
        jToolBarMenu.setMinimumSize(new java.awt.Dimension(860, 50));
        jToolBarMenu.setPreferredSize(new java.awt.Dimension(860, 50));

        btCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Cliente_32.png"))); // NOI18N
        btCadastrarCliente.setToolTipText("Cadastrar Cliente");
        btCadastrarCliente.setFocusable(false);
        btCadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrarCliente.setMaximumSize(new java.awt.Dimension(50, 50));
        btCadastrarCliente.setMinimumSize(new java.awt.Dimension(50, 50));
        btCadastrarCliente.setPreferredSize(new java.awt.Dimension(50, 50));
        btCadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btCadastrarClienteMouseEntered(evt);
            }
        });
        btCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClienteActionPerformed(evt);
            }
        });
        jToolBarMenu.add(btCadastrarCliente);
        btCadastrarCliente.getAccessibleContext().setAccessibleName("Cadastrar Cliente");

        jToolBarMenu.add(jSeparator1);

        btPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/clientSearch.png"))); // NOI18N
        btPesquisarCliente.setToolTipText("Pesquisar Cliente");
        btPesquisarCliente.setFocusable(false);
        btPesquisarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisarCliente.setMaximumSize(new java.awt.Dimension(50, 50));
        btPesquisarCliente.setMinimumSize(new java.awt.Dimension(50, 50));
        btPesquisarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btPesquisarClienteMouseEntered(evt);
            }
        });
        btPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarClienteActionPerformed(evt);
            }
        });
        jToolBarMenu.add(btPesquisarCliente);
        btPesquisarCliente.getAccessibleContext().setAccessibleName("Pesquisar Cliente");
        btPesquisarCliente.getAccessibleContext().setAccessibleDescription("");

        jToolBarMenu.add(jSeparator2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Beer-icon_32.png"))); // NOI18N
        jButton3.setToolTipText("Cadastrar Produto");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBarMenu.add(jButton3);
        jToolBarMenu.add(jSeparator3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/searchBeer.png"))); // NOI18N
        jButton4.setToolTipText("Pesquisar Produto");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBarMenu.add(jButton4);
        jToolBarMenu.add(jSeparator4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/grupo.png"))); // NOI18N
        jButton5.setToolTipText("Grupo de Produtos");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBarMenu.add(jButton5);
        jToolBarMenu.add(jSeparator11);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Truck.png"))); // NOI18N
        jButton1.setToolTipText("Fornecedor");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBarMenu.add(jButton1);
        jToolBarMenu.add(jSeparator8);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/searchTruck_1.png"))); // NOI18N
        jButton2.setToolTipText("Pesquisar Fornecedor");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBarMenu.add(jButton2);
        jToolBarMenu.add(jSeparator10);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/emblem_money.png"))); // NOI18N
        jButton7.setToolTipText("Ordem de Venda");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBarMenu.add(jButton7);
        jToolBarMenu.add(jSeparator12);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/relatorio.png"))); // NOI18N
        jButton6.setToolTipText("Gerar Relatórios");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBarMenu.add(jButton6);

        pnMenu.add(jToolBarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        getContentPane().add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        lbDuffBeer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDuffBeer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDuffBeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/duff.jpg"))); // NOI18N
        lbDuffBeer.setToolTipText("Duff Beer");
        lbDuffBeer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbDuffBeerMouseEntered(evt);
            }
        });
        getContentPane().add(lbDuffBeer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 860, 500));
        lbDuffBeer.getAccessibleContext().setAccessibleName("Duff Beer");

        lbStatus.setText("status");
        lbStatus.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbStatusAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 558, 260, 18));

        jMenuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar.setMaximumSize(new java.awt.Dimension(860, 30));
        jMenuBar.setMinimumSize(new java.awt.Dimension(860, 30));
        jMenuBar.setPreferredSize(new java.awt.Dimension(860, 30));

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnCliente);
        jMenu1.add(jSeparator6);

        mnFornecedor.setText("Fornecedor");
        jMenu1.add(mnFornecedor);
        jMenu1.add(jSeparator5);

        mnProduto.setText("Produto");
        mnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(mnProduto);
        jMenu1.add(jSeparator9);

        jMenuItem2.setText("Grupo de Produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator13);

        jMenuItem11.setText("Cidade");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);
        jMenu1.add(jSeparator14);

        jMenuItem12.setText("Estado");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);
        jMenu1.add(jSeparator16);

        jMenuItem1.setText("Funcionario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator18);

        jMenuItem15.setText("Ordem de Compra");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);
        jMenu1.add(jSeparator19);

        jMenuItem16.setText("Ordem de Venda");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);
        jMenu1.add(jSeparator20);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Pesquisar");

        jMenuItem6.setText("Cliente");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator7);

        jMenuItem10.setText("Produto");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator15);

        jMenuItem13.setText("Fornecedor");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);
        jMenu2.add(jSeparator17);

        jMenuItem14.setText("Funcionario");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuBar.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenu3.setToolTipText("Gerar Relatórios");

        jMenuItem7.setText("Cliente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Fornecedor");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Produtos");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);
        jMenu3.add(jSeparator21);

        jMenuItem17.setText("Vendas");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem17);
        jMenu3.add(jSeparator22);

        jMenuItem18.setText("Compras");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuBar.add(jMenu3);

        jMenu4.setText("Opções");

        jMenuItem3.setText("Ajuda");
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Sobre o Sistema");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Sair");
        jMenu4.add(jMenuItem5);

        jMenuBar.add(jMenu4);

        setJMenuBar(jMenuBar);

        getAccessibleContext().setAccessibleName("SysDistribuidora");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClienteActionPerformed
        Util.abrirJDialogCentralizado(new JDialogCadastroCliente(this, true));
    }//GEN-LAST:event_btCadastrarClienteActionPerformed

    private void lbStatusAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbStatusAncestorAdded
      
    }//GEN-LAST:event_lbStatusAncestorAdded

    private void lbDuffBeerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDuffBeerMouseEntered
        lbStatus.setText(((JLabel) evt.getSource()).getToolTipText());
    }//GEN-LAST:event_lbDuffBeerMouseEntered

    private void btCadastrarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCadastrarClienteMouseEntered
        lbStatus.setText((((JButton)evt.getSource()).getToolTipText()));
    }//GEN-LAST:event_btCadastrarClienteMouseEntered

    private void btPesquisarClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPesquisarClienteMouseEntered
       lbStatus.setText((((JButton)evt.getSource()).getToolTipText()));
    }//GEN-LAST:event_btPesquisarClienteMouseEntered

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        Util.abrirJDialogCentralizado(new JDialogCadastroCliente(this, true));
    }//GEN-LAST:event_mnClienteActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogPesquisarProduto(this, true));
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarClienteActionPerformed
            Util.abrirJDialogCentralizado(new JDialogPesquisaClienteSimples(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Util.abrirJDialogCentralizado(new JDialogCadastrarFornecedor(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Util.abrirJDialogCentralizado(new JDialogCadastrarProduto(this,true));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            Util.abrirJDialogCentralizado(new JDialogPesquisarProduto(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                Util.abrirJDialogCentralizado(new JDialogPesquisarFornecedor(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            Util.abrirJDialogCentralizado(new JDialogCadastrarGrupoDeProduto(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                        // TODO add your handling code here:
        gerarRelatorioVendas();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogCadastroCidade(this,true));
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogCadastroEstado(this,true));
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogPesquisaClienteSimples(this, true));
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProdutoActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogCadastrarProduto(this, true));
    }//GEN-LAST:event_mnProdutoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogCadastrarGrupoDeProduto(this, true));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogPesquisarFornecedor(this, true));
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogPesquisaFuncionario(this, true));
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
       // Util.abrirJDialogCentralizado(new JDialogCadastroFuncionario(this, true));
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogCadastroFuncionario(this, true));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogOrdemDeCompra(this, true));
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogOrdemVenda(this, true));
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Util.abrirJDialogCentralizado(new JDialogOrdemVenda(this, true));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        gerarRelatorioClientes();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        gerarRelatorioVendas();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        gerarRelatorioProdutos();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        gerarRelatorioFornecedores();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        gerarRelatorioCompras();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarCliente;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator20;
    private javax.swing.JPopupMenu.Separator jSeparator21;
    private javax.swing.JPopupMenu.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBarMenu;
    private javax.swing.JLabel lbDuffBeer;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnFornecedor;
    private javax.swing.JMenuItem mnProduto;
    private javax.swing.JPanel pnMenu;
    // End of variables declaration//GEN-END:variables

    private void colocarTema() {
        String lookName = com.sun.java.swing.plaf.windows.WindowsLookAndFeel.class.getName();
        try {
            UIManager.setLookAndFeel(lookName);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gerarRelatorioVendas() {
        // TODO add your handling code here:

        ReportManage report = new ReportManage();

        try {            
                report.relatorioPronto("vendas", "Clientes");
            

        } catch (JRException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gerarRelatorioClientes() {
        // TODO add your handling code here:

        ReportManage report = new ReportManage();

        try {            
                report.relatorioPronto("clientes", "Clientes");
            

        } catch (JRException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gerarRelatorioProdutos() {
        // TODO add your handling code here:

        ReportManage report = new ReportManage();

        try {            
                report.relatorioPronto("produtos", "Clientes");
            

        } catch (JRException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gerarRelatorioFornecedores() {
        // TODO add your handling code here:

        ReportManage report = new ReportManage();

        try {            
                report.relatorioPronto("fornecedores", "Fornecedores");
            

        } catch (JRException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void gerarRelatorioCompras() {
        // TODO add your handling code here:

        ReportManage report = new ReportManage();

        try {            
                report.relatorioPronto("compras", "Compras");
            

        } catch (JRException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
