package Projeto;

public class Plataforma {
    private int id;
    private Salas sala;
    private Jogadores jogadores;
    
    public Plataforma(Salas sala, Jogadores jogadores){
        
        this.sala = sala;
        this.jogadores = jogadores;
    }
}
