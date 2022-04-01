/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import crud.estudos.entidetis.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adm
 */
public class RepositorioPesooa implements IRepositorioPessoa{
    
    
    List<Pessoa> listaPessoas = new ArrayList<>();

    @Override
    public boolean salvarPessoa(Pessoa pessoa) {
        try{  
            listaPessoas.add(pessoa);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deletePessoaPorId(Long id) {

        for (Pessoa pessoa : listaPessoas){
            if(pessoa.getId() == id ){
                listaPessoas.remove(pessoa);
                
            }
        }
        return false;
    }

    @Override
    public List<Pessoa> listarPessoa() {        
        return listaPessoas ;
    }

    @Override
    public boolean alterarPessoa(Pessoa pessoa) {
        
        for (Pessoa pessoa1 : listaPessoas){
            if(pessoa1.getId() == pessoa.getId() ){
                listaPessoas.remove(pessoa1);
                listaPessoas.add(pessoa);
                
            }
        }
        return false;
    }
}
