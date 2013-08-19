/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.util;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RootPaneContainer;

/**
 *
 * @author JoaoPaulo
 */
public class Util {
    
        public static void abrirJFrameCentralizado(JFrame dialog) {

        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    public static void abrirJDialogCentralizado(JDialog dialog) {

        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }

    public static boolean imprimirConfirmacao(String deseja_Fechar) {
        
        return true;
    }

    public static void dispayMsg(String nenhum_Cliente_Encontrado) {
        JOptionPane.showMessageDialog(null, nenhum_Cliente_Encontrado);
    }
    
}
