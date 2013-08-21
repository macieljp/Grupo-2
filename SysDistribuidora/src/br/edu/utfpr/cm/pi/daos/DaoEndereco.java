/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.daos;

import br.edu.utfpr.cm.pi.api.Filter;
import br.edu.utfpr.cm.pi.api.Operator;
import br.edu.utfpr.cm.pi.entidades.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAYLY
 */
 public class DaoEndereco extends DaoGenerics<Endereco>{
    public DaoEndereco() {
        super.alvo = Endereco.class;
    }
 }