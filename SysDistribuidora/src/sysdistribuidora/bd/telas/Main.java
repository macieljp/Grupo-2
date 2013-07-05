/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sysdistribuidora.bd.telas;


import javax.swing.JFrame;
import sysdistribuidora.bd.telas.gui.Home;

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
