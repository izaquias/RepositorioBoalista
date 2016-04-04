/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Negocio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Kleriston
 */
@Entity(name="produto")
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    @Column
    private int codigo;
    @Column
    private String nome;
   
    @OneToOne
    private TipoProduto tipoProduto;

 
    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        
       
    }
     public Produto() {
    }
 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
  
    
}
