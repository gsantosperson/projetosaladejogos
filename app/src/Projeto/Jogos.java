package Projeto;

public class Jogos {
    private String titulo;
    private String categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Jogos(String titulo, String categoria){
        this.titulo = titulo;
        this.categoria = categoria;

    }

    public void exibirDados(){
        System.out.println("Titulo do jogo: "+ this.getTitulo());
        System.out.println("Categoria do jogo: "+this.categoria);
    }

}
