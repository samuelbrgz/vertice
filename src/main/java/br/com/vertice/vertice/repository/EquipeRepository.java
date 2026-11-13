/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vertice.vertice.repository;

import br.com.vertice.vertice.Equipe;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author samuelborges
 */
public interface EquipeRepository {
    public void salvarEquipe(Equipe e) throws SQLException;
    public List<Equipe> listarEquipes() throws SQLException;
    public void excluirEquipe(int id) throws SQLException;

}
