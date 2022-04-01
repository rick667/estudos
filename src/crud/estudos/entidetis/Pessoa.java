/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud.estudos.entidetis;

/**
 *
 * @author adm
 */
public class Pessoa {
    
    private String nome;
    private int idadte;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdadte() {
        return idadte;
    }

    public void setIdadte(int idadte) {
        this.idadte = idadte;
    }
    
}
