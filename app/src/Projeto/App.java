package Projeto;
public class App {

    public static void main(String[] args) throws Exception {
        Jogos jogo1 = new Jogos("CS 1.6", "Battle royale");
        Salas sala1 = new Salas(1, "Sala Free-fire", false, jogo1, 50);
        Jogos jogo2 = new Jogos("MK", "Luta");
        Salas sala2 = new Salas(2, "Sala MK", false, jogo2, 10);
        
        
        sala1.fecharSala();
        sala1.inserirParticipante();
        sala1.removerParticipante();
        sala1.exibirDados();

    }
}
