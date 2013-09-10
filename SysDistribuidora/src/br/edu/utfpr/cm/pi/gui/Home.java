/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.gui;

import br.edu.utfpr.cm.pi.util.Util;
import javax.swing.JButton;
import javax.swing.JLabel;

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
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JToolBar.Separator();
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
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
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

        jToolBarMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jToolBarMenu.setRollover(true);
        jToolBarMenu.setMaximumSize(new java.awt.Dimension(860, 50));
        jToolBarMenu.setMinimumSize(new java.awt.Dimension(860, 50));
        jToolBarMenu.setPreferredSize(new java.awt.Dimension(860, 50));

        btCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Cliente_32.png"))); // NOI18N
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

        btPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/clientSearch.png"))); // NOI18N
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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Beer-icon_32.png"))); // NOI18N
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

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/searchBeer.png"))); // NOI18N
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

        jButton10.setFocusable(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBarMenu.add(jButton10);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/Truck.png"))); // NOI18N
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/searchTruck_1.png"))); // NOI18N
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

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/grupo.png"))); // NOI18N
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

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/relatorio.png"))); // NOI18N
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
        jToolBarMenu.add(jSeparator12);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/email.png"))); // NOI18N
        jLabel1.setToolTipText("Enviar e-mail");
        jToolBarMenu.add(jLabel1);
        jToolBarMenu.add(jSeparator13);

        pnMenu.add(jToolBarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        getContentPane().add(pnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        lbDuffBeer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDuffBeer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDuffBeer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/icons/duff.jpg"))); // NOI18N
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

        jMenuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jMenuBar.setMaximumSize(new java.awt.Dimension(860, 30));
        jMenuBar.setMinimumSize(new java.awt.Dimension(860, 30));
        jMenuBar.setPreferredSize(new java.awt.Dimension(860, 30));

        jMenu1.setText("Cadastro");

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
        jMenu1.add(mnProduto);
        jMenu1.add(jSeparator9);

        jMenuItem2.setText("Grupo de Produto");
        jMenu1.add(jMenuItem2);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Pesquisar");

        jMenuItem6.setText("Cliente");
        jMenu2.add(jMenuItem6);
        jMenu2.add(jSeparator7);

        jMenuItem10.setText("Produto");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem1.setText("Fornecedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenu3.setToolTipText("Gerar Relatórios");

        jMenuItem7.setText("Cliente");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Fornecedor");
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Produtos");
        jMenu3.add(jMenuItem9);

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
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarClienteActionPerformed
            Util.abrirJDialogCentralizado(new JDialogPesquisaCliente(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_btPesquisarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Util.abrirJDialogCentralizado(new JDialogCadastrarFornecedor(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Util.abrirJDialogCentralizado(new JDialogCadastrarProduto(this,true));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            Util.abrirJDialogCentralizado(new JDialogPesquisarProduto(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                Util.abrirJDialogCentralizado(new JDialogPesquisarProduto(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            Util.abrirJDialogCentralizado(new JDialogCadastrarGrupoDeProduto(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                Util.abrirJDialogCentralizado(new JDialogRelatorioCliente(this,true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
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
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator2;
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
}
