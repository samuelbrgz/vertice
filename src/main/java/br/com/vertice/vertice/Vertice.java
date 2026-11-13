package br.com.vertice.vertice;

import br.com.vertice.vertice.dto.EquipeDTO;
import br.com.vertice.vertice.exception.NegocioException;
import br.com.vertice.vertice.service.EquipeService;
import java.util.List;

public class Vertice {

    public static void main(String[] args) {
        EquipeService service = new EquipeService();

        try {
            List<EquipeDTO> equipes = service.listarEquipes();

            for (EquipeDTO dto : equipes) {
                System.out.println(dto.getId() + " - " + dto.getNomeEquipe() + " (" + dto.getSigla() + ")");
            }
        } catch (NegocioException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }
}