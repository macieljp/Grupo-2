/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;


import br.edu.utfpr.cm.pi.entidades.Endereco;

/**
 *
 * @author TAYLY
 */
 public class DaoEndereco extends DaoGenerics<Endereco>{
    public DaoEndereco() {
        super.alvo = Endereco.class;
    }

    public void persist(Endereco end) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }