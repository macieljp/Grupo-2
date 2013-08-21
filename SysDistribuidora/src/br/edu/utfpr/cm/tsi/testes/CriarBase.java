/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.testes;

import br.edu.utfpr.cm.pi.api.HibernateConfiguration;

/**
 *
 * @author TAYLY
 */
public class CriarBase {
    public static void main(String[] args) {
        HibernateConfiguration.criarSchema();
    }
}
