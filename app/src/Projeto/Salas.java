package Projeto;
public class Salas{

    private int id_sala;
    private String nomeSala;
    private boolean status;
    private Jogos jogo;
    private int maxParticipantes;
    private int quantidadeDeParticipantes;
    private int quantidadeEmEspera;

    public Salas(int id_sala, String nomeSala, boolean status, Jogos jogo, int maxParticipantes){
        this.id_sala = id_sala;
        this.nomeSala = nomeSala;
        this.status = status;
        this.jogo = jogo;
        this.maxParticipantes = maxParticipantes;
        this.quantidadeDeParticipantes = 0;
        this.quantidadeEmEspera = 0;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }
    
    public void setId_sala(int id_sala){
        this.id_sala = id_sala;
    }

    public int getId_Sala(){
        return id_sala;
    }

    public String getNomeSala(){
        return nomeSala;
    }
    public void setNomesala(String nomeSala){
        this.nomeSala = nomeSala;
    }

    public void setQuantidadeDeParticipantes(int quantidadeDeParticipantes) {
        if(quantidadeDeParticipantes <= getMaxParticipantes())
        this.quantidadeDeParticipantes += quantidadeDeParticipantes;
    }

    public int getQuantidadeDeParticipantes() {
        return quantidadeDeParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }
    
    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public int getQuantidadeEmEspera() {
        return quantidadeEmEspera;
    }

    public void setQuantidadeEmEspera(int quantidadeEmEspera) {
        this.quantidadeEmEspera = quantidadeEmEspera;
    }

    public Jogos getJogo(){
        return jogo;
    }

    public void setJogo(Jogos jogo){
        this.jogo = jogo;
    }
    
    public void abrirSala(){
        this.setStatus(true);
    }

    public void fecharSala(){
        this.setStatus(false);
        }

        public void inserirParticipante() {

    if (!getStatus()) {
        System.out.println("Sala: " + getNomeSala() + " fechada, não é permitida entrada de jogadores.");
        return;
    }

    if (this.quantidadeDeParticipantes < this.maxParticipantes) {
        this.quantidadeDeParticipantes++;
        System.out.println("1 participante entrou na sala: " + getNomeSala());
    } else {
        this.quantidadeEmEspera++;
        System.out.println("Sala: " + getNomeSala() + " cheia. Participante foi para a espera.");
    }
}

    public void removerParticipante() {
        if (this.quantidadeDeParticipantes > 0) {
            this.quantidadeDeParticipantes--;
            System.out.println("1 participante saiu da sala.");

            if (this.quantidadeEmEspera > 0) {
                this.quantidadeEmEspera--;
                this.quantidadeDeParticipantes++;
                System.out.println("1 vaga abriu e alguém da espera entrou automaticamente!");
            }
        } else {
            System.out.println("A sala já está vazia.");
        }
    }


        
    public void exibirDados(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Id sala: "+this.getId_Sala());
        System.out.println("Nome da sala: "+this.getNomeSala());
        if(getStatus())
            System.out.println("Sala aberta");
        else
            System.out.println("Sala fechada");
        System.out.println("Jogo: "+ jogo.getTitulo());
        System.out.println("Número máximo de participantes:  "+this.getMaxParticipantes());
        System.out.println("Quantidade atual de participantes: "+this.getQuantidadeDeParticipantes());
        System.out.println("Quantidade na fila de espera: "+this.getQuantidadeEmEspera());
        System.out.println("-------------------------------------------------------------------------");
    }
}