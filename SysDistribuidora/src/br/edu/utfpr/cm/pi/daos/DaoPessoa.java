/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.entidades.Pessoa;

/**
 *
 * @author TAYLY
 */
public class DaoPessoa extends DaoGenerics<Pessoa> {
    
    
    public DaoPessoa() {
        super.alvo = Pessoa.class;
    }
    
    
}
