/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Fachada;

import br.lk.boalista2.Negocio.Marca;
import br.lk.boalista2.Negocio.Produto;
import br.lk.boalista2.Negocio.TipoProduto;
import br.lk.boalista2.Negocio.Usuario;
import br.lk.boalista2.Repositorio.Interface.RepositorioGenerico;
import br.lk.boalista2.Repositorio.RepositorioMarca;
import br.lk.boalista2.Repositorio.RepositorioProduto;
import br.lk.boalista2.Repositorio.RepositorioTipoProduto;
import br.lk.boalista2.Repositorio.RepositorioUsuario;
import java.util.List;

public class Fachada {
    
    private static Fachada myself = null;
           
    
    private RepositorioGenerico<Produto, Long> repProduto = null;
    private RepositorioGenerico<Marca, Long> repMarca = null;
    private RepositorioGenerico<Usuario, Long> repUsuario = null;
    private RepositorioGenerico<TipoProduto, Long> repTipoProduto = null;

    public Fachada() {
        
        this.repProduto= new RepositorioProduto();
        this.repTipoProduto = new RepositorioTipoProduto();
        this.repMarca = new RepositorioMarca();
        this.repUsuario = new RepositorioUsuario();
        
    }
    
    public static Fachada getStance(){
        if(myself == null)
            myself = new Fachada();
        
        return myself;
    }
    
    public void inserir(Produto produto){
        this.repProduto.inserir(produto);
    }
    public void inserirMarca(Marca marca){
        this.repMarca.inserir(marca);
    }
    public void inserirUsuario(Usuario usuario){
        this.repUsuario.inserir(usuario);
    }
    public void inserirTipoProduto(TipoProduto tipoProduto){
        this.repTipoProduto.inserir(tipoProduto);
    }
   
    public void alterar(Produto produto ){
        this.repProduto.alterar(produto);
    }
    public void alterarUsuario(Usuario usuario){
        this.repUsuario.alterar(usuario);
    }
    public void alterarMarca(Marca marca){
        this.repMarca.alterar(marca);
    }
    public void alterarTipoProduto(TipoProduto tipoProduto){
        this.repTipoProduto.alterar(tipoProduto);
    }
    
    public void excluir(Produto produto){
        this.repProduto.excluir(produto);
    }
    public void excluirTipoProduto(TipoProduto tipoproduto){
        this.repTipoProduto.excluir(tipoproduto);
    }
    public void excluirUsuario(Usuario usuario){
        this.repUsuario.excluir(usuario);
    }
    public void excluirMarca(Marca marca){
        this.repMarca.excluir(marca);
    }
    
    public Produto recuperarProduto(Long id){
        return this.repProduto.recuperar(id);
    }
    public Usuario recuperarUsuario(Long id){
        return this.repUsuario.recuperar(id);
    }
    public Marca recuperarMarca(Long id){
        return this.repMarca.recuperar(id);
    }
    public TipoProduto recuperarTipoProduto(Long id){
        return this.repTipoProduto.recuperar(id);
    }
    
    public List<Produto> recuperarTodos(){
        return this.repProduto.recuperarTodos();
    }
    public List<Usuario> recuperarTodosUsuarios(){
        return this.repUsuario.recuperarTodos();
    }
    public List<TipoProduto> recuperarTodosTiposProdutos(){
        return this.repTipoProduto.recuperarTodos();
    }
    public List<Marca> recuperarTodasMarcas(){
        return this.repMarca.recuperarTodos();
    }
}
