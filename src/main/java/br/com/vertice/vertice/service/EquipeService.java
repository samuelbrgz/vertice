package br.com.vertice.vertice.service;

import br.com.vertice.vertice.Equipe;
import br.com.vertice.vertice.dto.EquipeDTO;
import br.com.vertice.vertice.exception.NegocioException;
import br.com.vertice.vertice.repository.EquipeRepository;
import br.com.vertice.vertice.repository.EquipeRepositoryImpl;
import java.sql.SQLException;

public class EquipeService {

    private static final String VIOLACAO_UNIQUE = "23505";

    private final EquipeRepository repository = new EquipeRepositoryImpl();

    public void cadastrarEquipe(EquipeDTO e) throws NegocioException {
        Equipe eq;
        try {
            eq = new Equipe(e.getNomeEquipe(), e.getSigla(), e.getJogadores());
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
}