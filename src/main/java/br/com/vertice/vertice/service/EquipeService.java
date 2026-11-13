package br.com.vertice.vertice.service;

import br.com.vertice.vertice.Equipe;
import br.com.vertice.vertice.dto.EquipeDTO;
import br.com.vertice.vertice.exception.NegocioException;
import br.com.vertice.vertice.repository.EquipeRepository;
import br.com.vertice.vertice.repository.EquipeRepositoryImpl;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class EquipeService {

    private static final String VIOLACAO_UNIQUE = "23505";
    private static final String VIOLACAO_CHAVE_ESTRANGEIRA = "23503";

    private final EquipeRepository repository = new EquipeRepositoryImpl();

    public void cadastrarEquipe(EquipeDTO e) throws NegocioException {
        Equipe eq;
        try {
            eq = new Equipe(e.getNomeEquipe(), e.getSigla());
        } catch (IllegalArgumentException erro) {
            throw new NegocioException(erro.getMessage(), erro);
        }

        try {
            repository.salvarEquipe(eq);
        } catch (SQLException erro) {
            if (VIOLACAO_UNIQUE.equals(erro.getSQLState())) {
                throw new NegocioException("Já existe uma equipe com esse nome ou sigla.", erro);
            }
            throw new NegocioException("Não foi possível cadastrar a equipe.", erro);
        }
    }
    
    public List<EquipeDTO> listarEquipes() throws NegocioException{
        List<EquipeDTO> listaEdto = new ArrayList<>();
        try
        {
            List<Equipe> equipes = repository.listarEquipes();
            for(Equipe equipe : equipes){
                EquipeDTO dto = new EquipeDTO(equipe.getNome(), equipe.getSigla(), equipe.getId());
                listaEdto.add(dto);
            }
        } catch(SQLException erro){
            throw new NegocioException("Não foi possivel listar equipes.", erro);
        }
        return listaEdto;
    }
     public void excluirEquipe(int id) throws NegocioException{
         try {
             repository.excluirEquipe(id);
         } catch (SQLException erro) {
            if (VIOLACAO_CHAVE_ESTRANGEIRA.equals(erro.getSQLState())) {
                throw new NegocioException("Não é possivel excluir equipe que possui jogadores.", erro);
            }
            throw new NegocioException("Não foi possível excluir a equipe.", erro);
        }
     }
}