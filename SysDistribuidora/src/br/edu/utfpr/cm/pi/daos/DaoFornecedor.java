/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.entidades.Fornecedor;

/**
 *
 * @author TAYLY
 */
 public class DaoFornecedor extends DaoGenerics<Fornecedor>{
    public DaoFornecedor() {
        super.alvo = Fornecedor.class;
    }
    
}