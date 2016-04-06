/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Negocio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


/**
 *
 * @author Luciano
 */
@Entity(name="tipoproduto")
public class TipoProduto implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String nome;
    @Column
    private double valor;
    
    @OneToMany(mappedBy = "tipoProduto")
    @JoinColumn(name="Chave")
    private List<Produto> listaProdutos;

    public TipoProduto(String nome, double valor, List<Produto> listaProdutos) {
        this.nome = nome;
        this.valor = valor;
        this.listaProdutos = listaProdutos;
    }

  

    public TipoProduto() {
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
   
}
