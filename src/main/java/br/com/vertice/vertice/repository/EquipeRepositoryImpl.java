package br.com.vertice.vertice.repository;

import br.com.vertice.vertice.Equipe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EquipeRepositoryImpl implements EquipeRepository {
    
    @Override
    public void salvarEquipe(Equipe e) throws SQLException{
        
        try(Connection conexao = ConnectionFactory.getConnection()){
            conexao.setAutoCommit(false);
            
            String sql = "INSERT INTO equipe (nome, sigla) values (? , ?) RETURNING id";
            String sql2 = "INSERT INTO jogador (nome, equipe_id) values (? , ?)";
            
                try(PreparedStatement insercaoEquipe = conexao.prepareStatement(sql);PreparedStatement insercaoJogador = conexao.prepareStatement(sql2)){
                
                insercaoEquipe.setString(1, e.getNome());
                insercaoEquipe.setString(2, e.getSigla());

                ResultSet idEquipe = insercaoEquipe.executeQuery();
                idEquipe.next();
                int id = idEquipe.getInt("id");
                
                for (String jogador : e.getMembros()) {
                    insercaoJogador.setString(1, jogador);
                    insercaoJogador.setInt(2, id);
                    insercaoJogador.executeUpdate();
                }
                conexao.commit();
            } 
            catch(SQLException erro){
                conexao.rollback();
                    throw erro;
            }
            
        }
        
    };
}
