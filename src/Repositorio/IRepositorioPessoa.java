/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import crud.estudos.entidetis.Pessoa;
import java.util.List;


/**
 *
 * @author adm
 */
public interface IRepositorioPessoa {
    
    public boolean salvarPessoa(Pessoa pessoa);
    
    public boolean deletePessoaPorId(Long id);
   
    public List<Pessoa> listarPessoa();
    
    public boolean alterarPessoa(Pessoa pessoa);
}
