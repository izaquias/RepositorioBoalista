/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boalista2;

import br.lk.boalista2.Dao.DaoManagerHiber;
import br.lk.boalista2.Fachada.Fachada;
import br.lk.boalista2.Negocio.Produto;
import br.lk.boalista2.Negocio.TipoProduto;
import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano
 */
public class BoaLista2 {

    public static void menu(){
        System.out.println(" Escolha");
        System.out.println("1. Adicionar ");
        System.out.println("2. Recuperar");
        System.out.println("3. Atualizar");
        System.out.println("4. Deletar");
        System.out.println("0. Sair");
        System.out.println("Opção: ");
        
    }
    
   
    
    public static void CadastrarProduto(){
                int codigo;
                String nome, nomeTp;
                double valor;
                List<Produto> lstProduto = new ArrayList<Produto>();
                
                Scanner ler = new Scanner(System.in);
                System.out.printf("Informe o codigo do produto");
                codigo = ler.nextInt();
                System.out.printf("Informe o Nome do Produto");
                nome = ler.next();
                System.out.printf("Informe o nome do tipoProduto");
                nomeTp = ler.next();
                System.out.printf("Informe o valor do produto");
                valor = ler.nextDouble();
                
                Produto p = new Produto(codigo, nome);
                Fachada.getStance().inserir(p);
                
                lstProduto.add(p);
                TipoProduto tp = new TipoProduto(nomeTp, valor, lstProduto);
                Fachada.getStance().inserirTipoProduto(tp);
                
                System.out.println("Produto Cadastrado com Sucesso");
    }
   
    
    public static void RecuperarTodos(){
        
        List<Produto> Lista = Fachada.getStance().recuperarTodos();
                
                    for(int i=0; i < Lista.size(); i++){
                    System.out.println("Identificador: "+Lista.get(i).getId()+
                            " Codigo: "+Lista.get(i).getCodigo()+" Nome: "+Lista.get(i).getNome());
                }
                
    }
    
    
    public static void Atualizar(){
                int novoCod;
                String novoNome;
                
                long id;
                Scanner Lerid = new Scanner(System.in);
                System.out.printf("Informe o id");
                id = Lerid.nextLong();
              
                Produto p = Fachada.getStance().recuperarProduto(id);
           
                System.out.println("Identificador:"+p.getId()+" Codigo:"+p.getCodigo()+
                        " Nome:"+p.getNome());
            
                Scanner lerNCod = new Scanner(System.in);
                System.out.printf("Digite o novo codigo");
                novoCod = lerNCod.nextInt();
                
                
                Scanner lerNnome = new Scanner(System.in);
                System.out.printf("Digite o novo Nome");
                novoNome = lerNnome.next();
                
                Produto bp = new Produto(novoCod, novoNome);
                bp.setId(id);
                Fachada.getStance().alterar(bp);
                
                System.out.println("Atualizado com SUCESSO");
            
    }
    
   
    public static void Deletar(){
       
        long excluir;
                Scanner excluirId = new Scanner(System.in);
                System.out.printf("Informe o Id");
                excluir = excluirId.nextLong();
                
                Produto p1 = Fachada.getStance().recuperarProduto(excluir);
                
                Fachada.getStance().excluir(p1);
                
                System.out.println("Exclusão realizada com sucesso");
    }
    
    
    public static void main(String[] args) {
//        int opcao;
//        Scanner entrada = new Scanner(System.in);
//        
//        do{
//            menu();
//            opcao = entrada.nextInt();
//            
//            
//        switch(opcao){
//            case 1:
//                CadastrarProduto();
//                break;
//            case 2:
//                RecuperarTodos();                
//                break;
//                
//            case 3:
//                Atualizar();
//                break;
//            case 4:
//                Deletar();
//                break;
//            case 0:
//                break;
//            default:
//                System.out.println("Opção Invalida");
//        }
//         }while(opcao != 0);
        

        List<Produto> lista = Fachada.getStance().recuperarTodos();
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Nome:"+lista.get(i).getNome()+
                    "\n Tipo de Produto(VALOR): "+lista.get(i).getTipoProduto().getValor());
        }
    }
    
}
