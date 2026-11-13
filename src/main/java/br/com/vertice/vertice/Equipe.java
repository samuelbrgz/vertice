/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vertice.vertice;
import java.util.List;
/**
 *
 * @author samuelborges
 */
public class Equipe{
    private String nome;
    private String sigla;
    private int id;

    public Equipe(String nome, String sigla, int id){
        
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        if(sigla == null || sigla.isBlank()){
            throw new IllegalArgumentException("Sigla invalida");
        }
        if(id < 0 || id == 0){
            throw new IllegalArgumentException("Id invalido");
        }

        
        
        this.nome = nome;
        this.sigla = sigla;
        this.id = id;
    }
    public Equipe(String nome, String sigla){
        
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        if(sigla == null || sigla.isBlank()){
            throw new IllegalArgumentException("Sigla invalida");
        }
      
        
        
        this.nome = nome;
        this.sigla = sigla;
        this.id = 0;
 
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getId() {
        return id;
    }

  
}
