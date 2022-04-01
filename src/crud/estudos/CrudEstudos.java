/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.estudos;

import Repositorio.RepositorioPesooa;
import crud.estudos.entidetis.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author adm
 */
public class CrudEstudos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        Repositorio.RepositorioPesooa rp = new RepositorioPesooa();
        Pessoa pessoa = new Pessoa();
        boolean salvo;
        
        pessoa.setId(1);
        pessoa.setIdadte(25);
        pessoa.setNome("Richard Marcel");
        
        
        
        salvo = rp.salvarPessoa(pessoa);
        
        if (salvo){
            System.out.println(pessoa.getNome()+ " Salvo com sucesso");
            
        } else {
            System.out.println("Nao foi salvo");
        }
        
    }
   
    
}
