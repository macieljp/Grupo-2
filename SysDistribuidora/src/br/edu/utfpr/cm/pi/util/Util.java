/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.util;

import javax.swing.JDialog;
import javax.swing.JFrame;

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

    public static void imprimirConfirmacao(String deseja_Fechar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
