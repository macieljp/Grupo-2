/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.testes;

import br.edu.utfpr.cm.pi.conexao.HibernateConfiguration;
import br.edu.utfpr.cm.pi.conexao.TransactionManager;
import br.edu.utfpr.cm.pi.daos.DaoGrupodeProduto;
import br.edu.utfpr.cm.pi.entidades.GrupodeProduto;
import br.edu.utfpr.cm.pi.util.Util;

/**
 *
 * @author TAYLY
 */
public class CriarBase {

    public static void main(String[] args) {
        HibernateConfiguration.criarSchema();

//        String cpf = "056.426.529-23";
//
//        cpf = cpf.replace(".", "");
//        cpf = cpf.replace("-", "");
//
//        System.out.println(Util.validaCPF(cpf));
//        
//        
//        String cnpj = "73.279.044/0001-76";
//        
//        cnpj = cnpj.replace(".", "");
//        cnpj = cnpj.replace("-", "");
//        cnpj = cnpj.replace("/", "");
//        
//        System.out.println(Util.validarCNPJ(cnpj));
//        
        
    }
}
