/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vertice.vertice.service;
import br.com.vertice.vertice.Equipe;
import br.com.vertice.vertice.dto.EquipeDTO;

/**
 *
 * @author samuelborges
 */
public class EquipeService {
    
    public Equipe cadastrarEquipe(EquipeDTO e){
        Equipe eq = new Equipe(e.getNomeEquipe(), e.getSigla(), e.getJogadores());
        System.out.println(eq.getNome() + eq.getSigla() + eq.getMembros());
        return eq;
    }
}
