/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.estudos;

import Repositorio.RepositorioPesooa;
import crud.estudos.entidetis.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adm
 */
public class CrudEstudos {

    /**
     * @param args the command line arguments
     */
    static Repositorio.RepositorioPesooa rp = new RepositorioPesooa();

    public static void main(String[] args) {
        // TODO code application logic here
        popularArray();
        listarPessoas(); 
        System.out.println("\n");
        System.out.println("////////////////////////////////////////////");
        rp.deletePessoaPorId(2l);
        listarPessoas();
        System.out.println("\n");
        System.out.println("////////////////////////////////////////////");
        alterar();
        listarPessoas();
        System.out.println("\n");
        System.out.println("////////////////////////////////////////////");
    }
    
    public static void alterar(){
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setId(3);
        pessoa3.setIdadte(1);
        pessoa3.setNome("Aurora marcel de Souza");
        rp.alterarPessoa(pessoa3);
        
    }
    
    public static void popularArray(){
                       
        Pessoa pessoa = new Pessoa();        
        pessoa.setId(1);
        pessoa.setIdadte(25);
        pessoa.setNome("Richard Marcel");
        rp.salvarPessoa(pessoa);
        
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setId(2);
        pessoa2.setIdadte(20);
        pessoa2.setNome("Laiza Mireli");
        rp.salvarPessoa(pessoa2);
        
        Pessoa pessoa3 = new Pessoa();
        pessoa3.setId(3);
        pessoa3.setIdadte(1);
        pessoa3.setNome("Aurora Cavalcanti de Souza");
        rp.salvarPessoa(pessoa3);
    }
    
    public static void listarPessoas(){
        
        List<Pessoa> lista= new ArrayList<Pessoa>();    
        lista = rp.listarPessoa();
        
        for (Pessoa pessoa : lista){
            
            System.out.println("id: "+pessoa.getId());
            
            System.out.println("nome: "+pessoa.getNome());
            
            System.out.println("idade: "+pessoa.getIdadte());
            
            System.out.println("---------------------------------");
        }
    }
    
   
    
}
