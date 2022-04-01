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
        return false;
    }

    @Override
    public boolean deletePessoaPorId(Long id) {
        return false;
    }

    @Override
    public List<Pessoa> listarPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alterarPessoa(Pessoa pessoa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
