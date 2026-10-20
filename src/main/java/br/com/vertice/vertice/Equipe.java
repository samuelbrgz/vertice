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
    private List<String> membros;

    public Equipe(String nome, String sigla, int id, List<String> membros){
        
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        if(sigla == null || sigla.isBlank()){
            throw new IllegalArgumentException("Sigla invalida");
        }
        if(id < 0 || id == 0){
            throw new IllegalArgumentException("Id invalido");
        }
        if (membros == null) {
            throw new IllegalArgumentException("A lista de membros não pode ser nula.");
        }
        for (String membro : membros) {
            if (membro == null || membro.isBlank()) {
                throw new IllegalArgumentException("Nome de membro inválido.");
            }
        }
        
        
        this.nome = nome;
        this.sigla = sigla;
        this.id = id;
        this.membros = membros;
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

    public List<String> getMembros() {
        return membros;
    }
}
