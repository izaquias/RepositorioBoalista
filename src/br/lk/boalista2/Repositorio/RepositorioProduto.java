/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lk.boalista2.Repositorio;

import br.lk.boalista2.Dao.DaoManagerHiber;
import br.lk.boalista2.Negocio.Produto;
import br.lk.boalista2.Negocio.TipoProduto;
import br.lk.boalista2.Repositorio.Interface.RepositorioGenerico;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProduto implements RepositorioGenerico<Produto, Long>{

    List<Produto> listaProdutos = new ArrayList();
    
    @Override
    public void inserir(Produto produto) {
      DaoManagerHiber.getInstance().persist(produto);
    }
    

    @Override
    public void alterar(Produto t) {
      DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Produto recuperar(Long id) {
        return (Produto) DaoManagerHiber.getInstance().recover(Produto.class, id);
    }

    @Override
    public void excluir(Produto t) {
        
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Produto> recuperarTodos() {
        return DaoManagerHiber.getInstance().recoverAll("from produto");
    }

   
    
    
  
    
    
    
    
}
