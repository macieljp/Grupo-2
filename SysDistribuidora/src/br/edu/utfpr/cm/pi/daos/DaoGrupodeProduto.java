/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.entidades.GrupodeProduto;

/**
 *
 * @author TAYLY
 */
 public class DaoGrupodeProduto extends DaoGenerics<GrupodeProduto>{
    public DaoGrupodeProduto() {
        super.alvo = GrupodeProduto.class;
    }
    
}
