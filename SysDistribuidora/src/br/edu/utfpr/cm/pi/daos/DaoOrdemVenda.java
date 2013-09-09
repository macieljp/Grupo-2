/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.entidades.OrdemVenda;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author TAYLY
 */


public class DaoOrdemVenda extends DaoGenerics<OrdemVenda> {

    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM");
    String dataFormatada = formatador.format(data);
    SimpleDateFormat formatadorTotal = new SimpleDateFormat("yyyy-MM-dd");
    String dataFormatadaNormal = formatadorTotal.format(data);

    public DaoOrdemVenda() {
        super.alvo = OrdemVenda.class;
    }

    public List<OrdemVenda> obter() {
        List<OrdemVenda> lista = null;


        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterVencidas() {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id");
        lista = query.list();
        return lista;
    }
    
    public List<OrdemVenda> obterAVencer() {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento > '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id");
        lista = query.list();
        return lista;
    }

    public Long count() {
        Query query = session.createQuery("select count(*) from "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' ORDER BY id");
        return (Long) query.uniqueResult();
    }

    public List<OrdemVenda> obterVencidasClientes(int id) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND cliente.id = " + id + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterVencidasFuncionarios(int id) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND funcionario.id = " + id + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterVencidasFuncionariosClientes(Integer id, Integer id0) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND funcionario.id = " + id + " AND cliente.id = " + id0 + " ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterVencidasId(String text) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento < '" + dataFormatadaNormal + "' AND status = 'Aguardando Pagamento' AND id LIKE '" + text + "' ORDER BY id");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterId(String text) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND id LIKE '" + text + "' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterClientes(Integer id) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%'AND cliente.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterFuncionariosClientes(Integer id, Integer id0) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND funcionario.id = " + id + " AND cliente.id = " + id0 + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterFuncionarios(Integer id) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND funcionario.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterClientesID(Integer id) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where cliente.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterFuncionariosID(Integer id) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where funcionario.id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;


    }

    public List<OrdemVenda> obterDataCad(Calendar stringToCalendar) {

        SimpleDateFormat formatadorLocal = new SimpleDateFormat("yyyy-MM-dd");
        String dataTotal = formatadorLocal.format(stringToCalendar.getTime());

        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataCadastro LIKE '%" + dataFormatada + "%' AND dataCadastro LIKE '" + dataTotal + "' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterOSPorId(Integer id) {
        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where id = " + id + " ORDER BY id DESC");
        lista = query.list();
        return lista;
    }

    public List<OrdemVenda> obterDataVencimento(Calendar stringToCalendar) {
        SimpleDateFormat formatadorLocal = new SimpleDateFormat("yyyy-MM-dd");
        String dataTotal = formatadorLocal.format(stringToCalendar.getTime());

        List<OrdemVenda> lista = null;
        Query query = session.createQuery("From "
                + alvo.getSimpleName()
                + " where dataVencimento  LIKE '" + dataTotal + "' ORDER BY id DESC");
        lista = query.list();
        return lista;
    }
}

    

