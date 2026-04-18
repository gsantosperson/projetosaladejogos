package Projeto;

public class Perfil {
    private String nomeJogador;
    private int ranking;
    private int conquistas;
    private int conta;

public String getNomeJogador(){
    return this.nomeJogador;
}

public void setNomeJogador(String nomeJogador) {
    this.nomeJogador = nomeJogador;
}
public void setContas(int conta){
    if(conta > 1){
        System.out.println("Erro");
    }else{
        this.conta = conta;
    }
}

public int getConquistas() {
    return conquistas;
}

public void setConquistas(int conquistas) {
    this.conquistas = conquistas;
}

public int getRanking() {
    return ranking;
}

public void setRanking(int ranking) {
    this.ranking = ranking;
}

public Perfil(String nomeJoagdor,int ranking, int conquistas){
    this.nomeJogador = nomeJoagdor;
    this.ranking = ranking;
    this.conquistas = conquistas;
}

public void exibirDados(){
    System.out.println("Nome: " + this.getNomeJogador());
    System.out.println("Ranking: "+this.getRanking());
    System.out.println("Conquistas: "+this.getConquistas());
}

}

