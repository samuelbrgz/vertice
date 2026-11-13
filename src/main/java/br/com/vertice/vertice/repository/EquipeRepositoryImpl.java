package br.com.vertice.vertice.repository;

import br.com.vertice.vertice.Equipe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipeRepositoryImpl implements EquipeRepository {
    
    @Override
    public void salvarEquipe(Equipe e) throws SQLException{
        
        try(Connection conexao = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO equipe (nome, sigla) values (? , ?)";

            
                try(PreparedStatement insercaoEquipe = conexao.prepareStatement(sql);){
                
                insercaoEquipe.setString(1, e.getNome());
                insercaoEquipe.setString(2, e.getSigla());

                insercaoEquipe.executeUpdate();
  
            } 
            
        }
        
    }
    
     @Override
     public List<Equipe> listarEquipes() throws SQLException{
         String sql = "SELECT id, nome, sigla FROM equipe ORDER BY nome";
         List<Equipe> equipes = new ArrayList<>();
         
         try(Connection conexao = ConnectionFactory.getConnection(); PreparedStatement comando = conexao.prepareStatement(sql);  ResultSet resultado = comando.executeQuery()){
             while(resultado.next()){
                 int id = resultado.getInt("id");
                 String nome = resultado.getString("nome");
                 String sigla = resultado.getString("sigla");
                 Equipe equipe = new Equipe(nome, sigla, id);
                 equipes.add(equipe);
             }
         }
         
         return equipes;
     }
     
     @Override
     public void excluirEquipe(int id) throws SQLException{
         String sql = "DELETE FROM equipe WHERE id = ?";
         try(Connection conexao = ConnectionFactory.getConnection(); PreparedStatement comando = conexao.prepareStatement(sql)){
             comando.setInt(1, id);
             comando.executeUpdate();
         }
     }
}
