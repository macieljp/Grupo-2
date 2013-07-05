/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sysdistribuidora.bd.telas.gui;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogCadastroCliente extends javax.swing.JDialog {

    /**
     * Creates new form JDialogCadastroCliente
     */
    public JDialogCadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnRotulo = new javax.swing.JPanel();
        lbRotulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        lbCPF = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        lbNascimento = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCPF = new javax.swing.JTextField();
        tfRG = new javax.swing.JTextField();
        tfDataNascimento = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 550));
        setMinimumSize(new java.awt.Dimension(800, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnRotulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbRotulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbRotulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRotulo.setText("Cadastro de Cliente");
        pnRotulo.add(lbRotulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 5, -1, -1));

        getContentPane().add(pnRotulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(790, 200));
        jPanel2.setMinimumSize(new java.awt.Dimension(790, 200));
        jPanel2.setPreferredSize(new java.awt.Dimension(795, 200));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNome.setText("Nome:");
        jPanel2.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        lbCPF.setText("CNPJ/CPF:");
        jPanel2.add(lbCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lbRG.setText("IE/RG:");
        jPanel2.add(lbRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        lbId.setText("Código:");
        jPanel2.add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lbSexo.setText("Sexo:");
        jPanel2.add(lbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        lbNascimento.setText("Nasc:");
        jPanel2.add(lbNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jPanel2.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 90, 25));
        jPanel2.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 390, 25));
        jPanel2.add(tfCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 25));
        jPanel2.add(tfRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 160, 25));
        jPanel2.add(tfDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, 25));

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Maculino");
        jPanel2.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Feminino");
        jPanel2.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        jLabel1.setText("Tipo:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Jurídico");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Físico");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jTabbedPane1.addTab("Dados Pessoais", jPanel2);
        jTabbedPane1.addTab("Contato", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCadastroCliente dialog = new JDialogCadastroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lbRotulo;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JPanel pnRotulo;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDataNascimento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfRG;
    // End of variables declaration//GEN-END:variables
}
