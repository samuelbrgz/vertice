
package br.com.vertice.vertice.dto;



public class EquipeDTO {
    private String nomeEquipe;
    private String sigla;
    private int id;

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public String getSigla() {
        return sigla;
    }

    public int getId() {
        return id;
    }


    public EquipeDTO(String nomeEquipe, String sigla) {
        this.nomeEquipe = nomeEquipe;
        this.sigla = sigla;
    }
    public EquipeDTO(String nomeEquipe, String sigla, int id) {
        this.nomeEquipe = nomeEquipe;
        this.sigla = sigla;
        this.id = id;
    }
    
    
}
