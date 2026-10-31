
package br.com.vertice.vertice.dto;
import java.util.List;


public class EquipeDTO {
    private String NomeEquipe;
    private String Sigla;
    private List<String> jogadores;

    public String getNomeEquipe() {
        return NomeEquipe;
    }

    public String getSigla() {
        return Sigla;
    }

    public List<String> getJogadores() {
        return jogadores;
    }

    public EquipeDTO(String NomeEquipe, String Sigla, List<String> jogadores) {
        this.NomeEquipe = NomeEquipe;
        this.Sigla = Sigla;
        this.jogadores = jogadores;
    }
    
    
}
