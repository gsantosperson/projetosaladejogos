package Projeto;
public class App {

    public static void main(String[] args) throws Exception {
        
        
        Perfil perfil = new Perfil("Gustavo",10, 1);
        Perfil perfil2 = new Perfil("Marcos", 1, 23);
        Perfil perfil3 = new Perfil("Paullo", 2, 3);

        Jogos jogo = new Jogos("Cs", "de tiro");
        Jogos jogo2 = new Jogos("LOl", "Moba");
        Jogos jogo3 = new Jogos("Free fire", "Battle royale");

        Jogadores jogador1 = new Jogadores("jogador1", perfil);
        Jogadores jogador2 = new Jogadores("jogador2", perfil2);
        Jogadores jogador3 = new Jogadores("jogador3", perfil3);


        Salas sala1 = new Salas(1, "Sala cs", false, jogo, 10);
        Salas sala2 = new Salas(2, "Sala Lol", false, jogo2, 20);
        Salas sala3 = new Salas(3, "Sala Free-fire", false, jogo3, 50);

        Plataforma plataforma1 = new Plataforma(1, "Principal");

        plataforma1.criarSala(sala1);
        plataforma1.criarSala(sala2);
        plataforma1.criarSala(sala3);
        
        sala1.abrirSala();
        sala2.abrirSala();
        
        sala1.inserirParticipante(jogador1);
        sala1.inserirParticipante(jogador2);
        sala2.inserirParticipante(jogador3);
        
        
        
        plataforma1.exibirDados();
        
    }
}
