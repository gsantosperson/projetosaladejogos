package Projeto;
public class App {

    public static void main(String[] args) throws Exception {
        
        
        
        Jogos jogo = new Jogos("Cs", "teste");
        Jogos jogo2 = new Jogos("LOl", "Moba");
        Jogos jogo3 = new Jogos("Free fire", "Battle royale");

        Jogadores jogador1 = new Jogadores("Teste", null);
        Jogadores jogador2 = new Jogadores("Teste", null);

        Perfil perfil = new Perfil(jogador1, 10, 1);
        
        Salas sala1 = new Salas(1, "Sala cs", false, jogo, 10);
        Salas sala2 = new Salas(2, "Sala Lol", false, jogo2, 20);
        Salas sala3 = new Salas(3, "Sala Free-fire", false, jogo3, 50);

        Plataforma plataforma1 = new Plataforma(1, "Principal");

        plataforma1.criarSala(sala1);
        plataforma1.criarSala(sala2);
        plataforma1.criarSala(sala3);
        
        //Salas sala1 =  plataforma1.criarSala();
        sala1.abrirSala();
        sala1.inserirParticipante(jogador1);
        sala1.inserirParticipante(jogador2);
        
        //sala1.removerParticipante();
        //jogador1.exibirDados();
        
        //plataforma1.finalizarSala(sala1);
        //plataforma1.finalizarSala(sala2);
        plataforma1.exibirDados();
        //perfil.exibirDados(jogador1, 10, 1);
        //sala2.removerParticipante();
        //sala1.exibirDados();
    }
}
