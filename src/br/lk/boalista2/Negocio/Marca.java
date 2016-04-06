/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Luciano
 */
@Entity(name="marca")
public class Marca implements Serializable {
    
    @Id
    @GeneratedValue
    private long id;
    private String marca;
    @OneToOne
    private Produto produto;

    public Marca(String marca, Produto produto) {
        this.marca = marca;
        this.produto = produto;
    }

    
    public Marca() {
    }



    public Marca(String marca) {
        this.marca = marca;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
        public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}
