/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.main;

import br.edu.utfpr.cm.tsi.gui.Home;
import javax.swing.JFrame;

/**
 *
 * @author JoaoPaulo
 */
public class Main {

    public static void main(String[] args) {
        Home home = new Home();
        home.setVisible(true);
        home.setLocationRelativeTo(null);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
