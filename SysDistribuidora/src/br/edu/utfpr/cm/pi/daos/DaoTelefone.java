/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.entidades.Telefone;

/**
 *
 * @author TAYLY
 */

     public class DaoTelefone extends DaoGenerics<Telefone>{
     public DaoTelefone() {
        super.alvo = Telefone.class;
    }
}
