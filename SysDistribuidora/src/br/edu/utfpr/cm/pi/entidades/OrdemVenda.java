/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.entidades;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author TAYLY
 */
public class OrdemVenda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataVencimento;
    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa cliente;
    @ManyToOne(fetch = FetchType.EAGER)
    private Funcionario funcionario;
    @Basic
    @Column(length = 200)
    private String item1;
    @Basic
    @Column(length = 200)
    private String item2;
    @Basic
    @Column(length = 200)
    private String item3;
    @Basic
    @Column(length = 200)
    private String item4;
    private Double valor1;
    private Double valor2;
    private Double valor3;
    private Double valor4;
    private Double valorTotal;
    private String status;
    private Integer parcelas;
    private Integer parcelasRestantes;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Endereco endereco;
    private String banco;
    private String tipoCheque;
    private double juros;
    private String valorPorExtenso;
    
    private String nomeDoCheque;
    private String cnpjDoCheque;
    private String valorDoCheque;
    private String dataCheque;
    private String agenciaCheque;
    private String contaCheque;
    
}
