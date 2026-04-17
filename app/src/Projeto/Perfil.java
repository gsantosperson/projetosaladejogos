package Projeto;

public class Perfil {
    private String nome;
    private int ranking;
    private int conquistas;


public String getNome(){
    return this.nome;
}

public void setNome(String nome) {
    this.nome = nome;
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

public Perfil(String nome, int ranking, int conquistas){
    this.nome = nome;
    this.ranking = ranking;
    this.conquistas = conquistas;
}

public void exibirDados(){
    System.out.println("Nome: " + this.getNome());
    System.out.println("Ranking: "+this.getRanking());
    System.out.println("Conquistas: "+this.getConquistas());
}

}

