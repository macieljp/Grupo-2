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

    public static boolean imprimirMsgNaTela(String deseja_Cancelar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static boolean isCPF(String CPF) { 
        if (CPF.equals("00000000000") || CPF.equals("11111111111") 
                || CPF.equals("22222222222") || CPF.equals("33333333333") 
                || CPF.equals("44444444444") || CPF.equals("55555555555") 
                || CPF.equals("66666666666") || CPF.equals("77777777777") 
                || CPF.equals("88888888888") || CPF.equals("99999999999") 
                || (CPF.length() != 11)) return(false); 
        char dig10, dig11; int sm, i, r, num, peso;
        (int) try { // Calculo do 1o. Digito Verificador sm = 0; peso = 10; for (i=0; i<9; i++) { // converte o i-esimo caractere do CPF em um numero: // por exemplo, transforma o caractere '0' no inteiro 0 // (48 eh a posicao de '0' na tabela ASCII) num = (int)(CPF.charAt(i) - 48); sm = sm + (num * peso); peso = peso - 1; } r = 11 - (sm % 11); if ((r == 10) || (r == 11)) dig10 = '0'; else dig10 = (char)(r + 48); // converte no respectivo caractere numerico // Calculo do 2o. Digito Verificador sm = 0; peso = 11; for(i=0; i<10; i++) { num = (int)(CPF.charAt(i) - 48); sm = sm + (num * peso); peso = peso - 1; } r = 11 - (sm % 11); if ((r == 10) || (r == 11)) dig11 = '0'; else dig11 = (char)(r + 48); // Verifica se os digitos calculados conferem com os digitos informados. if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) return(true); else return(false); } catch (InputMismatchException erro) { return(false); } }


}
