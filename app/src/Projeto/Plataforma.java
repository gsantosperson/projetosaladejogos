package Projeto;

public class Plataforma {
    public static void main(String[] args) {
        Perfil p1 = new Perfil("Gustavo", 1, 15);

       // p1.exibirDados();

        Jogos jogo1 = new Jogos("Free-fire", "Battle Royale");
        Salas sala1 = new Salas(0, null, false, jogo1, 40, 0);
       // jogo1.exibirDados();
        //sala1.exibirDados();
        
        
        sala1.inserirParticipante(20);
        sala1.inserirParticipante(20);
        
        sala1.exibirDados();
        
    }
}
