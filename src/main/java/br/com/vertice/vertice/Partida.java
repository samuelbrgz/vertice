package br.com.vertice.vertice;


public class Partida {
    private Equipe equipe1;
    private Equipe equipe2;
    private int placarEquipe1;
    private int placarEquipe2;
 
    public Equipe getEquipe1() {
        return equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public int getPlacarEquipe1() {
        return placarEquipe1;
    }

    public int getPlacarEquipe2() {
        return placarEquipe2;
    }
    
     
    public Partida(Equipe equipe1, Equipe equipe2) {
        
        if (equipe1 == null || equipe2 == null || equipe1 == equipe2 || equipe1.getId() == equipe2.getId()) {
            throw new IllegalArgumentException("Equipe(s) Invalida(s)");
        }
        
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.placarEquipe1 = 0;
        this.placarEquipe2 = 0;
    } 
    public void registrarResultado(int placarEquipe1, int placarEquipe2){
        if (placarEquipe1 < 0 || placarEquipe2 < 0 || placarEquipe1 == placarEquipe2) {
            throw new IllegalArgumentException("Placar invalido");
        }
        this.placarEquipe1 = placarEquipe1;
        this.placarEquipe2 = placarEquipe2;
    }
}
